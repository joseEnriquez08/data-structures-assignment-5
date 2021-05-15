// Author: Jose Enriquez
// Email: jose.enriquez@okstate.edu
// 2/28/2021

Step 1 : Compile the java files, BinarySearchTree, BSTNode, Graph, SocialNetwork, User.
Step 2 : Run java SocialNetwork
Step 3 : Enter the corresponding number for the operation you want to perform.
Step 4 : Enter 6 to exit the program.
Step 5 : 

Assumptions:
    * The user will only enter id in the format xyyyy      x=letter, y=single digit integer.
    * operation 2(follow) will prompt for ID'S. They need to be entered int the format:  (xyyyy, xyyyy)
    * Most operations  should ask for name and Id.

Notes:
    * The userID was converted into a numeric value so I can insert it into the BST.
        -Ex: A1111 = 651111

Runtime analysis: BinarySearchTree
    *delete: O(n)
    *insert: O(n)
    *search: O(n)
    *They are O(n) because the tree does not balance itself.
        Otherwise it hould be O(height)

Runtime analysis: Graph
    *addVertex  :   O(1)
    *addEdge    :   O(1)
    *getFolowers:   O(n+m) because we have to scan the collection of every vertex
    *getFolowing:   nearly O(1)
    *removeEdge :   O(deg(i)), deg(i) = number of edges coming out of I
    *removeVertex:  O(n+m) because we have to scan the collection of every vertex
    