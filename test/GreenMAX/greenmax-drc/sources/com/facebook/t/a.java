package com.facebook.t;

import com.facebook.AccessToken;
import com.facebook.internal.x;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccessTokenAppIdPair.java */
/* loaded from: classes.dex */
public class a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final String f9427f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9428g;

    /* compiled from: AccessTokenAppIdPair.java */
    /* loaded from: classes.dex */
    static class b implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final String f9429f;

        /* renamed from: g, reason: collision with root package name */
        private final String f9430g;

        private Object readResolve() {
            return new a(this.f9429f, this.f9430g);
        }

        private b(String str, String str2) {
            this.f9429f = str;
            this.f9430g = str2;
        }
    }

    public a(AccessToken accessToken) {
        this(accessToken.r(), com.facebook.f.f());
    }

    private Object writeReplace() {
        return new b(this.f9427f, this.f9428g);
    }

    public String a() {
        return this.f9427f;
    }

    public String b() {
        return this.f9428g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.b(aVar.f9427f, this.f9427f) && x.b(aVar.f9428g, this.f9428g);
    }

    public int hashCode() {
        String str = this.f9427f;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f9428g;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public a(String str, String str2) {
        this.f9427f = x.Q(str) ? null : str;
        this.f9428g = str2;
    }
}
