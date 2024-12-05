package x3;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* loaded from: classes4.dex */
public final class a0 implements u5.e {

    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final a0 f39306a = new a0();
    }

    public static a0 a() {
        return a.f39306a;
    }

    public static EventReporter.Mode c() {
        return (EventReporter.Mode) u5.h.d(Z.f39305a.a());
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c();
    }
}
