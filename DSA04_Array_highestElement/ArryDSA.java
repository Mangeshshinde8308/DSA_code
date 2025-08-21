package DSA04_Array_highestElement;

import java.util.Scanner;

public class ArryDSA {

public static int fectchHighestElement(int array[]){

    int highestElement =array[0];
    for(int i=0;i<array.length;i++){
           if(array[i]>highestElement){
            highestElement = array[i];
    }

    }
    return highestElement;
}

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size :");
        int arrSize=sc.nextInt();
        int arr[]=new int[arrSize];
        System.out.println("Enter your array elements :");
        for(int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();
        }

       int highestNum= fectchHighestElement(arr);
        System.out.println("Highest element in the array is : "+highestNum);
        sc.close();

    }

}
