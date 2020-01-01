package com.kp.findleapyear

class LeapYear(private val year: Int) {

    fun isLeapYear(): Boolean {
        return isDivisibleBy4ButNotBy100() || isDivisibleBy400()
    }

    private fun isDivisibleBy400() = year % 400 == 0

    private fun isDivisibleBy4ButNotBy100() = year % 4 == 0 && year % 100 != 0
}