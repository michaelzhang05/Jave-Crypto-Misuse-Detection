package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzbin {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13296c;

    private zzbin(int i2, int i3, int i4) {
        this.a = i2;
        this.f13296c = i3;
        this.f13295b = i4;
    }

    public static zzbin b() {
        return new zzbin(0, 0, 0);
    }

    public static zzbin c() {
        return new zzbin(4, 0, 0);
    }

    public static zzbin d() {
        return new zzbin(5, 0, 0);
    }

    public static zzbin i(zzyd zzydVar) {
        if (zzydVar.f15813i) {
            return new zzbin(3, 0, 0);
        }
        if (zzydVar.n) {
            return new zzbin(2, 0, 0);
        }
        if (zzydVar.m) {
            return b();
        }
        return j(zzydVar.f15815k, zzydVar.f15812h);
    }

    public static zzbin j(int i2, int i3) {
        return new zzbin(1, i2, i3);
    }

    public final boolean a() {
        return this.a == 2;
    }

    public final boolean e() {
        return this.a == 3;
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final boolean g() {
        return this.a == 4;
    }

    public final boolean h() {
        return this.a == 5;
    }
}
