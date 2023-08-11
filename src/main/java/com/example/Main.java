package com.example;

public class Main {

  public static void main(String[] args) {
    SmartTV smartTV = new SmartTV();

    String arg1 = args[0];
    String arg2 = args[1];

    System.out.println(arg1 + arg2);

    System.out.println("TV Ligada " + smartTV.isLigada());
    System.out.println("TV Ligada " + smartTV.getCanal());
    System.out.println("TV Ligada " + smartTV.getVolume());
    smartTV.lowVolume();
    System.out.println(smartTV.getVolume());

  }

}
