package com.pragbits.stash;

public interface SlackSettings {

    boolean isSlackNotificationsEnabled();
    boolean isSlackNotificationsEnabledForPush();

    String getSlackWebHookUrl();

}
