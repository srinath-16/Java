import java.util.Scanner;
public class ifelseif {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        if(age<=3){
            System.out.println("child:");
        }
        else if (age>=4 && age<=12){
            System.out.println("kid:");
        }
        else if (age>=12 && age<=18){
            System.out.println("teenager:");
        } 
        else if (age>=18 && age<=25){
            System.out.println("Youngster:");
        } 
         else if (age>=25 && age<=50){ 
            System.out.println("adult:");
    }
    else 
        {
        System.out.println("old:");
    }
    
}
}
