/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import package2.Car;

/**
 *
 * @author admin
 */
public class Starting {

    public static void main(String[] args) {
        Tool saw = new Tool();
        saw.use();
        saw.getType();

        Car.go();
        Car.stop();

    }
    
    public static void preparing(){
        System.out.println("Prep");
    }
}
