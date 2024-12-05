package kotlin.reflect.x.internal.l0.b;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.f0.x.e.l0.b.i, still in use, count: 1, list:
  (r0v1 kotlin.f0.x.e.l0.b.i) from 0x006e: FILLED_NEW_ARRAY 
  (r0v1 kotlin.f0.x.e.l0.b.i)
  (r1v2 kotlin.f0.x.e.l0.b.i)
  (r4v2 kotlin.f0.x.e.l0.b.i)
  (r6v2 kotlin.f0.x.e.l0.b.i)
  (r8v2 kotlin.f0.x.e.l0.b.i)
  (r10v2 kotlin.f0.x.e.l0.b.i)
  (r12v2 kotlin.f0.x.e.l0.b.i)
 A[WRAPPED] elemType: kotlin.f0.x.e.l0.b.i
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PrimitiveType.kt */
/* loaded from: classes2.dex */
public final class i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: g, reason: collision with root package name */
    public static final Set<i> f19682g;
    private final f q;
    private final f r;
    private final Lazy s;
    private final Lazy t;

    /* renamed from: f, reason: collision with root package name */
    public static final a f19681f = new a(null);

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<kotlin.reflect.x.internal.l0.f.c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.f.c invoke() {
            kotlin.reflect.x.internal.l0.f.c c2 = k.r.c(i.this.i());
            l.e(c2, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c2;
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<kotlin.reflect.x.internal.l0.f.c> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.f.c invoke() {
            kotlin.reflect.x.internal.l0.f.c c2 = k.r.c(i.this.o());
            l.e(c2, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c2;
        }
    }

    static {
        Set<i> g2;
        g2 = u0.g(new i("Char"), new i("Byte"), new i("Short"), new i("Int"), new i("Float"), new i("Long"), new i("Double"));
        f19682g = g2;
    }

    private i(String str) {
        Lazy a2;
        Lazy a3;
        f r = f.r(str);
        l.e(r, "identifier(typeName)");
        this.q = r;
        f r2 = f.r(str + "Array");
        l.e(r2, "identifier(\"${typeName}Array\")");
        this.r = r2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        a2 = kotlin.i.a(lazyThreadSafetyMode, new c());
        this.s = a2;
        a3 = kotlin.i.a(lazyThreadSafetyMode, new b());
        this.t = a3;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) p.clone();
    }

    public final kotlin.reflect.x.internal.l0.f.c f() {
        return (kotlin.reflect.x.internal.l0.f.c) this.t.getValue();
    }

    public final f i() {
        return this.r;
    }

    public final kotlin.reflect.x.internal.l0.f.c n() {
        return (kotlin.reflect.x.internal.l0.f.c) this.s.getValue();
    }

    public final f o() {
        return this.q;
    }
}
