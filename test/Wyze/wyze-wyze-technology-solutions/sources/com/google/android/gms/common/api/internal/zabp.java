package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
public final class zabp<O extends Api.ApiOptions> extends zaag {

    /* renamed from: c, reason: collision with root package name */
    private final GoogleApi<O> f10700c;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f10700c = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T j(T t) {
        return (T) this.f10700c.c(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T k(T t) {
        return (T) this.f10700c.d(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context n() {
        return this.f10700c.f();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper o() {
        return this.f10700c.h();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void v(zacm zacmVar) {
    }
}
