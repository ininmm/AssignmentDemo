package com.github.ininmm.network.service

import com.github.ininmm.network.entity.WeatherRss
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Michael Lien
 * on 2018/7/25.
 */
interface WeatherService {
    /**
     * 獲取氣象局台中市一周內的天氣資料
     */
    @GET("rss/forecast/36_08.xml")
    fun getWeather(): Observable<WeatherRss>
}