package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2292z1 extends AbstractC2190f4 {
    public C2292z1(r4 r4Var) {
        super(r4Var);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16777a.c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
