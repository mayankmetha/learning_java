package learning;

public class nodeUtility {
	public node root;
	public int listCount;
	public nodeUtility() {
		root = new node("root");
	}
	public node add(String data) {
		node end = new node(data);
		node current = root;
		for(;current.next!=null;current=current.next);
		current.next = end;
		return root;
	}
	public node addAfter(String data,String nodeIndex) {
		node toadd = new node(data);
		toadd.data = data;
		node prev = root;
		for(;prev.data!=nodeIndex&&prev.next!=null;prev = prev.next);
		toadd.next = prev.next;
		prev.next = toadd;
		return root;
	}
	public void displayNodeValue() {
		System.out.println("Index of nodes are:");
		node current = root;
		for(;current.next!=null;current=current.next) {
			System.out.print(current.data+"->");
		}
		System.out.println(current.data);
	}
}