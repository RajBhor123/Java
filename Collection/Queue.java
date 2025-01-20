package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

	public static void main(String[] args) {

		Book b1 =new Book(1,"Harry Potter","J.k.Rowling","xyz");
		Book b2 =new Book(2,"2 States","Chetan","xyz");
		Book b3 =new Book(3,"abc","J.k.Rowling","def");
		Book b4 =new Book(4,"Harry Potter","J.k.Rowling","xyz");
		
		Deque<Book> d= new ArrayDeque<Book>();
		
		d.add(b1);
		d.offer(b2);
		d.offerFirst(b3);
		d.offerLast(b4);
		
		System.out.println(d.peekFirst().id);
		
		for(Book itr:d)
		{
			System.out.println("Book id : ****"+itr.id+"*****Book Name "+itr.bookName+"Book Author :"+itr.publisher);
		}
	}

}
