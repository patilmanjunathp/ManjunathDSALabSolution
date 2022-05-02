package com.greatlearning.Lab3_DSA_Q2.main;

public class DriverClass 
{

	public static void main(String[] args)
{
	BinarySearchTree bst=new BinarySearchTree();
	
	bst.insert(40).insert(20).insert(60).insert(10).insert(30).insert(50).insert(70);
	
	bst.printSumPair(130);
}

}
