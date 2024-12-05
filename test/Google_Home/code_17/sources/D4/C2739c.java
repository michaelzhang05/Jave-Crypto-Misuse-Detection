package d4;

import W3.q;
import android.content.Context;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2739c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31173a;

    public C2739c(Context context) {
        AbstractC3255y.i(context, "context");
        this.f31173a = context;
    }

    public final C2746j a(b4.b challengeResponseData, W3.q uiCustomization) {
        boolean z8;
        AbstractC3255y.i(challengeResponseData, "challengeResponseData");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        if (challengeResponseData.b0() == b4.g.f15460e) {
            z8 = true;
        } else {
            z8 = false;
        }
        C2746j c2746j = new C2746j(this.f31173a, null, 0, z8, 6, null);
        c2746j.d(challengeResponseData.s(), uiCustomization.a());
        c2746j.c(challengeResponseData.v(), uiCustomization.g(q.a.SELECT));
        return c2746j;
    }

    public final C2747k b(b4.b challengeResponseData, W3.q uiCustomization) {
        AbstractC3255y.i(challengeResponseData, "challengeResponseData");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        C2747k c2747k = new C2747k(this.f31173a, null, 0, 6, null);
        c2747k.setTextEntryLabel(challengeResponseData.s());
        c2747k.setTextBoxCustomization(uiCustomization.b());
        return c2747k;
    }

    public final com.stripe.android.stripe3ds2.views.e c(b4.b challengeResponseData) {
        AbstractC3255y.i(challengeResponseData, "challengeResponseData");
        com.stripe.android.stripe3ds2.views.e eVar = new com.stripe.android.stripe3ds2.views.e(this.f31173a, null, 0, 6, null);
        eVar.c(challengeResponseData.g());
        return eVar;
    }
}
