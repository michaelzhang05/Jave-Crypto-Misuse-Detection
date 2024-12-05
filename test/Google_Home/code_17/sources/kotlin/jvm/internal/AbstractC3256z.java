package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3256z implements InterfaceC3250t, Serializable {
    private final int arity;

    public AbstractC3256z(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC3250t
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j8 = U.j(this);
        AbstractC3255y.h(j8, "renderLambdaToString(...)");
        return j8;
    }
}
