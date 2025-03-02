package ir.hajkarami.fragmentsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Toast.makeText(activity, "onCreateView() is Called", Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(activity, "onViewCreated() is Called", Toast.LENGTH_SHORT).show()

        val btn: Button = view.findViewById(R.id.second_btn)
        val txt: TextView = view.findViewById(R.id.text_frag2)

        btn.setOnClickListener {
            Toast.makeText(activity, "Good Bye From Second Fragment", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(activity, "onStart() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(activity, "onResume() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(activity, "onPause() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(activity, "onStop() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(activity, "onDestroyView() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(activity, "onDestroy() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(activity, "onDetach() is Called", Toast.LENGTH_SHORT).show()
    }
}
