package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class H8 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f16147c;

    public H8(String str, Callable callable) {
        super(str);
        this.f16147c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        try {
            return AbstractC2070a4.b(this.f16147c.call());
        } catch (Exception unused) {
            return InterfaceC2236s.f16802b0;
        }
    }
}
