/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tamim
 */
public class DynamicArray {
    public static void main(String[] args){
        int lastAns = 0;
        Scanner input = new Scanner(System.in);
        int nS = input.nextInt();
        int nQ = input.nextInt();
        int type, x, y, index;
        
        ArrayList<Integer>[] seqList = new ArrayList[nS];
        
        while(nQ-- > 0){
            type = input.nextInt();
            x = input.nextInt();
            y = input.nextInt();
            index = (x ^ lastAns) % nS;
            
            switch(type){
                case 1:
                    if(seqList[index] == null){
                        ArrayList<Integer> myList = new ArrayList<>();
                        myList.add(y);
                        seqList[index] = myList;
                    }
                    else{
                        seqList[index].add(y);
                    }
                    break;
                    
                case 2:
                    System.out.println(lastAns = seqList[index].get(y % seqList[index].size()));
                    break;
            }
        }
        
    }
}
