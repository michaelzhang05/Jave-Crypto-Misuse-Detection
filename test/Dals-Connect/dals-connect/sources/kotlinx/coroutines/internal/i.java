package kotlinx.coroutines.internal;

import kotlin.Result;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes2.dex */
public final class i {
    private static final boolean a;

    static {
        Object a2;
        try {
            Result.a aVar = Result.f21603f;
            a2 = Result.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            a2 = Result.a(kotlin.o.a(th));
        }
        a = Result.d(a2);
    }

    public static final boolean a() {
        return a;
    }
}
