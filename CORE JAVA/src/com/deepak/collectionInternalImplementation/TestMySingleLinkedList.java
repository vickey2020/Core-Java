package com.deepak.collectionInternalImplementation;

public class TestMySingleLinkedList
{
  public static void main(String[] args)
  {
	  MySingleLinkedList m=new MySingleLinkedList();
	  m.addObjectAtEnd("Deepak");
	  m.addObjectAtEnd("123");
	  m.addObjectAtEnd("ABC");
	  m.addObjectAtEnd("Modi");
	  
	  m.iterate();
	  
	  m.getMiddileElement();
	  
	  // Here we are trying to add object at start position of linked list
	  m.addObjectAtStart("1");
	  m.addObjectAtStart("2");

	  // Again we are trying to iterate the linked list
	  // That prove that object added at start position
	  m.iterate();
  }
}

class MySingleLinkedList
{  
	ElementForSingleNode front,last;
    public void addObjectAtEnd(Object obj)
    {
	   ElementForSingleNode e=new ElementForSingleNode();
	   e.data = obj;
		
		if (front == null) 
		{
			front = e;
			//System.out.println(front);
		} 
		else 
		{
			last.next = e;
			//System.out.println(last.next);
		}
		
		last= e;
		//System.out.println(last);
    }
   
    // This method will return middle element of link list
	public void getMiddileElement() 
	{
      /* At initial point of time start and middle
	     both are pointing font node only */
	  ElementForSingleNode start = front;
	  ElementForSingleNode middle = front;
	  int length = 0;
	  while (start.next != null)
	  {
		length++;
		// If start move 2 then middle move 1
		// so after complete iteration start goes last
		// and middle goes to middle of linked list
		if (length % 2 == 0)
		{
			middle = middle.next;
		}
		start = start.next;
	  }
	  System.out.println("length of LinkedList: " + length);
	  System.out.println("middle element of LinkedList : " + middle);
	}
	
	public void addObjectAtStart(Object obj)
	{
		// Here we are creating liked list node
		ElementForSingleNode e = new ElementForSingleNode();
		// Here are storing data part in data
		e.data = obj;
		// Now first node become the 2nd node
		e.next = front;
		// Front containing the ref of new node
		front = e;
	}
   
    public void iterate()
    {
	   ElementForSingleNode e = front;
		while (e != null)
		{
			System.out.println(e.data + ",");
			e = e.next;
		}
    }
}


class ElementForSingleNode
{
  Object data;
  ElementForSingleNode next;
}
