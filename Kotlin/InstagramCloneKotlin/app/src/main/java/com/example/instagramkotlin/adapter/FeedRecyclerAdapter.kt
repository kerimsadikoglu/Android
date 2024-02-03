package com.example.instagramkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramkotlin.databinding.RecyclerRowBinding
import com.example.instagramkotlin.model.Post
import com.squareup.picasso.Picasso
import java.util.ArrayList

class FeedRecyclerAdapter(private val postList : ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {
    class PostHolder(val binding : RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recylerEmailText.text = postList.get(position).email
        holder.binding.recylerCommentText.text = postList.get(position).comment
        Picasso.get().load(postList[position].downloadUrl).into(holder.binding.recylerImageView)
    }
}