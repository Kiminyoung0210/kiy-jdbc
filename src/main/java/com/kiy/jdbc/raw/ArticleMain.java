package com.kiy.jdbc.raw;

import java.util.List;

import com.kiy.jdbc.template.ArticleDaoImplUsingTemplate;

public class ArticleMain {
    ArticleDao articleDao = new ArticleDaoImplUsingTemplate();

    /**
     * main 메서드
     */
    public static void main(String[] args) {
        new ArticleMain().listArticles();
    }

    public void listArticles() {
        List<Article> articles = articleDao.listArticles();
        System.out.println(articles);
    }

    public void getArticle() {
        Article article = articleDao.getArticle("3");
        System.out.println(article);
    }

    public void addArticle() {
        Article article = new Article();
        article.setTitle("웹프로그래밍 실습.");
        article.setContent("아이 재밌댜");
        article.setUserId("3");
        article.setName("전자공학과 김인영");
        articleDao.addArticle(article);
    }

    public void updateArticle() {
        Article article = new Article();
        article.setArticleId("7");
        article.setTitle("This is modified title.");
        article.setContent("This is modified content");
        articleDao.updateArticle(article);
    }

    public void deleteArticle() {
        articleDao.deleteArticle("10");
    }
}
