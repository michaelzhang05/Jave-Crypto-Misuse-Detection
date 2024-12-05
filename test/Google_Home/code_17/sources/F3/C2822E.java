package f3;

import e3.C2785I;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2822E implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31878b = new a(null);

    /* renamed from: f3.E$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: f3.E$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31879a;

        static {
            int[] iArr = new int[C2785I.c.values().length];
            try {
                iArr[C2785I.c.f31365c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2785I.c.f31366d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31879a = iArr;
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2785I a(JSONObject json) {
        C2785I c2785i;
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "id");
        y2.e eVar = y2.e.f40920a;
        Long j8 = eVar.j(json, "created");
        C2785I.c a8 = C2785I.c.f31364b.a(y2.e.l(json, "type"));
        if (a8 == null || l8 == null || j8 == null) {
            return null;
        }
        boolean f8 = eVar.f(json, "used");
        boolean f9 = eVar.f(json, "livemode");
        Date date = new Date(TimeUnit.SECONDS.toMillis(j8.longValue()));
        int i8 = b.f31879a[a8.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                c2785i = new C2785I(l8, a8, date, f9, f8, null, null, 96, null);
            } else {
                C2785I.c cVar = C2785I.c.f31366d;
                JSONObject optJSONObject = json.optJSONObject(cVar.b());
                if (optJSONObject == null) {
                    return null;
                }
                c2785i = new C2785I(l8, cVar, date, f9, f8, new C2827c().a(optJSONObject), null, 64, null);
            }
        } else {
            C2785I.c cVar2 = C2785I.c.f31365c;
            JSONObject optJSONObject2 = json.optJSONObject(cVar2.b());
            if (optJSONObject2 == null) {
                return null;
            }
            c2785i = new C2785I(l8, cVar2, date, f9, f8, null, new C2828d().a(optJSONObject2), 32, null);
        }
        return c2785i;
    }
}
