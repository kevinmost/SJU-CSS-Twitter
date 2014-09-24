package main.java;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 * @author kevinmost
 * @date 9/24/14
 */
public class TwitterTester {
    public static void main(String[] args) {
        Twitter twitterBuilder = TwitterFactory.getSingleton();
    }
}
