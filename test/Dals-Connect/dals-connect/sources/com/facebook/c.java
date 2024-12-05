package com.facebook;

/* compiled from: AccessTokenSource.java */
/* loaded from: classes.dex */
public enum c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);

    private final boolean p;

    c(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.p;
    }
}
