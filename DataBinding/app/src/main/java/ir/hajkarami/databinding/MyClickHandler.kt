package ir.hajkarami.databinding

import android.content.Context
import android.view.View
import android.widget.Toast

class MyClickHandler(private val context: Context) {

    fun onButton1Clicked(view: View){
        Toast.makeText(context,"First Button is Clicked",Toast.LENGTH_SHORT).show()
    }
}