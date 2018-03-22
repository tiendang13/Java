package oop;

public class Book implements IBook{
	int ID;
	String name;
	String publicDate;
	String author;
	String language;
	float averagePrice;
	
	@Override
	public void Display(){
		System.out.println("Book's name: "+ this.name);
		System.out.println("Public Date: "+ this.publicDate);
		System.out.println("Author: "+ this.author);
		System.out.println("Language: "+ this.language);
		System.out.println("Average Price: "+ this.averagePrice);
		System.out.println("======================================");
	}
	int[] priceList = new int[5];
	public void Calculate(){
		int sum = 0;
		for(int i = 0; i < 5; i++){
			sum+= priceList[i];
		}
		averagePrice = sum/5;
	}
	
	public Book() {
		super();
	}

	public Book(String name, String publicDate, String author, String language) {
		super();
		this.name = name;
		this.publicDate = publicDate;
		this.author = author;
		this.language = language;
	}
	
}
