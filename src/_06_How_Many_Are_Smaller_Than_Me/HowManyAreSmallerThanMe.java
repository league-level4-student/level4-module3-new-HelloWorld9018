package _06_How_Many_Are_Smaller_Than_Me;

import _00_Intro_to_Linked_Lists.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */
	//AVLNode<Integer> targetNode;
	int counter;
	int me;
    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	
    	//targetNode = new AVLNode<Integer>(me);
    	
    	AVLNode<Integer> currentNode = avlTree.getRoot();
    	System.out.println("target number: " + me);
    	 counter = 0;
    	 this.me = me;
    	 //goes all the way down, and increases count on the way up. Stops when the branch splits, and does the same process.
    	//try for loop with search method?
    	 System.out.println("start: " + currentNode.getValue());
    	recursiveCounter(currentNode);
    	
    	//isn't exiting the recursive function... why?
    	System.out.println("counter: " + counter);
        return counter;

    }

	private void recursiveCounter(AVLNode currentNode) {
		// TODO Auto-generated method stub
	
		
	/*	if(currentNode.getLeft().getValue()!=null) {
			counter++;
			System.out.println("Left: " + currentNode.getValue() + ", counter: " + counter);
		recursiveCounter(currentNode.getLeft());
		}
		if(currentNode.getRight().getValue()!=null) {
			counter++;
			//why isn't this running?
			System.out.println("Right: " + currentNode.getValue()+ ", counter: " + counter);
		recursiveCounter(currentNode.getRight());
		}
		//Once it reaches the left end point, node goes back up
		if(currentNode.getLeft().getValue() == null || 
				currentNode.getRight().getValue() == null) {
			System.out.println("starting the process of going back up");
		}*/
		if(currentNode == null) {
			return;
		}
		
		//going to the left
		recursiveCounter(currentNode.getLeft());
		if((int)currentNode.getValue() >= me) {
			return;
		}
		counter++;
		recursiveCounter(currentNode.getRight());
		
		
		//LOTS OF PROBLEMS I NEED TO FIX! It shouldn't be this complicated
	}

}
