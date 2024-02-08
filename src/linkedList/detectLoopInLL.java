package linkedList;

public class detectLoopInLL {
    Node head;
            class Node
            {
                int data ;
                Node next;
                Node (int d)
                {
                    data = d ;
                    next = null;

                }
            }

            public void insertAtEnyNode(Node prev_node , int newData)
            {
                if ( prev_node == null )
                {
                    System.out.println(" not curreect data :");
                }

                 Node newnode = new Node(newData);

                newnode.next = prev_node.next;
                prev_node.next = newnode;
            }
            public void insertAtEnd( int newData)
            {
                Node newnode  = new Node(newData);
                if (head == null )
                {
                    head = new Node(newData);
                    return;
                }
                newnode.next = null;
                Node temp = head;
                while (temp.next != null )
                {
                    temp = temp.next;
                }
                temp.next = newnode;
                return;

            }
            public void detectLLlopp()
            {
                Node slow = head , fast = head ;
                int flag = 0;

                while ( slow != null && fast != null && fast.next != null)
                {
                    slow =slow.next;
                    fast = fast.next.next;

                    if(slow == fast )
                    {
                         flag = 1;
                         return;
                    }
                }
                if(flag == 0)
                {
                    System.out.println(" no loop detected ");
                }
                else
                {
                    System.out.println(" loop is detected  ");
                }
            }

            public void display()
            {
                Node temp = head;
                while ( temp != null)
                {
                    System.out.print( temp.data  + " ");
                    temp = temp.next;
                }


            }


    public static void main(String[] args) {

               detectLoopInLL b = new detectLoopInLL();


               b.insertAtEnd(3);
               b.insertAtEnd(5);
               b.insertAtEnd(6);
               b.insertAtEnd(17);
               b.insertAtEnd(98);
               b.insertAtEnd(78);
        b.display();
        System.out.println( );

               Node temp = b.head;
               while (temp.next != null)
               {
                   temp= temp.next;
               }

               temp.next = b.head ;

               b.detectLLlopp();
        System.out.println();

    }
}
