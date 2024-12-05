package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;
import l0.EnumC3259B;

/* loaded from: classes3.dex */
final class G5 {

    /* renamed from: a, reason: collision with root package name */
    private String f17048a;

    /* renamed from: b, reason: collision with root package name */
    private Map f17049b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3259B f17050c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G5(String str, EnumC3259B enumC3259B) {
        this.f17048a = str;
        this.f17050c = enumC3259B;
    }

    public final EnumC3259B a() {
        return this.f17050c;
    }

    public final String b() {
        return this.f17048a;
    }

    public final Map c() {
        Map map = this.f17049b;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G5(String str, Map map, EnumC3259B enumC3259B) {
        this.f17048a = str;
        this.f17049b = map;
        this.f17050c = enumC3259B;
    }
}
