package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zai<O extends Api.ApiOptions> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10729b;

    /* renamed from: c, reason: collision with root package name */
    private final Api<O> f10730c;

    /* renamed from: d, reason: collision with root package name */
    private final O f10731d;

    private zai(Api<O> api, O o) {
        this.a = false;
        this.f10730c = api;
        this.f10731d = o;
        this.f10729b = Objects.b(api, o);
    }

    public static <O extends Api.ApiOptions> zai<O> a(Api<O> api) {
        return new zai<>(api);
    }

    public static <O extends Api.ApiOptions> zai<O> b(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    public final String c() {
        return this.f10730c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zaiVar = (zai) obj;
        return !this.a && !zaiVar.a && Objects.a(this.f10730c, zaiVar.f10730c) && Objects.a(this.f10731d, zaiVar.f10731d);
    }

    public final int hashCode() {
        return this.f10729b;
    }

    private zai(Api<O> api) {
        this.a = true;
        this.f10730c = api;
        this.f10731d = null;
        this.f10729b = System.identityHashCode(this);
    }
}
