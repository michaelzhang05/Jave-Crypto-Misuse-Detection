package O5;

import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c extends b {
    public static float b(float f8, float... other) {
        AbstractC3159y.i(other, "other");
        for (float f9 : other) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static Comparable c(Comparable a8, Comparable b8) {
        AbstractC3159y.i(a8, "a");
        AbstractC3159y.i(b8, "b");
        if (a8.compareTo(b8) < 0) {
            return b8;
        }
        return a8;
    }

    public static float d(float f8, float... other) {
        AbstractC3159y.i(other, "other");
        for (float f9 : other) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }
}
