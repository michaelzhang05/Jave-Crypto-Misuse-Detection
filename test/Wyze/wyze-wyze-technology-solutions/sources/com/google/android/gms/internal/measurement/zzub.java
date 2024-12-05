package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzub {
    private static final Class<?> a = a();

    /* renamed from: b, reason: collision with root package name */
    static final zzub f16116b = new zzub(true);

    /* renamed from: c, reason: collision with root package name */
    private final Map<?, zzuo.zzd<?, ?>> f16117c;

    zzub() {
        this.f16117c = new HashMap();
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzub b() {
        return u0.c();
    }

    private zzub(boolean z) {
        this.f16117c = Collections.emptyMap();
    }
}
