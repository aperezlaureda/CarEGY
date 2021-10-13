package com.test.CarEGY.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.test.CarEGY.R
import com.test.CarEGY.entities.Car


// clase que hereda las propiedades de recycler view y adapta la informacion a la vista

class carAdapter ( var carList : MutableList <Car>,
                   var onClick : (Int) -> Unit
) : RecyclerView.Adapter<carAdapter.CarHolder>() {

    // clase que es un view holder e intercatua con el item de la vista
    class CarHolder(v: View) : RecyclerView.ViewHolder(v)
    {
        private var view: View  
        init {
            this.view = v
        }

        fun setmodel (model : String)
        {
            var txtmodel : TextView = view.findViewById(R.id.txt_model)  //wiew
            txtmodel.text = model
        }

        fun getCardView () : CardView {
            return view.findViewById(R.id.cardCar)
        }
    }


    //crea el objeto holder y le pasa la vista de item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_car,parent,false)
        return (CarHolder(view))
    }

    // escucha a todas
    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.setmodel(carList[position].model)
        holder.getCardView().setOnClickListener(){
            onClick(position)

        }
    }

    // retorna la cant de elementos de la lista
    override fun getItemCount(): Int {
        return carList.size
    }



}

