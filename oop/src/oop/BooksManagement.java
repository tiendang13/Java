package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksManagement {
	private static Scanner sc;
	public static int bookCount = 0;
	public static ArrayList<Book> bookList = new ArrayList<Book>(); //List to save books
	public static void menu(){
		//Menu
		System.out.println("Please press to choose:"); 
		System.out.println("1. Insert a new book.");
		System.out.println("2. View list of book.");
		System.out.println("3. Average price");
		System.out.println("4. Exit");
		sc = new Scanner(System.in);
		String input =sc.nextLine();
		switch (input){
		case "1":  //Insert new book
			bookCount++;
			Book book = new Book();
			book.ID = bookCount;
			System.out.println("Please Enter"); 
			System.out.println("Book's name: "); 
			book.name = sc.nextLine();
			System.out.println("Public Date: ");
			book.publicDate = sc.nextLine();
			System.out.println("Author: ");
			book.author = sc.nextLine();
			System.out.println("Language: ");
			book.language = sc.nextLine();
			System.out.println("Please add 5 prices of that book!");
			for(int i = 0; i < 5; i++){
				book.priceList[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("======================================");
			bookList.add(book);
			menu();
		case "2": //Show all books
			if(bookList.size()==0){
				System.out.println("There is no book on the list!");
				System.out.println("======================================");
				menu();
			}
			else{
				for (int i = 0; i < bookList.size(); i++) {
					Book b = bookList.get(i);
					b.Calculate();
					b.Display();
				}
			}
			menu();
		case "3":
			if(bookList.size()==0){
				System.out.println("There is no book on the list!");
				System.out.println("======================================");
				menu();
			}
			else{
				for (int i = 0; i < bookList.size(); i++) {
					Book b = bookList.get(i);
					System.out.println("Average Price of " + b.name +" is " + b.averagePrice);
					System.out.println("======================================");
				}
			}
			menu();
		case "4":
			System.out.println("Goodbye!");
			System.out.println("======================================");
			break;
		default: break;
		}

	}
	public static void main(String[] args) {
		menu();
	}
}
