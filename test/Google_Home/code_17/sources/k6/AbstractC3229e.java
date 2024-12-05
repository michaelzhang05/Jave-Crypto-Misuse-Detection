package k6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3229e {
    public static final double a(double d8, EnumC3228d sourceUnit, EnumC3228d targetUnit) {
        AbstractC3255y.i(sourceUnit, "sourceUnit");
        AbstractC3255y.i(targetUnit, "targetUnit");
        long convert = targetUnit.b().convert(1L, sourceUnit.b());
        if (convert > 0) {
            return d8 * convert;
        }
        return d8 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j8, EnumC3228d sourceUnit, EnumC3228d targetUnit) {
        AbstractC3255y.i(sourceUnit, "sourceUnit");
        AbstractC3255y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }

    public static final long c(long j8, EnumC3228d sourceUnit, EnumC3228d targetUnit) {
        AbstractC3255y.i(sourceUnit, "sourceUnit");
        AbstractC3255y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }
}
