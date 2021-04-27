package com.jslee.koin_testing

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
* @내용 : module 키워드를 이용해 모듈로 선언하고 변수에 저장합니다.
 *          single : 앱이 실행되는 동안 계속 유지되는 싱글톤 객체를 생성합니다.
 *          factory : 요청할 때마다 매번 새로운 객체를 생성합니다.
 *          get() : 컴포넌트 내에서 알맞은 의존성을 주입 받습니다.
* @작성자 : 이재선
**/

/**
* @내용 : Repository 타입으로 선언되어 있으므로
 *        이미 생성된 객체 중 Repository 타입에 알맞은 객체를 Koin이 주입해줍니다
* @작성자 : 이재선
**/
val appModule = module {
    single { Repository() }
    factory { Controller(get()) }
}

/**
* @내용 : ViewModel의 경우 viewModel 키워드로 선언해야 합니다
* @작성자 : 이재선
**/
val viewModelModule = module {
    viewModel { MainViewModel() }
}