package com.foxy.foxy_sdk.foxynativemodules.enums;

public interface Events {
    enum Notification implements Events {
        notification_shown,
        notification_action,
        notification_cancelled,
    }
}
