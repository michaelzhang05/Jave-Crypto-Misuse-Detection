package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractC2192n f16164a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V2 f16165b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(AbstractC2192n abstractC2192n, V2 v22) {
        this.f16164a = abstractC2192n;
        this.f16165b = v22;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2236s interfaceC2236s = (InterfaceC2236s) obj;
        InterfaceC2236s interfaceC2236s2 = (InterfaceC2236s) obj2;
        AbstractC2192n abstractC2192n = this.f16164a;
        V2 v22 = this.f16165b;
        if (interfaceC2236s instanceof C2299z) {
            if (interfaceC2236s2 instanceof C2299z) {
                return 0;
            }
            return 1;
        }
        if (interfaceC2236s2 instanceof C2299z) {
            return -1;
        }
        if (abstractC2192n == null) {
            return interfaceC2236s.A().compareTo(interfaceC2236s2.A());
        }
        return (int) AbstractC2128g2.a(abstractC2192n.a(v22, Arrays.asList(interfaceC2236s, interfaceC2236s2)).z().doubleValue());
    }
}
