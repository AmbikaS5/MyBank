package com.example.mybank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {



    private  val bank_data = arrayOf("Choose Beneficiery", "Account Number","Bank","Branch","Amount","Message","Fee Transaction")
    private val bank_details = arrayOf("John Anderson","5889 8974","Cy Capital Bank","New York City","$1000","Rental Car Fee","$10")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var bank_data: TextView
        var bank_details: TextView
        init {

            bank_data = itemView.findViewById(R.id.bank_data)
            bank_details = itemView.findViewById(R.id.bank_details)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bank_data.text = bank_data[position]
        holder.bank_details.text = bank_details[position]


        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context,"Click on the item", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return bank_data.size



    }
}