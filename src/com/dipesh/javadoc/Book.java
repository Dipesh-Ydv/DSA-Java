/**
 * @author Dipesh Yadav
 * @version 2.0
 * @since 2023
 */
package com.dipesh.javadoc;

/**
 * Class for Library Book
 */
public class Book {
    /**
     * Number of books available
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Constructor
     * @param s Book Name
     */
    public Book(String s) {}

    /**
     * Issue a Book to a student
     * @param roll Roll number of a Student
     * @throws Exception If Book is not available, throws exception
     */
    public void issue(int roll) throws Exception {}

    /**
     * Check if Book is available
     * @param name str Book name
     * @return if Book is available returns true else return false
     */
    public boolean available(String name) {return true;}

    /**
     * Get Book name
     * @param id Book id
     * @return returns Book name
     */
    public String getName(int id) {return "";}
}
