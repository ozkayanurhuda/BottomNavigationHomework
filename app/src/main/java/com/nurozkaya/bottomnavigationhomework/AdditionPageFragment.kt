package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_addition_page.*
import kotlinx.android.synthetic.main.fragment_addition_page.view.*
import kotlinx.android.synthetic.main.fragment_addition_page_result.*


class AdditionPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_addition_page,container, false)
        return design

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button : Button= view.findViewById(R.id.buttonAddition)

        button.setOnClickListener {
            val result= enternumber1.text.toString().toInt() +
                    enternumber2.text.toString().toInt()
            val nav = AdditionPageFragmentDirections.addGecis(result)
            Navigation.findNavController(it).navigate(nav)
        }
    }




}