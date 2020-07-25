package linked_lists;

public class test_ll1 {
    Node head;

    public void insert(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if(head == null)
        {
            head = new_node;
        }
        else
        {
            Node curr_node = head;
            while(curr_node.next != null)
            {
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
        }
    }

    public void display()
    {
        if(head == null)
        {
            System.out.print("Empty list");
        }
        else
        {
            Node curr_node = head;
            while(curr_node != null)
            {
                System.out.println(curr_node.data);
                curr_node = curr_node.next;
            }
        }
    }
    public void insert_at_head(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if(head==null)
        {
            head = new_node;
        }
        else
        {
            new_node.next = head;
            head = new_node;
        }
    }

    public void insert_at(int index, int data)
    {

        if(head == null)
        {
            insert_at_head(data);
        }
        else
        {
            Node new_node = new Node();
            new_node.data = data;
            new_node.next = null;

            Node curr_node = head;
            int i=0;
            while(i<index)
            {
                curr_node = curr_node.next;
                i+=1;
            }
            new_node.next = curr_node.next;
            curr_node.next = new_node;

        }
    }




}
