/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements BinarySearchTree<E> {
    private TreeNode<E> root = null;
    private int size = 0;
    private int notContainLeftChild = 0;

    public int getSize() {
        return size;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    /**
     * In this adding new Node to the addInFamily function behaves like recursive function
     * here every node is get store in currentMember parameter and then checked by if condition.
     * condition are checked by comparision operator's and since data is of generic type then 1'st the data is
     * data is typecast in integer for simplicity.
     *
     * @param data          --> store the in generic data.
     * @param currentMember --> store the new data enter by user.
     * @return current node after simplifing.
     */
    private TreeNode<E> addInFamily(E data, TreeNode<E> currentMember) {
        if (currentMember == null) {
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentMember.getData()) {
            currentMember.setLeftChild(addInFamily(data, currentMember.getLeftChild()));
        } else
            currentMember.setRightChild(addInFamily(data, currentMember.getRightChild()));
        return currentMember;
    }

//    public int parentNoContainLeftChild() {
//
//    }


    @Override
    public boolean add(E data) {
        root = addInFamily(data, root);
        size++;
        return true;
    }

    /**
     * recursive method searchFromFamily
     *
     * @param data          --> given by user
     * @param currentMember --> position of the currentMember.
     * @return --> return boolean value of variable result true -> if data is being found false -> if data is being not found.
     */
    private boolean searchResult = false;

    /**
     * this function will found out the last children of the family from its forefather or can says its parents-parents
     * there the tertiary condition which continuously check for last member until the condition is true.
     *
     * @param findPOutMember --> make out the last member of the family in leftChildren direction.
     * @return --> return the last member of the family.
     */
    private E findSmallest(TreeNode<E> findPOutMember) {
        return (findPOutMember.getLeftChild() == null) ? findPOutMember.getData() : findSmallest(findPOutMember.getLeftChild());
    }

    @Override
    public boolean remove(E data) {
        root = deleteFromFamily(root, data);
        size--;
        return true;
    }

    /**
     * this is a recursive function deleteFromFamily.
     * here the data is 1'st find out of family and then called findSmallest member form family (Tree) and then it swapped the order in family .
     *
     * @param data --> generic type data .
     * @return --> return result if there are 0 member in family then it return null otherwise return hole concluded tree.
     */
    private TreeNode<E> deleteFromFamily(TreeNode<E> currentMember, E data) {
        if (currentMember == null) {
            return null;
        }
        if (data.equals(currentMember.getData())) {
            if (currentMember.getLeftChild() == null && currentMember.getRightChild() == null) {
                return null;
            }
            if (currentMember.getRightChild() == null) {
                return currentMember.getLeftChild();
            }
            if (currentMember.getLeftChild() == null) {
                return currentMember.getRightChild();
            }
            E smallestValue = findSmallest(currentMember.getRightChild());
            currentMember.setData(smallestValue);
            currentMember.setRightChild(deleteFromFamily(currentMember.getRightChild(), smallestValue));
            return currentMember;
        }
        if ((Integer) data < (Integer) currentMember.getData()) {
            currentMember.setLeftChild(deleteFromFamily(currentMember.getLeftChild(), data));
        }
        currentMember.setRightChild(deleteFromFamily(currentMember.getRightChild(), data));
        return currentMember;

    }

    private boolean searchFromFamily(E data, TreeNode<E> currentMember) {
        try {
            if ((Integer) currentMember.getData() == (Integer) data) {
                searchResult = true;
            }
            if ((Integer) currentMember.getData() < (Integer) data) {
                if (currentMember.getRightChild() != null) {
                    searchFromFamily(data, currentMember.getRightChild());
                }
            } else {
                if (currentMember.getLeftChild() != null) {
                    searchFromFamily(data, currentMember.getLeftChild());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No root element is found");
        }
        return searchResult;
    }

    /**
     * search data is to search using searchFormFamily parameterised by search data and root reference of the tree.
     *
     * @param data --> asked by user of generic type define in main method
     * @return --> return is boolean type.
     */
    @Override
    public boolean search(E data) {
        return searchFromFamily(data, root);
    }

    private void printOnlyLeftChildren(TreeNode<E> currentNode) {
        if (currentNode == null) {
            System.out.println("there are no other left member in Family");
        } else {
            System.out.println(currentNode.getData());
            printOnlyLeftChildren(currentNode.getLeftChild());
        }
    }

    @Override
    public boolean traverse() {
        System.out.println("These are only left node : ");
        printOnlyLeftChildren(root);
        return true;
    }

    /**
     * these all are the different type printing data of tree
     * preOrder, postOrder, inOrder these work recursively and visit method print the out of the node.
     *
     * @param data
     */
    public void traverseViaOrder(int data) {
        switch (data) {
            case 1 -> traversePerOrder(getRoot());
            case 2 -> traversePostOrder(getRoot());
            default -> System.out.println("wrong input try Again");
        }
    }

    public void traversePostOrder(TreeNode<E> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftChild());
            traversePostOrder(currentNode.getRightChild());
            visit(currentNode.getData());
        }
    }

    public void traversePerOrder(TreeNode<E> currentNode) {
        if (currentNode != null) {
            visit(currentNode.getData());
            traversePerOrder(currentNode.getLeftChild());
            traversePerOrder(currentNode.getRightChild());
        }
    }

    private void visit(E data) {
        System.out.println(" " + data);
    }

    public TreeNode preOrderSuccessor(TreeNode<E> node) {
        if (node.getLeftChild() != null) {
            return node.getLeftChild();
        }
        TreeNode temp = node.getRightChild();
        if (temp == null) {
            TreeNode currParent = node.getParentNode();
            while (currParent.getRightChild() == null) {
                currParent = currParent.getParentNode();
            }
            return currParent.getRightChild();
        }
        return temp;
    }

}


