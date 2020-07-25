package doubly_linked_lists;

public class dll_test1 {
    test_Node1 head;
    test_Node1 tail;

    public void insert(int data)
    {
        test_Node1 new_node = new test_Node1();
        new_node.data = data;
        new_node.next = null;
        new_node.previous = null;

        if(head == null)
        {
            head = tail = new_node;
            head.next = null;
            tail.previous = null;
        }
        else
        {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
            tail.next = null;
        }
    }
    public void display()
    {
        //test_Node1 curr_node = head;
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            test_Node1 curr_node = head;
            while(curr_node != null)
            {
                System.out.println(curr_node.data);
                curr_node=curr_node.next;
            }
        }
    }

    public void count_nodes()
    {
        int ctr=0;
        if(head==null)
        {
            System.out.println("0");
        }
        else
        {
            test_Node1 curr_node = head;
            while(curr_node!=null)
            {
                ctr+=1;
                curr_node=curr_node.next;
            }
            System.out.println(ctr);
        }
    }

    public void insert_at_head(int data)
    {
        test_Node1 new_node = new test_Node1();
        new_node.data = data;
        new_node.next = null;
        new_node.previous = null;

        if(head == null)
        {
            head = tail = new_node;
        }
        else
        {
            new_node.next = head;
            head.previous = new_node;
            head = new_node;
        }
    }




}
