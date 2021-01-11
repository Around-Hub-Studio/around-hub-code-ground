package lecture.tree.binary_tree;

public class BinaryTree {

    public static void main(String[] args) {
        int count = 7;

        Node[] nodeList = new Node[count + 1];

        for (int i = 1; i <= count; i++) {
            Node binaryTree = new Node(i);
            nodeList[i] = binaryTree;
        }

        for (int i = 1; i <= count; i++) {
            if (i * 2 <= count) {
                nodeList[i].leftChild = nodeList[i * 2];
                nodeList[i].rightChild = nodeList[(i * 2) + 1];
            }
        }

        preOrder(nodeList[1]);
        System.out.println();
        inOrder(nodeList[1]);
        System.out.println();
        postOrder(nodeList[1]);
    }

    static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftChild);
            System.out.print(node.data + " ");
            inOrder(node.rightChild);
        }
    }

    static void postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.data + " ");
        }
    }


}
