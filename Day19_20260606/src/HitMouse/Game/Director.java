package HitMouse.Game;
import HitMouse.AllFrame.EnrollFrame;
import HitMouse.Prop.Bomb;
import HitMouse.AllFrame.MyFrame;
import HitMouse.Mouse.BaseMouse;
import HitMouse.Mouse.Mouse;
import HitMouse.Mouse.WhiteMouse;
import HitMouse.Mouse.YellowMouse;
import HitMouse.Prop.Treat;
import HitMouse.Palyer.User;

import java.util.Random;

public class Director implements UserInput {
    public void start(){
        MyFrame myFrame = new MyFrame();
        //EnrollFrame enrollFrame=new EnrollFrame();

        GameMap gameMap=new GameMap();
        BaseMouse basemouse;
        User user=new User();
        WhiteMouse whiteMouse=new WhiteMouse(3,"🐁");
        Mouse mouse=new Mouse(1,"\uD83D\uDC00");
        YellowMouse yellowMouse=new YellowMouse(5,"🪤");
        BaseMouse[] mouses={mouse,whiteMouse,yellowMouse};

        System.out.println("选择难度：初级--1，中级--2，高级--3");
        int level=userInput(1,3);

        gameMap.initMap(level);

        Bomb[] bombs;
        Treat[] treats;

        a:while(user.getLife()>0){
            bombs = Bomb.createBombs(gameMap.getMap(),2);
            gameMap.setBombMap(bombs);//设置雷

            treats = Treat.createTreats(gameMap.getMap(),1);
            gameMap.setTreatMap(treats);//设置血包

            basemouse=createRandomMouse(mouses);
            basemouse.createMouse(gameMap.getRow(),gameMap.getCol());//设置老鼠

            for(int i=0;i<bombs.length;i++) {//判断老鼠是否与雷重叠
                if (basemouse.getRow() == bombs[i].getRow() && basemouse.getCol() == bombs[i].getCol()) {
                    break a;
                }
            }
            for(int i=0;i<treats.length;i++) {//判断老鼠是否与血包重叠
                if (basemouse.getRow() == treats[i].getRow() && basemouse.getCol() == treats[i].getCol()) {
                    break a;
                }
            }
            System.out.println("========老鼠出现了========");
            gameMap.setMap(basemouse.getRow(),basemouse.getCol(),basemouse);//设置老鼠在地图上
            gameMap.printMap();
            user.hit(basemouse,bombs,treats,gameMap.getRow(),gameMap.getCol());
            gameMap.resetMap(basemouse.getRow(),basemouse.getCol());//重置老鼠位置

            for (int i=0;i<bombs.length; i++) {
                gameMap.resetMap(bombs[i].getRow(), bombs[i].getCol());//重置雷位置

            }
            for (int i=0;i<treats.length; i++) {
                gameMap.resetMap(treats[i].getRow(), treats[i].getCol());//重置血包位置
            }
        }
        System.out.println("游戏结束，最终得分："+user.getScore());
    }

    public BaseMouse createRandomMouse(BaseMouse[] mouses){
        Random r=new Random();
        int n=r.nextInt(10);
        if(n<=4){
            return mouses[0];
        }else if(n<=7){
            return mouses[1];
        }else{
            return mouses[2];
        }
    }
}
