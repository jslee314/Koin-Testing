package com.jslee.koin_testing

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.BeforeAll
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject

/**
 * JUnit 테스트 클래스에서 KoinTest를 상속받아 Koin 모듈을 주입 받을 수 있습니다.
 * KoinTestRule을 통해 Koin context를 시작/중단할 수 있습니다.
 *
 *
 */
class UnitTest1 : KoinTest{

//    private val heavyResource : MyHeavyResource;
//    private val testSetup : TestSetup;
//    private val systemUnderTest : SystemUnderTest;


    val controller : Controller by inject()

    @get:Rule
    val koinTestRule = KoinTestRule.create{
        modules(appModule)
    }


    @BeforeAll
    fun setUp(){
        System.out.println("======= Before All ======")

    }


    @Test
    fun koinTest(){
//        assertEquals ("",)

    }

}