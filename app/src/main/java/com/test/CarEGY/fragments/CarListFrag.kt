package com.test.CarEGY.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.CarEGY.R
import com.test.CarEGY.adapters.carAdapter
import com.test.CarEGY.viewmodls.CarListFragViewModel
import com.test.CarEGY.entities.CarRepository

class CarListFrag : Fragment() {

    companion object {
        fun newInstance() = CarListFrag()
    }

    private lateinit var viewModel: CarListFragViewModel

    private lateinit var v : View
    private lateinit var recCar : RecyclerView
    private var repository = CarRepository()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.car_list_fragment, container, false)
        recCar = v.findViewById(R.id.recCar)
        return v
    }


    override fun onStart() {
        super.onStart()

        //tendra tamaño fijo
        recCar.setHasFixedSize(true)

        //dispocicion obj uno abajo del otro
        recCar.layoutManager = LinearLayoutManager(context)

        recCar.adapter = carAdapter(repository.getCars()) { index ->
            onItemClick(index)
        }
    }


    private fun onItemClick (pos : Int){

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CarListFragViewModel::class.java)
        // TODO: Use the ViewModel
    }

}


