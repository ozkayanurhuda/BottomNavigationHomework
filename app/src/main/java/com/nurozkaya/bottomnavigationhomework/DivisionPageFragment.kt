package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_division_page.view.*


class DivisionPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design =  inflater.inflate(R.layout.fragment_division_page, container, false)

        design.buttonDivision.setOnClickListener {
            val result:Int= design.enternumber7.text.toString().toInt()/ design.enternumber8.text.toString().toInt()
            val nav = DivisionPageFragmentDirections.divideGecis(result)
            Navigation.findNavController(it).navigate(nav)
        }

        return design
    }
}