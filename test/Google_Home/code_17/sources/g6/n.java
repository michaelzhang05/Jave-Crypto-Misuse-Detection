package g6;

import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class n {
    public static final void a(boolean z8, Number step) {
        AbstractC3255y.i(step, "step");
        if (z8) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static InterfaceC2885e b(float f8, float f9) {
        return new C2884d(f8, f9);
    }
}
