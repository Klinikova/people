/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author PolinaYoga
 */
public class student extends People {
    @Override
    public void work(){
        System.out.println("Student works");
}
    public static void main(String[] args){
        student poorStudent = new student(); 
        poorStudent.work();
        poorStudent.study();
        
        People people = poorStudent;
        people.work();
        people.study();
    }
}

