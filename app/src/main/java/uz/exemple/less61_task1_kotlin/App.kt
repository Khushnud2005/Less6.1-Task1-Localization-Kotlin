package uz.exemple.less61_task1_kotlin

import android.app.Application
import timber.log.Timber

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(object: Timber.DebugTree(){
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                super.log(priority, "advanced_$tag", message, t)
            }

            override fun createStackElementTag(element: StackTraceElement): String? {
                return String.format(
                    "%s:%s=>%s",
                    element.methodName,
                    element.lineNumber,
                    element.fileName
                )
            }
        })


    }
}