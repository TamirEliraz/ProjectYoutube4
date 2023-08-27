public class MainTest {
    public static void main(String[] args) {
        Farm farm = new Farm("Tel Aviv", 5,Math.sqrt(2));
        Farm farm1 = new Farm("Tel Aviv", 5, Math.sqrt(2));
        for (int i=0; i<10;i++) farm.update();
        farm.withdraw(50);
        System.out.println(farm);
        farm.withdraw(50);
        System.out.println(farm);
        farm.update();
        System.out.println(farm);
        
        
    }
}
