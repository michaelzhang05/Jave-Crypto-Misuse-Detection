package kotlin.reflect.x.internal.l0.f;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.text.u;

/* compiled from: CallableId.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final C0330a a = new C0330a(null);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final f f20706b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final c f20707c;

    /* renamed from: d, reason: collision with root package name */
    private final c f20708d;

    /* renamed from: e, reason: collision with root package name */
    private final c f20709e;

    /* renamed from: f, reason: collision with root package name */
    private final f f20710f;

    /* renamed from: g, reason: collision with root package name */
    private final c f20711g;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.f0.x.e.l0.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0330a {
        private C0330a() {
        }

        public /* synthetic */ C0330a(g gVar) {
            this();
        }
    }

    static {
        f fVar = h.l;
        f20706b = fVar;
        c k2 = c.k(fVar);
        l.e(k2, "topLevel(LOCAL_NAME)");
        f20707c = k2;
    }

    public a(c cVar, c cVar2, f fVar, c cVar3) {
        l.f(cVar, "packageName");
        l.f(fVar, "callableName");
        this.f20708d = cVar;
        this.f20709e = cVar2;
        this.f20710f = fVar;
        this.f20711g = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f20708d, aVar.f20708d) && l.a(this.f20709e, aVar.f20709e) && l.a(this.f20710f, aVar.f20710f) && l.a(this.f20711g, aVar.f20711g);
    }

    public int hashCode() {
        int hashCode = this.f20708d.hashCode() * 31;
        c cVar = this.f20709e;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f20710f.hashCode()) * 31;
        c cVar2 = this.f20711g;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public String toString() {
        String v;
        StringBuilder sb = new StringBuilder();
        String b2 = this.f20708d.b();
        l.e(b2, "packageName.asString()");
        v = u.v(b2, '.', '/', false, 4, null);
        sb.append(v);
        sb.append("/");
        c cVar = this.f20709e;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f20710f);
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i2, g gVar) {
        this(cVar, cVar2, fVar, (i2 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f fVar) {
        this(cVar, null, fVar, null, 8, null);
        l.f(cVar, "packageName");
        l.f(fVar, "callableName");
    }
}
