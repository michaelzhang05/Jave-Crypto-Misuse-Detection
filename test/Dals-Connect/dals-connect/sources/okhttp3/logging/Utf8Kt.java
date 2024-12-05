package okhttp3.logging;

import j.f;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: utf8.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj/f;", HttpUrl.FRAGMENT_ENCODE_SET, "isProbablyUtf8", "(Lj/f;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(f fVar) {
        long e2;
        l.f(fVar, "$this$isProbablyUtf8");
        try {
            f fVar2 = new f();
            e2 = kotlin.ranges.f.e(fVar.size(), 64L);
            fVar.g0(fVar2, 0L, e2);
            for (int i2 = 0; i2 < 16; i2++) {
                if (fVar2.u()) {
                    return true;
                }
                int F0 = fVar2.F0();
                if (Character.isISOControl(F0) && !Character.isWhitespace(F0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
