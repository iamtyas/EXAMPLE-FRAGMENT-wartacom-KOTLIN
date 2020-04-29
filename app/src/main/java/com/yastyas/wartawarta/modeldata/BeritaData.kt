package com.yastyas.wartawarta.modeldata

import com.yastyas.wartawarta.R

object BeritaData {
    private val beritaJudul = arrayOf(
        "Peta Sebaran Corona di 5 Wilayah Jabar yang Diusulkan PSBB",
        "Jalani Rapid Test, 13 Warga Subang Terindikasi Corona",
        "Jokowi Bagi-Bagi Sembako di Jalan, Istana: Wujud Kepedulian di Masa Pandemi Corona",
        "Peta Sebaran Corona di 5 Wilayah Jabar yang Diusulkan PSBB",
        "Jalani Rapid Test, 13 Warga Subang Terindikasi Corona",
        "Jokowi Bagi-Bagi Sembako di Jalan, Istana: Wujud Kepedulian di Masa Pandemi Corona",
        "Peta Sebaran Corona di 5 Wilayah Jabar yang Diusulkan PSBB",
        "Jalani Rapid Test, 13 Warga Subang Terindikasi Corona"
    )

    private val beritaRingkasan = arrayOf(
        "Pemprov Jabar mengajukan lima daerah untuk penerapan PSBB. Lima darah tersebut yakni Kota dan Kabupaten Bekasi," +
                "Kota dan Kabupaten Bogor, serta Kota Depok.",
        "Gugus Tugas Percepatan Penanggulangan Covid-19 Kabupaten Subang mengungkapkan hasil rapid test kepada 1.774 ODP yang " +
                "digelar selama dua hari terakhir.",
        "Lewat aksi bagi-bagi sembako ini, Jokowi ingin menyampaikan pesan kebersamaan dan gotong-royong di masa pandemi Corona.",
        "Pemprov Jabar mengajukan lima daerah untuk penerapan PSBB. Lima darah tersebut yakni Kota dan Kabupaten Bekasi," +
                "Kota dan Kabupaten Bogor, serta Kota Depok.",
        "Gugus Tugas Percepatan Penanggulangan Covid-19 Kabupaten Subang mengungkapkan hasil rapid test kepada 1.774 ODP yang " +
                "digelar selama dua hari terakhir.",
        "Lewat aksi bagi-bagi sembako ini, Jokowi ingin menyampaikan pesan kebersamaan dan gotong-royong di masa pandemi Corona.",
        "Pemprov Jabar mengajukan lima daerah untuk penerapan PSBB. Lima darah tersebut yakni Kota dan Kabupaten Bekasi," +
                "Kota dan Kabupaten Bogor, serta Kota Depok.",
        "Gugus Tugas Percepatan Penanggulangan Covid-19 Kabupaten Subang mengungkapkan hasil rapid test kepada 1.774 ODP yang " +
                "digelar selama dua hari terakhir."
    )

    private val beritaSrc = arrayOf(
        "detik.com",
        "detik.com",
        "liputan6.com",
        "detik.com",
        "detik.com",
        "liputan6.com",
        "detik.com",
        "detik.com"
    )

    private val beritaImg = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img1,
        R.drawable.img2
    )

    val listData: ArrayList<Berita>
        get() {
            val list = arrayListOf<Berita>()
            for (position in beritaJudul.indices) {
                val berita = Berita()
                berita.judul = beritaJudul[position]
                berita.ringkasan = beritaRingkasan[position]
                berita.src = beritaSrc[position]
                berita.img = beritaImg[position]
                list.add(berita)
            }
            return list
        }

}