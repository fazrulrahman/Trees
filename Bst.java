import java.io.*;
import java.util.Scanner;

class Node{
	int key;
	Node left, right;

	Node(int item){
		key = item;
		left = right = null;
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

	Node insert(Node node, int data){
		if(node == null)
			node = new Node(data)
		else{
			if (node.getRight() == null) {
				node.right = insert
				
			}
		}
	}
}

class Bst{

	public static void main(String[] args) {
		BinarySTree bst = new BinarySTree();

		int count = 10;
		while(count != 0){

			System.out.println("Enter number to insert into tree");
			Scanner s = new Scanner(System.in);
			int valueToInsert = s.nextInt();

			bst.insert(valueToInsert);

			count--;
		}
	}
}
