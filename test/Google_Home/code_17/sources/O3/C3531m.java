package o3;

import A2.InterfaceC0945c;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: o3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3531m implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35932a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f35933b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f35934c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f35935d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f35936e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f35937f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f35938g;

    /* renamed from: h, reason: collision with root package name */
    private final L5.a f35939h;

    public C3531m(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8) {
        this.f35932a = aVar;
        this.f35933b = aVar2;
        this.f35934c = aVar3;
        this.f35935d = aVar4;
        this.f35936e = aVar5;
        this.f35937f = aVar6;
        this.f35938g = aVar7;
        this.f35939h = aVar8;
    }

    public static C3531m a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8) {
        return new C3531m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static C3530l c(Function1 function1, Function1 function12, InterfaceC0945c interfaceC0945c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, S5.g gVar, Function0 function0, boolean z9) {
        return new C3530l(function1, function12, interfaceC0945c, paymentAnalyticsRequestFactory, z8, gVar, function0, z9);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3530l get() {
        return c((Function1) this.f35932a.get(), (Function1) this.f35933b.get(), (InterfaceC0945c) this.f35934c.get(), (PaymentAnalyticsRequestFactory) this.f35935d.get(), ((Boolean) this.f35936e.get()).booleanValue(), (S5.g) this.f35937f.get(), (Function0) this.f35938g.get(), ((Boolean) this.f35939h.get()).booleanValue());
    }
}
