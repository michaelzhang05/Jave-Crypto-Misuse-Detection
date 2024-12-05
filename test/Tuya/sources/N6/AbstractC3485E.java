package n6;

import L5.s;
import a.C1543a;

/* renamed from: n6.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3485E {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f36234a = new C1543a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f36235b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f36236c;

    static {
        Object b8;
        Object b9;
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (L5.s.e(b8) != null) {
            b8 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f36235b = (String) b8;
        try {
            b9 = L5.s.b(AbstractC3485E.class.getCanonicalName());
        } catch (Throwable th2) {
            s.a aVar3 = L5.s.f6511b;
            b9 = L5.s.b(L5.t.a(th2));
        }
        if (L5.s.e(b9) != null) {
            b9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f36236c = (String) b9;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
