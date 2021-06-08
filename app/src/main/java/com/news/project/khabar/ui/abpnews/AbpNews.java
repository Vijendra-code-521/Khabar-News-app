package com.news.project.khabar.ui.abpnews;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.news.project.khabar.R;

public class AbpNews extends Fragment {


    public AbpNews() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_abp_news, container, false);
        WebView webView = view.findViewById(R.id.webViewabpNews);
        webView.loadUrl("https://www.abplive.com");
        webView.setWebViewClient(new com.news.project.khabar.WebView());
        return view;
    }
}