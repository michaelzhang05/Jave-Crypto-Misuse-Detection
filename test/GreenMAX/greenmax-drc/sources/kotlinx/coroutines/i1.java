package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
final class i1 extends j {

    /* renamed from: f, reason: collision with root package name */
    private final Function1<Throwable, kotlin.u> f22163f;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(Function1<? super Throwable, kotlin.u> function1) {
        this.f22163f = function1;
    }

    @Override // kotlinx.coroutines.k
    public void b(Throwable th) {
        this.f22163f.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
        b(th);
        return kotlin.u.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + m0.a(this.f22163f) + '@' + m0.b(this) + ']';
    }
}
