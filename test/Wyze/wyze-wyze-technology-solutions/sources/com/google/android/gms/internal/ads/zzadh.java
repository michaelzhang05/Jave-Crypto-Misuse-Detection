package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzadh {
    private final Map<String, zzadg> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final zzadi f12647b;

    public zzadh(zzadi zzadiVar) {
        this.f12647b = zzadiVar;
    }

    public final void a(String str, zzadg zzadgVar) {
        this.a.put(str, zzadgVar);
    }

    public final void b(String str, String str2, long j2) {
        zzadi zzadiVar = this.f12647b;
        zzadg zzadgVar = this.a.get(str2);
        String[] strArr = {str};
        if (zzadiVar != null && zzadgVar != null) {
            zzadiVar.a(zzadgVar, j2, strArr);
        }
        Map<String, zzadg> map = this.a;
        zzadi zzadiVar2 = this.f12647b;
        map.put(str, zzadiVar2 == null ? null : zzadiVar2.c(j2));
    }

    public final zzadi c() {
        return this.f12647b;
    }
}
