package com.guitar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.GuitarSpec;
import com.guitar.util.DBUtil;
/**
 * ʹ��Sqlite���ݿ��ʵ����
 * ʵ��IGuitarDao
 * @author lzm
 *
 */
public class GuitarSqliteDao implements IGuitarDao{
	/**
	 * ����һ���µ�Guitar
	 */
	@Override
	public int addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Connection Conn = DBUtil.open();
		String sql = "insert into Guitar(serialNumber,builder,model,type,Wood,) values(?,?,?,?,?)";
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, serialNumber);
			pstmt.setString(2, spec.getBuilder());
			pstmt.setString(3, spec.getModel());
			pstmt.setString(4, spec.getType());
			pstmt.setString(5, spec.getWood());
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(Conn);
		}
		return 0;
	}
	/**
	 * ��ѯGuitar��Ϣ
	 * @return һ��List�б���������ݿ��е�����Guitar
	 */
	@Override
	public List<Guitar> searchGuitar(String serialNumber) {
		Connection Conn = DBUtil.open();
		String sql = "select * from Guitar";
		List<Guitar> guitarList = new ArrayList<Guitar>();
		
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Guitar guitar = new Guitar(rs.getString("serialNumber"),
						new GuitarSpec(rs.getString("builder"),rs.getString("model"),
								rs.getString("type"),rs.getString("Wood"),
				guitarList.add(guitar);
			}
			return guitarList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(Conn);
		}
		return null;
	}
	
	/**
	 * ɾ�����ݿ��ж�Ӧ��Guirtar��ͨ��serialNunmberɾ��
	 * @param serialNumber ���к�
	 */
	@Override
	public int delGuitar(String serialNumber) {
		Connection Conn = DBUtil.open();
		String sql = "delete from Guitar where serialNumber = ?";
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, serialNumber);
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(Conn);
		}
		return 0;
	}
}