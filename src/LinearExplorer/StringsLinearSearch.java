package LinearExplorer;

import java.util.*;

public class StringsLinearSearch {
  String arr[] = { "apple", "banana", "cherry", "date", "elderberry",
      "fig", "grape", "honeydew", "kiwi", "lemon" }; // predefined array
  int location; // variable to store position of the element found

  public boolean search(String key) // search function checks out for key in the array
  {
    for (int i = 0; i < arr.length; i++) // for loop for traversing array
    {
      if (arr[i].equalsIgnoreCase(key)) // comparing key with current element in array (case insensitive)
      {
        location = i; // storing the index of current location
        return true;
      }
    }
    return false; // key not found
  }

  public static void main(String args[]) // main function
  {
    Scanner scan = new Scanner(System.in); // Creating Scanner class object
    StringsLinearSearch obj = new StringsLinearSearch(); // Creating Linear_Search class object

    System.out.println("The predefined array is:");
    for (String item : obj.arr) {
      System.out.print("- " + item + " ");
    }

    System.out.println("\n\nEnter the text to search:"); // Prompting the user
    String key = scan.nextLine(); // Taking element to be searched from user
    boolean flag = obj.search(key); // Calling search() function

    if (flag) {
      System.err.println("-------------------------------");
      System.out.print("Key found and it is at position: " + (obj.location + 1)); // displaying the result
    } else {
      System.out.print("Key not found");
    }

    scan.close();
  }
}