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




