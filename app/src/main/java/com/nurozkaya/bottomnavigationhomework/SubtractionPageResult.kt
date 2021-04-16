package com.nurozkaya.bottomnavigationhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_subtraction_page_result.view.*


class SubtractionPageResult : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design = inflater.inflate(R.layout.fragment_subtraction_page_result, container, false)

        val bundle:SubtractionPageResultArgs by navArgs()
        val result= bundle.subtractResult
        design.resultTextSubtraction.text = "Subtraction is : " + result

        return design
    }


}