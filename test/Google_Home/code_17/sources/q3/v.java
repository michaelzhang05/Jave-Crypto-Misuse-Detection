package q3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import o3.InterfaceC3526h;

/* loaded from: classes4.dex */
public final class v implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f38250a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38251b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f38252c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f38253d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f38254e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f38255f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f38256g;

    /* renamed from: h, reason: collision with root package name */
    private final L5.a f38257h;

    /* renamed from: i, reason: collision with root package name */
    private final L5.a f38258i;

    /* renamed from: j, reason: collision with root package name */
    private final L5.a f38259j;

    /* renamed from: k, reason: collision with root package name */
    private final L5.a f38260k;

    public v(s sVar, L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8, L5.a aVar9, L5.a aVar10) {
        this.f38250a = sVar;
        this.f38251b = aVar;
        this.f38252c = aVar2;
        this.f38253d = aVar3;
        this.f38254e = aVar4;
        this.f38255f = aVar5;
        this.f38256g = aVar6;
        this.f38257h = aVar7;
        this.f38258i = aVar8;
        this.f38259j = aVar9;
        this.f38260k = aVar10;
    }

    public static v a(s sVar, L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8, L5.a aVar9, L5.a aVar10) {
        return new v(sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static InterfaceC3526h c(s sVar, Context context, boolean z8, S5.g gVar, S5.g gVar2, Map map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 function0, Set set, boolean z9, boolean z10) {
        return (InterfaceC3526h) x5.h.d(sVar.c(context, z8, gVar, gVar2, map, paymentAnalyticsRequestFactory, function0, set, z9, z10));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3526h get() {
        return c(this.f38250a, (Context) this.f38251b.get(), ((Boolean) this.f38252c.get()).booleanValue(), (S5.g) this.f38253d.get(), (S5.g) this.f38254e.get(), (Map) this.f38255f.get(), (PaymentAnalyticsRequestFactory) this.f38256g.get(), (Function0) this.f38257h.get(), (Set) this.f38258i.get(), ((Boolean) this.f38259j.get()).booleanValue(), ((Boolean) this.f38260k.get()).booleanValue());
    }
}
