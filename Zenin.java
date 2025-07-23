package day15;
class Node{
	int val;
	Node left,right;
	Node(int item) {
        val = item;
        left = right = null;
    }
}
public class Zenin {
	 Node root;
	    void inorderTraversal(Node node) {
	        if (node == null) {
	            return;
	        }
	        inorderTraversal(node.left);         
	        System.out.print(node.val + " ");   
	        inorderTraversal(node.right);        
	    }

	public static void main(String[] args) {
		

	}

}
