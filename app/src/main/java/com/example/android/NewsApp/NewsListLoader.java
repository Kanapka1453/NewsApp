package com.example.android.NewsApp;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import android.widget.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class NewsListLoader extends AsyncTaskLoader<List<News>> {

    private String mUrl;

    public NewsListLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<News> listOfNews = null;
        try {
            URL url = QueryUtils.createUrl();
            String jsonResponse = QueryUtils.makeHttpRequest(url);
            listOfNews = QueryUtils.parseJson(jsonResponse);
        } catch (IOException e) {

        }
        return listOfNews;
    }
}
