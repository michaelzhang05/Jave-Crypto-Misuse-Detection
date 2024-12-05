package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final /* synthetic */ class i4 implements r4 {
    static final r4 a = new i4();

    private i4() {
    }

    @Override // com.google.android.gms.internal.ads.r4
    public final Object a(zzbjf zzbjfVar) {
        String z2 = zzbjfVar.z2();
        if (z2 != null) {
            return z2;
        }
        String W4 = zzbjfVar.W4();
        return W4 != null ? W4 : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
