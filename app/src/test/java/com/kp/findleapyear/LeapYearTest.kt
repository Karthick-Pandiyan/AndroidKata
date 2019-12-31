package com.kp.findleapyear

import org.junit.Assert
import org.junit.Test

class LeapYearTest {


    @Test
    fun `Should find the given year is not leap year, YEAR = 2019`(){
        Assert.assertFalse(isLeapYear(2019))
    }

    private fun isLeapYear(year: Int): Boolean {
        return year == 2008
    }
}