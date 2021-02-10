package com.gildedrose.strategy

import com.gildedrose.Item

class BackstageStrategy : ItemStrategy() {

    override fun updateQuality(item: Item) {
        incrementQuality(item)
        updateBackstage(item)
    }

    override fun decrementSellin(item: Item) {
        item.sellIn = item.sellIn - 1
    }

    override fun updateSellinExpired(item: Item) {
        item.quality = 0
    }

    private fun updateBackstage(item: Item) {
        if (item.sellIn < 11) {
            incrementQuality(item)
        }

        if (item.sellIn < 6) {
            incrementQuality(item)
        }
    }
}