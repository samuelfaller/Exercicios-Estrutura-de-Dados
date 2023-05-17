/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myhouse.ex1;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */


public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int qtd_num = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade "
                + "de números que gostaria de cadastrar: "));

        int[] numeros = new int[qtd_num];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe um número: "));
            System.out.println("");
        }
        //ORDENAÇÃO 
    public static void Selecao(int[] v) {

        for (int i = 0; i < v.length - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int aux = v[i];
                v[i] = v[posMenor];
                v[posMenor] = aux;

            }
        }
    }
    
    Selecao(numeros);
    //FORMA PESQUISA
    int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe como gostaria de estar efetuando a pesquisa:"
            + "\n1-Pesquisa Linear "
            + "\n2-Pesquisa Binária"));

    switch (escolha) {

        case 1:
            
            public static int pesquisaLinear(int numPesq, int[]vet){

                    for (int i = 0; i < vet.length; i++) {
            
                        if(numPesq == vet[i]){
                            return i;
            
                            JOptionPane.showInputDialog("O número está na "+i+"º Posição");
                            System.out.println("O numeró está na "+i+ "º Posição");
                        }
            
            
            
                    }
                    

                }
            


        case 2:
            
            public static int pesquisaBinaria(int numPesq, int[]vet){
                int esquerda, meio, direita;
                esquerda = 0;
                direita = vet.length - 1;

                while(esquerda <= direita){
                    meio = (esquerda + direita)/2;
                    if(numPesq == vet[meio]){
                        return meio;
                    }
                    if(numPesq > vet[meio]){
                        esquerda = meio +1;
                    }else{
                        direita = meio -1;
                    }
                   
                }

                return -1;
            }
            if (posicaoBinaria = -1) {
                JOptionPane.showMessageDialog(null, "Número não encontrado!");
            } else {
                JOptionPane.showMessageDialog(null, "O número está na posição: " +pesquisaBinaria );
            }

    }
        
        
        
        
        
}
}
    

        

