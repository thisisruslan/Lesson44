package com.example.lesson44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter = Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerID.adapter = adapter
        setData()
    }

    private fun setData() {
        val verticalItems: MutableList<List<App>> = mutableListOf()
        for (i in 1..15) {
            val horizontalItems: MutableList<App> = mutableListOf()
            for (j in 1..10) {
                horizontalItems.add(App(R.drawable.pubg, "PUBG MOBILE \n556 MB"))
                horizontalItems.add(App(R.drawable.texnopos, "Online Course App\n17 MB"))
                horizontalItems.add(App(R.drawable.angrybirds, "Angry Birds \n213 MB"))
                horizontalItems.add(App(R.drawable.clash, "Clash of Clans \n151 MB"))
                horizontalItems.add(App(R.drawable.zombie, "Plants and Zombies \n98 MB"))
            }
            verticalItems.add(horizontalItems)
        }
        adapter.verticalItems = verticalItems
    }


}