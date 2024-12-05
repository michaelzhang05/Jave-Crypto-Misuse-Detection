package q6;

import O5.s;
import a.C1600a;

/* renamed from: q6.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3864E {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f38362a = new C1600a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f38363b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38364c;

    static {
        Object b8;
        Object b9;
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (O5.s.e(b8) != null) {
            b8 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f38363b = (String) b8;
        try {
            b9 = O5.s.b(AbstractC3864E.class.getCanonicalName());
        } catch (Throwable th2) {
            s.a aVar3 = O5.s.f8302b;
            b9 = O5.s.b(O5.t.a(th2));
        }
        if (O5.s.e(b9) != null) {
            b9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f38364c = (String) b9;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
