package com.gildedrose.strategy

import com.gildedrose.Item

abstract class ItemStrategy {

    protected abstract fun updateQuality(item: Item)

    protected abstract fun decrementSellin(item: Item)

    protected abstract fun updateSellinExpired(item: Item)

    fun init(item: Item) {
        updateQuality(item)
        decrementSellin(item)
        if (isSellinExpired(item)) {
            updateSellinExpired(item)
        }
    }

    protected fun incrementQuality(item: Item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1
        }
    }

    protected fun decrementQuality(item: Item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1
        }
    }
    private fun isSellinExpired(item: Item) = item.sellIn < 0
}
