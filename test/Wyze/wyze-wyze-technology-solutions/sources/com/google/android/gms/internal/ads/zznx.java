package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zznx {
    public final int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15350b;

    public zznx(int i2, byte[] bArr) {
        this.f15350b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznx.class == obj.getClass()) {
            zznx zznxVar = (zznx) obj;
            if (this.a == zznxVar.a && Arrays.equals(this.f15350b, zznxVar.f15350b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + Arrays.hashCode(this.f15350b);
    }
}
