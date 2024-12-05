package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzkt {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f15230b;

    /* renamed from: c, reason: collision with root package name */
    private static final UUID f15231c;

    /* renamed from: d, reason: collision with root package name */
    private static final UUID f15232d;

    /* renamed from: e, reason: collision with root package name */
    private static final UUID f15233e;

    static {
        a = zzsy.a < 23 ? 1020 : 6396;
        f15230b = new UUID(0L, 0L);
        f15231c = new UUID(1186680826959645954L, -5988876978535335093L);
        f15232d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f15233e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 / 1000;
    }

    public static long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 * 1000;
    }
}
