package com.example.sinfoniadeviento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalleInstrumentoActivityFlautaTransversal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xml_detalle_instrumento)

        // Configurar elementos de la interfaz de usuario
        val instrumentImage = findViewById<ImageView>(R.id.instrument_image)
        val instrumentNombre = findViewById<TextView>(R.id.instrument_nombre)
        val instrumentDescription = findViewById<TextView>(R.id.instrument_description)
        val instrumentPrice = findViewById<TextView>(R.id.instrument_price)
        val addToCartButton = findViewById<Button>(R.id.add_to_cart_button)

        instrumentImage.setImageResource(R.drawable.flauta_transversal)
        instrumentNombre.text = "Flauta Transversal"
        instrumentDescription.text = "La flauta travesera es un instrumento de viento-madera que se toca soplando aire a través de un agujero en el extremo del tubo. Es comúnmente utilizada en música clásica."
        instrumentPrice.text = "Precio: $3000.00"

        // Configurar acción del botón "Agregar al carrito"
        addToCartButton.setOnClickListener {
            Toast.makeText(this, "El instrumento se ha añadido al carrito", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CarritoDeComprasActivity::class.java)
            intent.putExtra("nombreInstrumento", "Flauta Transversal")
            intent.putExtra("precioInstrumento", 3000)
            startActivity(intent)
        }
    }
}
