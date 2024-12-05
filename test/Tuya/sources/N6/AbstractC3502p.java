package n6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3502p {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f36280a = new C3486F("CONDITION_FALSE");

    public static final Object a() {
        return f36280a;
    }

    public static final C3503q b(Object obj) {
        z zVar;
        C3503q c3503q;
        if (obj instanceof z) {
            zVar = (z) obj;
        } else {
            zVar = null;
        }
        if (zVar == null || (c3503q = zVar.f36301a) == null) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C3503q) obj;
        }
        return c3503q;
    }
}
