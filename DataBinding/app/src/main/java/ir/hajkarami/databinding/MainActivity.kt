package ir.hajkarami.databinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import ir.hajkarami.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val p1 = Person("Saleh","mshajkrami@gmail.com")


        activityMainBinding.person = ObservablePerson(p1)
        val clickHandler = MyClickHandler(this)
        activityMainBinding.clickHandler = clickHandler


    }
}