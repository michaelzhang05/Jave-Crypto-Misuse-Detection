package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2261u6;
import java.util.Map;

/* loaded from: classes3.dex */
final class L2 implements InterfaceC2261u6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17243a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ E2 f17244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(E2 e22, String str) {
        this.f17243a = str;
        this.f17244b = e22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2261u6
    public final String c(String str) {
        Map map;
        map = this.f17244b.f17011d;
        Map map2 = (Map) map.get(this.f17243a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
