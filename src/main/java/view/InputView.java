package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputFuncNumber(){
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextInt();
    }

}
