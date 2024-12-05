package com.facebook.t.r.g;

import android.util.Log;
import okhttp3.HttpUrl;

/* compiled from: UnityReflection.java */
/* loaded from: classes.dex */
public class e {
    private static final String a = "com.facebook.t.r.g.e";

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f9594b;

    public static void a() {
        c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static void b(String str) {
        c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static void c(String str, String str2, String str3) {
        try {
            if (f9594b == null) {
                f9594b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f9594b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(f9594b, str, str2, str3);
        } catch (Exception e2) {
            Log.e(a, "Failed to send message to Unity", e2);
        }
    }
}
