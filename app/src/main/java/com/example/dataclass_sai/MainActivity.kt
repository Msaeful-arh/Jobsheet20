package com.example.dataclass_sai

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = arrayListOf<Makanan>()
    val listMakanan = arrayOf(
        "M.Bogi Abiputro",
        "M.Ulil Sultan",
        "M.Afiq Ardianta",
        "M.Imam Sariski",
        "M.Nur Alamsyah",
        "M.Saeulloh Arahaman",
        "Najwa Atria Lefa",
        "Novita sari",
        "Rahma Rokhimatus Zahra",
        "Rendra Arkananta",
        "Saddam Hanif Qodriy"
    )

    val listnis = arrayOf(
        "2233260",
        "2233261",
        "2233262",
        "2233263",
        "2233264",
        "2233266",
        "2233267",
        "2233268",
        "2233269",
        "2233270",
        "2233271"
    )
    lateinit var makananView: RecyclerView
    lateinit var makananAdapter: MakananAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       makananView =findViewById(R.id.makananView)
        makananView.layoutManager = LinearLayoutManager(this)

        for (i in listMakanan.indices)  {
            list.add(Makanan(listMakanan[i], listnis[i]))
        }

        makananAdapter = MakananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}