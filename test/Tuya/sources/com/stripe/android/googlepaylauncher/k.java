package com.stripe.android.googlepaylauncher;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i6.M;
import kotlin.jvm.functions.Function1;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f23969a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f23970b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f23971c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f23972d;

    public k(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f23969a = aVar;
        this.f23970b = aVar2;
        this.f23971c = aVar3;
        this.f23972d = aVar4;
    }

    public static k a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new k(aVar, aVar2, aVar3, aVar4);
    }

    public static h c(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 function1, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3873c interfaceC3873c) {
        return new h(m8, dVar, eVar, activityResultLauncher, z8, context, function1, paymentAnalyticsRequestFactory, interfaceC3873c);
    }

    public h b(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return c(m8, dVar, eVar, activityResultLauncher, z8, (Context) this.f23969a.get(), (Function1) this.f23970b.get(), (PaymentAnalyticsRequestFactory) this.f23971c.get(), (InterfaceC3873c) this.f23972d.get());
    }
}
