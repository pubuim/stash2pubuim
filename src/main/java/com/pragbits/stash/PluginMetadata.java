package com.pragbits.stash;

public class PluginMetadata {

    public static String getPluginKey() {
        return "com.pubuim.stash.stash2pubu";
    }

    public static String getCompleteModuleKey(String moduleKey) {
        return getPluginKey() + ":" + moduleKey;
    }
}
