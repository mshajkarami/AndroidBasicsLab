package ir.hajkarami.fragmentsapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(activity, "onCreate() is Called", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Toast.makeText(activity, "onCreateView() is Called", Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(activity, "onViewCreated() is Called", Toast.LENGTH_SHORT).show()

        val firstBtn: Button = view.findViewById(R.id.btn_frag1)
        val text: TextView = view.findViewById(R.id.text_frag1)

        firstBtn.setOnClickListener {
            Toast.makeText(activity, "Welcome to the First Fragment", Toast.LENGTH_SHORT).show()
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
