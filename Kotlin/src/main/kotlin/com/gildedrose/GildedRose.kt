package com.gildedrose

import com.gildedrose.factory.ItemStrategyFactoryImpl
import com.gildedrose.strategy.ItemStrategy

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        items.indices.forEach {
            val item = items[it]
            val strategy = handleStrategy(item)
            strategy.init(item)
        }
    }

    private fun handleStrategy(item: Item) : ItemStrategy =
        ItemStrategyFactoryImpl().createItemStrategyFromName(item.name)
}
