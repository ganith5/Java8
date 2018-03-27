package com.java8.interviews.binarytree;

import apple.laf.JRSUIUtils;

/**
 * Created by Pavithra Sachidananda on 2/1/18.
 */
public class  TreeNode<T> {

    private T data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }


    @Override
    public String toString() {
        return ""+ data;
    }
}
