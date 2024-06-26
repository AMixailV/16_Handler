package ru.mixail_akulov.a16_handler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mixail_akulov.a16_handler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.handlerLevel1Button.setOnClickListener {
            startActivity(Intent(this, HandlerLevel1Activity::class.java))
        }

        binding.handlerLevel2Button.setOnClickListener {
            startActivity(Intent(this, HandlerLevel2Activity::class.java))
        }

    }

}