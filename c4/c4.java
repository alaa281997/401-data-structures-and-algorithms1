package c4;


import java.util.*;
  
public class c4
{
	public static void main(String[] args) {
	    int[][] arr={{1, 2, 3},{ 3, 5, 7}, {1, 7, 10}}; 
		System.out.println(Arrays.toString(arrOfarr(arr)));
	}
	//[[1.2.3],[]]
	public static int[] arrOfarr(int[][] arr){
	    
	     int[] sum = new int[arr.length];
	    for(int i = 0; i<arr.length ;i++){
	        for (int j = 0; j<arr[i].length;j++){
	            sum[i] += arr[i][j];
	            
	        }
	    }
	    return sum;
	}
}
