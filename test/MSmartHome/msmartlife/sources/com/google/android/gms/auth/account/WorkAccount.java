package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* loaded from: classes2.dex */
public class WorkAccount {
    private static final Api.ClientKey<zzr> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> f10319b;

    /* renamed from: c, reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f10320c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final WorkAccountApi f10321d;

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f10319b = aVar;
        f10320c = new Api<>("WorkAccount.API", aVar, clientKey);
        f10321d = new zzh();
    }

    private WorkAccount() {
    }
}
