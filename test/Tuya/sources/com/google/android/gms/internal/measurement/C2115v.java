package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2115v implements Iterable, r {

    /* renamed from: a, reason: collision with root package name */
    private final String f15916a;

    public C2115v(String str) {
        if (str != null) {
            this.f15916a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2115v(this.f15916a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2115v)) {
            return false;
        }
        return this.f15916a.equals(((C2115v) obj).f15916a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        if (this.f15916a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f15916a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return this.f15916a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.valueOf(!this.f15916a.isEmpty());
    }

    public final int hashCode() {
        return this.f15916a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return new C2099t(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2107u(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0179. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032f  */
    @Override // com.google.android.gms.internal.measurement.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r m(java.lang.String r20, com.google.android.gms.internal.measurement.T1 r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2115v.m(java.lang.String, com.google.android.gms.internal.measurement.T1, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    public final String toString() {
        return "\"" + this.f15916a + "\"";
    }
}
