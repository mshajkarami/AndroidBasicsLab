package ir.hajkarami.generatingluckynumbers

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import ir.hajkarami.generatingluckynumbers.databinding.ActivityMain2Binding
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var userName: String = "Guest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        userName = intent.getStringExtra("userName") ?: "Guest"

        // نمایش عدد تصادفی
        binding.resultNumber.text = generateRandomInteger().toString()
    }

    private fun generateRandomInteger(): Int {
        return Random.nextInt(1, 101)
    }
}
