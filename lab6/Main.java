package lab6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        int[] first;
        first = new int[12];
        int one = 4;
        int[] second;
        second = new int[12];
        int two = 4;
        for (int i = 0; i < 5; i++) {
            Object item = in.nextInt();
            stack1.push(item);
            first[i]= (int) item;
        }
        for (int i = 0; i < 5; i++) {
            Object item = in.nextInt();
            stack2.push(item);
            second[i]= (int) item;
        }
        while ((one != -1)&&(two != -1)) {
            for (int i = 0; i<10; i++) {
                if ((stack1.empty())||(stack2.empty())) {
                    break;
                }
                else {
                    int card1 = (int) stack1.pop();
                    int card2 = (int) stack2.pop();
                    if ((card1==9)&&(card2==0)) {
                        for (int j = two; j>=0; j--)
                            second[j+2]=second[j];
                        second[0]=card1;
                        second[1]=card2;
                        second[two+2]=0;
                        two =two+1;
                        first[one]=0;
                        one=one-1;
                    }
                    else if ((card2==9)&&(card1==0)) {
                        for (int j = one; j>=0; j--)
                            first[j+2]=first[j];
                        first[0]=card1;
                        first[1]=card2;
                        first[one+2]=0;
                        one=one+1;
                        second[two]=0;
                        two=two-1;
                    }
                    else {
                        if (card1 > card2) {
                            for (int j = one; j>=0; j--)
                                first[j + 2] = first[j];
                            first[0]=card1;
                            first[1]=card2;
                            first[one+2]=0;
                            one=one+1;
                            second[two]=0;
                            two=two-1;
                        }
                        else {
                            for (int j = two; j>=0; j--)
                                second[j+2]=second[j];
                            second[0]=card1;
                            second[1]=card2;
                            second[two+2]=0;
                            two =two+1;
                            first[one]=0;
                            one=one-1;
                        }
                    }
                }
                count++;
                if (count==106) {
                    System.out.println("botva");
                    System.exit(0);
                }
            }
            stack1.clear();
            stack2.clear();
            for (int i=0; i<one+1; i++) {
                stack1.push(first[i]);
            }
            for (int i=0; i<two+1; i++) {
                stack2.push(second[i]);
            }
        }
        if (one == -1) System.out.println("second " + count);
        if (two == -1) System.out.println("first " + count);
    }
}