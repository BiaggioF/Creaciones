package com.example.juegomemoria

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.juegomemoria.databinding.ActivityJuegoBinding

class JuegoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJuegoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJuegoBinding.inflate(this.layoutInflater)
        setContentView(binding.root)

        binding.carta1.setOnClickListener {
            binding.carta1.setImageResource(R.drawable.perro)
        }

        // Aquí puedes agregar más lógica si lo necesitas
    }
}
