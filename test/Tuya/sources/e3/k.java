package e3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f30260a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f30261b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f30262c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f30263d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f30264e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f30265f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f30266g;

    public k(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        this.f30260a = aVar;
        this.f30261b = aVar2;
        this.f30262c = aVar3;
        this.f30263d = aVar4;
        this.f30264e = aVar5;
        this.f30265f = aVar6;
        this.f30266g = aVar7;
    }

    public static k a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static com.stripe.android.networking.a c(Context context, Function0 function0, P5.g gVar, Set set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3873c interfaceC3873c, InterfaceC3684d interfaceC3684d) {
        return new com.stripe.android.networking.a(context, function0, gVar, set, paymentAnalyticsRequestFactory, interfaceC3873c, interfaceC3684d);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.networking.a get() {
        return c((Context) this.f30260a.get(), (Function0) this.f30261b.get(), (P5.g) this.f30262c.get(), (Set) this.f30263d.get(), (PaymentAnalyticsRequestFactory) this.f30264e.get(), (InterfaceC3873c) this.f30265f.get(), (InterfaceC3684d) this.f30266g.get());
    }
}
