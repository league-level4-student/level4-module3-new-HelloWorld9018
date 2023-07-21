package _00_Intro_to_Linked_Lists;

public class myLinkedListTester {
	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<>();
		myLinkedList.add("Billy");
		myLinkedList.add("bob");
		myLinkedList.add("JOEL");
		myLinkedList.add("keyla");
		myLinkedList.add("Kylie");
		myLinkedList.add("Georgie");
		myLinkedList.add("bobby");
		myLinkedList.print();
		System.out.println(myLinkedList.size());
		myLinkedList.remove(2);
		myLinkedList.print();
		
		Node<String> myNode = myLinkedList.getHead();
		while(myNode!=null) {
			myNode.setValue(myNode.getValue().toUpperCase());
			myNode = myNode.getNext();
		}
		myLinkedList.print();
		
		//myNode.getPrev()
	}
}
