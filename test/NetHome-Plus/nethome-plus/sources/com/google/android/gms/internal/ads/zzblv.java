package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblv implements zzbls {
    private zzaxb a;

    public zzblv(zzaxb zzaxbVar) {
        this.a = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void a(Map<String, String> map) {
        this.a.s(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
