package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    /* renamed from: f, reason: collision with root package name */
    public static final SignInOptions f16313f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16314g = false;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16315h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String f16316i = null;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16317j = false;
    private final boolean l = false;

    /* renamed from: k, reason: collision with root package name */
    private final String f16318k = null;
    private final Long m = null;
    private final Long n = null;

    /* loaded from: classes2.dex */
    public static final class zaa {
    }

    static {
        new zaa();
        f16313f = new SignInOptions(false, false, null, false, null, false, null, null);
    }

    private SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.m;
    }

    public final String b() {
        return this.f16318k;
    }

    public final Long c() {
        return this.n;
    }

    public final String d() {
        return this.f16316i;
    }

    public final boolean e() {
        return this.f16317j;
    }

    public final boolean g() {
        return this.f16315h;
    }

    public final boolean h() {
        return this.f16314g;
    }

    public final boolean i() {
        return this.l;
    }
}
