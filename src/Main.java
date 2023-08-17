public class Main {
    public static void main(String[] args) {
        Data dataOne = new FileSystem();
        System.out.println(dataOne.getData());
        Data dataTwo = new Db();
        System.out.println(dataTwo.getData());
    }
}