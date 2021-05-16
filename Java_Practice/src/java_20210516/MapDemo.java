package java_20210516;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	HashMap map = new HashMap();
	
	map.put("a", "1111");
	map.put("b", "2222");
	map.put("c", "3333");
	map.put("d", "4444");
	
	String value1 = (String) map.get("a");
	String value2 = (String) map.get("b");
	String value3 = (String) map.get("c");
	String value4 = (String) map.get("d");
	
	System.out.printf("%s %s %s %s \n",value1, value2, value3, value4);
	
	Set keySet = map.keySet();
	
	Iterator i = keySet.iterator();
	while (i.hasNext()) {
		String key = (String) i.next();
		String value = (String) map.get(key);
		System.out.printf("%s : %s \n",key,value);
	}
}
}
