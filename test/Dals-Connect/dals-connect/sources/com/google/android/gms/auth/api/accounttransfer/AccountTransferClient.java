package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes2.dex */
public class AccountTransferClient extends GoogleApi<zzn> {

    /* renamed from: j, reason: collision with root package name */
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> f10342j;

    /* renamed from: k, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> f10343k;
    private static final Api<zzn> l;

    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        f10342j = clientKey;
        b bVar = new b();
        f10343k = bVar;
        l = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", bVar, clientKey);
    }
}
