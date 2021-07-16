package com.example.mybank.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mybank.R
import com.example.mybank.RecyclerViewAdapter
import com.example.mybank.RecyclerViewAdapter1
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_transfer.*
import kotlinx.android.synthetic.main.fragment_transfer.recyclerView


class HomeFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)


            layoutManager = LinearLayoutManager(context)
            recyclerView1.layoutManager = layoutManager

            adapter = RecyclerViewAdapter1()
            recyclerView1.adapter = adapter


    }

}