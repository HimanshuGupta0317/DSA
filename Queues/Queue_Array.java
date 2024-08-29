import java.util.Scanner;

public class Queue_Array {

    static class Queueues {
        int n;
        int[] arr;
        int front, rear;

//  create Queue
        Queueues(int size) {
            this.n = size;
            this.arr = new int[size];
            this.front = -1;
            this.rear = -1;
        }

// if our array is empty then return
        public boolean is_Empty() 
        {
            return rear == -1;
        }

// if our array is full then return
        public boolean is_Full()
        {
            return rear == (n-1);
        }

// add element in Queue using array enqueue operation
        public void add(int data)
        {
            if(is_Full())
            {
                System.out.println("Queue is full");
                return;
            }
            // rear++; // because rear -1 me hai aur jo element aayega usko batana h ki vo kaha pr add hoga
            // arr[rear]=data;     // then rear ke place me jo element aayega usko vha (khada) add kr denge

            arr[++rear] = data;
        }
// remove element in Queue using array dequeue operation
        public int remove()
        {
            if(is_Empty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[rear] =0;
            rear--;
            return x;
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        Queueues q = new Queueues(5);

        q.add(5);
        q.add(7);
        q.add(9);
        q.add(3);
        q.add(4);

        System.out.println(q.is_Empty()); // if q is empty

        System.out.println(q.remove());
        System.out.println(q.is_Full()); // if q is full

       while(!q.is_Empty())
       {
        System.out.println(q.remove());
       }

    }
}
