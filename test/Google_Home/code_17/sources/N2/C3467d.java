package n2;

import A2.m;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import m2.r;
import u2.InterfaceC4057d;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3467d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3467d f35370a = new C3467d();

    private C3467d() {
    }

    public final InterfaceC3466c a(Context context) {
        AbstractC3255y.i(context, "context");
        return new C3464a(new m(InterfaceC4057d.f39950a.a(false), C3347b0.b()), new PaymentAnalyticsRequestFactory(context, r.f35037c.a(context).g(), null, 4, null), D2.c.f1777b.a(), C3347b0.b());
    }
}
