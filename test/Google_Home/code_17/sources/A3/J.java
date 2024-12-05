package A3;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* loaded from: classes4.dex */
public final class J implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I f281a;

    public J(I i8) {
        this.f281a = i8;
    }

    public static J a(I i8) {
        return new J(i8);
    }

    public static EventReporter.Mode c(I i8) {
        return (EventReporter.Mode) x5.h.d(i8.a());
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c(this.f281a);
    }
}
