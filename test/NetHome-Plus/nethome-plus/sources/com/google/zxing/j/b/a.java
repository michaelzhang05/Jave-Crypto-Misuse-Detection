package com.google.zxing.j.b;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix.java */
/* loaded from: classes2.dex */
public final class a {
    private final b[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f17092b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17093c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17094d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i2, int i3) {
        b[] bVarArr = new b[i2];
        this.a = bVarArr;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.a[i4] = new b(((i3 + 4) * 17) + 1);
        }
        this.f17094d = i3 * 17;
        this.f17093c = i2;
        this.f17092b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a() {
        return this.a[this.f17092b];
    }

    public byte[][] b(int i2, int i3) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.f17093c * i3, this.f17094d * i2);
        int i4 = this.f17093c * i3;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.a[i5 / i3].b(i2);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f17092b++;
    }
}
