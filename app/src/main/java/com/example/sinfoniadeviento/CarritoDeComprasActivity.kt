package com.example.sinfoniadeviento

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CarritoDeComprasActivity : AppCompatActivity() {
    private var totalAmount = 0 // Variable para almacenar el total
    private var quantity = 1 // Cantidad predeterminada

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_de_compras)

        // Obtener extras del Intent
        val nombreInstrumento = intent.getStringExtra("nombreInstrumento")
        val precioInstrumento = intent.getIntExtra("precioInstrumento", 0)

        // Mostrar los datos en el TextView correspondiente
        val carritoDetalleTextView = findViewById<TextView>(R.id.carrito_detalle_text_view)
        carritoDetalleTextView.text = "Nombre: $nombreInstrumento\nPrecio: $$precioInstrumento"

        val cantidadEditText = findViewById<EditText>(R.id.cantidad_edit_text)
        cantidadEditText.setText(quantity.toString())

        // Configurar el botón de pago
        val pagarButton = findViewById<Button>(R.id.pagar_button)
        pagarButton.setOnClickListener {
            // Obtener la cantidad ingresada
            val cantidadString = cantidadEditText.text.toString()
            val cantidad = if (cantidadString.isNotEmpty()) cantidadString.toInt() else 1

            // Calcular el total
            val total = precioInstrumento * cantidad
            totalAmount += total

            // Actualizar el TextView del total
            val totalTextView = findViewById<TextView>(R.id.total_text_view)
            totalTextView.text = "Total: $$totalAmount"

            val pagarButton = findViewById<Button>(R.id.pagar_button)
            pagarButton.setOnClickListener {
                // Mostrar un mensaje de confirmación
                Toast.makeText(this, "Gracias por tu compra", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


