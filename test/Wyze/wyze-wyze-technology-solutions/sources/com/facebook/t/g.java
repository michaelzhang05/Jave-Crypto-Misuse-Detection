package com.facebook.t;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;

/* compiled from: AppEventsLogger.java */
/* loaded from: classes.dex */
public class g {
    private h a;

    /* compiled from: AppEventsLogger.java */
    /* loaded from: classes.dex */
    public enum a {
        AUTO,
        EXPLICIT_ONLY
    }

    private g(Context context, String str, AccessToken accessToken) {
        this.a = new h(context, str, accessToken);
    }

    public static void a(Application application) {
        h.a(application, null);
    }

    public static void b(Application application, String str) {
        h.a(application, str);
    }

    public static String d(Context context) {
        return h.e(context);
    }

    public static a e() {
        return h.f();
    }

    public static String f() {
        return b.e();
    }

    public static void g(Context context, String str) {
        h.i(context, str);
    }

    public static g j(Context context) {
        return new g(context, null, null);
    }

    public static void k() {
        h.v();
    }

    public static void l(String str) {
        b.h(str);
    }

    @Deprecated
    public static void m(Bundle bundle, GraphRequest.f fVar) {
    }

    public void c() {
        this.a.c();
    }

    public void h(String str) {
        this.a.l(str);
    }

    public void i(String str, Bundle bundle) {
        this.a.n(str, bundle);
    }
}
