package com.pragbits.stash;

public class ImmutableSlackSettings implements SlackSettings {

    private final boolean slackNotificationsEnabled;
    private final boolean slackNotificationsEnabledForPush;
    private final String slackWebHookUrl;

    public ImmutableSlackSettings(boolean slackNotificationsEnabled,
                                  boolean slackNotificationsEnabledForPush,
                                  String slackWebHookUrl) {
        this.slackNotificationsEnabled = slackNotificationsEnabled;
        this.slackNotificationsEnabledForPush = slackNotificationsEnabledForPush;

        this.slackWebHookUrl = slackWebHookUrl;
    }

    public boolean isSlackNotificationsEnabled() {
        return slackNotificationsEnabled;
    }

    public boolean isSlackNotificationsEnabledForPush() {
        return slackNotificationsEnabledForPush;
    }



    public String getSlackWebHookUrl() {
        return slackWebHookUrl;
    }

    @Override
    public String toString() {
        return "ImmutableSlackSettings {" + "slackNotificationsEnabled=" + slackNotificationsEnabled +
                ", slackNotificationsEnabledForPush=" + slackNotificationsEnabledForPush +
                ", slackWebHookUrl=" + slackWebHookUrl + "}";
    }

}
