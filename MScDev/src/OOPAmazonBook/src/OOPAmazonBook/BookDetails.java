package OOPAmazonBook;

public class BookDetails {
	public static void main(String[] args) {
		
		OOPAmazonBook book1 = new OOPAmazonBook("the Body", "bill bryson", 7.99, 464, "0857522418", 4.5, "English");
		OOPAmazonBook book2 = new OOPAmazonBook("Ulysses", "James Joyce", 2.18, 736, "1840226358", 4.5, "English");
		
		
		
		
		if (book1.pages<book2.pages) {
			System.out.println(book2.toString());
		}else 
			System.out.println(book1.toString());
	}

}
