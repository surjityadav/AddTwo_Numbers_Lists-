
import java.util.Scanner;


public class AddTwo_Numbers_Lists 
{
    static Node head,head1;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static void insert(int data)
    {
        Node temp=new Node(data);
        temp.next=null;
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=temp;
        }
    }
    public static void insert1(int data)
    {
        Node temp=new Node(data);
        temp.next=null;
        if(head1==null)
        {
            head1=temp;
        }
        else
        {
            Node last=head1;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=temp;
        }
    }
    public static void display(Node h)
    {
        Node current=h;
        while(current.next!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println(current.data);
    }
    public static Node add(Node a,Node b )
    {
       Node prev=null;
       Node n=null,n1=null;
       int carry=0,sum;
       while(a!=null || b!=null)
       {
           sum=carry+(a!=null ? a.data:0)+(b!=null?b.data:0);
           carry=(sum>=10)?1:0;
           sum=sum%10;
           n=new Node(sum);
           if(n1==null)
               n1=n;
           else
           {
               prev.next=n;
           }
           prev=n;
           if(a!= null)
           {
               a=a.next;
           }
           if(b!= null)
           {
               b=b.next;
           }
       }
       if(carry>0)
       {
           n.next=new Node(carry);
       }
       return n1;
    }
    public static void main(String args[])
    {
        
        AddTwo_Numbers_Lists a=new AddTwo_Numbers_Lists();
        AddTwo_Numbers_Lists b=new AddTwo_Numbers_Lists();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements of list 1:");
        int m=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<m;i++)
        {
            a.insert(sc.nextInt());
        }
        display(a.head);
        System.out.println("Enter no. of elements of list 1:");
        int k=sc.nextInt();
        System.out.println("Enter Elements");
        for(int j=0;j<k;j++)
        {
            b.insert1(sc.nextInt());
        }
        display(b.head1);
        System.out.println("After Adding List Elements");
        Node h=add(head,head1);
        display(h);
        
       
    }
}
