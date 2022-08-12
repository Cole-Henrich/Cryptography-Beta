package sample;

import java.util.ArrayList;
import java.util.List;

public class Node<T>{
    private T data = null;
    private List<Node> children = new ArrayList<>();
    private Node parent = null;
    private int depth;
    public Node(T data) {
        // a fresh node, without a parent reference
        children = new ArrayList<>();
        parent = null;
        this.data = data;
        depth = 0; // 0 is the base level (only the root should be on there)
    }
    public Node(T data, Node<T> parent) {
        // new node with a given parent
        children = new ArrayList<>();
        this.data = data;
        this.parent = parent;
        depth = (parent.getDepth() + 1);
        parent.addChild(this);
    }

    public void addChild(Node child) {
        child.setParent(this);
        children.add(child);
    }

    public void addChild(T child) {
        Node<T> childNode = new Node<>(child);
        childNode.parent = this;
        children.add(childNode);
    }

    public void addChildren(List<Node> children) {
        for(Node t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<Node> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void notifyParentsOfSuccessfulLeafingDepth(){
        if (parent != null) {
            if (getData().getClass().equals(nac.class) && parent.getData().equals(nac.class)) {
                nac data = (nac) parent.getData();
                data.set_success_proven(true);
                parent.setData(data);
                if (parent.getParent() != null) {
                    parent.notifyParentsOfSuccessfulLeafingDepth();
                }
            }
        }
    }

    public ArrayList<String> compileArrayListOfStrings(ArrayList<String> phrase) {
        if (getData().getClass().equals(nac.class) && parent.getData().equals(nac.class)) {
            nac data = (nac) parent.getData();
            phrase.add(data.getS());
            if (parent.getParent() != null) {
                return parent.compileArrayListOfStrings(phrase);
            }
        }
        return phrase;
    }
}