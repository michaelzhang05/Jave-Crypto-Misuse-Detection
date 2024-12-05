package b4;

import L5.s;
import L5.t;
import L5.x;
import M5.Q;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    private final k3.i f14772b;

    public p(k3.i errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f14772b = errorReporter;
    }

    @Override // b4.o
    public void a() {
        Object b8;
        IllegalStateException illegalStateException = new IllegalStateException("Missing stripecardscan dependency, please add it to your apps build.gradle");
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        this.f14772b.a(i.f.f33427c, AbstractC3790k.f38229e.b(illegalStateException), Q.e(x.a("has_instrumentation", String.valueOf(s.h(b8)))));
    }
}
