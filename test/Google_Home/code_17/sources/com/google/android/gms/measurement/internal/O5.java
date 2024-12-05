package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O5 implements Z5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I5 f17280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O5(I5 i52) {
        this.f17280a = i52;
    }

    @Override // com.google.android.gms.measurement.internal.Z5
    public final void b(String str, String str2, Bundle bundle) {
        R2 r22;
        R2 r23;
        if (TextUtils.isEmpty(str)) {
            r22 = this.f17280a.f17204l;
            if (r22 != null) {
                r23 = this.f17280a.f17204l;
                r23.c().G().b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.f17280a.e().D(new R5(this, str, str2, bundle));
    }
}
