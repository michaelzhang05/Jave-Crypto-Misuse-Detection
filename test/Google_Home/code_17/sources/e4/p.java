package e4;

import O5.s;
import O5.t;
import O5.x;
import P5.Q;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    private final n3.i f31778b;

    public p(n3.i errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f31778b = errorReporter;
    }

    @Override // e4.o
    public void a() {
        Object b8;
        IllegalStateException illegalStateException = new IllegalStateException("Missing stripecardscan dependency, please add it to your apps build.gradle");
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        this.f31778b.a(i.f.f35419c, AbstractC4144k.f40356e.b(illegalStateException), Q.e(x.a("has_instrumentation", String.valueOf(s.h(b8)))));
    }
}
