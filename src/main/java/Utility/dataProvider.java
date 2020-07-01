package Utility;

import java.util.HashMap;
import java.util.Map;

public class dataProvider {
	
	
	
	public static Object[][]getData(){
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("FirstName", "Resmi");
	    map.put("LastName", "Mahe");
	    map.put("Address", "bvhhhj gjhgjhghfh");
	    map.put("Email", "hgfhgf@jhjgj.com");
	    map.put("Phone", "8976548765");
	    map.put("Gender", "female");
	    map.put("Hobbies", "hockey");
	    map.put("Skill", "Analytics");
	    map.put("Country", "Australia");
	    map.put("Password", "Resh@12345");
	    map.put("ConfirmPassword", "Resh@12345");
	    
	    return new Object[][] {
	        {map}
	    };
	}
	
	public static Object[][] GetdataAmzn() {
		
		Object[][] obj=new Object[1][4];
		obj[0][0]="NewDEmo";
		obj[0][1]="9800000000";
		obj[0][2]="NewDEmo709888@gmail.com";
		obj[0][3]="Reshm@9876";
		
		return obj;
	}
	
	public static Object[][] getLoginData() {
		Object[][] obj1= new Object[1][2];
		obj1[0][0]="demouser01";
		obj1[0][1]="Resh@1234";
		return obj1;
		
	}

}
