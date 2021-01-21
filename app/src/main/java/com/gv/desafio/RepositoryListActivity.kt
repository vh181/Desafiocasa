package com.gv.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.data.fakeRepository

import com.gv.desafio.model.RepositoryAdapter


class RepositoryListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.repository_list_activity)

        var recyclerViewRepositoryActivity: RecyclerView = findViewById(R.id.recycler_view_main)


        recyclerViewRepositoryActivity.adapter = RepositoryAdapter(fakeRepository())
        recyclerViewRepositoryActivity.layoutManager = LinearLayoutManager(this)

    }
}