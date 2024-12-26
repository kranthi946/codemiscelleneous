

package Gainer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practise {

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

        gainers.add(new GainerItem("Amazon", 1500.0, 1575.0, 1.33, "John", "Male", true));
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
        // Filter and map operations with sorting and replacing
        List<String> cl = createGainersList()
                .stream()
                .filter(cn -> cn.getCompanyName().toLowerCase().startsWith("a"))
                .filter(cn -> cn.getCompanyName().length() > 3)
                .map(cn -> cn.getCompanyName().replaceAll("A", "G"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(cl.toString());

        // Reduce operation (sum of current prices)
        double totalPrice = createGainersList().stream()
                .mapToDouble(GainerItem::getCurrentPrice)
                .reduce(0, (total, currentPrice) -> total + currentPrice);
        System.out.println("Total Price: " + totalPrice);

        // Collecting company names into a list (uppercase)
        List<String> companyNames = createGainersList()
                .stream()
                .map(GainerItem::getCompanyName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Company Names: " + companyNames);

        // Collecting company names and prices into a map
        Map<String, Double> companyPriceMap = createGainersList()
                .stream()
                .collect(Collectors.toMap(GainerItem::getCompanyName, GainerItem::getCurrentPrice, (existingValue, newValue) -> Math.max(existingValue, newValue)));
        System.out.println("Company Prices: " + companyPriceMap);

        // Collecting into an unmodifiable list (immutable collection)
        List<Double> priceList = createGainersList().stream()
                .filter(currentPrice -> currentPrice.getCurrentPrice() > 200)
                .map(GainerItem::getCurrentPrice)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Price List (Unmodifiable): " + priceList);

        // Joining company names into a single string
        String joinedNames = createGainersList().stream()
                .filter(currentPrice -> currentPrice.getCurrentPrice() > 200)
                .map(GainerItem::getCompanyName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);

        // Grouping companies by their current price being even or odd
        Map<Boolean, List<GainerItem>> partitionedByPrice = createGainersList().stream()
                .collect(Collectors.partitioningBy(currentPrice -> currentPrice.getCurrentPrice() % 2 == 0));
        System.out.println("Partitioned by Price (Even/Odd): " + partitionedByPrice);

        // Grouping by company name
        Map<String, List<GainerItem>> groupedByCompanyName = createGainersList().stream()
                .collect(Collectors.groupingBy(GainerItem::getCompanyName));
        System.out.println("Grouped by Company Name: " + groupedByCompanyName);

        // Grouping by company name and mapping to a list of prices
        Map<String, List<Double>> pricesGroupedByCompany = createGainersList().stream()
                .collect(Collectors.groupingBy(GainerItem::getCompanyName,
                        Collectors.mapping(GainerItem::getCurrentPrice, Collectors.toList())));
        System.out.println("Prices Grouped by Company: " + pricesGroupedByCompany);

        // Counting the occurrences of each company
        Map<String, Long> companyCount = createGainersList().stream()
                .collect(Collectors.groupingBy(GainerItem::getCompanyName, Collectors.counting()));
        System.out.println("Company Count: " + companyCount);

        // Collecting and then applying a function (collectingAndThen)
        Map<String, Long> companyCountAfterMapping = createGainersList().stream()
                .collect(Collectors.groupingBy(GainerItem::getCompanyName,
                        Collectors.collectingAndThen(Collectors.counting(), Function.identity())));
        System.out.println("Company Count (After Mapping): " + companyCountAfterMapping);

        // Max and Min price using Comparator
        Optional<GainerItem> maxPriceItem = createGainersList().stream()
                .max(Comparator.comparing(GainerItem::getCurrentPrice));
        System.out.println("Max Price Item: " + maxPriceItem.orElse(null));

        Optional<GainerItem> minPriceItem = createGainersList().stream()
                .min(Comparator.comparing(GainerItem::getCurrentPrice));
        System.out.println("Min Price Item: " + minPriceItem.orElse(null));
    }
}

