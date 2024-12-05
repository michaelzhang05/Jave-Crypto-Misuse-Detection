package c3;

import androidx.core.app.NotificationCompat;
import d3.AbstractC2554a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1913F implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14905b = new a(null);

    /* renamed from: c3.F$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: c3.F$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14906a;

        static {
            int[] iArr = new int[AbstractC2554a.g.values().length];
            try {
                iArr[AbstractC2554a.g.f30160c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2554a.g.f30161d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2554a.g.f30164g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2554a.g.f30162e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2554a.g.f30163f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2554a.g.f30165h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2554a.g.f30166i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f14906a = iArr;
        }
    }

    private final AbstractC2554a.e c(JSONObject jSONObject) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C1916b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = v2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = v2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C1916b().a(optJSONObject2);
        }
        return new AbstractC2554a.e(aVar, l8, l9, aVar2);
    }

    private final AbstractC2554a.h d(JSONObject jSONObject, String str) {
        com.stripe.android.model.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        com.stripe.android.model.a aVar2 = null;
        if (optJSONObject != null) {
            aVar = new C1916b().a(optJSONObject);
        } else {
            aVar = null;
        }
        String l8 = v2.e.l(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        String l9 = v2.e.l(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_address");
        if (optJSONObject2 != null) {
            aVar2 = new C1916b().a(optJSONObject2);
        }
        return new AbstractC2554a.h(aVar, l8, l9, aVar2, str);
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2554a a(JSONObject json) {
        JSONObject optJSONObject;
        AbstractC3159y.i(json, "json");
        AbstractC2554a.g a8 = AbstractC2554a.g.f30159b.a(v2.e.l(json, "type"));
        if (a8 == null || (optJSONObject = json.optJSONObject(a8.b())) == null) {
            return null;
        }
        String l8 = v2.e.l(json, "dynamic_last4");
        switch (b.f14906a[a8.ordinal()]) {
            case 1:
                return new AbstractC2554a.C0717a(l8);
            case 2:
                return new AbstractC2554a.b(l8);
            case 3:
                return new AbstractC2554a.f(l8);
            case 4:
                return new AbstractC2554a.c(l8);
            case 5:
                return c(optJSONObject);
            case 6:
                return d(optJSONObject, l8);
            case 7:
                return new AbstractC2554a.d(l8);
            default:
                throw new L5.p();
        }
    }
}
