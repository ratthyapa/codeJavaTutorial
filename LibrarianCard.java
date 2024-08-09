public class LibrarianCard {
    private Student owner;
    private int borrowcnt;

   
    public LibrarianCard() {
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBooks) {
        borrowcnt = borrowcnt + numOfBooks;
    }
    public void setownerName(Student student) {
        owner = student;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String toString() {
        return "Owner Name: " + owner.getName() + "\n" +
               "Email: " + owner.getEmail() + "\n" +
               "Books Borrowed: " + borrowcnt;
    }
}