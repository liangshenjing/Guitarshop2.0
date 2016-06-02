package com.guitar.domain;

import java.util.ArrayList;
import java.util.List;

import com.guitar.service.GuitarServiceDB;
import com.guitar.service.IGuitarService;
/**
 * ������ ����ҵ�� �� ��Ӳ�ѯ����
 *
 * @author lzm
 *
 */
public class Inventory {
	private List<Guitar> guitars;
	//ʹ���������ݿ�ʱʹ�õ�service��
	IGuitarService service = new GuitarServiceDB();

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}
	
	
	}
	//��ѯ��������
	public List<Guitar> searchGuitar(String serialNumber) {
		guitars = service.searchGuitar(serialNumber);
		return guitars;
	}
	

}
