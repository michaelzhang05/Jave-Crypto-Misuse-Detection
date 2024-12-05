package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public class SimpleClientAdapter<T extends IInterface> extends GmsClient<T> {

    /* renamed from: d, reason: collision with root package name */
    private final Api.SimpleClient<T> f10885d;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected T createServiceInterface(IBinder iBinder) {
        return this.f10885d.createServiceInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getServiceDescriptor() {
        return this.f10885d.getServiceDescriptor();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return this.f10885d.getStartServiceAction();
    }

    public Api.SimpleClient<T> k() {
        return this.f10885d;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected void onSetConnectState(int i2, T t) {
        this.f10885d.d(i2, t);
    }
}
