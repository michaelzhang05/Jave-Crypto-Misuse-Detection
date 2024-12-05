package r2;

import M5.AbstractC1246t;
import M5.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3682b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37561c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C3682b f37562d = new C3682b("2020-03-02", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    private final String f37563a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f37564b;

    /* renamed from: r2.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C3682b a() {
            return C3682b.f37562d;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3682b(String version, Set betaCodes) {
        AbstractC3159y.i(version, "version");
        AbstractC3159y.i(betaCodes, "betaCodes");
        this.f37563a = version;
        this.f37564b = betaCodes;
    }

    public final String b() {
        List e8 = AbstractC1246t.e(this.f37563a);
        Set set = this.f37564b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC1246t.w0(AbstractC1246t.G0(e8, arrayList), ";", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3682b)) {
            return false;
        }
        C3682b c3682b = (C3682b) obj;
        if (AbstractC3159y.d(this.f37563a, c3682b.f37563a) && AbstractC3159y.d(this.f37564b, c3682b.f37564b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f37563a.hashCode() * 31) + this.f37564b.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.f37563a + ", betaCodes=" + this.f37564b + ")";
    }

    public /* synthetic */ C3682b(String str, Set set, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? a0.f() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3682b(Set betas) {
        this("2020-03-02", betas);
        AbstractC3159y.i(betas, "betas");
    }
}
