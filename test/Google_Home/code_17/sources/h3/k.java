package h3;

import A2.InterfaceC0945c;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class k implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f32181a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f32182b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f32183c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f32184d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f32185e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f32186f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f32187g;

    public k(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        this.f32181a = aVar;
        this.f32182b = aVar2;
        this.f32183c = aVar3;
        this.f32184d = aVar4;
        this.f32185e = aVar5;
        this.f32186f = aVar6;
        this.f32187g = aVar7;
    }

    public static k a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static com.stripe.android.networking.a c(Context context, Function0 function0, S5.g gVar, Set set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0945c interfaceC0945c, InterfaceC4057d interfaceC4057d) {
        return new com.stripe.android.networking.a(context, function0, gVar, set, paymentAnalyticsRequestFactory, interfaceC0945c, interfaceC4057d);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.networking.a get() {
        return c((Context) this.f32181a.get(), (Function0) this.f32182b.get(), (S5.g) this.f32183c.get(), (Set) this.f32184d.get(), (PaymentAnalyticsRequestFactory) this.f32185e.get(), (InterfaceC0945c) this.f32186f.get(), (InterfaceC4057d) this.f32187g.get());
    }
}
