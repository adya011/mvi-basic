package com.example.archmvi.ui.intent

sealed class MainIntent {
    object FetchUser : MainIntent()
}