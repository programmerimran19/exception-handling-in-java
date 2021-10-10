/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package govtjob;

public class MyException extends Exception{
    
    private double job;
    MyException (double r) {job = r;}
    @Override
    public String toString()
    {
        return "["+job+"]";
    }
    
}
