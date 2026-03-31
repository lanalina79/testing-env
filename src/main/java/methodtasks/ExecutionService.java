package methodtasks;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(10));

        System.out.println(DataGeneratorUtil.getStringLength("Brave"));

        Customer marcel = new Customer();
        marcel.setName("Marcel");
        marcel.setId(DataGeneratorUtil.getRandomInt(999999));
        marcel.setAddress("Moldova");
        marcel.setAge(DataGeneratorUtil.getRandomInt(128));

        Customer ionel = new Customer(67, "Ionel Bujorel", "Fierailor,58");
        marcel.setName("Ionel Istrati");
        ionel.setAge(90);
        ionel.setId(8986);
        ionel.setAddress("Str. Moscova,12");

        System.out.println(ionel.getName());
        System.out.println(marcel.getName());
        System.out.println(ionel.getAge());
        System.out.println(marcel.getAge());

        System.out.println(DataGeneratorUtil.getRandomInt(45));
        System.out.println(DataGeneratorUtil.getRandomInt(120));
//        System.out.println(DataGeneratorUtil.getRandomInt(10,11));
        System.out.println(DataGeneratorUtil.generateRandom("gmail.com"));
        System.out.println(DataGeneratorUtil.generateRandom());


    }
}
