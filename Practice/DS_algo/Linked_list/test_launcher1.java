package linked_lists;

public class test_launcher1 {
    public static void main(String[] args)
    {
        test_ll1 list = new test_ll1();
        list.insert(2);
        list.insert(4);
        list.insert_at_head(1);
        list.insert_at_head(0);
        list.insert_at(2,3);
        list.display();
    }

}
