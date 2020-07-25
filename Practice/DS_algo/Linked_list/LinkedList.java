package linked_lists;

public class LinkedList{
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
            System.out.println("Empty list");
        }
        else
        {
            Node curr_node = head;
            while(curr_node != null)
            {
                System.out.print(curr_node.data+" --> ");
                curr_node=curr_node.next;
            }
            System.out.println("NULL");
        }
    }

    public int length()
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return 0;
        }
        else
        {
            Node curr_node = head;
            int ctr=0;
            while(curr_node != null)
            {
                ctr+=1;
                curr_node = curr_node.next;
            }
            return ctr;
        }


    }



 }