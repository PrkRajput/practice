package tree;

public class BinaryTree {
	
	// Root of Binary Tree 
    Node root; 
  
    // Constructor
    BinaryTree(int key) 
    { 
        root = new Node(key); 
    } 
    
    // Default constructor
    BinaryTree() 
    { 
        root = null; 
    } 
    
    
////////////////////////////////// ADDING TO BST //////////////////////////////////////
    public BinaryTree addToBST(BinaryTree tree,int data){
    		BinaryTree temp = new BinaryTree();
    		temp = tree;
    		
    		while(true){
	    		if(temp.root==null){
	    			Node node = new Node(data);
	    			temp.root = node;
	    			temp.root = tree.root;
	    			return temp;
	    		}
	    		else
	    		{
	    			if(data<temp.root.data){
	    				if(temp.root.left!=null){
	    					Node node = new Node(data);
	    					temp.root.left=node;
	    				}
	    				else
	    					temp.root=temp.root.left;
	    			}
	    			else if(data>=temp.root.data){
	    				if(temp.root.left!=null){
	    					Node node = new Node(data);
	    					temp.root.left=node;
	    				}
	    				else
	    					temp.root=temp.root.right;
	    			}
	    		}
    		}   		
    }
    
//////////////////////////////// DISPLAY TREE /////////////////////////////////////////
    public static  void printBinaryTree(Node root, int level){
        if(root==null)
             return;

        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
                System.out.println("|-------"+root.data);
        }
        else
            System.out.println(root.data);
        printBinaryTree(root.left, level+1);
    }    
}
