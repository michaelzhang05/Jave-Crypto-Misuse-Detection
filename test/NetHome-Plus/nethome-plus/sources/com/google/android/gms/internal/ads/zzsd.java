package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzsd {
    private final Map<String, String> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f15534b;

    public final synchronized Map<String, String> a() {
        if (this.f15534b == null) {
            this.f15534b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.f15534b;
    }
}
