package e4;

import c4.InterfaceC1925a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import l2.InterfaceC3167b;
import l6.InterfaceC3349K;

/* renamed from: e4.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2593G implements m4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2590D f30358a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30359b;

    /* renamed from: c, reason: collision with root package name */
    private final b4.e f30360c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f30361d;

    public C2593G(InterfaceC3167b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC1925a cbcEligibility) {
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(initialValues, "initialValues");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        C2590D c2590d = new C2590D(m4.G.Companion.a("card_detail"), cardAccountRangeRepositoryFactory, initialValues, z8, cbcEligibility, null, 32, null);
        this.f30358a = c2590d;
        this.f30359b = c2590d.j();
        this.f30360c = new b4.e();
        this.f30361d = c2590d.i().getError();
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30361d;
    }

    public final C2590D v() {
        return this.f30358a;
    }

    public final boolean w() {
        return this.f30359b;
    }

    public final b4.e x() {
        return this.f30360c;
    }
}
