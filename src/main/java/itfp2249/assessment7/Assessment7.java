/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp2249.assessment7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jmazzie
 */
public class Assessment7 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int integers[] = new int[7];
        
        System.out.println("Teacher's Copy");
        System.out.println("Enter Seven numbers: ");
        
        for (int i=0; i<integers.length; i++)
        {
            integers[i] = input.nextInt();
        }
        
        ArrayList<Integer> added = new ArrayList<>();
        
        for (int i=0; i<integers.length; i++ )
            if (added.contains(integers[i])==false)
            {
                added.add(integers[i]);
                System.out.println("Number "+integers[i]+" occurs "+occurances(integers[i],integers)+" times");
            }
    }
    public static int occurances(int num, int[] intArray)
    {
        int occurances = 0;
        for (int i=0; i<intArray.length; i++)
        {
            if (intArray[i]==num)
                occurances++;
        }
        return occurances;
    }
}
