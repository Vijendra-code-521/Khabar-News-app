package com.news.project.khabar.ui.zeenews;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.news.project.khabar.R;

public class ZeeNews extends Fragment {


    public ZeeNews() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_zee_news, container, false);
        WebView webView = view.findViewById(R.id.webViewzeeNews);
        webView.loadUrl("https://zeenews.india.com");
        webView.setWebViewClient(new com.news.project.khabar.WebView());
        return view;
    }
}