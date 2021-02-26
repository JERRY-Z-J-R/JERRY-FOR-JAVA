import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book thinkingInJava = new Book();

        thinkingInJava.setTitle("thinkingInJava");

        Scanner scanner = new Scanner(System.in);
        System.out.println("input pageNum:");
        int pageNum = scanner.nextInt();

        thinkingInJava.setPageNum(pageNum);

        thinkingInJava.getTitle();
        thinkingInJava.getPageNum();

        thinkingInJava.detail();
    }
}

class Book {
    private String title;
    private int pageNum;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("Error!");
        } else {
            this.pageNum = pageNum;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void detail() {
        System.out.println(title);
        System.out.println(pageNum);
    }
}
