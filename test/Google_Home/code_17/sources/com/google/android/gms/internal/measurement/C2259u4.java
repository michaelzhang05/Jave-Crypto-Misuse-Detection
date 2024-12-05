package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2259u4 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC2241s4 abstractC2241s4 = (AbstractC2241s4) obj;
        AbstractC2241s4 abstractC2241s42 = (AbstractC2241s4) obj2;
        InterfaceC2295y4 interfaceC2295y4 = (InterfaceC2295y4) abstractC2241s4.iterator();
        InterfaceC2295y4 interfaceC2295y42 = (InterfaceC2295y4) abstractC2241s42.iterator();
        while (interfaceC2295y4.hasNext() && interfaceC2295y42.hasNext()) {
            int compare = Integer.compare(AbstractC2241s4.e(interfaceC2295y4.w()), AbstractC2241s4.e(interfaceC2295y42.w()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC2241s4.r(), abstractC2241s42.r());
    }
}
