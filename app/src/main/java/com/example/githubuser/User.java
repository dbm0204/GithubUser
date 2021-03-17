package com.example.githubuser;

import java.util.Objects;

public class User {
    public String login;
    public String node_id;
    public String avatar_url;
    public String getavatar_url;
    public String url;
    public String html_url;
    public String followers_url;
    public String following_url;
    public String gists_url;
    public String starred_url;
    public String subscriptions_url;
    public String organizations_url;
    public String repos_url;
    public String events_url;
    public String received_events_url;
    public String type;
    public String site_admin;
    public int id;
    //Default Constructor
    public User(){}
    //Parameterized Constructor
    public User(String login,
                int id,
                String node_id,
                String avatar_url,
                String getavatar_url,
                String url,
                String html_url,
                String followers_url,
                String following_url,
                String gists_url,
                String starred_url,
                String subscriptions_url,
                String organizations_url,
                String repos_url,
                String events_url,
                String received_events_url,
                String type,
                String site_admin) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.getavatar_url = getavatar_url;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
    }

    //Getter Function for Login
    public String getLogin() {
        return login;
    }

    //Setter function for Login
    public void setLogin(String login) {
        this.login = login;
    }

    //Getter function for Id
    public int getId() {
        return id;
    }

    //Setter Function for Id
    public void setId(int id) {
        this.id = id;
    }

    //Getter function for Node_id
    public String getNode_id() {
        return node_id;
    }

    //Setter function for node_id
    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    //Getter function for Avatar_url
    public String getAvatar_url() {
        return avatar_url;
    }

    //Setter function for Avatar_url
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    //Getter function for Getavatar_url
    public String getGetavatar_url() {
        return getavatar_url;
    }

    //Setter function for Getavatar_url
    public void setGetavatar_url(String getavatar_url) {
        this.getavatar_url = getavatar_url;
    }

    //Getter function for url
    public String getUrl() {
        return url;
    }

    //Setter function for url
    public void setUrl(String url) {
        this.url = url;
    }

    //getter function for html_url
    public String getHtml_url() {
        return html_url;
    }

    //Setter function for html_url
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    //Getter function for followers_url
    public String getFollowers_url() {
        return followers_url;
    }

    //Setter function for followers_url
    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    //getter function for following_url
    public String getFollowing_url() {
        return following_url;
    }

    //Setter function for following_url
    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    //getter function for glists_url
    public String getGists_url() {
        return gists_url;
    }

    //Setter function for glists)url
    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    //Getter function for starred_url
    public String getStarred_url() {
        return starred_url;
    }

    //Setter function for starred_url
    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    //Getter function for subscription_url
    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    //Setter function for subscription_url
    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }
    //Getter function for organization_url
    public String getOrganizations_url() {
        return organizations_url;
    }

    //Setter function for organization_url
    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }
    //Getter function for repos_url
    public String getRepos_url() {
        return repos_url;
    }

    //Setter function for repos_url
    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    //Getter function for events_url
    public String getEvents_url() {
        return events_url;
    }

    //Setter function for events_url
    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    //Getter function for Received_events_url
    public String getReceived_events_url() {
        return received_events_url;
    }

    //Setter function for Recived_events_url
    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }
    //Getter function for Type
    public String getType() {
        return type;
    }

    //Setter function for Type
    public void setType(String type) {
        this.type = type;
    }

    //Getter function for site_admin
    public String getSite_admin() {
        return site_admin;
    }

    //Setter function for site_admin
    public void setSite_admin(String site_admin) {
        this.site_admin = site_admin;
    }

}
