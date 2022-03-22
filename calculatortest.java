import java.util.*;
public class calculatortest {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number");
        int b=sc.nextInt();
	calculator calc=new calculator();
        int addResult=calc.add(a, b);
        System.out.println("sum:"+addResult);
        int subResult=calc.sub(a, b);
        System.out.println("Difference:"+subResult);
        int mulResult=calc.multiply(a, b);
        System.out.println("Product:"+mulResult);
        float divResult=calc.div(a, b);
        System.out.println("division:"+divResult);
    }
    
        
    
}
