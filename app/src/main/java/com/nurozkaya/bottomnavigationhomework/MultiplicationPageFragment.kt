package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiplication_page.view.*


class MultiplicationPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design = inflater.inflate(R.layout.fragment_multiplication_page, container, false)


        design.buttonMultiplication.setOnClickListener {
            val result:Int = design.enternumber3.text.toString().toInt() *
                    design.enternumber4.text.toString().toInt()

            //veri gönder
            val nav = MultiplicationPageFragmentDirections.multiplyGecis(result )
            Navigation.findNavController(it).navigate(nav)
        }

        return design
    }



}