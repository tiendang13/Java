package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private static Scanner sc;
	private int bookCount = 0;
	public static ArrayList<Book> bookList = new ArrayList<Book>(); //List to save books
	
	private void insertNewBook(){
		 //Insert new book
		bookCount++;
		Book book = new Book();
		book.setID(bookCount);
		System.out.println("Please Enter"); 
		System.out.println("Book's name: "); 
		book.setName(sc.nextLine());
		System.out.println("Public Date: ");
		book.setPublicDate(sc.nextLine());
		System.out.println("Author: ");
		book.setAuthor(sc.nextLine());
		System.out.println("Language: ");
		book.setLanguage(sc.nextLine());
		System.out.println("Please add 5 prices of that book!");
		for(int i = 0; i < 5; i++){
			book.priceList[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("======================================");
		bookList.add(book);
	}
	private void showBook(){ 
		//Show all books
		if(bookList.size()==0){
			System.out.println("There is no book on the list!");
			System.out.println("======================================");
		}
		else{
			for (int i = 0; i < bookList.size(); i++) {
				Book b = bookList.get(i);
				b.Calculate();
				b.Display();
			}
		}
	}
	private void averagePrice(){
		if(bookList.size()==0){
			System.out.println("There is no book on the list!");
			System.out.println("======================================");
			menuShow();
		}
		else{
			for (int i = 0; i < bookList.size(); i++) {
				Book b = bookList.get(i);
				System.out.println("Average Price of " + b.getName() +" is " + b.getAveragePrice());
				System.out.println("======================================");
			}
		}
	}
	public void menuShow(){
		//Menu
		System.out.println("Please press to choose:"); 
		System.out.println("1. Insert a new book.");
		System.out.println("2. View list of book.");
		System.out.println("3. Average price");
		System.out.println("4. Exit");
		sc = new Scanner(System.in);
		String input =sc.nextLine();
		switch (input){
		case "1": 
			insertNewBook();
			menuShow();
			break;
		case "2": 
			showBook();
			menuShow();
			break;
		case "3":
			averagePrice();
			menuShow();
			break;
		default: break;
		}
	}
}
