package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15840f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15841g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zza(IBinder iBinder, String str) {
        this.f15840f = iBinder;
        this.f15841g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15840f;
    }
}
