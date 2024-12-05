package x2;

import M5.Q;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import org.json.JSONObject;
import r2.C3683c;

/* renamed from: x2.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3866D {

    /* renamed from: b, reason: collision with root package name */
    public static final b f39113b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function1 f39114c = a.f39116a;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f39115a;

    /* renamed from: x2.D$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39116a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String name) {
            AbstractC3159y.i(name, "name");
            String property = System.getProperty(name);
            if (property == null) {
                return "";
            }
            return property;
        }
    }

    /* renamed from: x2.D$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3866D(Function1 systemPropertySupplier) {
        AbstractC3159y.i(systemPropertySupplier, "systemPropertySupplier");
        this.f39115a = systemPropertySupplier;
    }

    public final Map a(C3683c c3683c) {
        return Q.e(L5.x.a("X-Stripe-Client-User-Agent", b(c3683c).toString()));
    }

    public final JSONObject b(C3683c c3683c) {
        Map map;
        Map k8 = Q.k(L5.x.a("os.name", "android"), L5.x.a("os.version", String.valueOf(Build.VERSION.SDK_INT)), L5.x.a("bindings.version", "20.49.0"), L5.x.a("lang", "Java"), L5.x.a("publisher", "Stripe"), L5.x.a("http.agent", this.f39115a.invoke("http.agent")));
        if (c3683c != null) {
            map = c3683c.b();
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return new JSONObject(Q.q(k8, map));
    }

    public /* synthetic */ C3866D(Function1 function1, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? f39114c : function1);
    }
}
