package tree;

public class BinaryNode {
    private int value;
    private int depth;
    private BinaryNode right;
    private BinaryNode left;

    public int getValue () {
        return value;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public int getDepth () {
        return depth;
    }

    public void setDepth (int depth) {
        this.depth = depth;
    }

    public BinaryNode getRight () {
        return right;
    }

    public void setRight (BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft () {
        return left;
    }

    public void setLeft (BinaryNode left) {
        this.left = left;
    }

    @Override
    public String toString () {
        return "BinaryNode{" +
                "value=" + value +
                '}';
    }

}
