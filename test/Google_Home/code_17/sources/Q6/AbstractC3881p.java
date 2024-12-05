package q6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3881p {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f38408a = new C3865F("CONDITION_FALSE");

    public static final Object a() {
        return f38408a;
    }

    public static final C3882q b(Object obj) {
        z zVar;
        C3882q c3882q;
        if (obj instanceof z) {
            zVar = (z) obj;
        } else {
            zVar = null;
        }
        if (zVar == null || (c3882q = zVar.f38429a) == null) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C3882q) obj;
        }
        return c3882q;
    }
}
