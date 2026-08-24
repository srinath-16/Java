import java .util.*;
public class arrayreverse {
    public static void revarray(int[]num){
        int l=0;
        int r=num.length-1;
        while(l<r){
            int temp =num[l];
            num[l]= num[r];
            num[r]=temp;
            l++;
            r--;
        }   
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int num[]= new int[n];
        for(int i =0;i<num.length;i++){
        num[i]=sc.nextInt();
        }revarray(num);
        System.out.println("the rev of array :");
         for(int i =0;i<num.length;i++){
            System.out.print(num[i]+" ");
    }System.out.println();
    sc.close();
       }

}
