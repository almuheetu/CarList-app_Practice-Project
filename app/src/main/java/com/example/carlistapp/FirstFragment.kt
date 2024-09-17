package com.example.carlistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carlistapp.databinding.FirstFragmentXmlBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FirstFragmentXmlBinding
    private lateinit var adapter: CarAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentXmlBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.CarRecyclerView
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        adapter = CarAdapter(carList)
        recyclerView.adapter = adapter

        carList.get(0).name
        carList.get(0).model
        carList.get(0).price
        carList[0].imageUrl
        carList.get(0).year


    }
}