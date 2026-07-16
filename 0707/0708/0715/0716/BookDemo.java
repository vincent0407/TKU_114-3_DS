public class BookDemo {
    public static void main(String[] args) {
        Book first = new Book("Java Basics", 650);
        Book second = new Book("Data Structures", 720);

        System.out.println(first);
        System.out.println(second);
        System.out.println("第一本書名：" + first.getTitle());
        System.out.println("第二本書名：" + second.getTitle());
    }
}