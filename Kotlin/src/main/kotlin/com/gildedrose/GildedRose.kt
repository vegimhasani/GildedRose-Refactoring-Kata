package com.gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        items.indices.forEach {
            val item = items[it]
            updateSingleItem(item)
        }
    }

    private fun incrementQuality(item: Item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1
        }
    }

    private fun updateSingleItem(item: Item) {
        updateQuality(item)

        decrementSellin(item)

        if (isSellinExpired(item)) {
            updateSellinExpired(item)
        }
    }

    private fun isSellinExpired(item: Item) = item.sellIn < 0

    private fun updateSellinExpired(item: Item) {
        when (item.name) {
            "Aged Brie" -> {
                incrementQuality(item)
            }
            "Backstage passes to a TAFKAL80ETC concert" -> {
                item.quality = item.quality - item.quality
            }
            "Sulfuras, Hand of Ragnaros" -> {
                return
            }
            else -> {
                decrementQuality(item)
            }
        }
    }

    private fun decrementQuality(item: Item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1
        }
    }

    private fun decrementSellin(item: Item) {
        if (item.name != "Sulfuras, Hand of Ragnaros") {
            item.sellIn = item.sellIn - 1
        }
    }

    private fun updateQuality(item: Item) {
        when (item.name) {
            "Aged Brie" -> {
                incrementQuality(item)
            }
            "Backstage passes to a TAFKAL80ETC concert" -> {
                incrementQuality(item)
                updateBackstage(item)
            }
            "Sulfuras, Hand of Ragnaros" -> return
            else -> decrementQuality(item)
        }
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
