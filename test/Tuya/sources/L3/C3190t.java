package l3;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f3.C2660a;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import x2.InterfaceC3873c;

/* renamed from: l3.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3190t implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33989a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33990b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f33991c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f33992d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f33993e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f33994f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f33995g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.a f33996h;

    /* renamed from: i, reason: collision with root package name */
    private final I5.a f33997i;

    /* renamed from: j, reason: collision with root package name */
    private final I5.a f33998j;

    public C3190t(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        this.f33989a = aVar;
        this.f33990b = aVar2;
        this.f33991c = aVar3;
        this.f33992d = aVar4;
        this.f33993e = aVar5;
        this.f33994f = aVar6;
        this.f33995g = aVar7;
        this.f33996h = aVar8;
        this.f33997i = aVar9;
        this.f33998j = aVar10;
    }

    public static C3190t a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        return new C3190t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static C3189s c(Function1 function1, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, P5.g gVar, Map map, Function0 function0, boolean z9, C2660a c2660a, InterfaceC3181k interfaceC3181k) {
        return new C3189s(function1, interfaceC3873c, paymentAnalyticsRequestFactory, z8, gVar, map, function0, z9, c2660a, interfaceC3181k);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3189s get() {
        return c((Function1) this.f33989a.get(), (InterfaceC3873c) this.f33990b.get(), (PaymentAnalyticsRequestFactory) this.f33991c.get(), ((Boolean) this.f33992d.get()).booleanValue(), (P5.g) this.f33993e.get(), (Map) this.f33994f.get(), (Function0) this.f33995g.get(), ((Boolean) this.f33996h.get()).booleanValue(), (C2660a) this.f33997i.get(), (InterfaceC3181k) this.f33998j.get());
    }
}
