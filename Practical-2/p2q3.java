class Library {
    private int id;
    private String title, author;
    private static int bookCount=0;

    public Library(){} 
    public Library(int i, String t, String a) {
        bookCount++;
        id=i;
        title=t;
        author=a;
    }
    public void disp(){
        System.out.println("Id : " + id);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

    public static void printTotal(){
        System.out.println("Total Book Objects created so far : " + bookCount);
    }

}

public class p2q3 {
    public static void main(String[] args) {
        Library b1=new Library(01, "C Programming", "Dennis Ritchie...");
        Library b2=new Library(02, "Java Programming", "James Gosling");
        Library b3=new Library(03, "Pytho Programming", "Guido Rossum");

        b1.disp();
        b2.disp();
        b3.disp();

        Library.printTotal();
    }
}
