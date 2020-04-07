import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] list = {1, 5, 9, 10, 15, 16, 18, 20, 26, 29, 30, 56, 80, 92, 98};
        System.out.println("Enter the number you want to find: ");
        Scanner sc = new Scanner(System.in);
        int searchNumber = sc.nextInt();
        if (BinarySearch.binarySearch(list,0,list.length-1,searchNumber)) {
            System.out.println("The number " + searchNumber +" is in the array");
        } else {
            System.out.println("Not available");
        }
    }
}
