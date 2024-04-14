
package vetores;

import java.util.Scanner;


public class Vetores {

    //Crie um programa que peça 10 números, armazene eles em um vetor e diga qual elemento é o maior, qual é o menor.
    public static void main(String[] args) {
        int num[] = new int[10];
        int maior = num[0];
        int menor = Integer.MAX_VALUE;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 10 números: ");
        for (int i=0; i<num.length; i++){
            System.out.println("Número "+(i+1)+ ": ");
            num[i]=leitor.nextInt();
        } for (int i=0; i<num.length;i++){
        if(num[i]>maior){
            maior=num[i];
        }if (num[i]<menor){
            menor=num[i];
        }
    }
        System.out.println("Maior número é: "+maior);
        System.out.println("Menor número é: "+menor);
    }
    
}
