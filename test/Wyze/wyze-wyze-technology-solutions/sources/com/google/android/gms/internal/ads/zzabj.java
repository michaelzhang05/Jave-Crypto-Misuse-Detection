package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@zzard
/* loaded from: classes2.dex */
public final class zzabj extends zzaal {

    /* renamed from: f, reason: collision with root package name */
    private final String f12600f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12601g;

    public zzabj(String str, String str2) {
        this.f12600f = str;
        this.f12601g = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String Q1() throws RemoteException {
        return this.f12601g;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String getDescription() throws RemoteException {
        return this.f12600f;
    }
}
