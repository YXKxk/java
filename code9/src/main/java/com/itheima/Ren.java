package com.itheima;

import java.util.Random;

public class Ren {
    private String name ;
    private  int xueliang;

    public String getName() {
        return name;
    }

    public Ren(String name, int xueliang) {
        this.name = name;
        this.xueliang = xueliang;
    }

    public Ren() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ren{" +
                "name='" + name + '\'' +
                ", xueliang=" + xueliang +
                '}';
    }

    public int getXueliang() {
        return xueliang;
    }

    public void setXueliang(int xueliang) {
        this.xueliang = xueliang;
    }
    public  void attack(Ren ren){
        Random random = new Random();
        int i = random.nextInt(20) + 1;
        int i1 = ren.getXueliang() - i;
            i1 = i1 < 0 ? 0 : i1;
            ren.setXueliang(i1);
        System.out.println(this.getName() + "打了" + ren.getName()+ "打了"+i+"伤害"+ren.getName()+"还剩"+i1);
    }
}
