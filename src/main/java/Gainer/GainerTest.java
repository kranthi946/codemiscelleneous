package Gainer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GainerTest {
	 public static List<GainerItem> createGainersList() {
	        List<GainerItem> gainersList = new ArrayList<>();



	        return gainersList;
	    }

	    public static void main(String[] args) {
	    	
	    	
	    	List<GainerItem> x = createGainersList();
	  List<String>  nameswithuppercase =  	 x.stream().map(GainerItem::getCompanyName).map(String::toUpperCase).collect(Collectors.toList());
	    	System.out.println(nameswithuppercase);
	    	
//	  	  Set<String>  nameswithuppercase =  	(Set<String>) createGainersList().stream().map(GainerItem::getCompanyName).map(String::toUpperCase).collect(Collectors.toList());
//	    	System.out.println(nameswithuppercase);
	    	
	    	
	    	List<String>  nameswithlowercase =  	x.stream().map(GainerItem::getCompanyName).map(String::toLowerCase).collect(Collectors.toList());
	    	System.out.println(nameswithlowercase);
	    	
	    	
	    	
	    	 // Create the map
	        Map<String, Double> companyPriceMap = x.stream()
	                .collect(Collectors.toMap(GainerItem::getCompanyName, GainerItem::getCurrentPrice));

	        // Print the map
	        System.out.println(companyPriceMap);
	        
	        
	        
	        
	   List<Double>  price =      x.stream().filter(e -> e.getCurrentPrice()>600).map(GainerItem::getCurrentPrice).collect(Collectors.toList());
	    	
	    System.out.println(price);
	    	
        
//	   List<Double>  price1 =      x.stream().filter(e -> e.getCurrentPrice()>600).map(GainerItem::getCurrentPrice).collect(Collectors.toUnmodifiableList());
//	    	
//	   
//	 //  price1.add(33.0);
//	    System.out.println(price1);
	    
	    
	   System.out.println( x.stream().filter(c -> c.getCurrentPrice()< 300).map(c->c.getCompanyName()).map(String::toUpperCase).collect(Collectors.joining(",")));
	    
	    	System.out.println(x.stream().collect(Collectors.partitioningBy(c -> c.getCurrentPrice() % 2 == 0)));
	    	
	    	
	  Map<String,List<GainerItem>>  t = 	x.stream().collect(Collectors.groupingBy(c-> c.getCompanyName()));
	    	
	  System.out.println(t);
	  
	  
	  
	  Map<String, List<Double>> cncp =    x.stream().collect(Collectors.groupingBy(c->c.getCompanyName(),Collectors.mapping(e ->e.getCurrentPrice(), Collectors.toList())));
	  
	  
	  System.out.println(cncp);
	  
Map<Object, Long> cncp1 =    x.stream().collect(Collectors.groupingBy(c->c.getCompanyName(),Collectors.mapping(e ->e.getCurrentPrice(), Collectors.counting())));
	  
	  
	  System.out.println(cncp1);
	  
	  
	  Map<String, Long>  hw =   x.stream().collect(Collectors.groupingBy(GainerItem::getCompanyName,Collectors.collectingAndThen(Collectors.counting(), Function.identity())));
	  
	  System.out.println(hw);
	  
	  
	  System.out.println(x.stream().mapToDouble(GainerItem::getCurrentPrice).min());
	  
	//  System.out.println(createGainersList().stream().collect(Collectors.maxBy(comparing(GainerItem::currentPrice))));
	  
	    }

		
}
