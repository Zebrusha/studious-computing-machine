public class BmiService {
    public int calc(int weight, double height) {

        return (int) (weight / (height * height));
    }

}