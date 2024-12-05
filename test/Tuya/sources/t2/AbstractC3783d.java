package t2;

import androidx.core.os.EnvironmentCompat;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3783d {
    public static final String a(Throwable th) {
        AbstractC3159y.i(th, "<this>");
        if (th instanceof AbstractC3790k) {
            return ((AbstractC3790k) th).a();
        }
        if (th instanceof IOException) {
            return "ioException";
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
