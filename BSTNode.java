// Author: Jose Enriquez
// Email: jose.enriquez@okstate.edu
// 4/30/2021
// Represents a Node to be used in a binary search tree.
public class BSTNode {

    public User user;
    public BSTNode left;
    public BSTNode right;
    public BSTNode parent;

    /**
     * Creates a node with User as its data type
     * @param user The data that the node contains.
     */
    public BSTNode(User user){
        this.user = user;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
