package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_addition_page_result.*
import kotlinx.android.synthetic.main.fragment_addition_page_result.view.*


class AdditionPageResult : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val design = inflater.inflate(R.layout.fragment_addition_page_result, container, false)

        //sayfaya gelen veriyi yakalamak
        val bundle:AdditionPageResultArgs by navArgs()
        val result = bundle.addResult

        design.resultTextAdd.text = "Sum is : " +result

        return design
    }


}