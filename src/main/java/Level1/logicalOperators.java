/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;
import java.util.Objects;
/**
 *
 * @author UDIT DEO
 */
public class logicalOperators {

    public static void main(String[] args) {
        int n = 5, m = 7;
        Integer i1 = 98;
        Integer i2 = 98;
        System.out.println(Objects.equals(i2, i1));

        System.out.println("Result is " + (double)(~n % m));
        System.out.println(Math.abs(-9.0));
        
        char c = 'a';
        
        System.out.println((int)c);
    }

}
