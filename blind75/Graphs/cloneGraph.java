package blind75.Graphs;


import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}




class cloneGraph {

    private static Node firstClone;

    public Node cloneGraph(Node node) {

        if(node == null) return null;

//        HashSet<Integer> hS = new HashSet();

        Queue<Node> nodeQ = new LinkedList<>();


        Node nodePolled = node;
        ArrayList<Node> neighborList = new ArrayList<>();
        nodeQ.add(node);

        boolean firstTime = true;

        while(!nodeQ.isEmpty() && !nodeQ.contains(nodePolled)){
            nodePolled = nodeQ.poll();
            for(Node n : nodePolled.neighbors){
                neighborList.add(n);
                nodeQ.add(n);
            }

            //first Clone only
            if(firstTime){
                firstClone = new Node(nodePolled.val, neighborList);
//                hS.add(firstClone.val);
                firstTime = false;
                continue;
            }

            Node clone = new Node(nodePolled.val, neighborList);
//            hS.add(clone.val);
            neighborList.clear();

        }
        return firstClone;
    }
}