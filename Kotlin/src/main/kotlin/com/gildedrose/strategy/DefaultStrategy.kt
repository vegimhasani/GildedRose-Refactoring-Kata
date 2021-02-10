package com.gildedrose.strategy

import com.gildedrose.Item

class DefaultStrategy : ItemStrategy() {

    override fun updateQuality(item: Item) {
        decrementQuality(item)
    }

    override fun decrementSellin(item: Item) {
        item.sellIn = item.sellIn - 1
    }

    override fun updateSellinExpired(item: Item) {
        decrementQuality(item)
    }
}