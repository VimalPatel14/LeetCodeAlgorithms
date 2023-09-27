package com.vimal.leetcodealgorithms.neetcode.slidingwindow

class maxProfit {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) {
            return 0
        }
        var maxProfit = 0
        var minPrice = prices[0]

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                maxProfit = maxOf(maxProfit, price - minPrice)
            }
        }

        return maxProfit
    }
}