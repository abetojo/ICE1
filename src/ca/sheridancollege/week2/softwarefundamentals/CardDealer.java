/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 * Student ID: 991602946
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        //Added a print statement
        System.out.println(nineClubs);
    }
}
