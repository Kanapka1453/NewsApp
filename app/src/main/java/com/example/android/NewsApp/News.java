package com.example.android.NewsApp;

public class News {

    private String mArticleTitle, mArticleAuthor, mArticleDate, mArticleTag, mArticleUrl;


    /**
     * Create a new Attraction object.
     *
     * @param articleTitle  title of the article
     * @param articleAuthor author of the article
     * @param articleDate   article date
     * @param articleTag    article category
     * @param articleUrl    article url
     */

    public News(String articleTitle, String articleAuthor, String articleDate, String articleTag, String articleUrl) {
        mArticleTitle = articleTitle;
        mArticleAuthor = articleAuthor;
        mArticleDate = articleDate;
        mArticleTag = articleTag;
        mArticleUrl = articleUrl;
    }

    public String getmArticleTitle() {
        return mArticleTitle;
    }

    public String getmArticleAuthor() {
        return mArticleAuthor;
    }

    public String getmArticleDate() {
        return mArticleDate;
    }

    public String getmArticleTag() {
        return mArticleTag;
    }

    public String getmArticleUrl() {
        return mArticleUrl;
    }

}
