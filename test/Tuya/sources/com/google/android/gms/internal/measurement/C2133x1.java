package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2133x1 extends AbstractC2088r4 implements Z4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2133x1(AbstractC2085r1 abstractC2085r1) {
        super(C2141y1.G());
    }

    public final int o() {
        return ((C2141y1) this.f15876b).C();
    }

    public final C2125w1 p(int i8) {
        return ((C2141y1) this.f15876b).E(i8);
    }

    public final C2133x1 q() {
        m();
        C2141y1.T((C2141y1) this.f15876b);
        return this;
    }

    public final C2133x1 r(int i8, C2117v1 c2117v1) {
        m();
        C2141y1.S((C2141y1) this.f15876b, i8, (C2125w1) c2117v1.k());
        return this;
    }

    public final String s() {
        return ((C2141y1) this.f15876b).N();
    }

    public final List t() {
        return DesugarCollections.unmodifiableList(((C2141y1) this.f15876b).O());
    }

    public final List v() {
        return DesugarCollections.unmodifiableList(((C2141y1) this.f15876b).P());
    }
}
