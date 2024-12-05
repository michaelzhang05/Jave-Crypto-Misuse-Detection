package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes3.dex */
public final class A7 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2003g7 f15254c;

    public A7(InterfaceC2003g7 interfaceC2003g7) {
        super("internal.logger");
        this.f15254c = interfaceC2003g7;
        this.f15750b.put("log", new z7(this, false, true));
        this.f15750b.put(NotificationCompat.GROUP_KEY_SILENT, new C1984e6(this, NotificationCompat.GROUP_KEY_SILENT));
        ((AbstractC2028k) this.f15750b.get(NotificationCompat.GROUP_KEY_SILENT)).l("log", new z7(this, true, true));
        this.f15750b.put("unmonitored", new F6(this, "unmonitored"));
        ((AbstractC2028k) this.f15750b.get("unmonitored")).l("log", new z7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        return r.f15866c0;
    }
}
