package com.jslee.koin_testing

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
* @내용 :  DI 모듈 등록: Koin에 해당 모듈을 등록
 * *       onCreate LifeCycle에서 startKoin을 호출하고 위에서 선언한 모듈 변수를 넘겨줍니다.
* @수정 :
* @버젼 : 0.0.0
* @최초작성일 : 2021-04-27 오후 4:13
* @작성자 : 이재선
**/
class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@BaseApp)
            modules(moduleList)
        }
    }
}