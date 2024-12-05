package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class fu implements Comparator<zzdmr> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdmr zzdmrVar, zzdmr zzdmrVar2) {
        int L;
        int L2;
        zzdmr zzdmrVar3 = zzdmrVar;
        zzdmr zzdmrVar4 = zzdmrVar2;
        zzdmy zzdmyVar = (zzdmy) zzdmrVar3.iterator();
        zzdmy zzdmyVar2 = (zzdmy) zzdmrVar4.iterator();
        while (zzdmyVar.hasNext() && zzdmyVar2.hasNext()) {
            L = zzdmr.L(zzdmyVar.b());
            L2 = zzdmr.L(zzdmyVar2.b());
            int a = eu.a(L, L2);
            if (a != 0) {
                return a;
            }
        }
        return eu.a(zzdmrVar3.size(), zzdmrVar4.size());
    }
}
