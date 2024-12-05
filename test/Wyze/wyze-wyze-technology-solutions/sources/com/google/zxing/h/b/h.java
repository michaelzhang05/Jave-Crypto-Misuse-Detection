package com.google.zxing.h.b;

import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext.java */
/* loaded from: classes2.dex */
final class h {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private l f17047b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.zxing.b f17048c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.zxing.b f17049d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f17050e;

    /* renamed from: f, reason: collision with root package name */
    int f17051f;

    /* renamed from: g, reason: collision with root package name */
    private int f17052g;

    /* renamed from: h, reason: collision with root package name */
    private k f17053h;

    /* renamed from: i, reason: collision with root package name */
    private int f17054i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 == '?' && str.charAt(i2) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.a = sb.toString();
        this.f17047b = l.FORCE_NONE;
        this.f17050e = new StringBuilder(str.length());
        this.f17052g = -1;
    }

    private int h() {
        return this.a.length() - this.f17054i;
    }

    public int a() {
        return this.f17050e.length();
    }

    public StringBuilder b() {
        return this.f17050e;
    }

    public char c() {
        return this.a.charAt(this.f17051f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.f17052g;
    }

    public int f() {
        return h() - this.f17051f;
    }

    public k g() {
        return this.f17053h;
    }

    public boolean i() {
        return this.f17051f < h();
    }

    public void j() {
        this.f17052g = -1;
    }

    public void k() {
        this.f17053h = null;
    }

    public void l(com.google.zxing.b bVar, com.google.zxing.b bVar2) {
        this.f17048c = bVar;
        this.f17049d = bVar2;
    }

    public void m(int i2) {
        this.f17054i = i2;
    }

    public void n(l lVar) {
        this.f17047b = lVar;
    }

    public void o(int i2) {
        this.f17052g = i2;
    }

    public void p() {
        q(a());
    }

    public void q(int i2) {
        k kVar = this.f17053h;
        if (kVar == null || i2 > kVar.a()) {
            this.f17053h = k.l(i2, this.f17047b, this.f17048c, this.f17049d, true);
        }
    }

    public void r(char c2) {
        this.f17050e.append(c2);
    }

    public void s(String str) {
        this.f17050e.append(str);
    }
}
