package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class Common {

    @KeepForSdk
    public static final Api.ClientKey<zai> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> f10909b;

    /* renamed from: c, reason: collision with root package name */
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> f10910c;

    /* renamed from: d, reason: collision with root package name */
    public static final zac f10911d;

    static {
        Api.ClientKey<zai> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f10909b = aVar;
        f10910c = new Api<>("Common.API", aVar, clientKey);
        f10911d = new zad();
    }
}
