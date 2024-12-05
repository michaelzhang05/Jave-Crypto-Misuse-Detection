package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q2 extends X2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(T2 t22, String str, Boolean bool, boolean z8) {
        super(t22, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.X2
    final /* synthetic */ Object a(Object obj) {
        if (AbstractC2118v2.f15923c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC2118v2.f15924d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f15618b + ": " + ((String) obj));
        return null;
    }
}
