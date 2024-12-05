package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.InterfaceC3154t;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class l extends d implements InterfaceC3154t {
    private final int arity;

    public l(int i8, P5.d dVar) {
        super(dVar);
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC3154t
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String i8 = U.i(this);
            AbstractC3159y.h(i8, "renderLambdaToString(...)");
            return i8;
        }
        return super.toString();
    }
}
