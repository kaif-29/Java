package day14;
import java.util.*;
class queue{
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int currentSize;
	
	public queue(int Size) {
		this.maxSize=Size;
		this.queueArray=new int[maxSize];
		this.front=0;
		this.rear=-1;
		this.currentSize=0;
	}
	public  void enqueue(int value) {
		if(isFull()) {
			System.out.println("queue is full,cannot insert value");
		}
		else {
			rear=(rear+1)%maxSize;
			queueArray[rear]=value;
			currentSize++;
		}
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		
		} else {
			System.out.println("queue is empty:");
			for(int i=0;i<currentSize;i++) {
				int index=(front+i)%maxSize;
				System.out.println(queueArray[index]+" ");
			}
			System.out.println();
		}
	}
			public int dequeue(){
			if(isEmpty()) {
				throw new RuntimeException("queue is empty");
			}else{
			int frontValue=queueArray[front];
			front=(front+1)%maxSize;
			currentSize--;
			return frontValue;
			}
		}
		public int peek(){
			if(isEmpty()) {
				throw new RuntimeException("queue is empty");}
			else {
				return queueArray[front];
			}
		}
		public boolean isEmpty() {
			return(currentSize==0);
		}
		public boolean isFull() {
			return(currentSize==maxSize);
		}
		public int Size() {
			return currentSize;
		}
		
}
public class Zoldyck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue j=new queue(5);
		j.enqueue(10);
		j.enqueue(20);
		j.enqueue(30);
System.out.println("queue after enqueong");
j.display();
	}

}
