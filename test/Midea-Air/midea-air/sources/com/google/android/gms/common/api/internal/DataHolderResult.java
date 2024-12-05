package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataHolderResult implements Releasable, Result {

    /* renamed from: f, reason: collision with root package name */
    @KeepForSdk
    protected final Status f10578f;

    /* renamed from: g, reason: collision with root package name */
    @KeepForSdk
    protected final DataHolder f10579g;

    @Override // com.google.android.gms.common.api.Releasable
    @KeepForSdk
    public void a() {
        DataHolder dataHolder = this.f10579g;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status getStatus() {
        return this.f10578f;
    }
}
