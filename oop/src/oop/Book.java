package oop;

public class Book implements IBook{
	private int ID;
	private String name;
	private String publicDate;
	private String author;
	private String language;
	private float averagePrice;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int[] getPriceList() {
		return priceList;
	}

	public void setPriceList(int[] priceList) {
		this.priceList = priceList;
	}

	public float getAveragePrice() {
		return averagePrice;
	}

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
