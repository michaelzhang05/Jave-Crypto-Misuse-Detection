package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F5;
import java.util.Map;

/* loaded from: classes3.dex */
final class R1 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16265a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S1 f16266b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(S1 s12, String str) {
        this.f16266b = s12;
        this.f16265a = str;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final String a(String str) {
        Map map;
        map = this.f16266b.f16272d;
        Map map2 = (Map) map.get(this.f16265a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
