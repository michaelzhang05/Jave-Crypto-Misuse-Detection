package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
final class w0 extends j {

    /* renamed from: f, reason: collision with root package name */
    private final v0 f22296f;

    public w0(v0 v0Var) {
        this.f22296f = v0Var;
    }

    @Override // kotlinx.coroutines.k
    public void b(Throwable th) {
        this.f22296f.d();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
        b(th);
        return kotlin.u.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f22296f + ']';
    }
}
