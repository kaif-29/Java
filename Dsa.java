package day09;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node head;
    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtPosition(int data, int position)
    {
        Node newNode = new Node(data);
        if (position == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++)
        {
            if (temp != null)
            {
                temp = temp.next;
            } else
            {
                System.out.println("Error");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteBeginning()
    {
        if (head != null)
        {
            head = head.next;
        } else
        {
            System.out.println("List is empty");
        }
    }
    public void deleteEnd()
    {
        if (head == null)
        {
            System.out.println("List is empty");
        }
        else if (head.next == null)
        {
            head = null;
        }
        else
        {
            Node temp = head;
            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deleteAtPosition(int position)
    {
        if (position == 0)
        {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++)
        {
            if (temp != null)
            {
                temp = temp.next;
            }
            else
            {
                 System.out.println("Error");
            }
        }
        if (temp != null && temp.next != null)
        {
            temp.next = temp.next.next;
        }
        else
        {
             System.out.println("Error");
        }
    }
    public boolean search(int data)
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.data == data)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Dsa
{
public static void main(String[] args)
{
LinkedList list = new LinkedList();
       
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.display();
        list.insertBeginning(5);
        list.display();
        list.insertAtPosition(15, 2);
        list.display();
        list.deleteBeginning();
        list.display();
        list.deleteEnd();
        list.display();
        list.deleteAtPosition(1);
        list.display();
        System.out.println(list.search(20));
        System.out.println(list.search(25));
}
}
