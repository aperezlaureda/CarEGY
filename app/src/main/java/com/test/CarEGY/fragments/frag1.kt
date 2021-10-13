package com.test.CarEGY.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.test.CarEGY.R
import com.test.CarEGY.viewmodls.Frag1ViewModel

class frag1 : Fragment() {

    companion object {
        fun newInstance() = frag1()
    }

    private lateinit var viewModel: Frag1ViewModel
    //variables nuevas
    lateinit var v: View
    lateinit var btn_ingresar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

// -----------------codigo de v
        v = inflater.inflate(R.layout.frag1_fragment, container, false)
        btn_ingresar = v.findViewById(R.id.btningresar)
        return v
    }

    override fun onStart() {
        super.onStart()

        btn_ingresar.setOnClickListener {
            val action2 = frag1Directions.actionFrag1ToCarListFrag()
            v.findNavController().navigate(action2)
        }


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Frag1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}