package com.example.disneyplus.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.disneyplus.R
import com.example.disneyplus.data.entity.Banner
import com.example.disneyplus.data.entity.Movies
import com.example.disneyplus.databinding.FragmentMainBinding
import com.example.disneyplus.ui.adapter.BannerAdapter
import com.example.disneyplus.ui.adapter.MoviesAdapter

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        val bannerList = ArrayList<Banner>()
        val b1 = Banner("guardians_of_the_galaxy")
        val b2 = Banner("i_am_groot")
        val b3 = Banner("galaxy")
        val b4 = Banner("the_last_jedi")
        val b5 = Banner("wakanda_forever")
        val b6 = Banner("dumbo")

        bannerList.add(b1)
        bannerList.add(b2)
        bannerList.add(b3)
        bannerList.add(b4)
        bannerList.add(b5)
        bannerList.add(b6)


        val bannerAdapter = BannerAdapter(requireContext(),bannerList)
        binding.rvBanner.adapter = bannerAdapter
        binding.rvBanner.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        val movieList = ArrayList<Movies>()
        val m1 = Movies("tangled")
        val m2 = Movies("frozen")
        val m3 = Movies("mulan")
        val m4 = Movies("onward")
        val m5 = Movies("the_incredibles")

        movieList.add(m1)
        movieList.add(m2)
        movieList.add(m3)
        movieList.add(m4)
        movieList.add(m5)


        val moviesAdapter = MoviesAdapter(requireContext(),movieList)
        binding.rvMovies.adapter = moviesAdapter
        binding.rvMovies.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        val movieList2 = ArrayList<Movies>()
        val mv1 = Movies("tangled")
        val mv2 = Movies("frozen")
        val mv3 = Movies("mulan")
        val mv4 = Movies("onward")
        val mv5 = Movies("the_incredibles")

        movieList2.add(mv5)
        movieList2.add(mv4)
        movieList2.add(mv1)
        movieList2.add(mv2)
        movieList2.add(mv3)

        val moviesAdapter2 = MoviesAdapter(requireContext(),movieList2)
        binding.rvMovies2.adapter = moviesAdapter2
        binding.rvMovies2.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        return binding.root
    }


}