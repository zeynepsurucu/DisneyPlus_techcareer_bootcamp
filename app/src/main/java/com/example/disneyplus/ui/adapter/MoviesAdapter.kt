package com.example.disneyplus.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.data.entity.Movies
import com.example.disneyplus.databinding.BannerDesignBinding

class MoviesAdapter (var mContext: Context, var bannerList: List<Movies>) :
    RecyclerView.Adapter<MoviesAdapter.MoviesHolder>(){
    inner class MoviesHolder(var design : BannerDesignBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MoviesHolder  {
        val binding = BannerDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return MoviesHolder(binding)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }

    override fun onBindViewHolder(holder: MoviesHolder, position: Int) {
        val banner = bannerList.get(position)
        val b = holder.design
        b.imageViewBanner.setImageResource(
            mContext.resources.getIdentifier(
                banner.movieImage,
                "drawable",
                mContext.packageName
            )
        )
    }

}