package com.example.onboardingfrfr

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webViewID)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://estin-guide-2npl.vercel.app/")
        webView.settings.javaScriptEnabled = true


    }

    override fun onBackPressed() {
        if (findViewById<WebView>(R.id.webViewID).canGoBack()){
            findViewById<WebView>(R.id.webViewID).goBack()
        }else{
            super.onBackPressed()
        }
    }
}