package HitMouse.Palyer;

import HitMouse.Game.UserInput;
import HitMouse.Mouse.BaseMouse;
import HitMouse.Prop.Bomb;
import HitMouse.Prop.Treat;

public class User implements UserInput {
    private int score;
    private int life=3;
    public void hit(BaseMouse mouse, Bomb[] bombs, Treat[] treats, int mapRow, int mapCol){
        System.out.println("请输入要打的行号：");
        int row=userInput(1,mapRow);
        System.out.println("请输入要打的列号；");
        int col=userInput(1,mapCol);
        for (int i = 0; i < bombs.length; i++) {
            if (row - 1 == bombs[i].getRow() && col - 1 == bombs[i].getCol()) {
                System.out.println("踩到地雷，直接失败");
                life=0;
                System.out.println("当前得分："+score);
                System.out.println("当前剩余生命值："+life);
                System.out.println("========================");
                return;
            }
        }

        for (int i = 0; i < treats.length; i++) {
            if(row-1== treats[i].getRow() && col-1== treats[i].getCol()){
                System.out.println("打中了血包，生命值+1");
                life++;
                System.out.println("当前得分："+score);
                System.out.println("当前剩余生命值："+life);
                System.out.println("========================");
                return;
            }
        }

        if(row-1== mouse.getRow() && col-1==mouse.getCol()){
            System.out.println("打中了");
            score+=mouse.getScore();
        }else{
            System.out.println("没打中,生命值-1");
            score=Math.max(0,--score);
            life--;
        }
        System.out.println("当前得分："+score);
        System.out.println("当前剩余生命值："+life);
        System.out.println("========================");
    }

    public int getScore() {
        return score;
    }

    public int getLife() {
        return life;
    }
}
