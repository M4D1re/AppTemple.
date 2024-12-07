package com.example.apptemple

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.apptemple.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goBack()
        goExit()
    }
    private fun goBack(){
        binding.backButton.setOnClickListener{
            finish()
        }
    }

    //При нажатии кнопки "Выйти из аккаунта" перезапускаем до активити входа
    private fun goExit() {
        binding.exitButtonSET.setOnClickListener {
            startActivity(Intent(this, EnterActivity::class.java))
        }
    }
}