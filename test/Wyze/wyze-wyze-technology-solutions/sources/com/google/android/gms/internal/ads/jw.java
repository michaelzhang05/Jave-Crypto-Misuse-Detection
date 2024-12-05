package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jw implements yv {
    private final zzdpk a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11666b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f11667c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11668d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jw(zzdpk zzdpkVar, String str, Object[] objArr) {
        this.a = zzdpkVar;
        this.f11666b = str;
        this.f11667c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11668d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f11668d = i2 | (charAt2 << i3);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yv
    public final boolean a() {
        return (this.f11668d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.yv
    public final zzdpk b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.yv
    public final int c() {
        return (this.f11668d & 1) == 1 ? zzdob.zze.f14852i : zzdob.zze.f14853j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.f11666b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f11667c;
    }
}
