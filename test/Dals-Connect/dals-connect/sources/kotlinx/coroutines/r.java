package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class r extends m1 implements q {

    /* renamed from: j, reason: collision with root package name */
    public final s f22268j;

    public r(s sVar) {
        this.f22268j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
        v(th);
        return kotlin.u.a;
    }

    @Override // kotlinx.coroutines.q
    public boolean n(Throwable th) {
        return w().q(th);
    }

    @Override // kotlinx.coroutines.y
    public void v(Throwable th) {
        this.f22268j.L(w());
    }
}
