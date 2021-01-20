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
        var imagemIcon_GitAdapter: ImageView = itemView.findViewById(R.id.imagemIcon_xml)
        var userName_GitAdapter: TextView = itemView.findViewById(R.id.userName_xml)
        var sobreName_GitAdapter: TextView = itemView.findViewById(R.id.sobreName_xml)
        var repositorioName_GitAdapter: TextView = itemView.findViewById(R.id.repositorioName_xml)
        var reposiorioText_GitAdapter: TextView = itemView.findViewById(R.id.repositorioText_xml)
        var numeroGit_GitAdapter: TextView = itemView.findViewById(R.id.numeroGit_xml)
        var numeroStar_GitAdapter: TextView = itemView.findViewById(R.id.numeroStar_xml)
        var gitIcon_GitAdapter: ImageView = itemView.findViewById(R.id.gitIcon_xml)
        var starIcon_GitAdapter: ImageView = itemView.findViewById(R.id.starIcon_xml)
        fun bind() {
            imagemIcon_GitAdapter.setImageResource(R.drawable.usuario)
            userName_GitAdapter.text
        }





}
    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind()

    }
}