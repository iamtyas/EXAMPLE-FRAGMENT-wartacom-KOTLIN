package com.yastyas.wartawarta.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yastyas.wartawarta.R
import com.yastyas.wartawarta.modeldata.Berita
import com.yastyas.wartawarta.modeldata.BeritaData
import com.yastyas.wartawarta.ui.home.HomeAdapter

class NotificationsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)

        list.addAll(BeritaData.listData)

        recyclerView = root.findViewById(R.id.rv_notif)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        val notificationAdapter = NotificationAdapter(list)
        recyclerView.adapter = notificationAdapter

        return root
    }
}
