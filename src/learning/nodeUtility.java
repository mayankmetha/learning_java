package learning;

public class nodeUtility {
	public node root;
	public int listCount;
	public nodeUtility() {
		root = new node(0);
	}
	public node add(int d,String data) {
		node end = new node(d);
		end.data = data;
		node current = root;
		for(;current.next!=null;current=current.next);
		current.next = end;
		return root;
	}
	public node addAfter(int d,String data,int nodeIndex) {
		node toadd = new node(d);
		toadd.data = data;
		node prev = root;
		for(;prev.index!=nodeIndex&&prev.next!=null;prev = prev.next);
		toadd.next = prev.next;
		prev.next = toadd;
		return root;
	}
	public void displayNodeValue() {
		System.out.println("Index of nodes are:");
		node current = root;
		for(;current.next!=null;current=current.next) {
			System.out.print(current.index+"->");
		}
		System.out.println(current.index);
	}
}