package com.jslee.koin_testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject


/**
* @내용 : MainActivity에서 각 클래스에 따른 인스턴스 객체를 일일이 생성해주었습니다.
 * 하지만 Koin 코인을 활용하면서 DI 의존성 주입 디자인 패턴이 구성되었으며
 * 프로그래머가 직접 의존 관계를 설정해주지 않더라도 자동으로 의존성 관계 문제가 해결됨
**/
class MainActivity : AppCompatActivity() {

    // by inject()로 Koin에 등록된 객체를 lazy 하게 주입 받을 수 있습니다
    val controller : Controller by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controller.printSampleData()

    }
}