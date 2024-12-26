package Gainer;

public class Array {

    // Array initialization
    Object[] k = new Object[5000];

    // Constructor or method to initialize the array
    public Array() {
        // Fill the array with values
        for (int i = 0; i < k.length; i++) {
            k[i] = i; // Example: setting each element to its index value
          
        }
    }

    // Method to print the array
    public void printArray() {
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array array = new Array(); // Create an instance of Array
        array.printArray();        // Print the array elements
    }
}
