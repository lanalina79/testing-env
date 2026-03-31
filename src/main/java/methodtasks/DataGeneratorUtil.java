package methodtasks;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    /*public static int genRandomInt(int minValue, int maxValue){
        if (minValue>maxValue){
            System.out.println("Min should be greater than maximum");
            return -1;
        }
        Random random= new Random();
        return random.nextInt(maxValue-minValue+1)+minValue;

    }*/

    private static Random random = new Random();

    public static int genRandomInt() {
//        Random random= new Random();
        int bound = 20;
        return random.nextInt(bound);
    }

    public static int getRandomInt(int limit) {
//        Random random=new Random();
        int result = random.nextInt(limit);
        return result;
    }

    /*works for latter version of Java 17+
    public static int getRandomInt(int min, int max){
        Random random=new Random();
        if (max>min){
            return random.nextInt(min, max)
        }
        else {
        return 0;}
    }
*/
    public static String getEmail() {
        UUID emailUuid = UUID.randomUUID();
        return emailUuid.toString() + "@test.com";
    }

    public static String getStringLength(String stringName) {
        int stringLength = 0;
        int i = 0;
        while (i < stringName.length()) {
            stringLength++;
            i++;
        }
        return "The length is " + stringLength;
    }

    public static String generateRandom(String domain) {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }

    public static String generateRandom() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@gmail.com";
    }
//comment this//

}
