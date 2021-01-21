package com.gv.desafio.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.R

import com.gv.desafio.data.Repository

class RepositoryAdapter(private val repository: MutableList<Repository>) : RecyclerView.Adapter<RepositoryAdapter.GitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repository_list_item, parent, false)
        return GitViewHolder(view)
    }

    override fun getItemCount(): Int = repository.size


    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageIcon_RepositoryAdapter: ImageView = itemView.findViewById(R.id.imageIcon)
        var userName_RepositoryAdapter: TextView = itemView.findViewById(R.id.userName)
        var surName_RepositoryAdapter: TextView = itemView.findViewById(R.id.surName)
        var repositoryName_RepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryName)
        var repositoryText_RepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryText)
        var numberGit_RepositoryAdapter: TextView = itemView.findViewById(R.id.numberGit)
        var numberStar_RepositoryAdapter: TextView = itemView.findViewById(R.id.numberStar)
        var gitIcon_RepositoryAdapter: ImageView = itemView.findViewById(R.id.gitIcon)
        var starIcon_RepositoryAdapter: ImageView = itemView.findViewById(R.id.starIcon)
        fun bind(git: Repository) {
            with(git) {
                imageIcon_RepositoryAdapter.setImageResource(R.drawable.usuario)
                userName_RepositoryAdapter.text = userName_Repository
                surName_RepositoryAdapter.text = surName_Repository
                repositoryName_RepositoryAdapter.text = repositoryName_Repository
                repositoryText_RepositoryAdapter.text = repositoryText_Repository
                numberGit_RepositoryAdapter.text = numberGit_Repository
                numberStar_RepositoryAdapter.text = numberStar_Repository
                gitIcon_RepositoryAdapter.setImageResource(R.drawable.ic_share)
                starIcon_RepositoryAdapter.setImageResource(R.drawable.ic_star)


            }

        }


    }

    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind(repository[position])

    }
}