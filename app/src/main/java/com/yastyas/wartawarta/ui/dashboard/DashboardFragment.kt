package com.yastyas.wartawarta.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yastyas.wartawarta.R
import com.yastyas.wartawarta.modeldata.Berita
import com.yastyas.wartawarta.modeldata.BeritaData
import com.yastyas.wartawarta.ui.home.HomeAdapter

class DashboardFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        list.addAll(BeritaData.listData)

        recyclerView = root.findViewById(R.id.rv_gallery)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = GridLayoutManager(activity, 2)
        val dashboardAdapter = DashboardAdapter(list)
        recyclerView.adapter = dashboardAdapter

        return root
    }

//    private fun GridLayoutManager(context: Context?): RecyclerView.LayoutManager? {
//        return  null
//    }
}
