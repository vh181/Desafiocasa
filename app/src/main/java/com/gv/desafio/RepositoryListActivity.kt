package com.gv.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gv.desafio.data.fakeRepository

import com.gv.desafio.model.RepositoryAdapter
import kotlinx.android.synthetic.main.main_activity.*

class RepositoryListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.repository_list_activity)


        recycler_view_main.adapter = RepositoryAdapter(fakeRepository())
        recycler_view_main.layoutManager = LinearLayoutManager(this)
    }
}