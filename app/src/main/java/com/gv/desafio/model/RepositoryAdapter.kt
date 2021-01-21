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

class RepositoryAdapter(private val git: MutableList<Git>) : RecyclerView.Adapter<RepositoryAdapter.GitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_git, parent, false)
        return GitViewHolder(view)
    }

    override fun getItemCount(): Int = git.size


    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagemIcon_GitAdapter: ImageView = itemView.findViewById(R.id.imageIcon)
        var userName_GitAdapter: TextView = itemView.findViewById(R.id.userName)
        var sobreName_GitAdapter: TextView = itemView.findViewById(R.id.surName)
        var repositorioName_GitAdapter: TextView = itemView.findViewById(R.id.repositoryName)
        var reposiorioText_GitAdapter: TextView = itemView.findViewById(R.id.repositoryText)
        var numeroGit_GitAdapter: TextView = itemView.findViewById(R.id.numberGit)
        var numeroStar_GitAdapter: TextView = itemView.findViewById(R.id.numberStar)
        var gitIcon_GitAdapter: ImageView = itemView.findViewById(R.id.gitIcon)
        var starIcon_GitAdapter: ImageView = itemView.findViewById(R.id.starIcon)
        fun bind(git: Git) {
            with(git) {
                imagemIcon_GitAdapter.setImageResource(R.drawable.usuario)
                userName_GitAdapter.text = userName_Git
               sobreName_GitAdapter.text = sobreName_Git
                repositorioName_GitAdapter.text = repositorioName_Git
                reposiorioText_GitAdapter.text = repositorioText_Git
                numeroGit_GitAdapter.text = numeroGit_Git
                numeroStar_GitAdapter.text = numeroStar_Git
                gitIcon_GitAdapter.setImageResource(R.drawable.ic_share)
                starIcon_GitAdapter.setImageResource(R.drawable.ic_star)


            }

        }


    }

    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind(git[position])

    }
}