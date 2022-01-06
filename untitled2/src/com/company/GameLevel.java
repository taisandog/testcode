package com.company;

public enum GameLevel {
    @DescriptionInfo(Remark = "初级")
    Start(1),
    @DescriptionInfo(Remark = "普通")
    Normal(2),
    @DescriptionInfo(Remark = "困难")
    Hard(4);


    private final int value;
    GameLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
