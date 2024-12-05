package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbk;

/* loaded from: classes2.dex */
public class LocationServices {
    private static final Api.ClientKey<zzaz> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f16248b;

    /* renamed from: c, reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f16249c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final FusedLocationProviderApi f16250d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final GeofencingApi f16251e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final SettingsApi f16252f;

    /* loaded from: classes2.dex */
    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        a = clientKey;
        b bVar = new b();
        f16248b = bVar;
        f16249c = new Api<>("LocationServices.API", bVar, clientKey);
        f16250d = new com.google.android.gms.internal.location.zzq();
        f16251e = new com.google.android.gms.internal.location.zzaf();
        f16252f = new zzbk();
    }

    private LocationServices() {
    }
}
