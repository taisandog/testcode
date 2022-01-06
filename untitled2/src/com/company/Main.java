package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start:"+EnumUnit.GetEnumDescription(GameLevel.Start));
        System.out.println("Normal:"+EnumUnit.GetEnumDescription(GameLevel.Normal));
        System.out.println("Hard:"+EnumUnit.GetEnumDescription(GameLevel.Hard));
    }
}
