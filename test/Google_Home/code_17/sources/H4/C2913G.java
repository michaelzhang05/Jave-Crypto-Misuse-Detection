package h4;

import f4.InterfaceC2835a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import o2.InterfaceC3515b;
import o6.InterfaceC3698L;

/* renamed from: h4.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2913G implements p4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2910D f32279a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32280b;

    /* renamed from: c, reason: collision with root package name */
    private final e4.e f32281c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f32282d;

    public C2913G(InterfaceC3515b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2835a cbcEligibility) {
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(initialValues, "initialValues");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        C2910D c2910d = new C2910D(p4.G.Companion.a("card_detail"), cardAccountRangeRepositoryFactory, initialValues, z8, cbcEligibility, null, 32, null);
        this.f32279a = c2910d;
        this.f32280b = c2910d.j();
        this.f32281c = new e4.e();
        this.f32282d = c2910d.i().getError();
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f32282d;
    }

    public final C2910D v() {
        return this.f32279a;
    }

    public final boolean w() {
        return this.f32280b;
    }

    public final e4.e x() {
        return this.f32281c;
    }
}
