package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R2 extends X2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(T2 t22, String str, Double d8, boolean z8) {
        super(t22, "measurement.test.double_flag", d8, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.X2
    final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f15618b + ": " + ((String) obj));
            return null;
        }
    }
}
