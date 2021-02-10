package com.gildedrose.strategy

import com.gildedrose.Item

class ConjuredStrategy : ItemStrategy() {
    override fun updateQuality(item: Item) {
        decrementQuality(item)
        decrementQuality(item)
    }

    override fun decrementSellin(item: Item) {
        return
    }

    override fun updateSellinExpired(item: Item) {
        decrementQuality(item)
        decrementQuality(item)
    }
}