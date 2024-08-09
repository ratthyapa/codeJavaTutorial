public class Librarian {
    public static void main(String[] args) {
        Student st1;
        LibrarianCard card1,card2;
        st1 = new Student();
        st1.setName("jon Java");
        st1.setEmail("jj@mamil.com");
        card1 = new LibrarianCard();
        card1.setownerName(st1);
        card1.checkOut(3);
        card2 = new LibrarianCard();
        card2.setownerName(st1);

        System.out.println("Card1 Info:");
        System.out.println(card1.toString()+ "\n" );
        System.out.println("Card2 Info:");
        System.out.println(card2.toString()+ "\n" );

    }
}