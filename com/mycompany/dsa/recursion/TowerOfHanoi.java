package com.mycompany.dsa.recursion;
import java.util.Scanner;

/*
Let assume the tower A,B & C and three disk r1,r2 & r3 (r1<r2<r3) which are situated in source A.
We have to shift them Destination C from source A. the rules are
1) we can move one disk at a time,
2) bigger one can't stay on smaller.
the logic is : ->
1.move-r1 from A to C (now B is empty)
2.move-r2 from A to B
3.move-r1 from C to B (now C is empty)
4.move-r3 from A to C (now A is empty)
5.move-r1 from B to A
6.move-r2 from B to C (Now B is empty)
7.move-r1 from A to C
Here requires 2^n-1 moves where n= number of disk to transfer source to destination.
towerofHanoi(n, src,aux,dest)=
    towerofHanoi(n-1, src,dest,aux)
    towerofHanoi(1, src,aux,dest)
    towerofHanoi(n-1, aux,src,dest)
*/
public class TowerOfHanoi {
    public static void towerofHanoi( int n, char src, char aux, char dest){
        if(n==1){
            System.out.println( src +" -> "+dest);
            return;
        }
        towerofHanoi(n-1, src,dest,aux);
        towerofHanoi(1, src,aux,dest);
        towerofHanoi(n-1, aux,src,dest);

    }

    public static void main(String[] args) {
        System.out.println("...It is Tower of Hanoi game...");//you can comment out
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter disk number : ");
        int n = Integer.parseInt(myInput.nextLine());
        towerofHanoi(n, 'A', 'B','C');
    }
}
