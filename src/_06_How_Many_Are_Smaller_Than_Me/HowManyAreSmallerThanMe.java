package _06_How_Many_Are_Smaller_Than_Me;

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

    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	
    	AVLNode<Integer> givenNode = new AVLNode<Integer>(me);
    	
    	AVLNode<Integer> currentNode = avlTree.getRoot();
    	System.out.println(me);
    	int counter = 0;
    	//if on right branch
    	if(avlTree.getRoot().getValue() < givenNode.getValue()) {
    		setCurrentToSmallest();
    		while(currentNode!=givenNode) {
    			//currentNode.getRight until it currentNode = givenNode
    			counter++;
    		}
    	}
    	//if on left branch
    	
    	// I actually don't know what's going on nvm. Restart later.
    	currentNode = givenNode;
    	while(currentNode!=null) {
    	currentNode = currentNode.getLeft();
    	counter++;
    	}
    	System.out.println(counter);
    	//System.out.println(currentNode == startingNode);
    	
    	/*while() {
    		
    	}*/
        return counter;

    }

	private void setCurrentToSmallest() {
		// TODO Auto-generated method stub
		//getting smallest value in avlTree
	}

}
