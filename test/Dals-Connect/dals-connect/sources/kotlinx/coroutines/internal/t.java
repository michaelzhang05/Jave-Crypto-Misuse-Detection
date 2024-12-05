package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j.internal.CoroutineStackFrame;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public class t<T> extends kotlinx.coroutines.c<T> implements CoroutineStackFrame {

    /* renamed from: h, reason: collision with root package name */
    public final Continuation<T> f22240h;

    /* JADX WARN: Multi-variable type inference failed */
    public t(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.f22240h = continuation;
    }

    @Override // kotlinx.coroutines.r1
    protected final boolean J() {
        return true;
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22240h;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.j.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r1
    public void k(Object obj) {
        Continuation b2;
        b2 = kotlin.coroutines.intrinsics.c.b(this.f22240h);
        f.c(b2, kotlinx.coroutines.z.a(obj, this.f22240h), null, 2, null);
    }

    @Override // kotlinx.coroutines.c
    protected void o0(Object obj) {
        Continuation<T> continuation = this.f22240h;
        continuation.resumeWith(kotlinx.coroutines.z.a(obj, continuation));
    }
}
