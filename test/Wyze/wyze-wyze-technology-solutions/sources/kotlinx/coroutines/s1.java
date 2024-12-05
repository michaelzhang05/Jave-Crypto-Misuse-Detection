package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class s1 {
    private static final kotlinx.coroutines.internal.v a = new kotlinx.coroutines.internal.v("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.v f22278b = new kotlinx.coroutines.internal.v("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.v f22279c = new kotlinx.coroutines.internal.v("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.v f22280d = new kotlinx.coroutines.internal.v("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.v f22281e = new kotlinx.coroutines.internal.v("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final x0 f22282f = new x0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final x0 f22283g = new x0(true);

    public static final Object g(Object obj) {
        return obj instanceof g1 ? new h1((g1) obj) : obj;
    }

    public static final Object h(Object obj) {
        g1 g1Var;
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        return (h1Var == null || (g1Var = h1Var.a) == null) ? obj : g1Var;
    }
}
