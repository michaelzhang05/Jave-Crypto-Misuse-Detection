package com.facebook.login;

/* compiled from: DefaultAudience.java */
/* loaded from: classes.dex */
public enum b {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* renamed from: k, reason: collision with root package name */
    private final String f9346k;

    b(String str) {
        this.f9346k = str;
    }

    public String d() {
        return this.f9346k;
    }
}
