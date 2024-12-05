package androidx.core.os;

import android.os.Trace;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;

/* loaded from: classes3.dex */
public final class TraceKt {
    public static final <T> T trace(String str, Function0 function0) {
        Trace.beginSection(str);
        try {
            return (T) function0.invoke();
        } finally {
            AbstractC3253w.b(1);
            Trace.endSection();
            AbstractC3253w.a(1);
        }
    }
}
