public class Test05 {
    public static void main(String[] args) {
        int firstday = 1;

        for (int i = 10; i >= 1; i--) {
            firstday = ((firstday + 1) * 2);
        }

        System.out.println("第一天共摘了：" + firstday + " 个桃子");
    }
}
