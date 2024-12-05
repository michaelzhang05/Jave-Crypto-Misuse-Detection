package com.google.zxing.k.c;

/* compiled from: QRCode.java */
/* loaded from: classes2.dex */
public final class f {
    private com.google.zxing.k.b.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.zxing.k.b.a f17141b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.zxing.k.b.c f17142c;

    /* renamed from: d, reason: collision with root package name */
    private int f17143d = -1;

    /* renamed from: e, reason: collision with root package name */
    private b f17144e;

    public static boolean b(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public b a() {
        return this.f17144e;
    }

    public void c(com.google.zxing.k.b.a aVar) {
        this.f17141b = aVar;
    }

    public void d(int i2) {
        this.f17143d = i2;
    }

    public void e(b bVar) {
        this.f17144e = bVar;
    }

    public void f(com.google.zxing.k.b.b bVar) {
        this.a = bVar;
    }

    public void g(com.google.zxing.k.b.c cVar) {
        this.f17142c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.f17141b);
        sb.append("\n version: ");
        sb.append(this.f17142c);
        sb.append("\n maskPattern: ");
        sb.append(this.f17143d);
        if (this.f17144e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f17144e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
