package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.safetynet.SafetyNet;

/* loaded from: classes2.dex */
abstract class a<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzx> {
    public a(GoogleApiClient googleApiClient) {
        super(SafetyNet.f16300c, googleApiClient);
    }
}
