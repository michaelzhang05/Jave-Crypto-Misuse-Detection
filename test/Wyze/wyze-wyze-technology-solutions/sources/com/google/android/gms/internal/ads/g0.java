package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class g0 implements zzaho<Object> {
    @Override // com.google.android.gms.internal.ads.zzaho
    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        zzbad.h(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
