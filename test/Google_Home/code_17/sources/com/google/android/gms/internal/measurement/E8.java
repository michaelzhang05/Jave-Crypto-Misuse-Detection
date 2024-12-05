package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E8 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16125c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16126d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ X7 f16127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8(X7 x72, boolean z8, boolean z9) {
        super("log");
        this.f16127e = x72;
        this.f16125c = z8;
        this.f16126d = z9;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        F8 f8;
        F8 f82;
        F8 f83;
        AbstractC2128g2.k("log", 1, list);
        if (list.size() == 1) {
            f83 = this.f16127e.f16441c;
            f83.a(y8.INFO, v22.b((InterfaceC2236s) list.get(0)).A(), Collections.emptyList(), this.f16125c, this.f16126d);
            return InterfaceC2236s.f16802b0;
        }
        y8 a8 = y8.a(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()));
        String A8 = v22.b((InterfaceC2236s) list.get(1)).A();
        if (list.size() == 2) {
            f82 = this.f16127e.f16441c;
            f82.a(a8, A8, Collections.emptyList(), this.f16125c, this.f16126d);
            return InterfaceC2236s.f16802b0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < Math.min(list.size(), 5); i8++) {
            arrayList.add(v22.b((InterfaceC2236s) list.get(i8)).A());
        }
        f8 = this.f16127e.f16441c;
        f8.a(a8, A8, arrayList, this.f16125c, this.f16126d);
        return InterfaceC2236s.f16802b0;
    }
}
