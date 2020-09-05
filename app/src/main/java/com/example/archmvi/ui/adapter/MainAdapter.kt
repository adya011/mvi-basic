package com.example.archmvi.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.archmvi.R
import com.example.archmvi.data.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class MainAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    fun addData(list: List<User>) {
        users.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder =
        MainViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_user, parent, false
            )
        )


    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) =
        holder.bind(users[position])

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            with(itemView) {
                textViewUserName.text = user.name
                textViewUserEmail.text = user.email
            }
        }
    }
}