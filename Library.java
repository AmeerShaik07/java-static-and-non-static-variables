public class Library{
    static String libraryName = "Central Library";
    String bookTitle;
    public static void main(String[] args){
        Library l1 = new Library();
        System.out.println("Library Name : " + Library.libraryName);
        System.out.println("Book Title : " + l1.bookTitle);
    }
}