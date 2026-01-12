class Book
{
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

class LibraryHasARelation
{
    String libraryName;
    Book book;   // HAS-A relationship

    LibraryHasARelation(String libraryName, Book book)
    {
        this.libraryName = libraryName;
        this.book = book;
    }

    void display()
    {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Id: " + book.bookId);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
    }

    public static void main(String args[])
    {
        Book b = new Book(101, "Effective Java", "Joshua Bloch");
        LibraryHasARelation l = new LibraryHasARelation("City Library", b);

        l.display();
    }
}
