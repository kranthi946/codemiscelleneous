package Gainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testclass {

	

    public static List<GainerItem> createGainersList() {
        List<GainerItem> gainersList = new ArrayList<>();

    
        

        return gainersList;
    }

    public static void main(String[] args) {
    	
    	Map<String, Double> f =  	createGainersList().stream().collect(Collectors.toMap(GainerItem::getCompanyName, GainerItem::getCurrentPrice));
    	
    	System.out.println(f);
    	
    	Map<Boolean, List<String>> d = 	createGainersList().stream().filter(cp ->cp.getCurrentPrice() > 100).map(cn -> cn.getCompanyName()).map(String::toUpperCase).collect(Collectors.partitioningBy(cn -> cn.startsWith("A")));
 System.out.println(d);   	
 
 
 
 Map<String, Long> r =  createGainersList().stream().collect(Collectors.groupingBy(GainerItem::getCompanyName, Collectors.counting()));
 System.out.println(r);
 Map<String, Long> cncp11 = createGainersList().stream()
 	    .collect(Collectors.groupingBy(GainerItem::getCompanyName, 
 	             Collectors.collectingAndThen(Collectors.counting(), Function.identity())));

System.out.println(cncp11);
 
}
    
    
    
    
}
