package com.algo.dcp;

import com.ds.Node;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SerializeTreeToString {
    private static final String SPLITTER = ",";
    private static final String NULLNODE = "X";

    public static void main(String[] args) {
        Node node = new Node("1", new Node("2", new Node("3"), new Node("4")), new Node("5", new Node("6"), new Node("7")));

        System.out.println(node);
        System.out.println(serialize(node));
        System.out.println(deserialize(serialize(node)));

        /*
        BTreePrinter.printNode(node);
        preTraversal(node);
        System.out.println("----------");
        inTraversal(node);
        System.out.println("----------");
        postTraversal(node);
*/
    }


    private static Node deserialize(String str) {
        List<String> split = Arrays.asList(str.split(SPLITTER));
        Deque nodes = new LinkedList(split);
        return deserial(nodes);
    }

    private static Node deserial(Deque nodes) {
        String val = (String) nodes.remove();
        if (val.equals(NULLNODE)) {
            return null;
        } else {
            Node node = new Node(val);
            node.left = deserial(nodes);
            node.right = deserial(nodes);
            return node;
        }
    }

    private static String serialize(Node node) {
        StringBuilder sb = new StringBuilder();
        serial(node, sb);
        return sb.toString();
    }

    private static void serial(Node node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULLNODE).append(SPLITTER);
        } else {
            sb.append(node.value).append(SPLITTER);
            serial(node.left, sb);
            serial(node.right, sb);
        }
    }

    private static void preTraversal(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        preTraversal(node.left);
        preTraversal(node.right);
    }

    private static void inTraversal(Node node) {
        if (node == null) return;
        inTraversal(node.left);
        System.out.println(node.value);
        inTraversal(node.right);
    }

    private static void postTraversal(Node node) {
        if (node == null) return;
        postTraversal(node.left);
        postTraversal(node.right);
        System.out.println(node.value);
    }
}
