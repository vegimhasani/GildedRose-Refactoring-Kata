package com.gildedrose.factory

import com.gildedrose.strategy.ItemStrategy

interface ItemStrategyFactory {
    fun createItemStrategyFromName(name: String): ItemStrategy
}