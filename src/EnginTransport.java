public class EnginTransport extends Transport {
    public EnginTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }
}




