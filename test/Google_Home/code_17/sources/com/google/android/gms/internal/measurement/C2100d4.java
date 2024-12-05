package com.google.android.gms.internal.measurement;

import x0.AbstractC4182q;

/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2100d4 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16603a;

    public C2100d4(InterfaceC2130g4 interfaceC2130g4) {
        w0.h.j(interfaceC2130g4, "BuildInfo must be non-null");
        this.f16603a = !interfaceC2130g4.w();
    }

    public final boolean a(String str) {
        w0.h.j(str, "flagName must not be null");
        if (!this.f16603a) {
            return true;
        }
        return ((AbstractC4182q) AbstractC2120f4.f16636a.get()).b(str);
    }
}
