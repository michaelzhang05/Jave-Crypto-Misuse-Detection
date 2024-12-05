package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzln {
    public static final zzln a = new zzln(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f15254b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15255c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15256d;

    public zzln(float f2, float f3) {
        this.f15254b = f2;
        this.f15255c = f3;
        this.f15256d = Math.round(f2 * 1000.0f);
    }

    public final long a(long j2) {
        return j2 * this.f15256d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzln.class == obj.getClass()) {
            zzln zzlnVar = (zzln) obj;
            if (this.f15254b == zzlnVar.f15254b && this.f15255c == zzlnVar.f15255c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f15254b) + 527) * 31) + Float.floatToRawIntBits(this.f15255c);
    }
}
