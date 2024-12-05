package k3;

import M5.Q;
import java.util.Map;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;
import x2.C3875e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f33448b;

    /* renamed from: c, reason: collision with root package name */
    private final C3875e f33449c;

    public j(InterfaceC3873c analyticsRequestExecutor, C3875e analyticsRequestFactory) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(analyticsRequestFactory, "analyticsRequestFactory");
        this.f33448b = analyticsRequestExecutor;
        this.f33449c = analyticsRequestFactory;
    }

    @Override // k3.i
    public void a(i.c errorEvent, AbstractC3790k abstractC3790k, Map additionalNonPiiParams) {
        Map d8;
        AbstractC3159y.i(errorEvent, "errorEvent");
        AbstractC3159y.i(additionalNonPiiParams, "additionalNonPiiParams");
        if (abstractC3790k == null) {
            d8 = Q.h();
        } else {
            d8 = i.f33394a.d(abstractC3790k);
        }
        this.f33448b.a(this.f33449c.g(errorEvent, Q.q(d8, additionalNonPiiParams)));
    }
}
