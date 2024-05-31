package com.example.dataclass_sai

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter(private val list: ArrayList<Makanan>): RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        return MakananViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MakananAdapter.MakananViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MakananViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        private val nama = ItemView.findViewById<TextView>(R.id.textDaftar)
        private val harga = ItemView.findViewById<TextView>(R.id.textHarga)
        fun bind(get: Makanan) {
            nama.text = get.nama
            harga.text = get.harga
        }
    }
}
