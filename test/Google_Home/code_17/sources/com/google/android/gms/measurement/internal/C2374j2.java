package com.google.android.gms.measurement.internal;

import N.AbstractC1341l;
import Q.AbstractC1387c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import l0.InterfaceC3272g;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2374j2 extends AbstractC1387c {
    public C2374j2(Context context, Looper looper, AbstractC1387c.a aVar, AbstractC1387c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return AbstractC1341l.f7472a;
    }

    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC3272g) {
            return (InterfaceC3272g) queryLocalInterface;
        }
        return new C2339e2(iBinder);
    }
}
