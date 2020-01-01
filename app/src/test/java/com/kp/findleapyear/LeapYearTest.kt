package com.kp.findleapyear

import org.junit.Assert
import org.junit.Test

class LeapYearTest {


    @Test
    fun `Should find the given year is not leap year as its not divisible by 4, Year = 2019`(){
        Assert.assertFalse(LeapYear(2019).isLeapYear())
    }

    @Test
    fun `Should find the given year is leap year as its divisible by 4, but not by 100, Year = 2008`(){
        Assert.assertTrue(LeapYear(2008).isLeapYear())
    }

    @Test
    fun `Should find the given year is leap year as its divisible by 4, but not by 100, Year = 2016`(){
        Assert.assertTrue(LeapYear(2016).isLeapYear())
    }

    @Test
    fun `Should find the given year is not leap year as its divisible by 4 and 100, Year = 1900`(){
        Assert.assertFalse(LeapYear(1900).isLeapYear())
    }

    @Test
    fun `Should find the given year is leap year as its divisible by 400, Year = 2000`(){
        Assert.assertTrue(LeapYear(2000).isLeapYear())
    }
}