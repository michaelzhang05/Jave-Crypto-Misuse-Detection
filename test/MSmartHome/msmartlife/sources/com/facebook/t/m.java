package com.facebook.t;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.t.g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: InternalAppEventsLogger.java */
/* loaded from: classes.dex */
public class m {
    private h a;

    public m(Context context) {
        this(new h(context, (String) null, (AccessToken) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return h.d();
    }

    public static g.a c() {
        return h.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        return h.h();
    }

    public static void m(Map<String, String> map) {
        p.i(map);
    }

    public void a() {
        this.a.c();
    }

    public void e(String str, double d2, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.m(str, d2, bundle);
        }
    }

    public void f(String str, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.n(str, bundle);
        }
    }

    public void g(String str, String str2) {
        this.a.p(str, str2);
    }

    public void h(String str) {
        if (com.facebook.f.i()) {
            this.a.q(str, null, null);
        }
    }

    public void i(String str, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.q(str, null, bundle);
        }
    }

    public void j(String str, Double d2, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.q(str, d2, bundle);
        }
    }

    public void k(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.r(str, bigDecimal, currency, bundle);
        }
    }

    public void l(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.f.i()) {
            this.a.t(bigDecimal, currency, bundle);
        }
    }

    public m(Context context, String str) {
        this(new h(context, str, (AccessToken) null));
    }

    public m(String str, String str2, AccessToken accessToken) {
        this(new h(str, str2, accessToken));
    }

    m(h hVar) {
        this.a = hVar;
    }
}
