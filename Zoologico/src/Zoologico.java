import animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;
        while (true){
            System.out.println("---------- ZOOLOGICO ----------\n");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Cadastrar funcionario");
            System.out.println("0 - Sair");
            System.out.print(">> ");
            op = scan.nextInt();
            if (op == 0){
                break;
            }
            if (op == 1){
                System.out.println("---------- CADASTRO DE ANIMAL ----------");
            }
        }

    }
}