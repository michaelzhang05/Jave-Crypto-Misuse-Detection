package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p001authapiphone.zzi;

/* loaded from: classes2.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* renamed from: j, reason: collision with root package name */
    private static final Api.ClientKey<zzi> f10403j;

    /* renamed from: k, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> f10404k;
    private static final Api<Api.ApiOptions.NoOptions> l;

    static {
        Api.ClientKey<zzi> clientKey = new Api.ClientKey<>();
        f10403j = clientKey;
        a aVar = new a();
        f10404k = aVar;
        l = new Api<>("SmsRetriever.API", aVar, clientKey);
    }
}
