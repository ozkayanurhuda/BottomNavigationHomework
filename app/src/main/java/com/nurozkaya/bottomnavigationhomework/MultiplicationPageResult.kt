package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_multiplication_page_result.view.*


class MultiplicationPageResult : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design =inflater.inflate(R.layout.fragment_multiplication_page_result, container, false)

        //gelen veriyi yakala
        val bundle:MultiplicationPageResultArgs by navArgs ()
        val result = bundle.multiplyResult

        design.resultTextMultiply.text = "Multiplication is : " + result

        return design
    }


}