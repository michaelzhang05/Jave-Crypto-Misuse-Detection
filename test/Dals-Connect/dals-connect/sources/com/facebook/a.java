package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.y;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccessTokenCache.java */
/* loaded from: classes.dex */
public class a {
    private final SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    private final C0127a f9027b;

    /* renamed from: c, reason: collision with root package name */
    private k f9028c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenCache.java */
    /* renamed from: com.facebook.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0127a {
        C0127a() {
        }

        public k a() {
            return new k(f.e());
        }
    }

    a(SharedPreferences sharedPreferences, C0127a c0127a) {
        this.a = sharedPreferences;
        this.f9027b = c0127a;
    }

    private AccessToken b() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return AccessToken.c(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private AccessToken c() {
        Bundle h2 = d().h();
        if (h2 == null || !k.g(h2)) {
            return null;
        }
        return AccessToken.d(h2);
    }

    private k d() {
        if (this.f9028c == null) {
            synchronized (this) {
                if (this.f9028c == null) {
                    this.f9028c = this.f9027b.a();
                }
            }
        }
        return this.f9028c;
    }

    private boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private boolean h() {
        return f.x();
    }

    public void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken c2 = c();
        if (c2 == null) {
            return c2;
        }
        g(c2);
        d().a();
        return c2;
    }

    public void g(AccessToken accessToken) {
        y.i(accessToken, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.w().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public a() {
        this(f.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C0127a());
    }
}
