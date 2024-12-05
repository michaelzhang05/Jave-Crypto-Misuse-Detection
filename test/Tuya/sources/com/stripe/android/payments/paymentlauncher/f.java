package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f25368a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f25369b;

    public f(I5.a aVar, I5.a aVar2) {
        this.f25368a = aVar;
        this.f25369b = aVar2;
    }

    public static f a(I5.a aVar, I5.a aVar2) {
        return new f(aVar, aVar2);
    }

    public static c c(Function0 function0, Function0 function02, ActivityResultLauncher activityResultLauncher, Integer num, boolean z8, boolean z9, Set set) {
        return new c(function0, function02, activityResultLauncher, num, z8, z9, set);
    }

    public c b(Function0 function0, Function0 function02, ActivityResultLauncher activityResultLauncher, Integer num, boolean z8) {
        return c(function0, function02, activityResultLauncher, num, z8, ((Boolean) this.f25368a.get()).booleanValue(), (Set) this.f25369b.get());
    }
}
