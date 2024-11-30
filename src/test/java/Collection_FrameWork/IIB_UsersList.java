package Collection_FrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIB_UsersList {
	
	
	public static Map<String, String> Username(String Role){
	 Map<String, String> l = new HashMap<String, String>();
		l.put("SuperAdmin", "Sanjay@iib.com");
		l.put("PIN_CompanyAdmin", "Sandeep.d@revalsys.com");
		
		l.put("Insurer_1", "maheedhar.k2@revalsys.com");
		l.put("Insurer_1", "maheedhar.k@revalsys.com");
		l.get(Role);
		System.out.println(l.get(Role));
		
		return l;
	}
	
	public static void main(String[] args) {
		Username("Insurer_1");
	}
	

}
