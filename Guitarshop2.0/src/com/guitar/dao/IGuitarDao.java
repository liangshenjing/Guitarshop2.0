package com.guitar.dao;

import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.GuitarSpec;

/**
 * GuitarDao
 * 数据库访问层，接口
 * @author lzm
 *
 */
public interface IGuitarDao {
	/**
	 * 添加吉他方法
	 * @param serialNumber 序列号
	 * @param spec 
	 * @return 
	 */
	public int addGuitar(String serialNumber,
            GuitarSpec spec);
	
	/**
	 * 匹配/查询吉他
	 * @param serialNumber 序列号
	 * @return 
	 */
	public List<Guitar> searchGuitar(String serialNumber);
	
	/**
	 * @param serialNumber 序列号
	 * @return 
	 */
	public int delGuitar(String serialNumber);
	
}
