package learning;

public class nodeUtility {
	public node root;
	public int listCount;
	public nodeUtility() {
		root = new node(0);
		listCount = 0;
	}
	public node add(int d,String data) {
		node end = new node(d);
		end.data = data;
		node current = root;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = end;
		listCount++;
		//System.out.println("Node created");
		return root;
	}
	public void displayNodeValue() {
		System.out.println("Index of nodes are:");
		node current = root;
		while(current.next!=null) {
			System.out.print(current.index+"->");
			current = current.next;
		}
		System.out.println(current.index);
	}
}