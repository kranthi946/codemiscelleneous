package Gainer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Gainerkranthi {

	    public static List<GainerItem> createGainersList() {
	        List<GainerItem> gainers = new ArrayList<>();

			// Test data
			gainers.add(new GainerItem("Amazon", 1500.0, 1520.0, 1.33, "Alice", "Female", false));
			gainers.add(new GainerItem("Facebook", 200.0, 205.0, 2.50, "Sophia", "Female", true));
			gainers.add(new GainerItem("WhatsApp", 300.0, 310.0, 3.33, "Emma", "Female", false));
			gainers.add(new GainerItem("OLX", 100.0, 102.0, 2.00, "Olivia", "Female", true));
			gainers.add(new GainerItem("Ola", 50.0, 51.0, 2.00, "Isabella", "Female", false));
			gainers.add(new GainerItem("Zomato", 75.0, 76.5, 2.00, "Mia", "Female", true));
			gainers.add(new GainerItem("Uber Taxi", 90.0, 91.0, 1.11, "Ava", "Female", false));
			gainers.add(new GainerItem("Atlas", 120.0, 121.5, 1.25, "Amelia", "Female", true));
			gainers.add(new GainerItem("Airbnb", 500.0, 510.0, 2.00, "Charlotte", "Female", false));
			gainers.add(new GainerItem("Paytm", 1000.0, 1010.0, 1.00, "Ella", "Female", true));

			gainers.add(new GainerItem("Amazon", 1500.0, 1520.0, 1.33, "John", "Male", true));
			gainers.add(new GainerItem("Facebook", 200.0, 205.0, 2.50, "William", "Male", false));
			gainers.add(new GainerItem("WhatsApp", 300.0, 310.0, 3.33, "James", "Male", true));
			gainers.add(new GainerItem("OLX", 100.0, 102.0, 2.00, "Michael", "Male", false));
			gainers.add(new GainerItem("Ola", 50.0, 51.0, 2.00, "Ethan", "Male", true));
			gainers.add(new GainerItem("Zomato", 75.0, 76.5, 2.00, "Lucas", "Male", false));
			gainers.add(new GainerItem("Uber Taxi", 90.0, 91.0, 1.11, "Mason", "Male", true));
			gainers.add(new GainerItem("Atlas", 120.0, 121.5, 1.25, "Logan", "Male", false));
			gainers.add(new GainerItem("Airbnb", 500.0, 510.0, 2.00, "Liam", "Male", true));
			gainers.add(new GainerItem("Paytm", 1000.0, 1010.0, 1.00, "Noah", "Male", false));

			return gainers;
	    }

	    public static void main(String[] args) {

			//	final int[] count = {0};


//	    	createGainersList().stream().filter(companyname -> companyname.getCompanyName().length() >15 ).forEach(cn -> System.out.println("kranthi" + cn));

			List<String> cl = createGainersList()

					.stream()


					.filter(cn -> cn.getCompanyName().toLowerCase().startsWith("a"))


					.filter(cn -> cn.getCompanyName().length() > 3)

					//.peek(cn -> System.out.println("Filtered company: " + cn.getCompanyName()))
					.map(cn -> cn.getCompanyName().replaceAll("A", "G"))
					.sorted(Collections.reverseOrder().reversed())
					.collect(Collectors.toList());
			//	System.out.println("Total items processed by stream: " + count[0]);
		//	cl.forEach(System.out::println);




			//...........................................................................................//

			System.out.println("FOREACH");


			//	createGainersList().stream().filter(currentPrice ->  currentPrice.getCurrentPrice() < 200).forEach(System.out::println);

			//createGainersList().stream().filter(currentPrice -> currentPrice.getCurrentPrice() <300).forEach(System.out::println);


			//	    	createGainersList().stream().map(GainerItem::getCompanyName).forEach(System.out::println);;
//...........................................................................................//	 
	    	
	    	
	    	/*System.out.println("|.....................................................................................................................................................");
	    	
	    	createGainersList().stream()
                   .mapToDouble(GainerItem::getCurrentPrice)
                .reduce(0, (total, currentPrice) -> total + currentPrice);
                   
                   
  System.out.println("|.....................................................................................................................................................");

	System.out.println("REDUCE OPERATION");	
	    	//REDUCE OPERATION
    	double totalPrice = createGainersList().stream()
                    .mapToDouble(GainerItem::getCurrentPrice)
                  .reduce(0, (total, currentPrice) -> total + currentPrice);
System.out.println(totalPrice);

	    	System.out.println("|.....................................................................................................................................................");

//...................................................................................................//
	    	
	    	System.out.println("TOLIST, TO SET");	
	    	//TOLIST , TO SET
List<String> companyNamesHavingCurrencyMoreThan100 = createGainersList()
.stream()

.map(GainerItem::getCompanyName)
.map(String::toUpperCase)
.collect(Collectors.toList());
	      System.out.println(companyNamesHavingCurrencyMoreThan100);
//	    
//	    
//	    
//	    // we can try for set also
//	    
//	    
//	    Set<String> companyNamesHavingCurrencyMoreThan99 = createGainersList()
//	    		.stream()
 		.map(GainerItem::getCompanyName)
//    		.map(String::toUpperCase)
//	    		.collect(Collectors.toSet());
//    			      System.out.println(companyNamesHavingCurrencyMoreThan99);
////	    			    }

	    	
	    	System.out.println("|.....................................................................................................................................................");
    	
	    	 //.................................................................................................................................................................//	    
	    	//TOLIST     
	    
//	    Map<String, Double> cncc = new HashMap<>();
//	     
//	     for(GainerItem  gt  :createGainersList() ) {
//	    	 
//	    	 
////	    String companyname =	 gt.getCompanyName();
////	    
////	    double currentprice = gt.getCurrentPrice();
//	    	cncc.put(gt.getCompanyName(), gt.getCurrentPrice());
//	    
//	    	}
//	    	 
//	 System.out.println(cncc);
	    	
	    	
	  	
	    	
	  System.out.println(	createGainersList().stream().collect(Collectors.toMap(GainerItem::getCompanyName, GainerItem::getCurrentPrice)));
	    	//this one to add in the list 
	    	//List<Double>  price  = createGainersList().stream().filter(currentPrice -> currentPrice.getCurrentPrice() >200).map(").collect(Collectors.toList());
    	
	    	System.out.println(" |.....................................................................................................................................................");

	 //.................................................................................................................................................................//	    

	    	
	    	System.out.println("UNMODIFIABLELIST");
	    //UNMODIFIABLELIST
	    	
	    	//this one is to not add in the list 
	    
	  //  List<Double>  price  = createGainersList().stream().filter(currentPrice -> currentPrice.getCurrentPrice() >200).map(GainerItem::getCurrentPrice).collect(Collectors.toUnmodifiableList());

	     	//price.add(22.0);
	     	
	    //	System.out.println(price);
    	System.out.println("|.....................................................................................................................................................");
    	
	   //............................................................................//
    	
    	System.out.println("JOINING");
	    // JOINING 
	    	//to join the values 
	  
    	
    	
    	String jcn =   createGainersList().stream().filter(currentPrice -> currentPrice.getCurrentPrice() >200).map(companyName ->companyName.getCompanyName()).map(String::toUpperCase).collect(Collectors.joining(","));
	    	System.out.println("company name: "+ jcn);
	    	
	    	
	    	
	    	
	    	//augmentation ......... Collector<c>  3 TYPES
	    	
	    	//we have to run 2 times for finding
	    	
	    	List<GainerItem>  gi = createGainersList();
    	
    	System.out.println("|.....................................................................................................................................................");

//.............................................................................//	    	
     	System.out.println("GROUPING sounds like even and oddd separation  ");
	    	//GROUPING 
	    System.out.println();
	    
	    	List<GainerItem> evennumberprice = gi.stream().filter(currentPrice -> currentPrice.getCurrentPrice() % 2 ==0).collect(Collectors.toList());
//	    	
    	System.out.println("even: " + evennumberprice);
//	    	
List<GainerItem> oddnumberprice = gi.stream().filter(currentPrice -> currentPrice.getCurrentPrice() % 2 != 0).collect(Collectors.toList());
//	    	
   	System.out.println("odd: " + oddnumberprice);
	    	
	    	
	    
    	System.out.println("|.....................................................................................................................................................");
     
	    
	    //fulltime employees , part time employess , in this state or outside state
	  
	    //joining by will give true and false list in {}
    	
    	
    	
	 	System.out.println("partioning by: "+ 
	    createGainersList().stream().collect(Collectors.partitioningBy(currentPrice -> currentPrice.getCurrentPrice() <200)));
    	System.out.println("|.....................................................................................................................................................");
	
	    //here grouping by will give based on name of companay of the bucket 
  Map<String , List<GainerItem>>  priceofsamename =	   createGainersList().stream().collect(Collectors.groupingBy(companyName -> companyName.getCompanyName()));
	System.out.println(priceofsamename);   
  
  
  System.out.println();
  
	System.out.println("|.....................................................................................................................................................");

  
  	    
  	    	
  	    	System.out.println();
  	    	System.out.println("|.....................................................................................................................................................");
	    	
  	    	
//	    	    	
	    	    	
//companyname & price in a bucket 
	 
	    
	    //check augmentation of grouping by 
// this one will take the groupby then map to then list
	    
	  // this one will take the groupby then map to then set   
	    
    	System.out.println("grouping ,MAP , LIST :this one will take the groupby then map to then set  ");
	    Map<String, List<Double>> cncp = createGainersList().stream()
	            .collect(Collectors.groupingBy(GainerItem::getCompanyName, Collectors.mapping(GainerItem::getCurrentPrice, Collectors.toList())));

	   System.out.println(cncp);

	    // it takes like this 
	    //collector(Funtion , Collector(Function, Collector))
    	System.out.println("|.....................................................................................................................................................");
    
//.................................................................................................................................................................//	    
    	System.out.println("counting ");
    	// counting 
	    
	    Map<String, Long> cncp1 = createGainersList().stream()
	    	    .collect(Collectors.groupingBy(GainerItem::getCompanyName, Collectors.counting()));

	    System.out.println(cncp1);
    	System.out.println("|.....................................................................................................................................................");
	    
	  //.................................................................................................................................................................//	    
     	System.out.println("collecting and Then , groupingBy and mapping (Function , Collector)");
	  // collecting and Then  
	    //groupingBy and mapping (Function , Collector)
	    
	    // collecting and Then (Collector , Function )
	    
	    
	    Map<String, Long> cncp11 = createGainersList().stream()
	    	    .collect(Collectors.groupingBy(GainerItem::getCompanyName, 
	    	             Collectors.collectingAndThen(Collectors.counting(), Function.identity())));

   	System.out.println(cncp11);
	   
	    
    	System.out.println("|.....................................................................................................................................................");
	  
//	  ................................................................................................................//
     	System.out.println("MAXBY , mapToInt , max , min , comparing");
	    //MAXBY , mapToInt , max , min , comparing
    	System.out.println("|.....................................................................................................................................................");
    
	    
	// System.out.println(createGainersList().stream().mapToLong(GainerItem::getCurrentPrice).sum());

 	System.out.println("|.....................................................................................................................................................");
    
	   // System.out.println(createGainersList().stream().collect(Collectors.maxBy(comparing(GainerItem::currentPrice)));

	    
    	System.out.println("|.....................................................................................................................................................");
  
	    	     }
	    
	    
	    */

			/**
			 * FOREACH
			 Company: Nakoda Group Of Ind, Prev Close: 44.6, Current Price: 50.02, % Change: 12.15
			 Company: Amerise Biosciences, Prev Close: 0.62, Current Price: 0.69, % Change: 11.29
			 Company: Indong Tea Company, Prev Close: 23.5, Current Price: 26.0, % Change: 10.64
			 Company: Sahyadri Hotels, Prev Close: 53.0, Current Price: 58.55, % Change: 10.47
			 |.....................................................................................................................................................
			 |.......................................................................................................................................................
			 REDUCE OPERATION
			 3260.2100000000005
			 |.....................................................................................................................................................
			 TOLIST, TO SET
			 [EXICOM TELE-SYSTEMS, AWFIS SPACE SOLUTION, AWFIS, KRANTHI, DER, NAKODA GROUP OF IND, AMERISE BIOSCIENCES, SAHYADRI INDUSTRIES, INDONG TEA COMPANY, SAHYADRI HOTELS]
			 |.....................................................................................................................................................
			 {DER=777.0, Awfis=605.4, Nakoda Group Of Ind=50.02, Exicom Tele-Systems=314.95, Indong Tea Company=26.0, Sahyadri Industries=378.05, Sahyadri Hotels=58.55, Amerise Biosciences=0.69, kranthi=604.4, Awfis Space Solution=445.15}
			 |.....................................................................................................................................................
			 UNMODIFIABLELIST
			 |.....................................................................................................................................................
			 JOINING
			 EXICOM TELE-SYSTEMS,AWFIS SPACE SOLUTION,AWFIS,KRANTHI,DER,SAHYADRI INDUSTRIES
			 |.....................................................................................................................................................
			 GROUPING
			 [Company: Indong Tea Company, Prev Close: 23.5, Current Price: 26.0, % Change: 10.64]
			 [Company: Exicom Tele-Systems, Prev Close: 269.35, Current Price: 314.95, % Change: 16.93, Company: Awfis Space Solution, Prev Close: 383.0, Current Price: 445.15, % Change: 16.23, Company: Awfis, Prev Close: 521.65, Current Price: 605.4, % Change: 16.05, Company: kranthi, Prev Close: 522.65, Current Price: 604.4, % Change: 16.05, Company: DER, Prev Close: 673.65, Current Price: 777.0, % Change: 15.34, Company: Nakoda Group Of Ind, Prev Close: 44.6, Current Price: 50.02, % Change: 12.15, Company: Amerise Biosciences, Prev Close: 0.62, Current Price: 0.69, % Change: 11.29, Company: Sahyadri Industries, Prev Close: 341.05, Current Price: 378.05, % Change: 10.85, Company: Sahyadri Hotels, Prev Close: 53.0, Current Price: 58.55, % Change: 10.47]
			 |.....................................................................................................................................................
			 grouping
			 {false=[Company: Exicom Tele-Systems, Prev Close: 269.35, Current Price: 314.95, % Change: 16.93, Company: Awfis Space Solution, Prev Close: 383.0, Current Price: 445.15, % Change: 16.23, Company: Awfis, Prev Close: 521.65, Current Price: 605.4, % Change: 16.05, Company: kranthi, Prev Close: 522.65, Current Price: 604.4, % Change: 16.05, Company: DER, Prev Close: 673.65, Current Price: 777.0, % Change: 15.34, Company: Nakoda Group Of Ind, Prev Close: 44.6, Current Price: 50.02, % Change: 12.15, Company: Amerise Biosciences, Prev Close: 0.62, Current Price: 0.69, % Change: 11.29, Company: Sahyadri Industries, Prev Close: 341.05, Current Price: 378.05, % Change: 10.85, Company: Sahyadri Hotels, Prev Close: 53.0, Current Price: 58.55, % Change: 10.47], true=[Company: Indong Tea Company, Prev Close: 23.5, Current Price: 26.0, % Change: 10.64]}
			 {DER=[Company: DER, Prev Close: 673.65, Current Price: 777.0, % Change: 15.34], Awfis=[Company: Awfis, Prev Close: 521.65, Current Price: 605.4, % Change: 16.05], Nakoda Group Of Ind=[Company: Nakoda Group Of Ind, Prev Close: 44.6, Current Price: 50.02, % Change: 12.15], Indong Tea Company=[Company: Indong Tea Company, Prev Close: 23.5, Current Price: 26.0, % Change: 10.64], Exicom Tele-Systems=[Company: Exicom Tele-Systems, Prev Close: 269.35, Current Price: 314.95, % Change: 16.93], Sahyadri Hotels=[Company: Sahyadri Hotels, Prev Close: 53.0, Current Price: 58.55, % Change: 10.47], Sahyadri Industries=[Company: Sahyadri Industries, Prev Close: 341.05, Current Price: 378.05, % Change: 10.85], Amerise Biosciences=[Company: Amerise Biosciences, Prev Close: 0.62, Current Price: 0.69, % Change: 11.29], kranthi=[Company: kranthi, Prev Close: 522.65, Current Price: 604.4, % Change: 16.05], Awfis Space Solution=[Company: Awfis Space Solution, Prev Close: 383.0, Current Price: 445.15, % Change: 16.23]}
			 grouping ,MAP , LIST :this one will take the groupby then map to then set
			 |.....................................................................................................................................................
			 counting
			 {DER=1, Awfis=1, Nakoda Group Of Ind=1, Indong Tea Company=1, Exicom Tele-Systems=1, Sahyadri Hotels=1, Sahyadri Industries=1, Amerise Biosciences=1, kranthi=1, Awfis Space Solution=1}
			 |.....................................................................................................................................................
			 collecting and Then , groupingBy and mapping (Function , Collector)
			 {DER=1, Awfis=1, Nakoda Group Of Ind=1, Indong Tea Company=1, Exicom Tele-Systems=1, Sahyadri Hotels=1, Sahyadri Industries=1, Amerise Biosciences=1, kranthi=1, Awfis Space Solution=1}
			 |.....................................................................................................................................................
			 MAXBY , mapToInt , max , min , comparing
			 |.....................................................................................................................................................
			 *
			 *
			 */

//}
		}}