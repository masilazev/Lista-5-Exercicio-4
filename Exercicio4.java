import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x>0){
            System.out.println("P");  
        }
        else{
            System.out.println("N");
        }
    }
}