public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight;
        double height;
        int index = service.calc(98, 1.87);
        System.out.print(index);
    }
}