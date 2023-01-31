package com.intellectsoft.nav.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.intellectsoft.nav.R
import com.intellectsoft.nav.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {




        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            //inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_gallery, container, false)
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val myWebView: WebView = view.findViewById(R.id.webv1)
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl("https://intellectsoft.net")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true
}}
