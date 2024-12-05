package kotlin.reflect.x.internal.l0.d.a;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes2.dex */
public final class v {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final v f20200b = new v(f0.STRICT, null, null, 6, null);

    /* renamed from: c, reason: collision with root package name */
    private final f0 f20201c;

    /* renamed from: d, reason: collision with root package name */
    private final KotlinVersion f20202d;

    /* renamed from: e, reason: collision with root package name */
    private final f0 f20203e;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final v a() {
            return v.f20200b;
        }
    }

    public v(f0 f0Var, KotlinVersion kotlinVersion, f0 f0Var2) {
        l.f(f0Var, "reportLevelBefore");
        l.f(f0Var2, "reportLevelAfter");
        this.f20201c = f0Var;
        this.f20202d = kotlinVersion;
        this.f20203e = f0Var2;
    }

    public final f0 b() {
        return this.f20203e;
    }

    public final f0 c() {
        return this.f20201c;
    }

    public final KotlinVersion d() {
        return this.f20202d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f20201c == vVar.f20201c && l.a(this.f20202d, vVar.f20202d) && this.f20203e == vVar.f20203e;
    }

    public int hashCode() {
        int hashCode = this.f20201c.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f20202d;
        return ((hashCode + (kotlinVersion == null ? 0 : kotlinVersion.getF19487k())) * 31) + this.f20203e.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f20201c + ", sinceVersion=" + this.f20202d + ", reportLevelAfter=" + this.f20203e + ')';
    }

    public /* synthetic */ v(f0 f0Var, KotlinVersion kotlinVersion, f0 f0Var2, int i2, g gVar) {
        this(f0Var, (i2 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i2 & 4) != 0 ? f0Var : f0Var2);
    }
}
