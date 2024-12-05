package u2;

import P5.AbstractC1378t;
import P5.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4055b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f39941c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C4055b f39942d = new C4055b("2020-03-02", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    private final String f39943a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f39944b;

    /* renamed from: u2.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C4055b a() {
            return C4055b.f39942d;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C4055b(String version, Set betaCodes) {
        AbstractC3255y.i(version, "version");
        AbstractC3255y.i(betaCodes, "betaCodes");
        this.f39943a = version;
        this.f39944b = betaCodes;
    }

    public final String b() {
        List e8 = AbstractC1378t.e(this.f39943a);
        Set set = this.f39944b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC1378t.w0(AbstractC1378t.G0(e8, arrayList), ";", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4055b)) {
            return false;
        }
        C4055b c4055b = (C4055b) obj;
        if (AbstractC3255y.d(this.f39943a, c4055b.f39943a) && AbstractC3255y.d(this.f39944b, c4055b.f39944b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39943a.hashCode() * 31) + this.f39944b.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.f39943a + ", betaCodes=" + this.f39944b + ")";
    }

    public /* synthetic */ C4055b(String str, Set set, int i8, AbstractC3247p abstractC3247p) {
        this(str, (i8 & 2) != 0 ? a0.f() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4055b(Set betas) {
        this("2020-03-02", betas);
        AbstractC3255y.i(betas, "betas");
    }
}
