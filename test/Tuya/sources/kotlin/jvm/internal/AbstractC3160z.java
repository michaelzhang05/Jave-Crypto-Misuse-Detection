package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3160z implements InterfaceC3154t, Serializable {
    private final int arity;

    public AbstractC3160z(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC3154t
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j8 = U.j(this);
        AbstractC3159y.h(j8, "renderLambdaToString(...)");
        return j8;
    }
}
