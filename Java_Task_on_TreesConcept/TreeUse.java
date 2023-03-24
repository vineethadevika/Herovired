import java.util.Scanner;
public class TreeUse {
public static TreeNode<Integer> takingInput(Scanner sc)
{
	System.out.print("Enter the value of next Root:");
	int n=sc.nextInt();
	TreeNode<Integer> root=new TreeNode<>(n);
	System.out.print("Enter the number of children in "+n+" : ");
	int children=sc.nextInt();
	for(int i=0;i<children;i++)
	{
		TreeNode<Integer>child=takingInput(sc);
		root.children.add(child);
	}
	System.out.println();
	return root;
}
public static void printNode(TreeNode<Integer> root)
{
	 
	    	String s=root.data+" : ";
	    	for(int i=0;i<root.children.size();i++)
	    	{
	    		s=s+root.children.get(i).data+" , ";
	    	}
	    	 System.out.println(s);
	    	 for(int i=0;i<root.children.size();i++)
		    	{
		    		printNode(root.children.get(i));
		    	}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	TreeNode<Integer> root=takingInput(sc);
	printNode(root);    
}
}

/*
Output:

Enter the value of next Root:1
Enter the number of children in 1 : 2
Enter the value of next Root:2
Enter the number of children in 2 : 2
Enter the value of next Root:4
Enter the number of children in 4 : 0

Enter the value of next Root:5
Enter the number of children in 5 : 0


Enter the value of next Root:3
Enter the number of children in 3 : 2
Enter the value of next Root:6
Enter the number of children in 6 : 0

Enter the value of next Root:7
Enter the number of children in 7 : 0



1 : 2 , 3 , 
2 : 4 , 5 , 
4 : 
5 : 
3 : 6 , 7 , 
6 : 
7 : 

*/
