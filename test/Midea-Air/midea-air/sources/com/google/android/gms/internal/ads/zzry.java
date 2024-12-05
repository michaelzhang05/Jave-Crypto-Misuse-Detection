package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzry {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15507b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15508c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15509d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15510e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15511f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15512g;

    public zzry(Uri uri) {
        this(uri, 0);
    }

    public final boolean a(int i2) {
        return (this.f15512g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.f15507b);
        long j2 = this.f15508c;
        long j3 = this.f15509d;
        long j4 = this.f15510e;
        String str = this.f15511f;
        int i2 = this.f15512g;
        StringBuilder sb = new StringBuilder(valueOf.length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    private zzry(Uri uri, int i2) {
        this(uri, 0L, -1L, null, 0);
    }

    public zzry(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    private zzry(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    private zzry(Uri uri, long j2, long j3, long j4, String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public zzry(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        zzsk.a(j2 >= 0);
        zzsk.a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        zzsk.a(z);
        this.a = uri;
        this.f15507b = bArr;
        this.f15508c = j2;
        this.f15509d = j3;
        this.f15510e = j4;
        this.f15511f = str;
        this.f15512g = i2;
    }
}
