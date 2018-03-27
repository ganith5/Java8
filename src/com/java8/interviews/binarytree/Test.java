package com.java8.interviews.binarytree;

import com.java8.interviews.queues.Queue;

/**
 * Created by Pavithra Sachidananda on 2/1/18.
 */
public class Test {

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);

        nodeB.setLeftChild(nodeD);

        nodeC.setLeftChild(nodeE);
        nodeC.setRightChild(nodeF);
        nodeD.setLeftChild(nodeG);

        try {
            breadthFirst(nodeA);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void breadthFirst(TreeNode root) throws Exception{
        if(root == null){
            return;
        }


        Queue<TreeNode> queue = new Queue<>(TreeNode.class);
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.dequeue();
            System.out.println(node.getData());

                if(node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }

            if(node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }


    }
}
