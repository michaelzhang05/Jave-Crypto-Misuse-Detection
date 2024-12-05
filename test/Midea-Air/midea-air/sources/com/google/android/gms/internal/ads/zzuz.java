package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzuz {
    private final float a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15650b;

    /* renamed from: c, reason: collision with root package name */
    private final float f15651c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15652d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15653e;

    @VisibleForTesting
    public zzuz(float f2, float f3, float f4, float f5, int i2) {
        this.a = f2;
        this.f15650b = f3;
        this.f15651c = f2 + f4;
        this.f15652d = f3 + f5;
        this.f15653e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        return this.f15650b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        return this.f15651c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float d() {
        return this.f15652d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.f15653e;
    }
}
