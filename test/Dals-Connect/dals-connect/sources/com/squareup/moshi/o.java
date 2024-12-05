package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public abstract class o implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    String f17269j;

    /* renamed from: k, reason: collision with root package name */
    boolean f17270k;
    boolean l;
    boolean m;

    /* renamed from: f, reason: collision with root package name */
    int f17265f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f17266g = new int[32];

    /* renamed from: h, reason: collision with root package name */
    String[] f17267h = new String[32];

    /* renamed from: i, reason: collision with root package name */
    int[] f17268i = new int[32];
    int n = -1;

    public static o T(j.g gVar) {
        return new l(gVar);
    }

    public final boolean D() {
        return this.l;
    }

    public final boolean J() {
        return this.f17270k;
    }

    public abstract o L(String str) throws IOException;

    public abstract o P() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Y() {
        int i2 = this.f17265f;
        if (i2 != 0) {
            return this.f17266g[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract o a() throws IOException;

    public abstract o b() throws IOException;

    public final String c() {
        return j.a(this.f17265f, this.f17266g, this.f17267h, this.f17268i);
    }

    public final void c0() throws IOException {
        int Y = Y();
        if (Y != 5 && Y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        int i2 = this.f17265f;
        int[] iArr = this.f17266g;
        if (i2 != iArr.length) {
            return false;
        }
        if (i2 != 256) {
            this.f17266g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17267h;
            this.f17267h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f17268i;
            this.f17268i = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof n)) {
                return true;
            }
            n nVar = (n) this;
            Object[] objArr = nVar.o;
            nVar.o = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + c() + ": circular reference?");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g0(int i2) {
        int[] iArr = this.f17266g;
        int i3 = this.f17265f;
        this.f17265f = i3 + 1;
        iArr[i3] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(int i2) {
        this.f17266g[this.f17265f - 1] = i2;
    }

    public void k0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f17269j = str;
    }

    public abstract o o() throws IOException;

    public final void q0(boolean z) {
        this.f17270k = z;
    }

    public final void s0(boolean z) {
        this.l = z;
    }

    public abstract o t0(double d2) throws IOException;

    public abstract o u0(long j2) throws IOException;

    public abstract o v0(Number number) throws IOException;

    public abstract o w() throws IOException;

    public abstract o w0(String str) throws IOException;

    public abstract o x0(boolean z) throws IOException;

    public final String z() {
        String str = this.f17269j;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
