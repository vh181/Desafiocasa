package com.gv.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.data.Repository


import com.gv.desafio.model.RepositoryModel
import com.gv.desafio.model.RepositoryViewModelFactory


class RepositoryListActivity : AppCompatActivity() {
private lateinit var viewModel: RepositoryModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.repository_list_activity)

        var recyclerViewRepositoryActivity: RecyclerView = findViewById(R.id.recycler_view_main)

val repository = Repository()
        val viewModelFactory = RepositoryViewModelFactory(repository)
viewModel = ViewModelProvider(this,viewModelFactory).get(RepositoryModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->

        })
    //    recyclerViewRepositoryActivity.adapter = RepositoryModel(fakeRepository())
        recyclerViewRepositoryActivity.layoutManager = LinearLayoutManager(this)

    }
}