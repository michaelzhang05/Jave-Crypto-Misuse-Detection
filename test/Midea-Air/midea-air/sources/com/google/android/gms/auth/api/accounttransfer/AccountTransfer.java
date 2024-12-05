package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class AccountTransfer {
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> f10338b;

    /* renamed from: c, reason: collision with root package name */
    private static final Api<zzn> f10339c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final zzb f10340d;

    /* renamed from: e, reason: collision with root package name */
    private static final zzq f10341e;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzq] */
    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f10338b = aVar;
        f10339c = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", aVar, clientKey);
        f10340d = new com.google.android.gms.internal.auth.zzt();
        f10341e = new com.google.android.gms.internal.auth.zzt();
    }

    private AccountTransfer() {
    }
}
