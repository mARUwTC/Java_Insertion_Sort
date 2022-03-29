import java.io.*;
public class Insertion_Sort{
    public static void insertionSort(int array[]){
        int n = array.length;  
        for (int j=1; j<n; j++) {  
            int k=array[j];  
            int i=j-1;
            for (;(i>-1)&&(array[i]>k);i--){
                array[i+1]=array[i];
            }
            array[i+1]=k; 
        } 
    }
    public static void main (String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many integers to be input: ");
        int count = Integer.parseInt(buf.readLine());

        int[] num = new int[count];
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<count; i++){
        System.out.print("Enter the " + (i+1) + " numbers: ");
        num[i] = Integer.parseInt(buff.readLine()); }
        insertionSort(num);
        for (int j=0; j<num.length; j++) {
            System.out.println("The " + (j+1) + "-th smallest integer is: " + num[j]);
        }
    }
}
