/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.Tree;

/**
 *
 * @author naman
 */

import java.util.*;

class BSTNode
{
    BSTNode left, right;
    int data;
    String st;
    BSTNode(int n)
    {
        left=null;
        right=null;
        data=n;
    }
    void setLeft(BSTNode n)
    {
        left = n;
    }
    void setRight(BSTNode n)
    {
        right = n;
    }
    BSTNode getLeft()
    {
        return left;
    }
    BSTNode getRight()
    {
        return right;
    }
    void setData(String s, int d)
    {
        st=s;       
        data=d;
    }
    int getData()
    {
        return data;
    }
}
        
class BST
{
    BSTNode root;
    BST()
    {
        root=null;
    }
    boolean isEmpty()
    {
        return root==null;
    }
    void insert(int data)
    {
        root = insert(root,data);
    }
    BSTNode insert(BSTNode node , int data)
    {
        if(node == null)
            node=new BSTNode(data);
        else
        {
            if(data<=node.getData())
            {
                node.left=insert(node.left,data);
            }
            else
            {
                node.right=insert(node.right,data);
            }
        }
        return node;
    }
    void delete(int k)
    {
        if(isEmpty())
        {
            System.out.println("Tree Empty");
        }else if(search(k)==false)
        {
            System.out.println("Sorry "+k+" is not present");
        }
        else
        {
            root = delete(root,k);
            System.out.println(k+"deleted from the tree");
        }
    }
    BSTNode delete(BSTNode root,int k)
    {
        BSTNode p,p2,n;
        if(root.getData()==k)
        {
            BSTNode lt,rt;
            lt=root.getLeft();
            rt=root.getRight();
            if(lt==null&&rt==null)
            {
                return null;
            }
            else if(lt==null)
            {
                p=rt;
                return p;
            }
            else if(rt==null)
            {
                p=lt;
                return p;
            }
            else
            {
                p2=rt;
                p=rt;
                while(p.getLeft()!=null)
                {
                    p=p.getLeft();
                }
                p.setLeft(lt);
                return p2;
            }
        }
        if(k<root.getData())    
        {
            n=delete(root.getLeft(),k);
            root.setLeft(n);
        }
        else
        {
            n=delete(root.getRight(),k);
            root.setRight(n);
        }
        return root;
    }
    int countNodes()
    {
        return countNodes(root);
    }
    int countNodes(BSTNode r)
    {
        if(r==null)
        {
            return 0;
        }
        else
        {
            int l=1;
            l=l+countNodes(r.getLeft());
            l=l+countNodes(r.getRight());
            return l;
        }
    }
    boolean search(int val)
    {
        return search(root, val);
    }
    boolean search(BSTNode r, int val)
    {
        boolean found=false;
        while((r!=null)&&!found)
        {
            int rval=r.getData();
            if(val < rval)
            {
                r=r.getLeft();
            }
            else if(val > rval)
            {
                r=r.getRight();
            }
            else
            {
                found = true;
                break;
            }
            found =search(r,val);
        }
        return found;
    }
    void inOrder()
    {
        inOrder(root);
    }
    void inOrder(BSTNode r)
    {
        if(r!=null)
        {
            inOrder(r.getLeft());
            System.out.print(r.getData()+" ");
            inOrder(r.getRight());
        }
    }
    void preOrder()
    {
        preOrder(root);
    }
    void preOrder(BSTNode r)
    {
        if(r!=null)
        {
            System.out.print(r.getData()+" ");
            preOrder(r.getLeft());
            preOrder(r.getRight());
        }
    }
    void postOrder()
    {
        postOrder(root);
    }
    void postOrder(BSTNode r)
    {
        if(r!=null)
        {
            postOrder(r.getLeft());
            postOrder(r.getRight());
            System.out.print(r.getData()+" ");
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in); 
        BST bst=new BST();
        System.out.println("Binary Search Tree");
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);
        bst.insert(8);
         bst.inOrder();
        bst.delete(1);
        
       /* char ch;
        do    
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bst.insert( scan.nextInt());                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to delete");
                bst.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ bst.countNodes(null));
                break;     
            case 5 :  
                System.out.println("Empty status = "+ bst.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
           
            System.out.print("\nPost order : ");
            bst.postOrder();
            System.out.print("\nPre order : ");
            bst.preOrder();
            System.out.print("\nIn order : ");
            bst.inOrder();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');              
        */
        
    }
}
