package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.InterfaceC2645e;

/* renamed from: kotlin.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3155u extends AbstractC3146k implements InterfaceC3154t, InterfaceC2645e {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3155u(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AbstractC3155u.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3155u) {
            AbstractC3155u abstractC3155u = (AbstractC3155u) obj;
            if (getName().equals(abstractC3155u.getName()) && getSignature().equals(abstractC3155u.getSignature()) && this.flags == abstractC3155u.flags && this.arity == abstractC3155u.arity && AbstractC3159y.d(getBoundReceiver(), abstractC3155u.getBoundReceiver()) && AbstractC3159y.d(getOwner(), abstractC3155u.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC2645e)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.InterfaceC3154t
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

    @Override // e6.InterfaceC2645e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // e6.InterfaceC2645e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // e6.InterfaceC2645e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // e6.InterfaceC2645e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3146k, e6.InterfaceC2642b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2642b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3146k
    public InterfaceC2645e getReflected() {
        return (InterfaceC2645e) super.getReflected();
    }
}
