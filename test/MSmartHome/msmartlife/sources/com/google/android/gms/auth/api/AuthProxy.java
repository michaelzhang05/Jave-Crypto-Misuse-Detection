package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
/* loaded from: classes2.dex */
public final class AuthProxy {
    private static final Api.ClientKey<zzak> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> f10334b;

    /* renamed from: c, reason: collision with root package name */
    @KeepForSdk
    public static final Api<AuthProxyOptions> f10335c;

    /* renamed from: d, reason: collision with root package name */
    @KeepForSdk
    public static final ProxyApi f10336d;

    static {
        Api.ClientKey<zzak> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f10334b = aVar;
        f10335c = new Api<>("Auth.PROXY_API", aVar, clientKey);
        f10336d = new zzar();
    }
}
