package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int a = 10;
      byte b = 1;
      short c = 1000;
      long d = 10000L;
      float e = 1.75f;
      double f = 2.6;
      double boxerfirst = 78.2;
      double boxersecond = 82.7;
      double boxersWeight = boxerfirst + boxersecond;
      System.out.println("Общая масса двоих боксеров " + boxersWeight + " кг!");
      double boxersWeights = boxersecond - boxerfirst;
      System.out.println("Разница в массе боксеров " + boxersWeights + " кг!");

      byte bananasPieces = 5;
      short milkMl = 200;
      byte icecrBr = 2;
      byte eggs = 4;
      int banana = 80;
      int m = 100;
      int i = 105;
      int es = 70;
      int bananasGr = bananasPieces * banana;
      System.out.println("Масса бананов " + bananasGr + " грамм!");
      int milk1 = milkMl / 100;
      int milkGR = milk1 * i;
      System.out.println("Масса молока " + milkGR + " грамм!");
      int icecrGr = icecrBr * 100;
      System.out.println("Масса мороженого " + icecrGr + " грамм!");
      int eggsGr = eggs * es;
      System.out.println("Масса яиц " + eggsGr + " грамм!");
      float breakfastGr = bananasGr + milkGR + icecrGr + eggsGr;
      System.out.println("Общая масса завтрака " + breakfastGr + " грамм!");
      float breakfastKg = breakfastGr / 1000;
      System.out.println("Общая масса завтрака " + breakfastKg + " кг!");

      int weightlossKg = 7;
      int one = 250;
      int two = 500;
      int kg = 1000;
      double weightlosGr = weightlossKg * kg;
      double dayofLoss = weightlosGr / one;
      System.out.println("При снижении массы тела на 250 гр, необходимо " + dayofLoss + " дней");
      double dayofLosss = weightlosGr / two;
      System.out.println("При снижении массы тела на 500 гр, необходимо " + dayofLosss + " дней");
      int average = one + two;
      int averageone = average / 2;
      double averagetwo = weightlosGr / averageone;
      System.out.println("Среднее количество дней, необходимое для похудения " + averagetwo );









    }



}
