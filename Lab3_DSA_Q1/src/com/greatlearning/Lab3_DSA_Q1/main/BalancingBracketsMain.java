package com.greatlearning.Lab3_DSA_Q1.main;

import java.util.Stack;

public class BalancingBracketsMain
{

public static void main(String[] args)
{
	String openingBrackets="({[";
	String inputString="( [ [ { } ] ] )";
	boolean unbalanced=false;
	
	Stack<Character> stack=new Stack<>();
	
	breakFor:
		
	for(int i=0;i<inputString.length();i++)
	{
		char ch =inputString.charAt(i);
		
		
		switch (ch) 
		{
		
		case '(':
		case '{':
		case '[':
			
			stack.push(ch);
			continue;
			
		case')':
			
			if(stack.empty() || (stack.pop()!='('))
			{
				unbalanced=true;
				break breakFor;
			}
			
			continue;
			
        case'}':
			
			if(stack.empty() || (stack.pop()!='{'))
			{
				unbalanced=true;
				break breakFor;
			}
			
			continue;
			
        case']':
			
			if(stack.empty() || (stack.pop()!='['))
			{
				unbalanced=true;
				break breakFor;
			}
			
			continue;
		}
	}
	


	
	if(unbalanced || !stack.empty())
	{
		System.out.println("The entered Strings do not contain Balanced Brackets");
	}
	
	else
	{
		System.out.println("The entered String has Balanced Brackets");
	}
}

}
