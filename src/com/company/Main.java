package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(70);
        boss.getBossWeapon();
        System.out.println(boss.getHealth() + " " + boss.getDamage());

    }
}