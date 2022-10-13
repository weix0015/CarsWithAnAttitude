public class TestCar {
    public static void main(String[] args) {
        Car carTest = new Car();
        carTest.turnEngine();
        System.out.println(carTest);
        Driver carTest2= new Driver();
        System.out.println(carTest.getBrand() + ", " + carTest.getMake() + ", " + carTest.getHonk() + ", "
                + carTest.getDrive() + ", " + carTest.getPark() + ", " + carTest.isEngine() + ", "
                + carTest2.getDriver());
    }
}
