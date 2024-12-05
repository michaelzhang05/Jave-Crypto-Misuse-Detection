package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.internal.safetynet.zzy;

/* loaded from: classes2.dex */
public final class SafetyNet {
    private static final Api.ClientKey<zzx> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> f16299b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> f16300c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final SafetyNetApi f16301d;

    /* renamed from: e, reason: collision with root package name */
    private static final zzo f16302e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.safetynet.zzy, com.google.android.gms.safetynet.zzo] */
    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        f16299b = aVar;
        f16300c = new Api<>("SafetyNet.API", aVar, clientKey);
        f16301d = new zzk();
        f16302e = new zzy();
    }

    private SafetyNet() {
    }

    public static SafetyNetClient a(Context context) {
        return new SafetyNetClient(context);
    }
}
