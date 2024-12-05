package com.google.android.gms.measurement.internal;

import java.util.Map;
import l0.EnumC3259B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U5 {

    /* renamed from: a, reason: collision with root package name */
    private long f17366a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.D2 f17367b;

    /* renamed from: c, reason: collision with root package name */
    private String f17368c;

    /* renamed from: d, reason: collision with root package name */
    private Map f17369d;

    /* renamed from: e, reason: collision with root package name */
    private EnumC3259B f17370e;

    public final S5 a() {
        return new S5(this.f17366a, this.f17367b, this.f17368c, this.f17369d, this.f17370e);
    }

    public final U5 b(long j8) {
        this.f17366a = j8;
        return this;
    }

    public final U5 c(com.google.android.gms.internal.measurement.D2 d22) {
        this.f17367b = d22;
        return this;
    }

    public final U5 d(String str) {
        this.f17368c = str;
        return this;
    }

    public final U5 e(Map map) {
        this.f17369d = map;
        return this;
    }

    public final U5 f(EnumC3259B enumC3259B) {
        this.f17370e = enumC3259B;
        return this;
    }
}
