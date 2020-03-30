package problem1.mybst;

public interface BinarySearchTree<E> {
    boolean add(E data);

    boolean remove(E data);

    boolean search(E data);

    boolean traverse();
}
