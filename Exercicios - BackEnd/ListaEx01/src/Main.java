import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //final = const
        System.out.print("digite o salario:");
        final float salario  = leitor.nextFloat();

        if(salario < 1000) {
            var novoSalario = salario * 1.1f https://github.com/SamantaMelissa/JavaScript.git ;
            System.out.println(novoSalario);
        } else{
            System.out.println("Salario dentro da faixa");
        }

      }
    }
