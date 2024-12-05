package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzjq {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15182c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15183d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15185f;

    public zzjq(Uri uri) {
        this(uri, 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j2 = this.f15181b;
        long j3 = this.f15182c;
        long j4 = this.f15183d;
        String str = this.f15184e;
        int i2 = this.f15185f;
        StringBuilder sb = new StringBuilder(valueOf.length() + 91 + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
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

    private zzjq(Uri uri, int i2) {
        this(uri, 0L, -1L, null, 0);
    }

    public zzjq(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, null, 0);
    }

    private zzjq(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    public zzjq(Uri uri, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        zzkh.a(j2 >= 0);
        zzkh.a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        zzkh.a(z);
        this.a = uri;
        this.f15181b = j2;
        this.f15182c = j3;
        this.f15183d = j4;
        this.f15184e = str;
        this.f15185f = i2;
    }
}
