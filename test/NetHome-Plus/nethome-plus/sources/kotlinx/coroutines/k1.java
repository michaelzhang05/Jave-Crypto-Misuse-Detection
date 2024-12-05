package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class k1 extends q1 {

    /* renamed from: j, reason: collision with root package name */
    private final Function1<Throwable, kotlin.u> f22255j;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(Function1<? super Throwable, kotlin.u> function1) {
        this.f22255j = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
        v(th);
        return kotlin.u.a;
    }

    @Override // kotlinx.coroutines.y
    public void v(Throwable th) {
        this.f22255j.invoke(th);
    }
}
