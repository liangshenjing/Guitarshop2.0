package com.guitar.service;

import java.util.List;

import com.guitar.dao.GuitarSqliteDao;
import com.guitar.dao.IGuitarDao;
import com.guitar.domain.Guitar;
import com.guitar.domain.GuitarSpec;
/**
 * 连接数据库时使用的service层
 * @author lzm
 *
 */
public class GuitarServiceDB {
	
	IGuitarDao guitarDao = new GuitarSqliteDao();

	public int addGuitar(String serialNumber, double price,
	          GuitarSpec spec) {
			int i = guitarDao.addGuitar(serialNumber, price, spec);
			return i;
		}
	
	public List<Guitar> searchGuitar(String serialNumber) {
		List<Guitar> list = guitarDao.searchGuitar(serialNumber);
		return list;
	}
	
	public int delGuitar(String serialNumber) {
		int i = guitarDao.delGuitar(serialNumber);
		return i;
	}

	
}
