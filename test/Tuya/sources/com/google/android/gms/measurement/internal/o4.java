package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o4 implements x4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r4 f16720a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4(r4 r4Var) {
        this.f16720a = r4Var;
    }

    @Override // com.google.android.gms.measurement.internal.x4
    public final void a(String str, String str2, Bundle bundle) {
        Y1 y12;
        Y1 y13;
        if (TextUtils.isEmpty(str)) {
            r4 r4Var = this.f16720a;
            y12 = r4Var.f16797l;
            if (y12 != null) {
                y13 = r4Var.f16797l;
                y13.d().r().b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f16720a.f().z(new n4(this, str, "_err", bundle));
    }
}
