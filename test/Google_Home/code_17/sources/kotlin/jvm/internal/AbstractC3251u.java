package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.InterfaceC2965e;

/* renamed from: kotlin.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3251u extends AbstractC3242k implements InterfaceC3250t, InterfaceC2965e {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3251u(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            int r9 = r14 >> 1
            r8.flags = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AbstractC3251u.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3251u) {
            AbstractC3251u abstractC3251u = (AbstractC3251u) obj;
            if (getName().equals(abstractC3251u.getName()) && getSignature().equals(abstractC3251u.getSignature()) && this.flags == abstractC3251u.flags && this.arity == abstractC3251u.arity && AbstractC3255y.d(getBoundReceiver(), abstractC3251u.getBoundReceiver()) && AbstractC3255y.d(getOwner(), abstractC3251u.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC2965e)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.InterfaceC3250t
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // h6.InterfaceC2965e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // h6.InterfaceC2965e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // h6.InterfaceC2965e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // h6.InterfaceC2965e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3242k, h6.InterfaceC2962b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2962b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3242k
    public InterfaceC2965e getReflected() {
        return (InterfaceC2965e) super.getReflected();
    }
}
