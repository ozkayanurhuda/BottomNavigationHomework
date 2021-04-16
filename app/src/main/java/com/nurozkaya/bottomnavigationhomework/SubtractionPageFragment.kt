package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_subtraction_page.view.*

class SubtractionPageFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val design = inflater.inflate(R.layout.fragment_subtraction_page, container, false)
        design.buttonSubtraction.setOnClickListener {
            val result:Int = design.enternumber5.text.toString().toInt()-design.enternumber6.text.toString().toInt()
            val nav = SubtractionPageFragmentDirections.subtractGecis(result)
            Navigation.findNavController(it).navigate(nav)
        }

        return design
    }


}