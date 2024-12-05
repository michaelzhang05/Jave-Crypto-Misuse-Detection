package w0;

import java.util.Arrays;

/* renamed from: w0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4123f extends AbstractC4119b {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
