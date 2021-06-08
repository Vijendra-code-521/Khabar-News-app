package com.news.project.khabar.ui.cnn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.news.project.khabar.R;


public class CnnNews extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_cnn , container,false);
        WebView webView = root.findViewById(R.id.webViewCnn);
        webView.loadUrl("https://www.news18.com/agency/cnn/news/");
        webView.setWebViewClient(new com.news.project.khabar.WebView());
        return root;
    }

}