package linked_lists;

import linked_lists.LinkedList;

public class test_linkedlist_launcher
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        System.out.println(list.length());
    }
}
