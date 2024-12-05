package j6;

import java.math.BigDecimal;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class u extends t {
    public static BigDecimal f(String str) {
        AbstractC3255y.i(str, "<this>");
        try {
            if (!m.f34063b.e(str)) {
                return null;
            }
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double g(String str) {
        AbstractC3255y.i(str, "<this>");
        try {
            if (!m.f34063b.e(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
