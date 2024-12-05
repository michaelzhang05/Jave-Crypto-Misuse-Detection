package G2;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.e;

/* loaded from: classes4.dex */
public final class u implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2961a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2962b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f2963c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f2964d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f2965e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f2966f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f2967g;

    public u(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        this.f2961a = aVar;
        this.f2962b = aVar2;
        this.f2963c = aVar3;
        this.f2964d = aVar4;
        this.f2965e = aVar5;
        this.f2966f = aVar6;
        this.f2967g = aVar7;
    }

    public static u a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        return new u(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e.d c(SavedStateHandle savedStateHandle, L5.a aVar, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar, com.stripe.android.payments.paymentlauncher.d dVar, Integer num, com.stripe.android.paymentsheet.f fVar, n3.i iVar) {
        return (e.d) x5.h.d(d.f2936a.s(savedStateHandle, aVar, bVar, dVar, num, fVar, iVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.d get() {
        return c((SavedStateHandle) this.f2961a.get(), this.f2962b, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f2963c.get(), (com.stripe.android.payments.paymentlauncher.d) this.f2964d.get(), (Integer) this.f2965e.get(), (com.stripe.android.paymentsheet.f) this.f2966f.get(), (n3.i) this.f2967g.get());
    }
}
