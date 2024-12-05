package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public final class k {
    private static final Object a = new v("CONDITION_FALSE");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f22223b = new v("LIST_EMPTY");

    public static final Object a() {
        return a;
    }

    public static final l b(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        l lVar = sVar != null ? sVar.a : null;
        return lVar == null ? (l) obj : lVar;
    }
}
