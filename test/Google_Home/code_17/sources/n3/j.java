package n3;

import A2.C0947e;
import A2.InterfaceC0945c;
import P5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0945c f35440b;

    /* renamed from: c, reason: collision with root package name */
    private final C0947e f35441c;

    public j(InterfaceC0945c analyticsRequestExecutor, C0947e analyticsRequestFactory) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(analyticsRequestFactory, "analyticsRequestFactory");
        this.f35440b = analyticsRequestExecutor;
        this.f35441c = analyticsRequestFactory;
    }

    @Override // n3.i
    public void a(i.c errorEvent, AbstractC4144k abstractC4144k, Map additionalNonPiiParams) {
        Map d8;
        AbstractC3255y.i(errorEvent, "errorEvent");
        AbstractC3255y.i(additionalNonPiiParams, "additionalNonPiiParams");
        if (abstractC4144k == null) {
            d8 = Q.h();
        } else {
            d8 = i.f35386a.d(abstractC4144k);
        }
        this.f35440b.a(this.f35441c.g(errorEvent, Q.q(d8, additionalNonPiiParams)));
    }
}
