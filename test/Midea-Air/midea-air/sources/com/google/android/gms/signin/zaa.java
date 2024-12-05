package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* loaded from: classes2.dex */
public final class zaa {
    private static final Api.ClientKey<SignInClientImpl> a;

    /* renamed from: b, reason: collision with root package name */
    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> f16331b;

    /* renamed from: c, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f16332c;

    /* renamed from: d, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<SignInClientImpl, Object> f16333d;

    /* renamed from: e, reason: collision with root package name */
    private static final Scope f16334e;

    /* renamed from: f, reason: collision with root package name */
    private static final Scope f16335f;

    /* renamed from: g, reason: collision with root package name */
    public static final Api<SignInOptions> f16336g;

    /* renamed from: h, reason: collision with root package name */
    private static final Api<Object> f16337h;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        f16331b = clientKey2;
        a aVar = new a();
        f16332c = aVar;
        b bVar = new b();
        f16333d = bVar;
        f16334e = new Scope("profile");
        f16335f = new Scope("email");
        f16336g = new Api<>("SignIn.API", aVar, clientKey);
        f16337h = new Api<>("SignIn.INTERNAL_API", bVar, clientKey2);
    }
}
