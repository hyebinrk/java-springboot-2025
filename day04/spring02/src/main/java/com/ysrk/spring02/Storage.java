package com.ysrk.spring02;

import java.util.List;

// 제네릭
public class Storage<P> {
    private P item;  // ctrl + . generate 아이템어쩌고 해서 자동 입력

    public P getItem() {
        return item;
    }

    public void setItem(float item) {
        this.item = item;
    }

}
