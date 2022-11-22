/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author tiegancozzie
 */
public class Node {
    private String continent;
    private String location;
    private int date;
    private int total_cases;
    private int new_cases;
    private int population;
    private Node next;
    private Node prev;
    
    Node(String cont, String loc, int d, int tc, int nc, int pop){
        next = null;
        prev = null;
        continent=cont;
        location=loc;
        date=d;
        total_cases=tc;
        new_cases=nc;
        population=pop;
    }
    
    public void setNext(Node n){
            next = n;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setPrev(Node p)
    {
        prev = p;
    }
    public Node getPrev(){
        return prev;
    }
    
    
    @Override
    public String toString()
    {
        return "New Cases: "+new_cases+" at "+location+" on "+date+" Total: "+total_cases+" Pop: "+population;
    }
    
}
