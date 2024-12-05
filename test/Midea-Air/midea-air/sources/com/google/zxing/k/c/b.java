package com.google.zxing.k.c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix.java */
/* loaded from: classes2.dex */
public final class b {
    private final byte[][] a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17136b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17137c;

    public b(int i2, int i3) {
        this.a = (byte[][]) Array.newInstance((Class<?>) byte.class, i3, i2);
        this.f17136b = i2;
        this.f17137c = i3;
    }

    public void a(byte b2) {
        for (byte[] bArr : this.a) {
            Arrays.fill(bArr, b2);
        }
    }

    public byte b(int i2, int i3) {
        return this.a[i3][i2];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.f17137c;
    }

    public int e() {
        return this.f17136b;
    }

    public void f(int i2, int i3, int i4) {
        this.a[i3][i2] = (byte) i4;
    }

    public void g(int i2, int i3, boolean z) {
        this.a[i3][i2] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f17136b * 2 * this.f17137c) + 2);
        for (int i2 = 0; i2 < this.f17137c; i2++) {
            byte[] bArr = this.a[i2];
            for (int i3 = 0; i3 < this.f17136b; i3++) {
                byte b2 = bArr[i3];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
