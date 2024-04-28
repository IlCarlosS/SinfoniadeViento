package com.example.sinfoniadeviento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalleInstrumentoActivityTrombon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xml_detalle_instrumento)

        // Configurar elementos de la interfaz de usuario
        val instrumentImage = findViewById<ImageView>(R.id.instrument_image)
        val instrumentNombre = findViewById<TextView>(R.id.instrument_nombre)
        val instrumentDescription = findViewById<TextView>(R.id.instrument_description)
        val instrumentPrice = findViewById<TextView>(R.id.instrument_price)
        val addToCartButton = findViewById<Button>(R.id.add_to_cart_button)

        instrumentImage.setImageResource(R.drawable.trombon)
        instrumentNombre.text = "Trombon"
        instrumentDescription.text =
            "El trombón es un instrumento que se caracteriza por su capacidad para producir glissandos y efectos expresivos."
        instrumentPrice.text = "Precio: $7500.00"

        // Configurar acción del botón "Agregar al carrito"
        addToCartButton.setOnClickListener {
            Toast.makeText(this, "El instrumento se ha añadido al carrito", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this, CarritoDeComprasActivity::class.java)
            intent.putExtra("nombreInstrumento", "Trombom")
            intent.putExtra("precioInstrumento", 7500)
            startActivity(intent)
        }
    }
}