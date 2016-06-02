package com.guitar.domain;

import java.util.ArrayList;
import java.util.List;

import com.guitar.service.GuitarServiceDB;
import com.guitar.service.IGuitarService;
/**
 * 工厂类 存在业务 即 添加查询吉他
 *
 * @author lzm
 *
 */
public class Inventory {
	private List<Guitar> guitars;
	//使用连接数据库时使用的service层
	IGuitarService service = new GuitarServiceDB();

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}
	
	
	}
	//查询吉他方法
	public List<Guitar> searchGuitar(String serialNumber) {
		guitars = service.searchGuitar(serialNumber);
		return guitars;
	}
	

}
