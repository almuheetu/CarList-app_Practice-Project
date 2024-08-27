package com.example.carlistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carlistapp.databinding.CarListXmlBinding

class CarAdapter(
    private val cars: ArrayList<Car>
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
            .into(viewHolder.binding.carProfileImage)

        viewHolder.binding.carName.text = car.name
        viewHolder.binding.carModel.text.text = "Model:"
        viewHolder.binding.carModel.value.text = car.model
        viewHolder.binding.carPrice.text.text = "Price:"
        viewHolder.binding.carPrice.value.text = car.price.toString()
        viewHolder.binding.carYear.text.text = "Year:"
        viewHolder.binding.carYear.value.text = car.year.toString()




    }

    override fun getItemCount(): Int {
        return cars.size

    }

}