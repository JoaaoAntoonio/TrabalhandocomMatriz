/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 1
 */
public class Matriz {
    public static void main(String[] args){
        int n,m,aux=0;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero N para matriz:");
        n = sc.nextInt();
        System.out.println("Digite o numero M para matriz:");
        m = sc.nextInt();
        int[][] matriz = new int [n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o numero a ser procurado na matriz:");
        int procurado = sc.nextInt();
        
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(procurado==matriz[i][j]){
                
                    System.out.println("Posicao:"+i+","+j);
                    if(j>0){
                System.out.println("Esquerda:"+matriz[i][j-1]);
                }
                if(j<m-1){
                System.out.println("Direita:"+matriz[i][j+1]);
                }
                if(i<n-1){
                System.out.println("Abaixo:"+matriz[i+1][j]);
                }
                if(i>0){
                System.out.println("Em cima:"+matriz[i-1][j]);
                }
                }
                
                
            }
        }
       
    
    }
}
