package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M2 implements x4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y2 f16224a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(Y2 y22) {
        this.f16224a = y22;
    }

    @Override // com.google.android.gms.measurement.internal.x4
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f16224a.t("auto", "_err", bundle, str);
        } else {
            this.f16224a.r("auto", "_err", bundle);
        }
    }
}
