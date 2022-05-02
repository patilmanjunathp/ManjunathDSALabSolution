package com.greatlearning.Lab3_DSA_Q2.main;

import java.util.HashSet;
import java.util.Set;

public class BinarySearchTree 
{
	
	public static class Node
	{
	  
     int nodeDaata;
	 Node left, right;
	 public int nodeData;
		
	public Node (int nodeData)
	{
	  this.nodeDaata=nodeData;
	}
	
	}
	
	private Node root;
	
	public BinarySearchTree insert(int nodeData)
	{
		if(root==null)
		{
			root=new Node(nodeData);
		}
		
		insert(root, nodeData);
		return this;
	}
	
	private Node insert(Node node , int nodeData)
	{
		if(node==null)
		{
			node=new Node(nodeData);
			return node;
		}
		
		if(nodeData<node.nodeData)
		{
			node.left=insert(node.left, nodeData);
			return node;
		}
		
		if(nodeData>node.nodeData)
		{
			node.right=insert(node.right, nodeData);
			return node;
		}
		
		return node;
		
	}
		
	public void print()
	{
		printAscending(root);
	}
	
	public void printAscending()
	{
		printAscending(root);
	}
	
	public void printDescending()
	{
		printDescending(root);
	}
	
	private void printAscending(Node node)
	{
		if(node.left!=null)
		{
			printAscending(node.left);
		}
		
		System.out.println(node.nodeDaata);
		
		if(node.right!=null)
		{
			printAscending(node.right);
		}
	}
	
	private void printDescending(Node node)
	{
		
		if(node.right!=null)
		{
			printDescending(node.right);
		}
		
		System.out.println(node.nodeDaata);
		
		if(node.left!=null)
		{
			printDescending(node.left);
		}
	
	}
	
	public void printSumPair(int sum)
	{
		
		if(!printSumPair(root,sum,new HashSet<>()))
		{
			System.out.println("No pairs found");
		}
		
	}
	
	private boolean printSumPair(Node node, int sum,Set<Integer> set)
	{
		if(node==null)
		{
			return false;
		}
		
		if(printSumPair(node.left,sum,set))
		{
			return true;
		}
		
		if(set.contains(sum-node.nodeDaata))
		{
			System.out.println("Pair is found ("+(sum-node.nodeDaata+","+node.nodeDaata+")"));
		
		return true;
		
		}
		else
		{
			set.add(node.nodeDaata);
	    }
		
		return printSumPair(node.right,sum,set);
	}
	
}
