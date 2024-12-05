package kotlin.reflect.x.internal.l0.d.a.l0.m;

import java.util.Set;
import kotlin.collections.t0;
import kotlin.collections.v0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.d.a.j0.k;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes2.dex */
public final class a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final b f20072b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20073c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<e1> f20074d;

    /* renamed from: e, reason: collision with root package name */
    private final m0 f20075e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(k kVar, b bVar, boolean z, Set<? extends e1> set, m0 m0Var) {
        l.f(kVar, "howThisTypeIsUsed");
        l.f(bVar, "flexibility");
        this.a = kVar;
        this.f20072b = bVar;
        this.f20073c = z;
        this.f20074d = set;
        this.f20075e = m0Var;
    }

    public static /* synthetic */ a b(a aVar, k kVar, b bVar, boolean z, Set set, m0 m0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = aVar.a;
        }
        if ((i2 & 2) != 0) {
            bVar = aVar.f20072b;
        }
        b bVar2 = bVar;
        if ((i2 & 4) != 0) {
            z = aVar.f20073c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            set = aVar.f20074d;
        }
        Set set2 = set;
        if ((i2 & 16) != 0) {
            m0Var = aVar.f20075e;
        }
        return aVar.a(kVar, bVar2, z2, set2, m0Var);
    }

    public final a a(k kVar, b bVar, boolean z, Set<? extends e1> set, m0 m0Var) {
        l.f(kVar, "howThisTypeIsUsed");
        l.f(bVar, "flexibility");
        return new a(kVar, bVar, z, set, m0Var);
    }

    public final m0 c() {
        return this.f20075e;
    }

    public final b d() {
        return this.f20072b;
    }

    public final k e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f20072b == aVar.f20072b && this.f20073c == aVar.f20073c && l.a(this.f20074d, aVar.f20074d) && l.a(this.f20075e, aVar.f20075e);
    }

    public final Set<e1> f() {
        return this.f20074d;
    }

    public final boolean g() {
        return this.f20073c;
    }

    public final a h(m0 m0Var) {
        return b(this, null, null, false, null, m0Var, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.f20072b.hashCode()) * 31;
        boolean z = this.f20073c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Set<e1> set = this.f20074d;
        int hashCode2 = (i3 + (set == null ? 0 : set.hashCode())) * 31;
        m0 m0Var = this.f20075e;
        return hashCode2 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final a i(b bVar) {
        l.f(bVar, "flexibility");
        return b(this, null, bVar, false, null, null, 29, null);
    }

    public final a j(e1 e1Var) {
        l.f(e1Var, "typeParameter");
        Set<e1> set = this.f20074d;
        return b(this, null, null, false, set != null ? v0.k(set, e1Var) : t0.c(e1Var), null, 23, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.f20072b + ", isForAnnotationParameter=" + this.f20073c + ", visitedTypeParameters=" + this.f20074d + ", defaultType=" + this.f20075e + ')';
    }

    public /* synthetic */ a(k kVar, b bVar, boolean z, Set set, m0 m0Var, int i2, g gVar) {
        this(kVar, (i2 & 2) != 0 ? b.INFLEXIBLE : bVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : set, (i2 & 16) != 0 ? null : m0Var);
    }
}
