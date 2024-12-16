package com.example.internetslider

import java.io.Serializable

class Page(val name: String, val url: String, val image: Int) : Serializable {

    companion object {
        val pages = mutableListOf(
            Page("Новости", "https://dzen.ru/news", R.drawable.ic_newspaper),
            Page("Музыка", "https://music.yandex.ru/", R.drawable.ic_music_note),
            Page("Видео", "https://yandex.ru/video/", R.drawable.ic_video),
            Page("Картинки", "https://yandex.ru/images/search?from=tabbar&text=Urban%20University", R.drawable.ic_image),
        )
    }
}