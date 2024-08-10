package LinkedList;

public class LL {

    static int size =0;//because node nhi bhi ho skta
    Node head;

    //for node in linked list
    class Node 
    {
        int data; // store the data of node
        Node next; // store the address of next node(like pointer) and data type same as class name
        Node(int data) // constructor for point the data `
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void add_first(int data)
    {
        Node newNode = new Node(data); // node is a class so create the object of node class because jb hm node ko add krenge to jo data aayega vo newnode me jayega
        if(head == null) // if head not present
        {
            head = newNode;// then newNode(head ko point krega) head me add ho jayega
            return;
        }
        newNode.next = head; //new node jo add krenge uska address point krega head ko
        head = newNode; // uske baad newnode head me add ho jayega aur newnode head bn jayega
    }


    public void add_last(int data)
    {
        Node newNode = new Node(data); // node is a class so create the object of node class because jb hm node ko add krenge to jo data aayega vo newnode me jayega
        if(head == null) // if head not present
        {
            head = newNode;// then newNode(head ko point krega) head me add ho jayega
            return; //iteration kam hote h
        }
        Node temp = head; // temp point to the head(temp head ko point krega)
        while(temp.next!=null) // temp ka next jab tk null ko point na kre(means last node) tb tk chalega
        {
            temp = temp.next; // temp me temp ka next point krta jayega jb tk ki null ko point nahi krega
        }
        temp.next = newNode;  //jb temp me temp ka next null ko point krega then newNode ko temp ke next me add kr do

    }

// add element in linked list at any position
    public void add (int data,int position)
    {
        Node newNode = new Node(data);
        if(position==0)
        {
            add_first(data);
            return;
        }
        if(position==size)
        {
            add_last(data);
            return;
        }
        int i=0;
        Node temp = head;
        while (i<position-1) 
        {
            temp = temp.next;
            i++; 
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void remove_first()
    {
        if(head == null) // yadi linked list empty ho tab print kre list is empty
        {
            System.out.println("list is empty");
            return;
        }
        head = head.next; // yadi ho to head apne aage vale element ko point kre aur print kr de
    }

    public void remove_last()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=head.next;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next=null;
    }

    public void remove_any(int position)
    {
        if(position==0)
        {
            remove_first();
            return;
        }
        if(position==size-1)
        {
            remove_last();
            return;
        }
        int i=0;
        Node temp = head;
        while (i<position-1) 
        {
            temp = temp.next;
            i++;
        }
        Node x = temp.next;
        temp.next = temp.next.next;
        x.next = null;

    }



    public void print()
    {
        Node temp = head; // need of temp because we need to call also another method
        // if we use head then not access all data at position
        while (temp!=null)  /// when temp is not null
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;//temp point to the next temp data
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        // list.add_first(1);
        // list.add_first(2);
        // list.add_first(3);
        // list.add_first(5);

        // list.add_last(8);
        // list.add_last(9);
        // list.add(4, 3);

        list.add_first(1);

        list.add_last(2);
        list.add_last(3);

        list.add(4, 1); 
        list.print();// 1-->4-->2-->3

        // list.remove_first();
        // list.print();// 4-->2-->3

        // list.remove_last();
        // list.print();

        list.remove_any(2);
        list.print();

    }
    
}
