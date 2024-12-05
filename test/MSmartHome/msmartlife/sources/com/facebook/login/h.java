package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Set;

/* compiled from: LoginResult.java */
/* loaded from: classes.dex */
public class h {
    private final AccessToken a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f9365b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f9366c;

    public h(AccessToken accessToken, Set<String> set, Set<String> set2) {
        this.a = accessToken;
        this.f9365b = set;
        this.f9366c = set2;
    }

    public AccessToken a() {
        return this.a;
    }

    public Set<String> b() {
        return this.f9365b;
    }
}
