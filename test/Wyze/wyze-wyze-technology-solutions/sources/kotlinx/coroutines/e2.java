package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class e2 implements CoroutineContext.b, CoroutineContext.c<e2> {

    /* renamed from: f, reason: collision with root package name */
    public static final e2 f22148f = new e2();

    private e2() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        return (R) CoroutineContext.b.a.a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) CoroutineContext.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    public CoroutineContext.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return CoroutineContext.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.b.a.d(this, coroutineContext);
    }
}
