package A3;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* loaded from: classes4.dex */
public final class a0 implements x5.e {

    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final a0 f301a = new a0();
    }

    public static a0 a() {
        return a.f301a;
    }

    public static EventReporter.Mode c() {
        return (EventReporter.Mode) x5.h.d(Z.f300a.a());
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c();
    }
}
