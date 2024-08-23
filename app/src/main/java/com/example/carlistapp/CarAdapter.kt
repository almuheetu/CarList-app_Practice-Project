package com.example.carlistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carlistapp.databinding.CarListXmlBinding

class CarAdapter(val cars: ArrayList<Car>
) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(
        val binding: CarListXmlBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CarListXmlBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val car = cars[position]

        Glide.with(viewHolder.itemView.context)
            .load(car.imageUrl)
            .circleCrop()
            .into(viewHolder.binding.ivCarImg)

        viewHolder.binding.tvCarName.text = car.name
        viewHolder.binding.ivCarNum.text = car.model

    }

    override fun getItemCount(): Int {
        return carList.size
    }

}