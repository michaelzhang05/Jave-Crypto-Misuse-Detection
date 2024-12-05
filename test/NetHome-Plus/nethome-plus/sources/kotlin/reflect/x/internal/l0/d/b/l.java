package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.g;
import kotlin.reflect.x.internal.l0.i.u.e;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes2.dex */
public abstract class l {
    public static final b a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final d f20311b = new d(e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final d f20312c = new d(e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final d f20313d = new d(e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final d f20314e = new d(e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final d f20315f = new d(e.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final d f20316g = new d(e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final d f20317h = new d(e.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final d f20318i = new d(e.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: j, reason: collision with root package name */
        private final l f20319j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(null);
            kotlin.jvm.internal.l.f(lVar, "elementType");
            this.f20319j = lVar;
        }

        public final l i() {
            return this.f20319j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final d a() {
            return l.f20311b;
        }

        public final d b() {
            return l.f20313d;
        }

        public final d c() {
            return l.f20312c;
        }

        public final d d() {
            return l.f20318i;
        }

        public final d e() {
            return l.f20316g;
        }

        public final d f() {
            return l.f20315f;
        }

        public final d g() {
            return l.f20317h;
        }

        public final d h() {
            return l.f20314e;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l {

        /* renamed from: j, reason: collision with root package name */
        private final String f20320j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            kotlin.jvm.internal.l.f(str, "internalName");
            this.f20320j = str;
        }

        public final String i() {
            return this.f20320j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l {

        /* renamed from: j, reason: collision with root package name */
        private final e f20321j;

        public d(e eVar) {
            super(null);
            this.f20321j = eVar;
        }

        public final e i() {
            return this.f20321j;
        }
    }

    private l() {
    }

    public /* synthetic */ l(g gVar) {
        this();
    }

    public String toString() {
        return n.a.a(this);
    }
}
