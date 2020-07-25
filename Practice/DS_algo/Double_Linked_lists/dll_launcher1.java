package doubly_linked_lists;

public class dll_launcher1 {
    public static void main(String[] args)
    {
        dll_test1 list = new dll_test1();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert_at_head(0);
        list.insert(2);
        list.insert_at_head(1);
        list.display();

        System.out.println();
        list.count_nodes();


    }
}
