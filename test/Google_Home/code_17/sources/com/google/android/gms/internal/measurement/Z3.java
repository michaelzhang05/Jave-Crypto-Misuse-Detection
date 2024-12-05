package com.google.android.gms.internal.measurement;

import android.net.Uri;
import w0.InterfaceC4120c;

/* loaded from: classes3.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    final String f16526a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f16527b;

    /* renamed from: c, reason: collision with root package name */
    final String f16528c;

    /* renamed from: d, reason: collision with root package name */
    final String f16529d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16530e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16531f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16532g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f16533h;

    /* renamed from: i, reason: collision with root package name */
    final InterfaceC4120c f16534i;

    public Z3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final R3 a(String str, double d8) {
        return R3.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final R3 b(String str, long j8) {
        return R3.c(this, str, Long.valueOf(j8), true);
    }

    public final R3 c(String str, String str2) {
        return R3.d(this, str, str2, true);
    }

    public final R3 d(String str, boolean z8) {
        return R3.a(this, str, Boolean.valueOf(z8), true);
    }

    public final Z3 e() {
        return new Z3(this.f16526a, this.f16527b, this.f16528c, this.f16529d, this.f16530e, this.f16531f, true, this.f16533h, this.f16534i);
    }

    public final Z3 f() {
        if (this.f16528c.isEmpty()) {
            InterfaceC4120c interfaceC4120c = this.f16534i;
            if (interfaceC4120c == null) {
                return new Z3(this.f16526a, this.f16527b, this.f16528c, this.f16529d, true, this.f16531f, this.f16532g, this.f16533h, interfaceC4120c);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private Z3(String str, Uri uri, String str2, String str3, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC4120c interfaceC4120c) {
        this.f16526a = str;
        this.f16527b = uri;
        this.f16528c = str2;
        this.f16529d = str3;
        this.f16530e = z8;
        this.f16531f = z9;
        this.f16532g = z10;
        this.f16533h = z11;
        this.f16534i = interfaceC4120c;
    }
}
