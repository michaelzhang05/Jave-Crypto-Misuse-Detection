package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzvi {
    final long a;

    /* renamed from: b, reason: collision with root package name */
    final String f15669b;

    /* renamed from: c, reason: collision with root package name */
    final int f15670c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvi(long j2, String str, int i2) {
        this.a = j2;
        this.f15669b = str;
        this.f15670c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzvi)) {
            zzvi zzviVar = (zzvi) obj;
            if (zzviVar.a == this.a && zzviVar.f15670c == this.f15670c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
