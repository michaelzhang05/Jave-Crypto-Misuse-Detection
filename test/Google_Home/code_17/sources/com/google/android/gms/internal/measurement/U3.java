package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U3 extends R3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public U3(Z3 z32, String str, Boolean bool, boolean z8) {
        super(z32, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.R3
    final /* synthetic */ Object g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (AbstractC2214p3.f16765c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (AbstractC2214p3.f16766d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
