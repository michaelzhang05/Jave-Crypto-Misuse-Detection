package l6;

import q6.C3861B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z0 extends C3861B implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f34592e;

    public Z0(long j8, S5.d dVar) {
        super(dVar.getContext(), dVar);
        this.f34592e = j8;
    }

    @Override // l6.AbstractC3344a, l6.F0
    public String o0() {
        return super.o0() + "(timeMillis=" + this.f34592e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        K(a1.a(this.f34592e, X.d(getContext()), this));
    }
}
