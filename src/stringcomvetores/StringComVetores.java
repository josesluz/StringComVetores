/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomvetores;

public class StringComVetores {

    public static void main(String[] args) {
        int ano = 2018;
        int v[] = {1, 2, 3};       
        double[] numeros = new double[10];
        //Imprimindo
        System.out.println(v[1]);
        numeros[5] = 500; // Atribuindo o valor 500 na posição 5 do vetor
        System.out.println(numeros[5]);
        
        //String
        String palavra = "Curso de Java";
        System.out.println(palavra.charAt(0));
        System.out.println(palavra.charAt(5));
        System.out.println(palavra.replace('a', 'e'));
        //System.out.println(palavra.replace(' ', '/'));

        //palavra = palavra.replace('a', 'e');
        //System.out.println(palavra);
        String palavra2 = palavra.replace(' ', '/');
        System.out.println(palavra2);
        System.out.println(palavra2.substring(0, 5));
        System.out.println(palavra2.substring(9));
        System.out.println(palavra2.toUpperCase());
        System.out.println(palavra2.toLowerCase());
        System.out.println(palavra+palavra2);
        
        //Imprimindo Vetores
        for(int i=0; i<v.length; i++){ //length faz a leitura do tamanho do vetor
        System.out.println(v[i]);
        }    
        for (int j=0; j < palavra.length(); j++){
            System.out.println(palavra.charAt(j));
        }
    }
}