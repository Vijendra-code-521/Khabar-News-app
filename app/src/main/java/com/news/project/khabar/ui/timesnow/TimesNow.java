package com.news.project.khabar.ui.timesnow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.news.project.khabar.R;


public class TimesNow extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view;
         view = inflater.inflate(R.layout.fragment_times_now , container,false);
        WebView webView = view.findViewById(R.id.webViewtimesNow);
        webView.loadUrl("https://www.timesnownews.com");
        webView.setWebViewClient(new com.news.project.khabar.WebView());
        return view;
    }

}