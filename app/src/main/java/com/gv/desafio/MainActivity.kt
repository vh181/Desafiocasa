package com.gv.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gv.desafio.data.fakeGit
import com.gv.desafio.model.GitAdapter
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        recycler_view_main.adapter = GitAdapter(fakeGit())
        recycler_view_main.layoutManager = LinearLayoutManager(this)
    }
}