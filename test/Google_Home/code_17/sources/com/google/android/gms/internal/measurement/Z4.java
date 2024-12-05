package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    private Map f16535a = new HashMap();

    public final InterfaceC2236s a(String str) {
        if (this.f16535a.containsKey(str)) {
            try {
                return (InterfaceC2236s) ((Callable) this.f16535a.get(str)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return InterfaceC2236s.f16802b0;
    }

    public final void b(String str, Callable callable) {
        this.f16535a.put(str, callable);
    }
}
