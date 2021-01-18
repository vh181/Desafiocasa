package com.gv.desafio.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.R
import com.gv.desafio.data.Git
import kotlinx.android.synthetic.main.item_git.view.*

class GitAdapter( private val  git: MutableList<Git>) : RecyclerView.Adapter<GitAdapter.GitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_git, parent, false)
        return GitViewHolder(view)
    }

    override fun getItemCount(): Int = git.size




    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagIcon: ImageView = itemView.findViewById(R.id.img_icon)
        var userName: TextView = itemView.findViewById(R.id.user_name)
        var sobreName: TextView = itemView.findViewById(R.id.sobre_name)
        var reposiName: TextView = itemView.findViewById(R.id.reposi_name)
        var reposiText: TextView = itemView.findViewById(R.id.repsoi_text)
        var nGit: TextView = itemView.findViewById(R.id.n_git)
        var nStar: TextView = itemView.findViewById(R.id.n_star)
        var gitIcon: ImageView = itemView.findViewById(R.id.img_icon)
        var starIcon: ImageView = itemView.findViewById(R.id.img_icon)



}
    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.imagIcon.setImageResource(R.drawable.usuario)
    }
}