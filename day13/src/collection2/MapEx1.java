package collection2;

import java.util.HashMap;
import java.util.Map;

//Map:Ű�� ���� ���� �̷�� ���� ����� ������ �����̳� 
//iterator ��� ����
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(101, "�Ѹ�"); //put() �ʿ� ������ �߰�
		mp.put(201, "�����");
		mp.put(301, "������");
		mp.put(401, "��ġ");
		// key�� ã�ƴٴѴ�.
		System.out.println("key : " + 101 + "value : " + mp.get(101));
		System.out.println("key : " + 201 + "value : " + mp.get(201));
		System.out.println("key : " + 301 + "value : " + mp.get(301));
		System.out.println("key : " + 401 + "value : " + mp.get(401));
		
		mp.remove(401);
		System.out.println(mp.get(401));
		mp.clear(); //�� ��ü ����
		System.out.println(mp.get(101));
	} 
	
}
