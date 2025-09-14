package Heaps;
import java.util.*;

public class Twitter {
    private static int timestamp = 0;

    // user -> set of followees
    private final Map<Integer, Set<Integer>> userFollows;
    // user -> list of their tweets
    private final Map<Integer, List<Tweet>> userTweets;

    private static class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public Twitter() {
        userFollows = new HashMap<>();
        userTweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        userTweets.putIfAbsent(userId, new ArrayList<>());
        userTweets.get(userId).add(new Tweet(tweetId, ++timestamp));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new ArrayList<>();
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);

        // include own tweets
        if (userTweets.containsKey(userId)) {
            maxHeap.addAll(userTweets.get(userId));
        }

        // include followees' tweets
        Set<Integer> follows = userFollows.getOrDefault(userId, new HashSet<>());
        for (int followee : follows) {
            if (userTweets.containsKey(followee)) {
                maxHeap.addAll(userTweets.get(followee));
            }
        }

        // take 10 most recent
        while (!maxHeap.isEmpty() && feed.size() < 10) {
            feed.add(maxHeap.poll().id);
        }
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        userFollows.putIfAbsent(followerId, new HashSet<>());
        userFollows.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (userFollows.containsKey(followerId)) {
            userFollows.get(followerId).remove(followeeId);
        }
    }
}
