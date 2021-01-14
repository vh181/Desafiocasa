package com.gv.desafio.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.R
import com.gv.desafio.data.Git
import kotlinx.android.synthetic.main.item_git.view.*

class GitAdapter( val git : MutableList<Git>): RecyclerView.Adapter<GitAdapter.GitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
    val view =    LayoutInflater.from(parent.context).inflate(R.layout.item_git,parent,false)
return GitViewHolder(view)
    }

    override fun getItemCount(): Int = git.size


    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
holder.bind(git[position])
    }
    inner class  GitViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        fun bind(git: Git) {
            with(git){
                itemView.user_name.text= user_name.first().toString()
            }


        }

    }

}