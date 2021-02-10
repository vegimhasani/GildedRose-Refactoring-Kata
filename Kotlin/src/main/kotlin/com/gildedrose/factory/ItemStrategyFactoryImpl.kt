package com.gildedrose.factory

import com.gildedrose.strategy.*

class ItemStrategyFactoryImpl : ItemStrategyFactory {
    override fun createItemStrategyFromName(name: String): ItemStrategy {
        return when (name) {
            AGED_BRIE -> {
                AgedBrieStrategy()
            }
            BACKSTAGE -> {
                BackstageStrategy()
            }
            SULFURAS -> {
                SulfurasStrategy()
            }
            CONJURED -> {
                ConjuredStrategy()
            }
            else -> {
                DefaultStrategy()
            }
        }
    }

    companion object {
        const val AGED_BRIE = "Aged Brie"
        const val CONJURED = "Conjured Mana Cake"
        const val BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"
        const val SULFURAS = "Sulfuras, Hand of Ragnaros"
    }
}