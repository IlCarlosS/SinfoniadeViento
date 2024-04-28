package com.example.sinfoniadeviento

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DetalleInstrumentoActivityFlautaDulce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xml_detalle_instrumento)

        // Configurar elementos de la interfaz de usuario
        val instrumentImage = findViewById<ImageView>(R.id.instrument_image)
        val instrumentNombre = findViewById<TextView>(R.id.instrument_nombre)
        val instrumentDescription = findViewById<TextView>(R.id.instrument_description)
        val instrumentPrice = findViewById<TextView>(R.id.instrument_price)
        val addToCartButton = findViewById<Button>(R.id.add_to_cart_button)

        instrumentImage.setImageResource(R.drawable.flauta_dulce)
        instrumentNombre.text = "Flauta Dulce"
        instrumentDescription.text = "La flauta dulce es un instrumento de viento-madera con un sonido suave y delicado. Es popular en la enseñanza musical."
        instrumentPrice.text = "Precio: $500.00"

        // Configurar acción del botón "Agregar al carrito"
        addToCartButton.setOnClickListener {
            Toast.makeText(this, "El instrumento se ha añadido al carrito", Toast.LENGTH_SHORT).show()
            // Crear un Intent para iniciar la actividad del carrito de compras
            val intent = Intent(this, CarritoDeComprasActivity::class.java)
            intent.putExtra("nombreInstrumento", "Flauta Dulce")
            intent.putExtra("precioInstrumento", 500)
            startActivity(intent)
        }
    }
}