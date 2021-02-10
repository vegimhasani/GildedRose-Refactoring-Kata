package com.gildedrose.strategy

import com.gildedrose.Item

class SulfurasStrategy : ItemStrategy() {
    override fun updateQuality(item: Item) {
       return
    }

    override fun decrementSellin(item: Item) {
        return
    }

    override fun updateSellinExpired(item: Item) {
        return
    }
}