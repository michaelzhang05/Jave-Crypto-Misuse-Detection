package androidx.compose.runtime.internal;

import g6.AbstractC2725a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i8) {
        this.element = i8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String num = Integer.toString(hashCode(), AbstractC2725a.a(16));
        AbstractC3159y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public IntRef(int i8) {
        this.element = i8;
    }

    public /* synthetic */ IntRef(int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
