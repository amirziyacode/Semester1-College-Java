package org.example;

public class probB {
    int[] wallet;
    int i;

    public static void main(String[] args) {

    }

    public probB(int _Q) {
        wallet = new int[_Q];
        i = 0;
    }

   public void addBall(int _x){
        wallet[i] = _x;
        i++;
    }

   public void removeBall(int _x){
        for (int j = 0; j <wallet.length ; j++) {
            if(wallet[j] == _x){
                wallet[j] = 0;
            }
        }
    }

   public int  showBalls(){
        int sum = 0;
       for (int k : wallet) {
           if (k != 0) {
               sum++;
           }
       }
        return sum;
   }

}
