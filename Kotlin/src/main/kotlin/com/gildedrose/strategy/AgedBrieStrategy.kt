package com.gildedrose.strategy

import com.gildedrose.Item

class AgedBrieStrategy : ItemStrategy() {
    override fun updateQuality(item: Item) {
        incrementQuality(item)
    }

    override fun decrementSellin(item: Item) {
        item.sellIn = item.sellIn - 1
    }

    override fun updateSellinExpired(item: Item) {
        incrementQuality(item)
    }
}