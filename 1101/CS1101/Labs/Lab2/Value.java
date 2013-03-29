/**
 * @(#)Value.java
 *
 *
 * @author 
 * @version 1.00 2009/1/21
 */
import java.util.Scanner;

public class Value {
	private int minValue = 1;
	private int maxValue = 100;
	private String  promptString = "Please enter an Integer between  1-100 inclusive";
//	default constructor. using 1-100
    public Value() {
    }
//	other constructor set your own values    
    public Value(int minValue, int maxValue){
    	this.minValue = minValue;
    	this.maxValue = maxValue;
    	setString(minValue, maxValue);
    }
//	sets the String which prompts for a int between set values    
    private void setString(int minValue, int maxValue){
    	promptString = "Please enter an Integer between  "+minValue+"-"+maxValue+" inclusive";
    }
//	standard to string method returning all variables    
    public String toString(){
    	String result = "***\nminValue ="+minValue+"\nmaxValue ="+maxValue+"\npromptString ="+promptString+"\n***";
    	return result; 
    }
//	gets a value between the min and max. will ask until you get it correct.    
    public void getValue(){
    	boolean valid = false;
    	while (!valid){
    	System.out.println(promptString);	
    	Scanner input = new Scanner(System.in);
    	int value = input.nextInt();
    	valid = isValid(value);    	
    	}    	
    }
//	checks to see if value is valid.    
    private boolean isValid(int Value){
    	if (Value>maxValue||Value<minValue)
    		return false;
    	return true;  	
    }
    
    
}