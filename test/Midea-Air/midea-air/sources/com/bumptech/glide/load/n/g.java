package com.bumptech.glide.load.n;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public class g implements com.bumptech.glide.load.f {

    /* renamed from: b, reason: collision with root package name */
    private final h f8711b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f8712c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8713d;

    /* renamed from: e, reason: collision with root package name */
    private String f8714e;

    /* renamed from: f, reason: collision with root package name */
    private URL f8715f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f8716g;

    /* renamed from: h, reason: collision with root package name */
    private int f8717h;

    public g(URL url) {
        this(url, h.f8718b);
    }

    private byte[] b() {
        if (this.f8716g == null) {
            this.f8716g = a().getBytes(com.bumptech.glide.load.f.a);
        }
        return this.f8716g;
    }

    private String d() {
        if (TextUtils.isEmpty(this.f8714e)) {
            String str = this.f8713d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) com.bumptech.glide.r.j.d(this.f8712c)).toString();
            }
            this.f8714e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f8714e;
    }

    private URL e() throws MalformedURLException {
        if (this.f8715f == null) {
            this.f8715f = new URL(d());
        }
        return this.f8715f;
    }

    public String a() {
        String str = this.f8713d;
        return str != null ? str : ((URL) com.bumptech.glide.r.j.d(this.f8712c)).toString();
    }

    public Map<String, String> c() {
        return this.f8711b.a();
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return a().equals(gVar.a()) && this.f8711b.equals(gVar.f8711b);
    }

    public URL f() throws MalformedURLException {
        return e();
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f8717h == 0) {
            int hashCode = a().hashCode();
            this.f8717h = hashCode;
            this.f8717h = (hashCode * 31) + this.f8711b.hashCode();
        }
        return this.f8717h;
    }

    public String toString() {
        return a();
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b());
    }

    public g(String str) {
        this(str, h.f8718b);
    }

    public g(URL url, h hVar) {
        this.f8712c = (URL) com.bumptech.glide.r.j.d(url);
        this.f8713d = null;
        this.f8711b = (h) com.bumptech.glide.r.j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f8712c = null;
        this.f8713d = com.bumptech.glide.r.j.b(str);
        this.f8711b = (h) com.bumptech.glide.r.j.d(hVar);
    }
}
