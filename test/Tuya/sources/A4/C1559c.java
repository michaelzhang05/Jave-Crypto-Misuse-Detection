package a4;

import T3.q;
import android.content.Context;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1559c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13510a;

    public C1559c(Context context) {
        AbstractC3159y.i(context, "context");
        this.f13510a = context;
    }

    public final C1566j a(Y3.b challengeResponseData, T3.q uiCustomization) {
        boolean z8;
        AbstractC3159y.i(challengeResponseData, "challengeResponseData");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        if (challengeResponseData.b0() == Y3.g.f13175e) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1566j c1566j = new C1566j(this.f13510a, null, 0, z8, 6, null);
        c1566j.d(challengeResponseData.n(), uiCustomization.c());
        c1566j.c(challengeResponseData.s(), uiCustomization.b(q.a.SELECT));
        return c1566j;
    }

    public final C1567k b(Y3.b challengeResponseData, T3.q uiCustomization) {
        AbstractC3159y.i(challengeResponseData, "challengeResponseData");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        C1567k c1567k = new C1567k(this.f13510a, null, 0, 6, null);
        c1567k.setTextEntryLabel(challengeResponseData.n());
        c1567k.setTextBoxCustomization(uiCustomization.e());
        return c1567k;
    }

    public final com.stripe.android.stripe3ds2.views.e c(Y3.b challengeResponseData) {
        AbstractC3159y.i(challengeResponseData, "challengeResponseData");
        com.stripe.android.stripe3ds2.views.e eVar = new com.stripe.android.stripe3ds2.views.e(this.f13510a, null, 0, 6, null);
        eVar.c(challengeResponseData.e());
        return eVar;
    }
}
