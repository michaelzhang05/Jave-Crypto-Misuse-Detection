package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p000authapi.zzi;
import com.google.android.gms.internal.p000authapi.zzr;

/* loaded from: classes2.dex */
public final class Auth {
    public static final Api.ClientKey<zzr> a;

    /* renamed from: b, reason: collision with root package name */
    public static final Api.ClientKey<zzg> f10322b;

    /* renamed from: c, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzr, AuthCredentialsOptions> f10323c;

    /* renamed from: d, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzg, GoogleSignInOptions> f10324d;

    /* renamed from: e, reason: collision with root package name */
    @KeepForSdk
    @Deprecated
    public static final Api<AuthProxyOptions> f10325e;

    /* renamed from: f, reason: collision with root package name */
    public static final Api<AuthCredentialsOptions> f10326f;

    /* renamed from: g, reason: collision with root package name */
    public static final Api<GoogleSignInOptions> f10327g;

    /* renamed from: h, reason: collision with root package name */
    @KeepForSdk
    @Deprecated
    public static final ProxyApi f10328h;

    /* renamed from: i, reason: collision with root package name */
    public static final CredentialsApi f10329i;

    /* renamed from: j, reason: collision with root package name */
    public static final GoogleSignInApi f10330j;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {

        /* renamed from: f, reason: collision with root package name */
        private static final AuthCredentialsOptions f10331f = new Builder().a();

        /* renamed from: g, reason: collision with root package name */
        private final String f10332g = null;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f10333h;

        @Deprecated
        /* loaded from: classes2.dex */
        public static class Builder {
            protected Boolean a = Boolean.FALSE;

            public AuthCredentialsOptions a() {
                return new AuthCredentialsOptions(this);
            }
        }

        public AuthCredentialsOptions(Builder builder) {
            this.f10333h = builder.a.booleanValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f10333h);
            return bundle;
        }
    }

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        a = clientKey;
        Api.ClientKey<zzg> clientKey2 = new Api.ClientKey<>();
        f10322b = clientKey2;
        b bVar = new b();
        f10323c = bVar;
        c cVar = new c();
        f10324d = cVar;
        f10325e = AuthProxy.f10335c;
        f10326f = new Api<>("Auth.CREDENTIALS_API", bVar, clientKey);
        f10327g = new Api<>("Auth.GOOGLE_SIGN_IN_API", cVar, clientKey2);
        f10328h = AuthProxy.f10336d;
        f10329i = new zzi();
        f10330j = new zzf();
    }

    private Auth() {
    }
}
