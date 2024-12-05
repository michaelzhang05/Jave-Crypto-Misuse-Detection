package h6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: h6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC2762e {
    public static final double a(double d8, EnumC2761d sourceUnit, EnumC2761d targetUnit) {
        AbstractC3159y.i(sourceUnit, "sourceUnit");
        AbstractC3159y.i(targetUnit, "targetUnit");
        long convert = targetUnit.b().convert(1L, sourceUnit.b());
        if (convert > 0) {
            return d8 * convert;
        }
        return d8 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j8, EnumC2761d sourceUnit, EnumC2761d targetUnit) {
        AbstractC3159y.i(sourceUnit, "sourceUnit");
        AbstractC3159y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }

    public static final long c(long j8, EnumC2761d sourceUnit, EnumC2761d targetUnit) {
        AbstractC3159y.i(sourceUnit, "sourceUnit");
        AbstractC3159y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }
}
