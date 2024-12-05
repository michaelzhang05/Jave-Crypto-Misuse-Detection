package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.eu;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class h0 implements Comparator<zzte> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzte zzteVar, zzte zzteVar2) {
        int a;
        int a2;
        zzte zzteVar3 = zzteVar;
        zzte zzteVar4 = zzteVar2;
        zztl zztlVar = (zztl) zzteVar3.iterator();
        zztl zztlVar2 = (zztl) zzteVar4.iterator();
        while (zztlVar.hasNext() && zztlVar2.hasNext()) {
            a = zzte.a(zztlVar.b());
            a2 = zzte.a(zztlVar2.b());
            int a3 = eu.a(a, a2);
            if (a3 != 0) {
                return a3;
            }
        }
        return eu.a(zzteVar3.size(), zzteVar4.size());
    }
}
