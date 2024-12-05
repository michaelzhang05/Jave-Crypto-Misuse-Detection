package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

/* loaded from: classes2.dex */
public final class zaw<O extends Api.ApiOptions> extends GoogleApi<O> {

    /* renamed from: j, reason: collision with root package name */
    private final Api.Client f10748j;

    /* renamed from: k, reason: collision with root package name */
    private final zaq f10749k;
    private final ClientSettings l;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> m;

    public zaw(Context context, Api<O> api, Looper looper, Api.Client client, zaq zaqVar, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.f10748j = client;
        this.f10749k = zaqVar;
        this.l = clientSettings;
        this.m = abstractClientBuilder;
        this.f10537i.g(this);
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final Api.Client i(Looper looper, GoogleApiManager.zaa<O> zaaVar) {
        this.f10749k.a(zaaVar);
        return this.f10748j;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final zace k(Context context, Handler handler) {
        return new zace(context, handler, this.l, this.m);
    }

    public final Api.Client m() {
        return this.f10748j;
    }
}
