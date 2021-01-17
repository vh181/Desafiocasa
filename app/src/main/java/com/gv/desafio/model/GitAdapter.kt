package com.gv.desafio.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.R
import com.gv.desafio.data.Git
import kotlinx.android.synthetic.main.item_git.view.*

class GitAdapter(val git: MutableList<Git>) : RecyclerView.Adapter<GitAdapter.GitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_git, parent, false)
        return GitViewHolder(view)
    }

    override fun getItemCount(): Int = git.size


    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind(git[position])
    }

    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(git: Git) {
            with(git) {
                itemView.img_icon.setImageResource(R.drawable.usuario)
                itemView.user_name.text = userName
                itemView.sobre_name.text = sobreName
                itemView.reposi_name.text = reposiName
                itemView.repsoi_text.text = reposiText
                itemView.n_git.text = nGit
                itemView.n_star.text = nStar
                itemView.git_icon.setImageResource(R.drawable.ic_share)
                itemView.star_icon.setImageResource(R.drawable.ic_star)
            }


        }

    }

}