package n3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.InterfaceC3178h;

/* loaded from: classes4.dex */
public final class v implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f36122a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f36123b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f36124c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f36125d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f36126e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f36127f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f36128g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.a f36129h;

    /* renamed from: i, reason: collision with root package name */
    private final I5.a f36130i;

    /* renamed from: j, reason: collision with root package name */
    private final I5.a f36131j;

    /* renamed from: k, reason: collision with root package name */
    private final I5.a f36132k;

    public v(s sVar, I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        this.f36122a = sVar;
        this.f36123b = aVar;
        this.f36124c = aVar2;
        this.f36125d = aVar3;
        this.f36126e = aVar4;
        this.f36127f = aVar5;
        this.f36128g = aVar6;
        this.f36129h = aVar7;
        this.f36130i = aVar8;
        this.f36131j = aVar9;
        this.f36132k = aVar10;
    }

    public static v a(s sVar, I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        return new v(sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static InterfaceC3178h c(s sVar, Context context, boolean z8, P5.g gVar, P5.g gVar2, Map map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 function0, Set set, boolean z9, boolean z10) {
        return (InterfaceC3178h) u5.h.d(sVar.c(context, z8, gVar, gVar2, map, paymentAnalyticsRequestFactory, function0, set, z9, z10));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3178h get() {
        return c(this.f36122a, (Context) this.f36123b.get(), ((Boolean) this.f36124c.get()).booleanValue(), (P5.g) this.f36125d.get(), (P5.g) this.f36126e.get(), (Map) this.f36127f.get(), (PaymentAnalyticsRequestFactory) this.f36128g.get(), (Function0) this.f36129h.get(), (Set) this.f36130i.get(), ((Boolean) this.f36131j.get()).booleanValue(), ((Boolean) this.f36132k.get()).booleanValue());
    }
}
