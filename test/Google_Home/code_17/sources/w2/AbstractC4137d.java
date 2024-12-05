package w2;

import androidx.core.os.EnvironmentCompat;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4137d {
    public static final String a(Throwable th) {
        AbstractC3255y.i(th, "<this>");
        if (th instanceof AbstractC4144k) {
            return ((AbstractC4144k) th).a();
        }
        if (th instanceof IOException) {
            return "ioException";
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
