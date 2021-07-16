package com.example.mybank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter1 : RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder>() {



    private  val paymentType= arrayOf("Envato Payment", "Bank Charge","Payment from Paypal","MasterCard Charge","Shopping at Wallmart")
    private val amount = arrayOf("+$50 USD","-$20 USD","+$1000 USD","-$20 USD","-$90 USD")
    private val imgv = intArrayOf(
        R.drawable.wallet,
        R.drawable.purse,
        R.drawable.paypal,
        R.drawable.mastercard,
        R.drawable.purse
    )
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgv: ImageView
        var paymentType: TextView
        var amount: TextView
        init {

            imgv = itemView.findViewById(R.id.imgv)
            paymentType = itemView.findViewById(R.id.paymentType)
            amount =itemView.findViewById(R.id.amount)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model1,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.paymentType.text = paymentType[position]
        holder.amount.text = amount[position]
        holder.imgv.setImageResource(imgv [position])



        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context,"Click on the item", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return imgv.size



    }
}