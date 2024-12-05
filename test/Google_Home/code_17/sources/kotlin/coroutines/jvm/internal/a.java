package kotlin.coroutines.jvm.internal;

import O5.s;
import O5.t;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a implements S5.d, e, Serializable {
    private final S5.d completion;

    public a(S5.d dVar) {
        this.completion = dVar;
    }

    public S5.d create(S5.d completion) {
        AbstractC3255y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        S5.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final S5.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // S5.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        S5.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            S5.d dVar2 = aVar.completion;
            AbstractC3255y.f(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                obj = s.b(t.a(th));
            }
            if (invokeSuspend == T5.b.e()) {
                return;
            }
            obj = s.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public S5.d create(Object obj, S5.d completion) {
        AbstractC3255y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
