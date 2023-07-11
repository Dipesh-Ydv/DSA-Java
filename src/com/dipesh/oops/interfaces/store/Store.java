package com.dipesh.oops.interfaces.store;

public class Store {
    private Member[] mem = new Member[10];
    private int count = 0;

    public void register(Member member) {
        mem[count++] = member;
    }

    void inviteToSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }
}
