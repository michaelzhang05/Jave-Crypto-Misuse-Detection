package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzadj extends zzadm {

    /* renamed from: f, reason: collision with root package name */
    private final zzf f12652f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12653g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12654h;

    public zzadj(zzf zzfVar, String str, String str2) {
        this.f12652f = zzfVar;
        this.f12653g = str;
        this.f12654h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String d6() {
        return this.f12653g;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String getContent() {
        return this.f12654h;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void o1(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.f12652f.zzg((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordClick() {
        this.f12652f.zzky();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordImpression() {
        this.f12652f.zzkz();
    }
}
