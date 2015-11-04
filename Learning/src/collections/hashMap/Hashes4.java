package collections.hashMap;

import java.util.HashMap;
import java.util.Map;
/* ������� �� ����� ������ ������
���� ��������� HashMap<String, String>, ���� ������� 10 ��������� �����. ������� �� ����� ������ ������,
������ ������� � ����� ������.
*/
public class Hashes4 {
	 public static void main(String[] args) throws Exception
	    {
	        HashMap<String, String> map = new HashMap<String, String>();
	        map.put("Sim", "Sim");
	        map.put("Tom", "Tom");
	        map.put("Arbus", "Arbus");
	        map.put("Baby", "Baby");
	        map.put("Cat", "Cat");
	        map.put("Dog", "Dog");
	        map.put("Eat", "Eat");
	        map.put("Food", "Food");
	        map.put("Gevey", "Gevey");
	        map.put("Hugs", "Hugs");

	        printKeys(map);
	    }

	    public static void printKeys(HashMap<String, String> map)
	    {
	        for (Map.Entry<String, String> pair: map.entrySet()) 
	        	System.out.println(pair.getKey());//�������� ��� ��� ���
	    }
}
