package question2;

// Function to traverse the right
// skewed tree using recursion
public class traverse 
{
	static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
}
