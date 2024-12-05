package p4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class B0 {
    public static final boolean a(y0 y0Var, String currentValue, String proposedValue) {
        AbstractC3255y.i(y0Var, "<this>");
        AbstractC3255y.i(currentValue, "currentValue");
        AbstractC3255y.i(proposedValue, "proposedValue");
        if (y0Var.d() && proposedValue.length() > currentValue.length()) {
            return false;
        }
        return true;
    }
}
