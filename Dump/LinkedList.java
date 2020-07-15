public class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next=null;
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node curr_node = head;
            while(curr_node.next != null)
            {
                curr_node = curr_node.next;
            }
            curr_node.next = node;
        }
    }

    public void show()
    {
        Node node = head;
        while(node!= null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void insert_at_start(int data)
    {
        Node node = new Node();
        node.data=data;
        //node.next=null;  NOT NECESSARY< CODE WORKS WITHOUT THIS LINE, FOR NOW...
        node.next=head;
        head=node;
    }
}
