package com.guitar.dao;

import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.GuitarSpec;

/**
 * GuitarDao
 * ���ݿ���ʲ㣬�ӿ�
 * @author lzm
 *
 */
public interface IGuitarDao {
	/**
	 * ��Ӽ�������
	 * @param serialNumber ���к�
	 * @param spec 
	 * @return 
	 */
	public int addGuitar(String serialNumber,
            GuitarSpec spec);
	
	/**
	 * ƥ��/��ѯ����
	 * @param serialNumber ���к�
	 * @return 
	 */
	public List<Guitar> searchGuitar(String serialNumber);
	
	/**
	 * @param serialNumber ���к�
	 * @return 
	 */
	public int delGuitar(String serialNumber);
	
}
