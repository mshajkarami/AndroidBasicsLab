package ir.hajkarami.adapterapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import ir.hajkarami.adapterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 1- adding AdapterView : ListView (We use dataBinding )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 2- Data Source : Array of Strings
        val countries = arrayOf("USA", "UK", "Iran", "Germany", "Egypt")


        // 3- Create Adapter as bridge between the 'data source' and the 'UI'
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            countries
        )
        // 4- Set the adapter to the ListView
        binding.listview.adapter = adapter
    }
}