package com.stripe.android.paymentsheet.analytics;

import A2.InterfaceC0945c;
import D2.d;
import S5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import x5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f26800a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f26801b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f26802c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f26803d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f26804e;

    public b(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f26800a = aVar;
        this.f26801b = aVar2;
        this.f26802c = aVar3;
        this.f26803d = aVar4;
        this.f26804e = aVar5;
    }

    public static b a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a c(EventReporter.Mode mode, InterfaceC0945c interfaceC0945c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d dVar, g gVar) {
        return new a(mode, interfaceC0945c, paymentAnalyticsRequestFactory, dVar, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((EventReporter.Mode) this.f26800a.get(), (InterfaceC0945c) this.f26801b.get(), (PaymentAnalyticsRequestFactory) this.f26802c.get(), (d) this.f26803d.get(), (g) this.f26804e.get());
    }
}
