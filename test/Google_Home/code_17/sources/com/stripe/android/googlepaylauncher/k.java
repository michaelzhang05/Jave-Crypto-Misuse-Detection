package com.stripe.android.googlepaylauncher;

import A2.InterfaceC0945c;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function1;
import l6.M;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f25024a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f25025b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f25026c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f25027d;

    public k(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f25024a = aVar;
        this.f25025b = aVar2;
        this.f25026c = aVar3;
        this.f25027d = aVar4;
    }

    public static k a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new k(aVar, aVar2, aVar3, aVar4);
    }

    public static h c(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 function1, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0945c interfaceC0945c) {
        return new h(m8, dVar, eVar, activityResultLauncher, z8, context, function1, paymentAnalyticsRequestFactory, interfaceC0945c);
    }

    public h b(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return c(m8, dVar, eVar, activityResultLauncher, z8, (Context) this.f25024a.get(), (Function1) this.f25025b.get(), (PaymentAnalyticsRequestFactory) this.f25026c.get(), (InterfaceC0945c) this.f25027d.get());
    }
}
