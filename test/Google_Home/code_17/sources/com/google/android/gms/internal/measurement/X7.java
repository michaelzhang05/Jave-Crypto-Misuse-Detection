package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes3.dex */
public final class X7 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private final F8 f16441c;

    public X7(F8 f8) {
        super("internal.logger");
        this.f16441c = f8;
        this.f16732b.put("log", new E8(this, false, true));
        this.f16732b.put(NotificationCompat.GROUP_KEY_SILENT, new C2280w7(this, NotificationCompat.GROUP_KEY_SILENT));
        ((AbstractC2192n) this.f16732b.get(NotificationCompat.GROUP_KEY_SILENT)).j("log", new E8(this, true, true));
        this.f16732b.put("unmonitored", new D8(this, "unmonitored"));
        ((AbstractC2192n) this.f16732b.get("unmonitored")).j("log", new E8(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        return InterfaceC2236s.f16802b0;
    }
}
