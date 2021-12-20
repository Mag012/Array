
package array_treino;

import java.util.Scanner;//usado para capturar os dados do usuaio;


public class Array_treino {

    
    public static void main(String[] args) {
        int[] vetor;// declara o array identificado
        vetor = new int[10];//cria o objeto do array com 10 posiçoes;
        
        for(int cont =0;cont<vetor.length;cont++){//prenchendo o vetor 
            System.out.printf( "%5d%8d\n",cont,vetor[cont]);//imprimindo cada posição do vetor.
        }
        int []dados = {20,30,40,50,60,70,80,90};// fiz o meu vetor de dados receber esses dados,
        System.out.printf("%s%8s\n","index","value");
        
        for(int cont =0;cont<dados.length;cont++){
            System.out.printf("%5d%8d\n",cont,dados[cont]);//Aqui eu estou imprimindo cada posição do meu vetor de dados.
        }
        
        
        System.out.println("------------------------------------");
        //Criando outro vetor sem uma quantidade determinada
        int qtd;//dessa forma posso criar um array onde o usuario escolhe a quantidade de dados que deseja trabalhar
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com a Quantidade de dados");
        qtd = ler.nextInt();
        
        int[] number = new int[qtd];//estrutura de um array.
           System.out.println("Prenchento o vetor com os dados:");
           for(int i=0;i<number.length;i++){
               
               System.out.println("number["+(i+1)+"] = ");
               number[i]=ler.nextInt();
           }
           
           for(int h =0;h<number.length;h++){
               System.out.println("Os numeros coletados foram " +number[h]);
               
           } 
    }
    
}
