package _01_Spies_On_A_Train;

import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	String spy = null;
    	boolean found = false;
    	Node<TrainCar> passenger = train.getHead();
    	HashMap<String, Integer> map = new HashMap<>();
    	
    	while(passenger !=null) {
    		map.put(passenger.getValue().toString(), 0);
    		passenger = passenger.getNext();
    	}
    	
    	passenger = train.getHead();
    	while(passenger != null) {
    		String answer = passenger.getValue().questionPassenger();
    		answer = answer.substring(answer.indexOf("I saw "));
    		
    		for(String c: clues){
    			if(answer.contains(c)) {
    				for(String d: map.keySet()){
    					if(answer.contains(d)) {
    						int matching = map.get(d) +1;
    						if(matching == clues.length) {
    							return d;
    						}
    						map.put(d, matching);
    					}
    				}
    			}
    		}
    		
    		
    		
    		passenger = passenger.getNext();
    		
    	}
    	
    	return null;
    	
    /*	for(int i = 0; i<train.size(); i++) {
    	map.put(train.toString(), 0);
    	//System.out.println(train.to);
    	}
    	
    	while(passenger != null && !found) {
    		String info = passenger.getValue().questionPassenger();
    		TrainCar trainCar = new TrainCar(passenger.getValue().toString(), info);
    		StringBuilder name = new StringBuilder();
    		StringBuilder evidence = new StringBuilder();
    		name.append(info);
    		evidence.append(info);
    		
    		String name1 = name.substring(name.lastIndexOf("saw")+4, name.indexOf(" ", name.lastIndexOf("saw")+4));
    		String evidence1 = evidence.substring(evidence.indexOf(" ", evidence.indexOf(name1))+1);
    		
    		System.out.println(name1 + ", " + evidence1);
    		
    		
    		for(int k = 0; k<clues.length; k++) {
    				//System.out.println(clues[k].toString());
    			int matchingClues = 0;
    				if(evidence1.equalsIgnoreCase(clues[k])) {
    					matchingClues++;
    					map.replace(name1, matchingClues);
    					if(matchingClues>=3) {
    						found=true;
    					}
    				}
    				//analyze info to determine if I can eliminate suspect (2nd name in  string info)
    		}
    		spy = name1;
    		System.out.println(name1);
    		passenger = passenger.getNext();
    		}
    		
    	
    	//spy = passenger.getValue().toString();
        return spy;

    } */

}
}
