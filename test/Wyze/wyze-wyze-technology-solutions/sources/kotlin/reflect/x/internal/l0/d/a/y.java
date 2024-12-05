package kotlin.reflect.x.internal.l0.d.a;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.o0;
import kotlin.collections.s;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: Jsr305Settings.kt */
/* loaded from: classes2.dex */
public final class y {
    private final f0 a;

    /* renamed from: b, reason: collision with root package name */
    private final f0 f20209b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<c, f0> f20210c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f20211d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20212e;

    /* compiled from: Jsr305Settings.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<String[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            List c2;
            List a;
            y yVar = y.this;
            c2 = s.c();
            c2.add(yVar.a().f());
            f0 b2 = yVar.b();
            if (b2 != null) {
                c2.add("under-migration:" + b2.f());
            }
            for (Map.Entry<c, f0> entry : yVar.c().entrySet()) {
                c2.add('@' + entry.getKey() + ':' + entry.getValue().f());
            }
            a = s.a(c2);
            Object[] array = a.toArray(new String[0]);
            l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(f0 f0Var, f0 f0Var2, Map<c, ? extends f0> map) {
        Lazy b2;
        l.f(f0Var, "globalLevel");
        l.f(map, "userDefinedLevelForSpecificAnnotation");
        this.a = f0Var;
        this.f20209b = f0Var2;
        this.f20210c = map;
        b2 = i.b(new a());
        this.f20211d = b2;
        f0 f0Var3 = f0.IGNORE;
        this.f20212e = f0Var == f0Var3 && f0Var2 == f0Var3 && map.isEmpty();
    }

    public final f0 a() {
        return this.a;
    }

    public final f0 b() {
        return this.f20209b;
    }

    public final Map<c, f0> c() {
        return this.f20210c;
    }

    public final boolean d() {
        return this.f20212e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.f20209b == yVar.f20209b && l.a(this.f20210c, yVar.f20210c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f0 f0Var = this.f20209b;
        return ((hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31) + this.f20210c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.f20209b + ", userDefinedLevelForSpecificAnnotation=" + this.f20210c + ')';
    }

    public /* synthetic */ y(f0 f0Var, f0 f0Var2, Map map, int i2, g gVar) {
        this(f0Var, (i2 & 2) != 0 ? null : f0Var2, (i2 & 4) != 0 ? o0.i() : map);
    }
}
