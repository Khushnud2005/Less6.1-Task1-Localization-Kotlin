package uz.exemple.less61_task1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import uz.exemple.less61_task1_kotlin.activity.LanguageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val b_home = findViewById<Button>(R.id.b_home)
        b_home.text = getString(R.string.app_name)
        b_home.setOnClickListener {
            callLanguageActivity()
        }
    }



    fun callLanguageActivity() {
        val intent = Intent(this, LanguageActivity::class.java)
        startActivity(intent)
    }
}