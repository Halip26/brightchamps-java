package LinearExplorer;

import java.util.*; //importing package

public class Linear_Search // defining class
{
  public static Scanner scan;
  int arr[]; // declaring array
  int location; // variable to store position of the element found

  public void input(int n) // input function fills the array
  {
    arr = new int[n]; // creating the array of given size
    scan = new Scanner(System.in); // Creating Scanner class object
    System.out.println("Please fill the array :");
    for (int i = 0; i < n; i++) // loop to fill array values
    {
      System.out.println("Enter the element:");
      arr[i] = scan.nextInt();
    }
    System.out.println("The given array is:"); // display the given array
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public boolean search(int key) // search function checks out for key in the array
  {
    for (int i = 0; i < arr.length; i++) // for loop for traversing array
    {
      if (arr[i] == key) // comparing key with current element in array
      {
        location = i; // storing the index of current location
        return true;
      }
    }
    return false; // key not found
  }

  public static void main(String args[]) // main function
  {
    int key, size; // declaring variables
    scan = new Scanner(System.in); // Creating Scanner class object
    Linear_Search obj = new Linear_Search(); // Creating Linear_Search class object
    System.out.println("Enter the size of the array:"); // Prompting the user
    size = scan.nextInt(); // Taking size of the array from user
    obj.input(size); // Calling input() function
    System.out.println("\n Enter the value to search:"); // Prompting the user
    key = scan.nextInt(); // Taking elemnt to be searched from user
    boolean flag = obj.search(key); // Calling search() function
    if (flag == true) {
      System.out.print("Key found and it is at position :" + (obj.location + 1)); // displaying the result
    } else {
      System.out.print("Key not found");
    }
  }
}