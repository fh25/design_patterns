package com.creational.patterns.factory;

public class Blog extends Website {
  @Override
  public void createWebsite() {
    pages.add(new PostPage());
    pages.add(new AboutPage());
    pages.add(new ContactPage());
    pages.add(new CommentPage());
  }
}
