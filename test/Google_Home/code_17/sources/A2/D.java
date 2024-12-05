package A2;

import P5.Q;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import org.json.JSONObject;
import u2.C4056c;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public static final b f108b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function1 f109c = a.f111a;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f110a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f111a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String name) {
            AbstractC3255y.i(name, "name");
            String property = System.getProperty(name);
            if (property == null) {
                return "";
            }
            return property;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public D(Function1 systemPropertySupplier) {
        AbstractC3255y.i(systemPropertySupplier, "systemPropertySupplier");
        this.f110a = systemPropertySupplier;
    }

    public final Map a(C4056c c4056c) {
        return Q.e(O5.x.a("X-Stripe-Client-User-Agent", b(c4056c).toString()));
    }

    public final JSONObject b(C4056c c4056c) {
        Map map;
        Map k8 = Q.k(O5.x.a("os.name", "android"), O5.x.a("os.version", String.valueOf(Build.VERSION.SDK_INT)), O5.x.a("bindings.version", "20.49.0"), O5.x.a("lang", "Java"), O5.x.a("publisher", "Stripe"), O5.x.a("http.agent", this.f110a.invoke("http.agent")));
        if (c4056c != null) {
            map = c4056c.a();
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return new JSONObject(Q.q(k8, map));
    }

    public /* synthetic */ D(Function1 function1, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? f109c : function1);
    }
}
