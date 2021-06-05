package com.example.newsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        var adapter: NewsListAdapter = NewsListAdapter(items,this)
        recyclerView.adapter = adapter
    }

    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("Item is $i")
        }
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"Item clicked is $item",Toast.LENGTH_LONG).show()
    }


}