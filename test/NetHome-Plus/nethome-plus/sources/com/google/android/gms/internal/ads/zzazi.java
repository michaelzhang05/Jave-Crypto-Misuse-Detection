package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzazi extends zzawv {
    private final zzbah a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13122b;

    public zzazi(Context context, String str, String str2) {
        this(str2, zzk.zzlg().g0(context, str));
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        this.a.a(this.f13122b);
    }

    private zzazi(String str, String str2) {
        this.a = new zzbah(str2);
        this.f13122b = str;
    }
}
