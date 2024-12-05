package k6;

import i6.AbstractC2809a;
import i6.C2857y0;
import i6.F0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class e extends AbstractC2809a implements d {

    /* renamed from: d, reason: collision with root package name */
    private final d f33613d;

    public e(P5.g gVar, d dVar, boolean z8, boolean z9) {
        super(gVar, z8, z9);
        this.f33613d = dVar;
    }

    @Override // k6.v
    public boolean B() {
        return this.f33613d.B();
    }

    @Override // i6.F0
    public void M(Throwable th) {
        CancellationException D02 = F0.D0(this, th, null, 1, null);
        this.f33613d.cancel(D02);
        K(D02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d P0() {
        return this.f33613d;
    }

    @Override // k6.u
    public Object c(P5.d dVar) {
        Object c8 = this.f33613d.c(dVar);
        Q5.b.e();
        return c8;
    }

    @Override // i6.F0, i6.InterfaceC2855x0
    public final void cancel(CancellationException cancellationException) {
        if (h0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2857y0(P(), null, this);
        }
        M(cancellationException);
    }

    @Override // k6.u
    public Object d() {
        return this.f33613d.d();
    }

    @Override // k6.v
    public Object i(Object obj, P5.d dVar) {
        return this.f33613d.i(obj, dVar);
    }

    @Override // k6.u
    public f iterator() {
        return this.f33613d.iterator();
    }

    @Override // k6.v
    public boolean p(Throwable th) {
        return this.f33613d.p(th);
    }

    @Override // k6.v
    public void s(Function1 function1) {
        this.f33613d.s(function1);
    }

    @Override // k6.v
    public Object y(Object obj) {
        return this.f33613d.y(obj);
    }

    @Override // k6.u
    public Object z(P5.d dVar) {
        return this.f33613d.z(dVar);
    }

    public final d O0() {
        return this;
    }
}
