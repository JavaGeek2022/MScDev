package OOPAmazonBook;

public class OOPAmazonBook {
	
	public String title;
	public String author;
	public double price;
	public int pages;
	public String ISBN10;
	public double avgRating;
	public String language;
	
	/**
	 * default constructor 
	 */
	public OOPAmazonBook() {
		
	}
	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param pages
	 * @param ISBN10
	 * @param avgRating
	 * @param language
	 */
	public OOPAmazonBook(String title, String author, double price, int pages, 
			String ISBN10, double avgRating, String language) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.ISBN10= ISBN10;
		this.avgRating = avgRating;
		this.language = language;
				
	}
	@Override
	public String toString() {
		return String.format(
				"Title of book is: %s,%n"
				+ "Author is: %s,%n"
				+ "Price = £%s,%n"
				+ "No. of Pages = %s,%n"
				+ "ISBN10 = %s,%n"
				+ "Average Customer Rating = %.1f,%n"
				+ "Language= %s", title, author, price, pages, ISBN10, avgRating, language);
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	/**
	 * @return the iSBN10
	 */
	public String getISBN10() {
		return ISBN10;
	}
	/**
	 * @param iSBN10 the iSBN10 to set
	 */
	public void setISBN10(String iSBN10) {
		ISBN10 = iSBN10;
	}
	/**
	 * @return the avgRating
	 */
	public double getAvgRating() {
		return avgRating;
	}
	/**
	 * @param avgRating the avgRating to set
	 */
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
