package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

/* loaded from: classes2.dex */
public class ActivityRecognition {
    private static final Api.ClientKey<zzaz> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f16200b;

    /* renamed from: c, reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f16201c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ActivityRecognitionApi f16202d;

    /* loaded from: classes2.dex */
    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f16200b = aVar;
        f16201c = new Api<>("ActivityRecognition.API", aVar, clientKey);
        f16202d = new zze();
    }

    private ActivityRecognition() {
    }
}
