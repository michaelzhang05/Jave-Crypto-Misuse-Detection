package com.facebook.internal;

import java.util.Collection;

/* compiled from: ServerProtocol.java */
/* loaded from: classes.dex */
public final class v {
    public static final Collection<String> a = x.r0("service_disabled", "AndroidAuthKillSwitchException");

    /* renamed from: b, reason: collision with root package name */
    public static final Collection<String> f9225b = x.r0("access_denied", "OAuthAccessDeniedException");

    public static final String a() {
        return "v6.0";
    }

    public static final String b() {
        return String.format("m.%s", com.facebook.f.n());
    }

    public static final String c() {
        return String.format("https://graph.%s", com.facebook.f.p());
    }

    public static final String d() {
        return String.format("https://graph-video.%s", com.facebook.f.p());
    }
}
