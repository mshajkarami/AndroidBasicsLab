package ir.hajkarami.generatingluckynumbers

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ir.hajkarami.generatingluckynumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var userName = "saleh"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding.button.setOnClickListener {
            if (!binding.editTextText.text.isEmpty())
                userName = binding.editTextText.text.toString()
            else {
                userName = "salehHajkarami is Developer!"
                Toast.makeText(this, "you do not enter your name !!", Toast.LENGTH_SHORT).show()
            }
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("userName", userName)
            startActivity(intent)
        }
    }
}