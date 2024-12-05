package f3;

import androidx.core.app.NotificationCompat;
import g3.AbstractC2878a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2823F implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31880b = new a(null);

    /* renamed from: f3.F$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: f3.F$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31881a;

        static {
            int[] iArr = new int[AbstractC2878a.g.values().length];
            try {
                iArr[AbstractC2878a.g.f32040c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2878a.g.f32041d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2878a.g.f32044g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2878a.g.f32042e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2878a.g.f32043f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2878a.g.f32045h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2878a.g.f32046i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f31881a = iArr;
        }
    }

    private final AbstractC2878a.e c(JSONObject jSONObject) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C2826b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = y2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = y2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C2826b().a(optJSONObject2);
        }
        return new AbstractC2878a.e(aVar, l8, l9, aVar2);
    }

    private final AbstractC2878a.h d(JSONObject jSONObject, String str) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C2826b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = y2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = y2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C2826b().a(optJSONObject2);
        }
        return new AbstractC2878a.h(aVar, l8, l9, aVar2, str);
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2878a a(JSONObject json) {
        JSONObject optJSONObject;
        AbstractC3255y.i(json, "json");
        AbstractC2878a.g a8 = AbstractC2878a.g.f32039b.a(y2.e.l(json, "type"));
        if (a8 == null || (optJSONObject = json.optJSONObject(a8.b())) == null) {
            return null;
        }
        String l8 = y2.e.l(json, "dynamic_last4");
        switch (b.f31881a[a8.ordinal()]) {
            case 1:
                return new AbstractC2878a.C0742a(l8);
            case 2:
                return new AbstractC2878a.b(l8);
            case 3:
                return new AbstractC2878a.f(l8);
            case 4:
                return new AbstractC2878a.c(l8);
            case 5:
                return c(optJSONObject);
            case 6:
                return d(optJSONObject, l8);
            case 7:
                return new AbstractC2878a.d(l8);
            default:
                throw new O5.p();
        }
    }
}
