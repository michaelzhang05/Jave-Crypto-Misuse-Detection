package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import kotlin.jvm.functions.Function0;
import u5.i;

/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final f f25367a;

    e(f fVar) {
        this.f25367a = fVar;
    }

    public static i b(f fVar) {
        return u5.f.a(new e(fVar));
    }

    @Override // com.stripe.android.payments.paymentlauncher.d
    public c a(Function0 function0, Function0 function02, Integer num, boolean z8, ActivityResultLauncher activityResultLauncher) {
        return this.f25367a.b(function0, function02, activityResultLauncher, num, z8);
    }
}
