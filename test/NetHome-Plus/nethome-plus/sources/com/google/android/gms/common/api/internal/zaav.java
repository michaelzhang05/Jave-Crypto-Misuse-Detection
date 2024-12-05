package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zaav implements zabd {
    private final zabe a;

    public zaav(zabe zabeVar) {
        this.a = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void C(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void R(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T S(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T T(T t) {
        this.a.s.f10691i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void a() {
        this.a.i();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void d() {
        Iterator<Api.Client> it = this.a.f10699k.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.a.s.q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void u(int i2) {
    }
}
