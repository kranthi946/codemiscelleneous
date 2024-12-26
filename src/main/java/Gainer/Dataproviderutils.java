package Gainer;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Dataproviderutils {




	static List<Map<String,String>>  list = new ArrayList<>();   //  [{password=123.0, testname=bo}, {password=abc, testname=alice}, {password=true, testname=charlie}, {password=SUM(1, 2), testname=dave}]


	public static Object[] getData(Method m ) throws IOException {


		String testcasename = 	m.getName() ;

		if(list.isEmpty()) {


			


			list = 	ExcelUtils.getTestdetailsfromExcel(ExcelUtils.sheetname);

		}


		List<Map<String,String>> smalllist = new ArrayList<>(list);   // []


		Predicate<Map<String,String>>	   testcasenamenotmatching =  e -> !e.get("testcasename").equalsIgnoreCase(testcasename);

		Predicate<Map<String,String>>			isexecutecolumnno =   e-> e.get("execute").equalsIgnoreCase("no");

		smalllist.removeIf(testcasenamenotmatching.or(isexecutecolumnno));
		
		System.out.println("smalllist" + smalllist);
		return smalllist.toArray();
	}
	
	
	 public static void main(String[] args) throws NoSuchMethodException, Throwable {
	       
System.out.println("getting data for dataprovidertesting");


Method method = GainerItem.class.getMethod("testMethod1");



Dataproviderutils.getData(method);
	        
	    }


}

