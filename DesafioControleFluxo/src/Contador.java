import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        entrada.close();

        try{
            contar(numero1, numero2);
        }
        catch (ParametrosInvalidosException verificador){
            System.out.println("Erro: " + verificador.getMessage());
        }
    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException {      
        if (numero1 > numero2 || numero1 == numero2){
            throw new ParametrosInvalidosException();
        }
        else{
            int contador = numero2 - numero1;
            for(int i = 1; i <= contador; i++){
                System.out.println("Imprimindo o valor: " + i);
            }
        }
    }
}
