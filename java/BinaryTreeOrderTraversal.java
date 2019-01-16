public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
}


public class Solution {
	public List<Integer>  inorderTraversal(TreeNode root) {
		List<Integer>  result = new ArrayList<Integer>();

		if(root == null) return result;

		List<Integer> left = inorderTraversal(root.left);
		List<Integer> right = inorderTraversal(root.right);

		// inorder
		result.addAll(left);
		result.add(root.val);
		result.addAll(right);

		// preorder 
		result.add(root.val);
		result.addAll(left);
		result.addAll(right);

		// postorder
		resut.addAll(left);
		result.addAll(right);
		result.add(root);

		return result;
	}
}


