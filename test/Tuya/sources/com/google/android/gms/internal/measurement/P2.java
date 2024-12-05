package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P2 extends X2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(T2 t22, String str, Long l8, boolean z8) {
        super(t22, str, l8, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.X2
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f15618b + ": " + ((String) obj));
            return null;
        }
    }
}
