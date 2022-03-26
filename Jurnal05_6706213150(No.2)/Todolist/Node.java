package Todolist;

public class Node {
    private String data;
    private Node link;

    public Node() {
        link = null;
        data = "Data Kosong";
    }

    public Node(String data, Node n) {
        data = data;
        link = n;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    //  Function to set data to current Node
    public void setData(String data) {
        data = data;
    }

    //  Function to get link to next node
    public Node getLink() {
        return link;
    }

    //  Function to get data from current Node
    public String getData()
    {
        return data;
    }
}

