package HitMouse.Game;

import java.util.Scanner;

public interface UserInput {
    Scanner sc=new Scanner(System.in);
    default int userInput(int lower, int upper){
        while(true){
            if(sc.hasNextInt()){
                int input=sc.nextInt();
                if(input<lower || input>upper){
                    System.out.println("没有这个选项请重新输入");
                    continue;
                }
                return input;
            }
            System.out.println("输入不合法，请重新输入");
            sc.next();
        }
    }
    default int userInput(){
        while(true){
            if(sc.hasNextInt()){
                return sc.nextInt();
            }
            System.out.println("输入不合法，请重新输入");
            sc.next();
        }
    }
}
