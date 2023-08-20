import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

            System.out.print("Numero 1: ");
            int num1 = sc.nextInt();
            System.out.print("Numero 2: ");
            int num2 = sc.nextInt();

            try{
                contar(num1, num2);
            } 
            catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

            
        sc.close();
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException("Paramentro invalido");
        }else{
            int soma = num2 - num1;
                for(int i =1; i <= soma; i++){
                    System.out.println("imprindo o numero: " + i);
                }
        }
    }
}
