package org.assesment3.fragment.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.assesment3.databinding.ListProdukBinding
import org.assesment3.model.Product

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val data = mutableListOf<Product>()
    fun updateData(newData: List<Product>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    class ViewHolder(
        private val binding: ListProdukBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) = with(binding) {
            brandTxtV.text = product.brand
            productNameTxtV.text = product.productName
            imageView.setImageResource(product.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListProdukBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

}