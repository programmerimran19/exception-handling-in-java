/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package govtjob;

public class Test {
    
    static void solution (double a) throws MyException{
        
        if (a < 3.00)
        {
            throw new MyException(a);
            
        }
        System.out.println("You are available for Job Application");
    }
    
}
