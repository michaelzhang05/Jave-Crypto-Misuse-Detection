package i6;

import n6.C3482B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z0 extends C3482B implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f31740e;

    public Z0(long j8, P5.d dVar) {
        super(dVar.getContext(), dVar);
        this.f31740e = j8;
    }

    @Override // i6.AbstractC2809a, i6.F0
    public String p0() {
        return super.p0() + "(timeMillis=" + this.f31740e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        K(a1.a(this.f31740e, X.d(getContext()), this));
    }
}
