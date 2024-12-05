package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2205o3 {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC2231r3 f16756a;

    public static synchronized InterfaceC2231r3 a() {
        InterfaceC2231r3 interfaceC2231r3;
        synchronized (AbstractC2205o3.class) {
            try {
                if (f16756a == null) {
                    b(new C2223q3());
                }
                interfaceC2231r3 = f16756a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2231r3;
    }

    private static synchronized void b(InterfaceC2231r3 interfaceC2231r3) {
        synchronized (AbstractC2205o3.class) {
            if (f16756a == null) {
                f16756a = interfaceC2231r3;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
