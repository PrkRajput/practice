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
    		
    		if(temp.root==null){
    			Node node = new Node(data);
    			temp.root = node;
    			temp.root = tree.root;
    			return tree;
    		}
    		Node pointer = temp.root;
    			
    		while(true){
	    		
	    	
	    			if(data<pointer.data){
	    				if(pointer.left!=null){
	    					pointer=pointer.left;
	    				}
	    				else
	    				{
	    					Node node = new Node(data);
	    					pointer.left=node;
	    					return temp;
	    				}
	    			}
	    			else{
	    				if(pointer.right!=null){
	    					pointer=pointer.right;
	    				}
	    				else
	    					{
	    						Node node = new Node(data);
	    						pointer.right=node;
	    						return temp;
	    					}
	    			}
	    		
    		}   		
    }
    
//////////////////////////////// DISPLAY TREE IN 2D /////////////////////////////////////////
    public static  void printBinaryTree2D(Node root, int level){
        if(root==null){
        	 return;
        }
            
        printBinaryTree2D(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
                System.out.println("|------->"+root.data);
        }
        else
            System.out.println(root.data);
        printBinaryTree2D(root.left, level+1);
    } 
    
////////////////////////////////// DISPLAY TREE PREORDER /////////////////////////////////
    public static void printPreorder(Node root){
    	
    	if(root==null)
    		return;
    	System.out.print("->"+root.data);
    	printPreorder(root.left);
    	printPreorder(root.right);
    }
////////////////////////////////// DISPLAY TREE INORDER /////////////////////////////////
    public static void printInorder(Node root){

    		if(root==null)
    			return;
    		printInorder(root.left);
    		System.out.print("->"+root.data);
    		printInorder(root.right);
    }
////////////////////////////////// DISPLAY TREE POSTORDER /////////////////////////////////
	public static void printPostorder(Node root){
	
			if(root==null)
				return;
			printPostorder(root.left);			
			printPostorder(root.right);
			System.out.print("->"+root.data);
	}
///////////////////////////////// SUM OF NODES AT LEVEL K ////////////////////////////////
	public static int sumAtK(Node root, int k, int sum){
		if(root!=null){
			if(k==0)
				return root.data;
			else if(k<0)
				return 0;
			else{
				sum=sumAtK(root.left, k-1, sum)+sumAtK(root.right, k-1, sum);
				return sum;
			}			
		}
		else
			return 0;		
	}
	
	///////////////////////////////// MAX HEIGHT OF A TREE /////////////////////////////////// 
	public static int maxHeight(Node root) {
		if (root != null) {
			if(root.left==null && root.right==null)
				return 1;
			else
				return Math.max(maxHeight(root.left),maxHeight(root.right))+1;			
		} else
			return 0;
	}	

/////////////////////////////// FIND MINIMUM ///////////////////////////////////////////////
	public static int minimum(Node root){
		Node temp = root;	
		while(true){
				if(temp.left!=null)
					temp=temp.left;
				else
					return temp.data;
			}		
	}
	
/////////////////////////////// FIND MAXIMUM /////////////////////////////////////////////////////////	
	public static int maximum(Node root) {
		Node temp = root;
		while (true) {
			if (temp.right != null)
				temp = temp.right;
			else
				return temp.data;
		}
	}
/////////////////////////////// TRIM A TREE WITH A RANGE //////////////////////////////////////////////
	
	public static void trim(Node root, int x,int y){
		
	}
/////////////////////////////// DELETE A GIVEN NODE //////////////////////////////////////////////
	
	public  Node delNode(Node root, int x) {
		Node temp = root;
		if (root == null)
			return root;
		if(temp.data==x){
			if (temp.right != null){
				Node delTemp = root;
				root=temp.right;
				root=addNode(root,temp.left);
				
			}
			else 
				root=temp.left;
			return root;
		}
		while (true) {
		
			if (temp.left!=null && temp.left.data == x) {
				if (temp.left.right != null) {
					Node delTemp = temp.left;
					temp.left = temp.left.right;	
					if (delTemp.left != null) {
						root=addNode(root, delTemp.left);						
					}
					
				}
				else
					temp.left = temp.left.left;
				
				return root;
			}
			
			else if (temp.right!=null && temp.right.data == x) {
				if (temp.right.right != null) {
					Node delTemp = temp.right;
					temp.right = temp.right.right;	
					if (delTemp.left != null) {
						addNode(root, delTemp.left);
					}
				}
				else
					temp.right = temp.right.left;
				
				return root;
			}

			else if (temp.data > x)
				temp = temp.left;
			else
				temp = temp.right;
		}
	}
	
/////////////////////////////// ADD A GIVEN NODE //////////////////////////////////////////////
	public Node addNode(Node root, Node x) {
		Node temp = root;
		if(temp==null)
			return root;
		while (true) {
			if (temp.data <= x.data) {
				if (temp.right == null){
					temp.right = x;
					break;
				}
				else
					temp = temp.right;
			} else {
				if (temp.left == null){
					temp.left = x;
					break;
				}
				else
					temp = temp.left;
			}
		}
		return temp;
	}
}
