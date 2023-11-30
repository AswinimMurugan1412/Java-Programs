package Tree;
class Binary{
	int item;
	Node right,left;
	public Binary(int key) {
		item=key;
		right=left=null;
	}
}

public class Tree_Exp {
	Node root;
	Tree_Exp(){
		root=null;
	}
     void inorder(Node node) {
    	 if(node==null)
    		 return;
    	 inorder(node.left);
    	 System.out.print(node.item+"->");
    	 inorder(node.right);
     }
     void preorder(Node node) {
    	 if(node==null)
    		 return;
    	 System.out.print(node.item+"->");
    	 preorder(node.left);
    	 preorder(node.right);
     }
     void postorder(Node node) {
    	 if(node==null)
    		 return;
    	 postorder(node.left);
    	 postorder(node.right);
    	 System.out.print(node.item+"->");
     }
     

	public static void main(String[] args) {
		Tree_Exp trees= new Tree_Exp();
         trees.root=new Node(1);
         trees.root.left=new Node(12);
         trees.root.right=new Node(13);
         trees.root.left.left=new Node(6);
         trees.root.left.right=new Node(10);
         trees.root.right.left=new Node(8);
         trees.root.right.right=new Node(9);
         trees.root.left.left.left=new Node(2);
         trees.root.left.left.right=new Node(3);
         System.out.println("Inorder traversal");
		 trees.inorder(trees.root);
		 System.out.println("\nPreorder traversal");
		 trees.preorder(trees.root);
		 System.out.println("\nPostorder traversal");
		 trees.postorder(trees.root);
         
	}

}
