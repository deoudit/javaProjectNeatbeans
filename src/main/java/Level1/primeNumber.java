/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

/**
 *
 * @author UDIT DEO
 */
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Input the number upto which you want to find prime numbers");
        Integer n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        System.out.println("-----------------------------");
        boolean isPrime [] = new boolean[n+1]; 
        
        for (int i=0; i<n+1; i++){
            isPrime[i] = i >= 2;
        }
        
        for (int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for (int j=i*i; j<=n; j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        
        for (int i=2; i<=n; i++){
            if (isPrime[i]){
                System.out.println(i);
            }
        }
        }
    }

