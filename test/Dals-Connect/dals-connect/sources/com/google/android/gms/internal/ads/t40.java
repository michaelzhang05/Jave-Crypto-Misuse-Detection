package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class t40 implements Comparator<zzvi> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t40(zzvb zzvbVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzvi zzviVar, zzvi zzviVar2) {
        zzvi zzviVar3 = zzviVar;
        zzvi zzviVar4 = zzviVar2;
        int i2 = zzviVar3.f15670c - zzviVar4.f15670c;
        return i2 != 0 ? i2 : (int) (zzviVar3.a - zzviVar4.a);
    }
}
