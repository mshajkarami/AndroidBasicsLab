package ir.hajkarami.convertkilostopounds

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import ir.hajkarami.convertkilostopounds.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val inputText = binding.editTextNumber.text.toString()

            if (inputText.isNotEmpty()) {
                val kilograms = inputText.toDoubleOrNull()

                if (kilograms != null) {
                    val pounds = convertKilogramsToPounds(kilograms)
                    binding.resultTv.text = String.format("%.2f lbs", pounds)
                } else {
                    binding.resultTv.text = "Invalid input!"
                }
            } else {
                binding.resultTv.text = "Please enter a number!"
            }
        }
    }

    private fun convertKilogramsToPounds(kilograms: Double): Double {
        return kilograms * 2.20462
    }
}
