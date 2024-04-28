package com.example.sinfoniadeviento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.sinfoniadeviento.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Manejando el clic en la primera CardView (Clarinete)
        binding.instrumentCardView1.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityClarinete::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView2.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityFlautaDulce::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView3.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityFlautaTransversal::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView4.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityFogot::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView5.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityOboe::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView6.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivitySaxofonAlto::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView7.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityTrombon::class.java)
            startActivity(intent)
        }

        binding.instrumentCardView8.setOnClickListener {
            val intent = Intent(this, DetalleInstrumentoActivityTrompeta::class.java)
            startActivity(intent)
        }

    }
}