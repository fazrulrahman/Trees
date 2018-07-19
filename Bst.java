import java.io.*;
import java.util.Scanner;

class Node{
	int data;
	Node left, right;

	public Node(){
		left = right = null;
		data = 0;
	}

	public Node(int n){
		left = right = null;
		data = n;
	}

	public void setLeft(Node n){
		left  = n;
	}

	public void setRight(Node n){
		right = n;
	}

	public Node getLeft(){
		return left;
	}

	public Node getRight(){
		return right;
	}

	public void setData(int n){
		data = n;
	}

	public int getData(){
		return data;
	}

}

class BinarySTree{
	private Node root;

	BinarySTree(){
		root = null;
	}
	void insert(int data){
		root = insert(root,data);
	}

	private Node insert(Node node, int data){
		if(node == null)
			node = new Node(data);
		else{
			if (node.getData() < data) 
				node.right = insert(node.right, data);
			
			else
				node.left = insert(node.left, data);
		}
		return node;
	}

	public void inorder(){
		inorder(root);
	}

	private void inorder(Node r){
		if (r != null){
			inorder(r.getLeft());
			System.out.println(r.getData() + " ");
			inorder(r.getRight());
		}
	}
}

class Bst{

	public static void main(String[] args) {
		BinarySTree bst = new BinarySTree();
		int choice = 1;

		do{
			System.out.println("Enter Operation:\n 1. Insert \n 2. Inorder \n 5. Exit");
			Scanner s = new Scanner(System.in);

			choice = s.nextInt();
			switch(choice)
			{
				case 1:
						System.out.println("Enter number to insert into tree");
						int valueToInsert = s.nextInt();		
						bst.insert(valueToInsert);
						break;

				case 2:
						bst.inorder();
						break;

				case 5:
						break;
			}
		}while(choice != 5);
	}
}
