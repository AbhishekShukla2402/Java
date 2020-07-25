package linked_lists;

import linked_lists.Node;

public class practice_linked_list
{
    Node head;

    // ==========Insert data at end==========

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

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



    // ==========Display linked list==========

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
                System.out.println(curr_node.data);
                curr_node = curr_node.next;
            }
        }
    }


    // ==========Display length of list==========

    public int length()
    {
        int ctr=0;
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else {
            Node curr_node = head;
            while (curr_node!= null) {
                ctr += 1;
                curr_node = curr_node.next;
            }

        }
        return ctr;
    }

    // ==========Insert data at index==========

    public void insert_at(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index==0)
        {
            node.next  = head;
            head = node;
        }

        else
        {
            Node curr_node = head;
            for(int i =0; i<index-1; i++)
            {
                curr_node = curr_node.next;
            }
            node.next = curr_node.next;
            curr_node.next = node;
        }
    }




}
