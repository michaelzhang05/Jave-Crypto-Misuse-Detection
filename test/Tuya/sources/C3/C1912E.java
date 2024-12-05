package c3;

import b3.C1864I;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1912E implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14903b = new a(null);

    /* renamed from: c3.E$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: c3.E$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14904a;

        static {
            int[] iArr = new int[C1864I.c.values().length];
            try {
                iArr[C1864I.c.f14359c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1864I.c.f14360d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14904a = iArr;
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1864I a(JSONObject json) {
        C1864I c1864i;
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "id");
        v2.e eVar = v2.e.f38789a;
        Long j8 = eVar.j(json, "created");
        C1864I.c a8 = C1864I.c.f14358b.a(v2.e.l(json, "type"));
        if (a8 == null || l8 == null || j8 == null) {
            return null;
        }
        boolean f8 = eVar.f(json, "used");
        boolean f9 = eVar.f(json, "livemode");
        Date date = new Date(TimeUnit.SECONDS.toMillis(j8.longValue()));
        int i8 = b.f14904a[a8.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                c1864i = new C1864I(l8, a8, date, f9, f8, null, null, 96, null);
            } else {
                C1864I.c cVar = C1864I.c.f14360d;
                JSONObject optJSONObject = json.optJSONObject(cVar.b());
                if (optJSONObject == null) {
                    return null;
                }
                c1864i = new C1864I(l8, cVar, date, f9, f8, new C1917c().a(optJSONObject), null, 64, null);
            }
        } else {
            C1864I.c cVar2 = C1864I.c.f14359c;
            JSONObject optJSONObject2 = json.optJSONObject(cVar2.b());
            if (optJSONObject2 == null) {
                return null;
            }
            c1864i = new C1864I(l8, cVar2, date, f9, f8, null, new C1918d().a(optJSONObject2), 32, null);
        }
        return c1864i;
    }
}
