package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2334d4 implements Z5 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A3 f17552a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2334d4(A3 a32) {
        this.f17552a = a32;
    }

    @Override // com.google.android.gms.measurement.internal.Z5
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f17552a.g0("auto", str2, bundle, str);
        } else {
            this.f17552a.T0("auto", str2, bundle);
        }
    }
}
