package D2;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.e;

/* loaded from: classes4.dex */
public final class u implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1419a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1420b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f1421c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f1422d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f1423e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f1424f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f1425g;

    public u(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        this.f1419a = aVar;
        this.f1420b = aVar2;
        this.f1421c = aVar3;
        this.f1422d = aVar4;
        this.f1423e = aVar5;
        this.f1424f = aVar6;
        this.f1425g = aVar7;
    }

    public static u a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        return new u(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e.d c(SavedStateHandle savedStateHandle, I5.a aVar, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar, com.stripe.android.payments.paymentlauncher.d dVar, Integer num, com.stripe.android.paymentsheet.f fVar, k3.i iVar) {
        return (e.d) u5.h.d(d.f1394a.s(savedStateHandle, aVar, bVar, dVar, num, fVar, iVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.d get() {
        return c((SavedStateHandle) this.f1419a.get(), this.f1420b, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f1421c.get(), (com.stripe.android.payments.paymentlauncher.d) this.f1422d.get(), (Integer) this.f1423e.get(), (com.stripe.android.paymentsheet.f) this.f1424f.get(), (k3.i) this.f1425g.get());
    }
}
