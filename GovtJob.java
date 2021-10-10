/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package govtjob;

import java.util.Scanner;

public class GovtJob {

    public static void main(String[] args) {
        
        try{
            System.out.print("Enter Your Gpa: ");
            Scanner jpa = new Scanner(System.in);
            double a = jpa.nextDouble();
            Test.solution(a);
            
        }catch(MyException i){
            System.out.println("You are not available for Job Application" +i);
        }
    }
    
}
