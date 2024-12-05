package com.google.android.gms.measurement.internal;

import O.AbstractC1268l;
import R.AbstractC1306c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m0.InterfaceC3391d;

/* renamed from: com.google.android.gms.measurement.internal.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2248q1 extends AbstractC1306c {
    public C2248q1(Context context, Looper looper, AbstractC1306c.a aVar, AbstractC1306c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return AbstractC1268l.f7671a;
    }

    @Override // R.AbstractC1306c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC3391d) {
            return (InterfaceC3391d) queryLocalInterface;
        }
        return new C2223l1(iBinder);
    }
}
