package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2025j4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C2025j4 f15742b;

    /* renamed from: c, reason: collision with root package name */
    static final C2025j4 f15743c = new C2025j4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f15744a = Collections.emptyMap();

    C2025j4(boolean z8) {
    }

    public static C2025j4 a() {
        C2025j4 c2025j4 = f15742b;
        if (c2025j4 != null) {
            return c2025j4;
        }
        synchronized (C2025j4.class) {
            try {
                C2025j4 c2025j42 = f15742b;
                if (c2025j42 != null) {
                    return c2025j42;
                }
                C2025j4 a8 = AbstractC2073p4.a(C2025j4.class);
                f15742b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2096s4 b(Y4 y42, int i8) {
        android.support.v4.media.a.a(this.f15744a.get(new C2017i4(y42, i8)));
        return null;
    }
}
