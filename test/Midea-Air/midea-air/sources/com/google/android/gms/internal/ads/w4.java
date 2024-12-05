package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w4 extends zzawv {
    private final /* synthetic */ zzawm a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(zzawm zzawmVar) {
        this.a = zzawmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        Context context;
        zzbai zzbaiVar;
        Object obj;
        zzacy zzacyVar;
        context = this.a.f13045f;
        zzbaiVar = this.a.f13046g;
        zzacx zzacxVar = new zzacx(context, zzbaiVar.f13150f);
        obj = this.a.a;
        synchronized (obj) {
            try {
                zzk.zzlp();
                zzacyVar = this.a.f13047h;
                zzada.a(zzacyVar, zzacxVar);
            } catch (IllegalArgumentException e2) {
                zzbad.d("Cannot config CSI reporter.", e2);
            }
        }
    }
}
