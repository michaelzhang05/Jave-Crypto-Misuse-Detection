package k2;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i6.C2812b0;
import j2.r;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;
import x2.m;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3112d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3112d f33378a = new C3112d();

    private C3112d() {
    }

    public final InterfaceC3111c a(Context context) {
        AbstractC3159y.i(context, "context");
        return new C3109a(new m(InterfaceC3684d.f37570a.a(false), C2812b0.b()), new PaymentAnalyticsRequestFactory(context, r.f33061c.a(context).e(), null, 4, null), A2.c.f75b.a(), C2812b0.b());
    }
}
