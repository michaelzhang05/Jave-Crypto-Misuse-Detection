package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzh implements zzac {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f15088b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15089c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15090d;

    public zzh() {
        this(2500, 1, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final void a(zzaf zzafVar) throws zzaf {
        int i2 = this.f15088b + 1;
        this.f15088b = i2;
        int i3 = this.a;
        this.a = i3 + ((int) (i3 * this.f15090d));
        if (!(i2 <= this.f15089c)) {
            throw zzafVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final int g() {
        return this.f15088b;
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final int l0() {
        return this.a;
    }

    private zzh(int i2, int i3, float f2) {
        this.a = 2500;
        this.f15089c = 1;
        this.f15090d = 1.0f;
    }
}
