/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortNumbers;
import java.util.Arrays;

/**
 *
 * @author Yasemin
 */
public class SortNumbers {

    /**
     * @param args the command line arguments
     */
  public static void main(String []args){
  //int[] arr={4,13,8,9,7,1,6};
  int[] arr2={7,1,4,5,3,11,8,2};
  int s=0;
  int e=arr2.length-1;
  int temp;
  while(s<e){
    
    for(int i=e;i>s;i--){
        if(arr2[i]>arr2[i-1]){
           temp=arr2[i];
           arr2[i]=arr2[i-1];
           arr2[i-1]=temp;
    }
}
    s++;
    for(int i=s;i<e;i++){
        if(arr2[i]>arr2[i+1]){
            temp=arr2[i];
            arr2[i]=arr2[i+1];
            arr2[i+1]=temp;
        }
    }
      e--;}
      System.out.println(Arrays.toString(arr2));
	}	

}




/*public static void topTwoElements(int [] arrA){

        if(arrA.length<2){
            System.out.println("Invalid Input, array size is less than 2");
        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first<current){
                second = first;
                first = current;
            }else if(second<current){
                second = current;
            }
        }
        System.out.println("top two elements are: " + first + " " + second);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arrA = new int [] { 6, 8, 1, 9, 2, 1, 19};
        topTwoElements(arrA);
      */