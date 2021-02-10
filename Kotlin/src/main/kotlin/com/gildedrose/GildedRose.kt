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

        if (item.name != "Sulfuras, Hand of Ragnaros") {
            item.sellIn = item.sellIn - 1
        }

        if (item.sellIn < 0) {
            if (item.name != "Aged Brie") {
                if (item.name != "Backstage passes to a TAFKAL80ETC concert") {
                    if (item.quality > 0) {
                        if (item.name != "Sulfuras, Hand of Ragnaros") {
                            item.quality = item.quality - 1
                        }
                    }
                } else {
                    item.quality = item.quality - item.quality
                }
            } else {
                incrementQuality(item)
            }
        }
    }

    private fun updateQuality(item: Item) {
        if (item.name != "Aged Brie" && item.name != "Backstage passes to a TAFKAL80ETC concert") {
            if (item.quality > 0) {
                if (item.name != "Sulfuras, Hand of Ragnaros") {
                    item.quality = item.quality - 1
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1

                if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
                    if (item.sellIn < 11) {
                        incrementQuality(item)
                    }

                    if (item.sellIn < 6) {
                        incrementQuality(item)
                    }
                }
            }
        }
    }

}

