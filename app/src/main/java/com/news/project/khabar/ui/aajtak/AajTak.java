package com.news.project.khabar.ui.aajtak;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.news.project.khabar.R;


public class AajTak extends Fragment {


    public AajTak() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View root;
       root = inflater.inflate(R.layout.fragment_aaj_tak, container, false);

       WebView webView = root.findViewById(R.id.webViewAajTak);
       webView.loadUrl("https://www.aajtak.in");
       webView.setWebViewClient(new com.news.project.khabar.WebView());
        return root ;
    }
}