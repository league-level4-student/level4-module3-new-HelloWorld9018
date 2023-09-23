package _03_Intro_to_Binary_Trees;

public class BinaryTreeDemo {

    /*
     * A Binary Tree is a data structure that makes use of nodes and references
     * like a LinkedList, but instead of the nodes pointing to a previous node
     * or next node in an unorderd list they each points to two child nodes that
     * are below them in the hierarchy.
     * 
     * Some important properties of BinaryTree are:
     * 
     * -The left node is always a smaller value than its parent and the right
     * node is always a larger value. This is a property you have seen in some
     * form already via Binary Search.
     * 
     * -Empty nodes are null references.
     * 
     * -The parent node at the very top of the tree is called the root.
     * 
     * 1. Read through the BinaryTree and Node classes.
     * 
     * 2. Create a BinaryTree of any type you like.
     * 
     * 3. Try using some BinaryTree methods to insert, search for, delete and
     * print elements.
     * 
     * 4. Save the root into a Node Object and use references to traverse
     * through the BinaryTree and perform an operation on every element(You may
     * choose to do this recursively or iteratively). Then print it out to see
     * if it worked.
     * 
     */

    public static void main(String[] args) {
    	BinaryTree<String> tree = new BinaryTree<String>();
    	tree.insert("Hello");
    	tree.insert("Hi");
    	tree.insert("GAR");
    	tree.insert("Aa");
    	tree.insert("a");
    	tree.printHorizontal();
    	tree.search("Hi");
    	System.out.println("FOUND VALUE: " + tree.recursiveSearch(tree.getRoot(), "Hi").getValue());
    	
    	tree.delete("Hi");
    	tree.printVertical();
    	tree.search("Hi");
    	
    	//completed steps 1-3 and now understand binary trees
    	
    	Node<String> root = tree.getRoot();
   
    	toUpper(root);
    	 
    }
    
    static void toUpper (Node<String> root) {
    	if(root == null) {
    		return;
    	}
    	root.setValue(root.getValue().toUpperCase());
    	System.out.println(root.getValue());
    	toUpper(root.getLeft()); //depth first
    	toUpper(root.getRight());
    	
    }

}
