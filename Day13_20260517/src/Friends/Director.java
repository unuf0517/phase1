package Friends;

import java.util.ArrayList;
import java.util.Scanner;

public class Director {
    Scanner sc=new Scanner(System.in);
    public void Start(){
        System.out.println("==========好友管理系统==========");
        ArrayList<Friend> list=new ArrayList<>();
        while(true){
            System.out.println("1-添加，2-修改，3-删除，4-查询，0-退出系统");
            int n=input(0,4);
            switch (n) {
                case 1:
                    addFriend(list);
                    break;
                case 2:
                    changeFriend(list);
                    break;
                case 3:
                    deleteFriend(list);
                    break;
                case 4:
                    searchFriend(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }



    }
    public void searchFriend(ArrayList<Friend> list){
        if(list.isEmpty()){
            System.out.println("好友列表为空");
            return;
        }
        a:while(true){
            System.out.println("请输入要查询的好友id,0--返回");
            int id = input(1, Integer.MAX_VALUE);
            if (id==0) return;
            if(!checkFriend(list,id)){
                System.out.println("好友不存在");
                continue;
            }
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId()==id){
                    System.out.println("编号:"+list.get(i).getId()+" 姓名:"+list.get(i).getName()+" 年龄:"+list.get(i).getAge()+" 性格:"+list.get(i).getCharacter());
                    break a;
                }
            }
        }

    }

    public void deleteFriend(ArrayList<Friend> list){
        if(list.isEmpty()){
            System.out.println("好友列表为空");
            return;
        }
        a:while(true){
            System.out.println("请输入要删除的好友id,0--返回");
            int id = input(1, Integer.MAX_VALUE);
            if (id==0) return;
            if(!checkFriend(list,id)){
                System.out.println("好友不存在");
                continue;
            }
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId()==id){
                    list.remove(i);
                    break a;
                }
            }
        }

    }
    public void changeFriend(ArrayList<Friend> list){
        if(list.isEmpty()){
            System.out.println("好友列表为空");
            return;
        }
        a:while(true){
            System.out.println("请输入要修改的好友id,0--返回");
            int id = input(1, Integer.MAX_VALUE);
            if (id==0) return;
            if(!checkFriend(list,id)){
                System.out.println("好友不存在");
                continue;
            }
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId()==id){
                    System.out.println("编号:"+list.get(i).getId()+" 姓名:"+list.get(i).getName()+" 年龄:"+list.get(i).getAge()+" 性格:"+list.get(i).getCharacter());
                }
            }
            System.out.println("请输入新的好友信息");
            System.out.println("请输入好友id");
            id = input(1, Integer.MAX_VALUE);
            if(checkFriend(list,id)){
                System.out.println("好友已存在");
                continue;
            }
            System.out.println("请输入好友姓名");
            String name = sc.next();
            System.out.println("请输入好友年龄");
            int age = input(1, 150);
            System.out.println("请输入好友性格");
            String character = sc.next();
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId()==id){
                    list.set(i,new Friend(id, name, age, character));
                    break a;
                }
            }
        }

    }
    public void addFriend(ArrayList<Friend> list){
        while(true){
            System.out.println("请输入好友id,0--返回");
            int id = input(1, Integer.MAX_VALUE);
            if (id==0) return;
            if(checkFriend(list,id)){
                System.out.println("好友已存在");
                continue;
            }
            System.out.println("请输入好友姓名");
            String name = sc.next();
            System.out.println("请输入好友年龄");
            int age = input(1, 150);
            System.out.println("请输入好友性格");
            String character = sc.next();
            Friend friend = new Friend(id, name, age, character);
            list.add(friend);
            System.out.println("添加成功");
            break;
        }

    }
    public  boolean checkFriend(ArrayList<Friend> list,int id){
        for (Friend friend : list) {
            if(friend.getId()==id){
                return true;
            }
        }
        return false;
    }
    public int input(int min,int max){
        while(true){
            if(sc.hasNextInt()){
                int n=sc.nextInt();
                if(n<min || n>max){
                    System.out.println("超出范围，请重新输入");
                    continue;
                }
                return n;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
    }
}
