package com.example.disneyplus.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.data.entity.Banner
import com.example.disneyplus.databinding.BannerDesignBinding

class BannerAdapter  (var mContext: Context, var bannerList: List<Banner>) :
    RecyclerView.Adapter<BannerAdapter.BannerDesignHolder>(){
    inner class BannerDesignHolder(var design : BannerDesignBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerDesignHolder {
        val binding = BannerDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return BannerDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }

    override fun onBindViewHolder(holder: BannerDesignHolder, position: Int) {
        val banner = bannerList.get(position)
        val b = holder.design
        b.imageViewBanner.setImageResource(
            mContext.resources.getIdentifier(
                banner.image,
                "drawable",
                mContext.packageName
            )
        )
    }

}