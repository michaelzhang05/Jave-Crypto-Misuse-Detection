package kotlin.reflect.x.internal.l0.e.z;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.v;
import kotlin.reflect.x.internal.l0.e.w;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final h f20704b;

    /* renamed from: c, reason: collision with root package name */
    private final List<v> f20705c;

    /* compiled from: VersionRequirement.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h a(w wVar) {
            l.f(wVar, "table");
            if (wVar.v() == 0) {
                return b();
            }
            List<v> y = wVar.y();
            l.e(y, "table.requirementList");
            return new h(y, null);
        }

        public final h b() {
            return h.f20704b;
        }
    }

    static {
        List i2;
        i2 = t.i();
        f20704b = new h(i2);
    }

    private h(List<v> list) {
        this.f20705c = list;
    }

    public /* synthetic */ h(List list, g gVar) {
        this(list);
    }
}
