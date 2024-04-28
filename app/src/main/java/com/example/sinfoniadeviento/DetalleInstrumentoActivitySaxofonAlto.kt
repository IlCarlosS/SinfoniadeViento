package com.example.sinfoniadeviento


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalleInstrumentoActivitySaxofonAlto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xml_detalle_instrumento)

        // Configurar elementos de la interfaz de usuario
        val instrumentImage = findViewById<ImageView>(R.id.instrument_image)
        val instrumentNombre = findViewById<TextView>(R.id.instrument_nombre)
        val instrumentDescription = findViewById<TextView>(R.id.instrument_description)
        val instrumentPrice = findViewById<TextView>(R.id.instrument_price)
        val addToCartButton = findViewById<Button>(R.id.add_to_cart_button)

        instrumentImage.setImageResource(R.drawable.saxofon_alto)
        instrumentNombre.text = "Saxofón Alto"
        instrumentDescription.text =
            "El saxofón alto es un instrumento con un timbre cálido y versátil. Se utiliza en una amplia variedad de géneros musicales, desde jazz y blues hasta música clásica y pop."
        instrumentPrice.text = "Precio: $10000.00"

        // Configurar acción del botón "Agregar al carrito"
        addToCartButton.setOnClickListener {
            Toast.makeText(this, "El instrumento se ha añadido al carrito", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this, CarritoDeComprasActivity::class.java)
            intent.putExtra("nombreInstrumento", "Saxofón Alto")
            intent.putExtra("precioInstrumento", 10000)
            startActivity(intent)
        }
    }
}