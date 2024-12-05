package n6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import l6.AbstractC3344a;
import l6.C3392y0;
import l6.F0;

/* loaded from: classes5.dex */
public abstract class e extends AbstractC3344a implements d {

    /* renamed from: d, reason: collision with root package name */
    private final d f35605d;

    public e(S5.g gVar, d dVar, boolean z8, boolean z9) {
        super(gVar, z8, z9);
        this.f35605d = dVar;
    }

    @Override // l6.F0
    public void M(Throwable th) {
        CancellationException C02 = F0.C0(this, th, null, 1, null);
        this.f35605d.cancel(C02);
        K(C02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d O0() {
        return this.f35605d;
    }

    @Override // n6.u
    public Object c(S5.d dVar) {
        return this.f35605d.c(dVar);
    }

    @Override // l6.F0, l6.InterfaceC3390x0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C3392y0(P(), null, this);
        }
        M(cancellationException);
    }

    @Override // n6.v
    public Object d(Object obj, S5.d dVar) {
        return this.f35605d.d(obj, dVar);
    }

    @Override // n6.u
    public Object e() {
        return this.f35605d.e();
    }

    @Override // n6.u
    public f iterator() {
        return this.f35605d.iterator();
    }

    @Override // n6.u
    public Object p(S5.d dVar) {
        Object p8 = this.f35605d.p(dVar);
        T5.b.e();
        return p8;
    }

    @Override // n6.v
    public boolean q(Throwable th) {
        return this.f35605d.q(th);
    }

    @Override // n6.v
    public void v(Function1 function1) {
        this.f35605d.v(function1);
    }

    @Override // n6.v
    public Object w(Object obj) {
        return this.f35605d.w(obj);
    }

    @Override // n6.v
    public boolean z() {
        return this.f35605d.z();
    }

    public final d N0() {
        return this;
    }
}
