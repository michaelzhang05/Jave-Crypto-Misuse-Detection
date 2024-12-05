package com.flurry.sdk;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class k0 {
    private static k0 a;

    /* renamed from: b, reason: collision with root package name */
    public String f9973b;

    /* renamed from: c, reason: collision with root package name */
    public String f9974c;

    private k0() {
    }

    public static k0 a() {
        if (a == null) {
            a = new k0();
        }
        return a;
    }

    private static boolean d() {
        return f1.a() == 0;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f9973b)) {
            c();
        }
        d1.c(3, "APIKeyProvider", "Getting streaming apikey: " + this.f9973b);
        return this.f9973b;
    }

    public final void c() {
        if (TextUtils.isEmpty(this.f9973b)) {
            this.f9973b = this.f9974c;
            if (!d()) {
                this.f9973b += "0";
            }
            d1.c(3, "APIKeyProvider", "Generating a streaming apikey: " + this.f9973b);
        }
    }
}
