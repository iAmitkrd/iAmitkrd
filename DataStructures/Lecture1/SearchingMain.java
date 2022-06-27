import java.util.Scanner;


public class SearchingMain{
    public static int LinearSearch(int[] arr, int key){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == key)
                return i;
                
            }
            return -1;
        
        }

    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {88,33,66,99,44,77,22,55,11};
    System.out.println("Enter Key to Search: ");
    int key = sc.nextInt();
    int index = LinearSearch(arr, key);
    if (index !=-1)
        System.out.println("Key Found at index: " +index);
    else
        System.out.println("Key Not Found");

        

    
}
}
