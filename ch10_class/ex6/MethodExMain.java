package ch10_class.ex6;

public class MethodExMain {
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        //method1 호출
        System.out.println("호출전");
        methodEx.method1();
        System.out.println("호출후");
        System.out.println();

        //method2호출
        methodEx.method2("안녕하세요");
        String str1 = "오늘은 화요일";
        methodEx.method2(str1);
        System.out.println();

        //method3 호출
        String result = methodEx.method3();
        System.out.println("result = " + result);
        System.out.println();

        //method4호출후 결과값 입력
        int num = methodEx.method4();
        System.out.println("num = " + num);
        System.out.println();

        //method5호출후 결과값 입력
        String result2 = methodEx.method5("안녕",1000);
        System.out.println("result2 = " + result2);
        System.out.println();

        //method6 호출후 결과값 입력
        int result3 = methodEx.method6(10,20);
        System.out.println("result3 = " + result3);
    
    }
}
