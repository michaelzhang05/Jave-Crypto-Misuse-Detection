package kotlin.coroutines.jvm.internal;

import L5.s;
import L5.t;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a implements P5.d, e, Serializable {
    private final P5.d completion;

    public a(P5.d dVar) {
        this.completion = dVar;
    }

    public P5.d create(P5.d completion) {
        AbstractC3159y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        P5.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final P5.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // P5.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        P5.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            P5.d dVar2 = aVar.completion;
            AbstractC3159y.f(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f6511b;
                obj = s.b(t.a(th));
            }
            if (invokeSuspend == Q5.b.e()) {
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

    public P5.d create(Object obj, P5.d completion) {
        AbstractC3159y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
