

public class kitap {

	
	public String name;
	public String author;
	public int pageNumber;
	
	public void read() {
		System.out.println("You are reading:  " + name);
	}
	

		
		public static void main(String[] args) {
			kitap book1 = new kitap();
			
			
			book1.name = "Les Miserables";
			book1.author = "Victor Hugo";
			book1.pageNumber = 1235;
			
			book1.read();
			
		
	}
	
	
		
	}

