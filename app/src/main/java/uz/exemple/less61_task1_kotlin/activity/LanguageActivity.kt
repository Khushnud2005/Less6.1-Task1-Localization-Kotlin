package uz.exemple.less61_task1_kotlin.activity

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import uz.exemple.less61_task1_kotlin.R
import java.util.*

class LanguageActivity : AppCompatActivity() {

        lateinit var context: Context

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_language)
            initViews()
        }

        fun initViews() {
            context = this
            val b_english = findViewById<Button>(R.id.b_english)
            b_english.setOnClickListener {
                setLocale("en")
                finish()
            }
            val b_russian = findViewById<Button>(R.id.b_russian)
            b_russian.setOnClickListener {
                setLocale("ru")
                finish()
            }
            val b_uzbek = findViewById<Button>(R.id.b_uzbek)
            b_uzbek.setOnClickListener {
                setLocale("uz")
                finish()
            }

            val b_china = findViewById<Button>(R.id.b_china)
            b_china.setOnClickListener { setLocale("zh") }
            val b_korea = findViewById<Button>(R.id.b_korea)
            b_korea.setOnClickListener { setLocale("ko") }
            val b_japan = findViewById<Button>(R.id.b_japan)
            b_japan.setOnClickListener { setLocale("ja") }


            val one = resources.getQuantityString(R.plurals.my_cats, 1, 1)

            val few = resources.getQuantityString(R.plurals.my_cats, 2, 3)

            val many = resources.getQuantityString(R.plurals.my_cats, 5, 10)

            //Log.d("@@@one ", one)
            //Log.d("@@@few ", few)
            //Log.d("@@@many ", many)
            Timber.d(one)
            Timber.d(few)
            Timber.d(many)
        }

        fun setLocale(language: String?) {
            val locale = Locale(language)
            Locale.setDefault(locale)
            val config = Configuration()
            config.locale = locale
            baseContext.resources.updateConfiguration(config,
                baseContext.resources.displayMetrics)
            Timber.d(language)
            finish()
        }
}