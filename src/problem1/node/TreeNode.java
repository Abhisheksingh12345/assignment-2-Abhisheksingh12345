/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode<E> {
    private TreeNode<E> rightChild;
    private TreeNode<E> leftChild;
    private TreeNode<E> parentNode;
    private E data;

    public TreeNode<E> getParentNode() {
        return parentNode;
    }

    public void setParentNode(TreeNode<E> parentNode) {
        this.parentNode = parentNode;
    }

    public TreeNode<E> getRightChild() {
        return rightChild;
    }

    public TreeNode(E data) {
        this.data = data;
    }

    public void setRightChild(TreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
