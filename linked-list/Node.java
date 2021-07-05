public class Node {
    public int value;
    Node next;
    
    
    public Node (int value,Node next) {
        this.value = value;
        this.next = next;
    }
    public int getData()
    {
        return value;
    }

    public void setData(int d)
    {
        value = d;
    }
}
