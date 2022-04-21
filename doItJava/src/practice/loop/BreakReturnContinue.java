package practice.loop;

public class BreakReturnContinue {
    public static void main(String[] args) {
//        System.out.println("### continue ###");
//        for (int i = 0; i < 10; i++) {
//            if (i % 5 == 0){
//                continue;
//            }
//            System.out.println(i);
//
//        }
//
//        System.out.println("continue 종료");

        System.out.println("### break ###");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i  == 5){
                break;
            }
        }

        System.out.println("break 종료");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5 ){
                return;
            }
        }

        System.out.println("return 종료");





    }
}
