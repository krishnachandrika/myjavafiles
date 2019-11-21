package symboltable;
class StNode{
	StNode left;
	StNode right;
	String key;
	int data;
	int count;
	StNode(String key,int data){
		this.key=key;
		this.data=data;
	}
	public String toString() {
		return "key "+this.key+ " data "+ this.data + " count "+ this.count;
	}
	
}
class StringTree{
	
	StNode root;
	
	void insert(String key,int data) {
		root=insertRec(root,key,data);
	}
	
	StNode insertRec(StNode root,String key,int data) {
		int compare;
		if(root==null) {
			root=new StNode(key, data);
			return root;
		}
		else {
			compare=root.key.compareTo(key);
			if(compare==0) {
				root.data=data;
				root.count++;
			}
			else if(compare==1) {
				root.left=insertRec(root.left,key,data);
			}
			else {
				root.right=insertRec(root.right,key,data);
			}
		}
		return root;
	}
	
	void inOrder(StNode cur) {
		if(cur!=null) {
			inOrder(cur.left);
			System.out.println(cur);
			inOrder(cur.right);
		}
		
	}
}
public class SymbolTableBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTree ob=new StringTree();
		ob.insert("a", 1);
		ob.insert("b", 2);
		ob.insert("c", 3);
		ob.insert("d", 3);
		ob.insert("e", 4);
		ob.insert("a", 10);
		ob.insert("a", 100);
		ob.inOrder(ob.root);
	
		

	}

}
