package lab4;

import java.util.Objects;
import java.util.Scanner;

abstract class Item {
	private int UID;
	private String title;
	private int number_of_copies;

	public Item(int uID, String title, int number_of_copies) {
		UID = uID;
		this.title = title;
		this.number_of_copies = number_of_copies;
	}

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber_of_copies() {
		return number_of_copies;
	}

	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}

	@Override
	public String toString() {
		return "Item [UID=" + UID + ", title=" + title + ", number_of_copies=" + number_of_copies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return UID == other.UID && number_of_copies == other.number_of_copies && Objects.equals(title, other.title);
	}

}

class WrittenItem extends Item {
	private String author;

	public WrittenItem(int uID, String title, int number_of_copies, String author) {
		super(uID, title, number_of_copies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", toString()=" + super.toString() + "]";
	}

}

class Journal extends WrittenItem {
	private int year_of_publish;

	public Journal(int uID, String title, int number_of_copies, String author, int year_of_publish) {
		super(uID, title, number_of_copies, author);
		this.year_of_publish = year_of_publish;
	}

	public int getYear_of_publish() {
		return year_of_publish;
	}

	public void setYear_of_publish(int year_of_publish) {
		this.year_of_publish = year_of_publish;
	}

	@Override
	public String toString() {
		return "Journal [year_of_publish=" + year_of_publish + ", toString()=" + super.toString() + "]";
	}

}

class Book extends WrittenItem {
	public Book(int uID, String title, int number_of_copies, String author) {
		super(uID, title, number_of_copies, author);
	}

	@Override
	public String toString() {
		return "Book [toString()=" + super.toString() + "]";
	}

}

class MediaItem extends Item {
	private int runtime;

	public MediaItem(int uID, String title, int number_of_copies, int runtime) {
		super(uID, title, number_of_copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", toString()=" + super.toString() + "]";
	}

}

class CD extends MediaItem {
	private String genre, artist;

	public CD(int uID, String title, int number_of_copies, int runtime, String genre, String artist) {
		super(uID, title, number_of_copies, runtime);
		this.genre = genre;
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "CD [genre=" + genre + ", artist=" + artist + ", toString()=" + super.toString() + "]";
	}

}

class Video extends MediaItem {
	private int year_of_release;
	private String director, genre;

	public Video(int uID, String title, int number_of_copies, int runtime, String director, String genre,
			int year_of_release) {
		super(uID, title, number_of_copies, runtime);
		this.year_of_release = year_of_release;
		this.director = director;
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear_of_release() {
		return year_of_release;
	}

	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}

	@Override
	public String toString() {
		return "Video [year_of_release=" + year_of_release + ", director=" + director + ", genre=" + genre
				+ ", toString()=" + super.toString() + "]";
	}

}

public class Exercise3 {
	public static void main(String[] args) {
//		System.out.println("End of execution");
//		Book bk = new Book(123, "Hello", 5, "hisdh");
//		System.out.println(bk.getNumber_of_copies());
//		System.out.println(bk.getAuthor());
//
//		CD cd = new CD(123, "HI", 4, 120, "Genre", "Artist");
//		System.out.println(cd.getGenre());
//		System.out.println(cd);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of item: (Journal, Book, Video, CD)");
		String type = sc.next();
		type = type.toLowerCase();
		int uid, copy, year, rt;
		String title, author, director, genre, artist;
		switch (type) {
		case "book":
			System.out.println("Enter book details");
			System.out.print("Enter book ID: ");
			uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter book Title: ");
			title = sc.nextLine();
			System.out.print("Enter book Number of Copies: ");
			copy = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter book Author: ");
			author = sc.nextLine();
			Book book_obj = new Book(uid, title, copy, author);
			System.out.println("Book: " + book_obj);
			break;
		case "journal":
			System.out.println("Enter Journal details");
			System.out.print("Enter Journal ID: ");
			uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Journal Title: ");
			title = sc.nextLine();
			System.out.print("Enter Journal Number of Copies: ");
			copy = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Journal Author: ");
			author = sc.nextLine();
			System.out.print("Enter Journal Publication Year: ");
			year = sc.nextInt();
			Journal journal_obj = new Journal(uid, title, copy, author, year);
			System.out.println("Journal: " + journal_obj);
			break;
		case "video":
			System.out.println("Enter Video details");
			System.out.print("Enter Video ID: ");
			uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Video Title: ");
			title = sc.nextLine();
			System.out.print("Enter Video Number of Copies: ");
			copy = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Video Runtime: ");
			rt = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Video Director: ");
			director = sc.nextLine();
			System.out.print("Enter Video Genre: ");
			genre = sc.nextLine();
			System.out.print("Enter Video Publication Year: ");
			year = sc.nextInt();
			Video video_obj = new Video(uid, title, copy, rt, director, genre, year);
			System.out.println("Video: " + video_obj);
			break;
		case "cd":
			System.out.println("Enter CD details");
			System.out.print("Enter CD ID: ");
			uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter CD Title: ");
			title = sc.nextLine();
			System.out.print("Enter CD Number of Copies: ");
			copy = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Video Runtime: ");
			rt = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Video Genre: ");
			genre = sc.nextLine();
			System.out.print("Enter Journal Artist: ");
			artist = sc.nextLine();
			CD cd_obj = new CD(uid, title, copy, rt, genre, artist);
			System.out.println("CD: " + cd_obj);
			break;
		default:
			System.out.println("Enter a vald choice");
		}

		sc.close();

	}
}
