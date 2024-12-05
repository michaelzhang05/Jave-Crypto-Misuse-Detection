package l3;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import x2.InterfaceC3873c;

/* renamed from: l3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3183m implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33931a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33932b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f33933c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f33934d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f33935e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f33936f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f33937g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.a f33938h;

    public C3183m(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8) {
        this.f33931a = aVar;
        this.f33932b = aVar2;
        this.f33933c = aVar3;
        this.f33934d = aVar4;
        this.f33935e = aVar5;
        this.f33936f = aVar6;
        this.f33937g = aVar7;
        this.f33938h = aVar8;
    }

    public static C3183m a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8) {
        return new C3183m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static C3182l c(Function1 function1, Function1 function12, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, P5.g gVar, Function0 function0, boolean z9) {
        return new C3182l(function1, function12, interfaceC3873c, paymentAnalyticsRequestFactory, z8, gVar, function0, z9);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3182l get() {
        return c((Function1) this.f33931a.get(), (Function1) this.f33932b.get(), (InterfaceC3873c) this.f33933c.get(), (PaymentAnalyticsRequestFactory) this.f33934d.get(), ((Boolean) this.f33935e.get()).booleanValue(), (P5.g) this.f33936f.get(), (Function0) this.f33937g.get(), ((Boolean) this.f33938h.get()).booleanValue());
    }
}
