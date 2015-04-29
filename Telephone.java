package edu.saintjoe.cs.aribicki.phones;

public class Phone {

    private final String name;
    
    private Object value = null;
    
    
    Public Phone(String name) {
            this.name = name;
            
    public Phone(String name, Object value) {
            this.name = name;
        this.value = value;
         }
         
    public String getname() {
            return name;
            }
            
    public Object getValue() {
            return value;
            }
            
    public Object setValue(Object newValue) {
        Object oldVal = value;
        value = newValue;
        return oldVal;
        }
        
        public String toString() { 
            return name + "='" + value + "'";
            }
            }
