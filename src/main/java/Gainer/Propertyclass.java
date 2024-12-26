//package Gainer;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//import java.util.Properties;
//import java.util.stream.Collectors;
//
//public class Propertyclass {
//
//
//
//
//
//
//
//	    private static final Properties property = new Properties();
//	    private static final Map<String, String> CONFIGMAP = new HashMap<>();
//
//
//
//	    static {
//	        try (FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath())) {
//	            property.load(file);
//	            CONFIGMAP.putAll(property.entrySet().stream()
//	                    .collect(Collectors.toMap(
//	                            e -> String.valueOf(e.getKey()),
//	                            e -> String.valueOf(e.getValue()).trim();
//
//	                            Map<String, List<Person>> peopleByState = peopleStream.collect(Collectors.groupingBy(Person::getState));
//
//
//
//	                    )));
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	            System.exit(0);
//	        }
//	    }
//
//	    public static String get(ConfigProperties key) {
//	        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
//	            throw new PropertyFileUsageException(
//	                    "Property name " + key + " is not found. Please check config.properties");
//	        }
//	        return CONFIGMAP.get(key.name().toLowerCase());
//	    }
//	}
//
