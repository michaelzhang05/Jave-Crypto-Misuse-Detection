package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2056n3 {
    public static InterfaceC2016i3 a(InterfaceC2016i3 interfaceC2016i3) {
        if (!(interfaceC2016i3 instanceof C2040l3) && !(interfaceC2016i3 instanceof C2024j3)) {
            if (interfaceC2016i3 instanceof Serializable) {
                return new C2024j3(interfaceC2016i3);
            }
            return new C2040l3(interfaceC2016i3);
        }
        return interfaceC2016i3;
    }

    public static InterfaceC2016i3 b(Object obj) {
        return new C2048m3(obj);
    }
}
