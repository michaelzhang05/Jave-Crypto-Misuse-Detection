package x3;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* renamed from: x3.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3888J implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3887I f39286a;

    public C3888J(C3887I c3887i) {
        this.f39286a = c3887i;
    }

    public static C3888J a(C3887I c3887i) {
        return new C3888J(c3887i);
    }

    public static EventReporter.Mode c(C3887I c3887i) {
        return (EventReporter.Mode) u5.h.d(c3887i.a());
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c(this.f39286a);
    }
}
