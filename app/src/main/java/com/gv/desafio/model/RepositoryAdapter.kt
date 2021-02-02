package com.gv.desafio.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.gv.desafio.R
import com.gv.desafio.api.Post

import com.gv.desafio.data.Repository
import kotlinx.coroutines.launch

class RepositoryAdapter(private val repository: MutableList<Repository>) : ViewModel() {

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repository_list_item, parent, false)
        return GitViewHolder(view)
    }

    fun getItemCount(): Int = repository.size


    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.imageIcon)
        var userNameRepositoryAdapter: TextView = itemView.findViewById(R.id.userName)
        var surNameRepositoryAdapter: TextView = itemView.findViewById(R.id.surName)
        var repositoryNameRepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryName)
        var repositoryTextRepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryText)
        var numberGitRepositoryAdapter: TextView = itemView.findViewById(R.id.numberGit)
        var numberStarRepositoryAdapter: TextView = itemView.findViewById(R.id.numberStar)
        var gitIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.gitIcon)
        var starIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.starIcon)
        fun bind(git: Repository) {
            with(git) {
                imageIconRepositoryAdapter.setImageResource(R.drawable.user)
                userNameRepositoryAdapter.text = userNameRepository
                surNameRepositoryAdapter.text = surNameRepository
                repositoryNameRepositoryAdapter.text = repositoryNameRepository
                repositoryTextRepositoryAdapter.text = repositoryTextRepository
                numberGitRepositoryAdapter.text = numberGitRepository
                numberStarRepositoryAdapter.text = numberStarRepository
                gitIconRepositoryAdapter.setImageResource(R.drawable.ic_share)
                starIconRepositoryAdapter.setImageResource(R.drawable.ic_star)


            }

        }


    }

    fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind(repository[position])

    }
val myResponse: MutableLiveData<Post> = MutableLiveData()
    fun getPost(){
      viewModelScope.launch {

      }
    }
}