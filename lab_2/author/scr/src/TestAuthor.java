public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Vladimir", "ovvlad10@gmail.com", 'm');
        System.out.println(a1);
        a1.setEmail("ovvlad10@gmail.com");
        System.out.println(a1);
    }
}

