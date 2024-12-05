package m2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import u2.C4054a;

/* renamed from: m2.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3426l {

    /* renamed from: d, reason: collision with root package name */
    private static final a f34974d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f34975a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34976b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34977c;

    /* renamed from: m2.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3426l(String publishableKey, String str) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        this.f34975a = str;
        this.f34976b = C4054a.f39939a.a().b(publishableKey);
        this.f34977c = "20.49.0";
    }

    private final String a() {
        String str = this.f34975a;
        if (str != null) {
            String str2 = this.f34976b + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.f34976b;
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.f34977c).put("stripe:publishableKey", a()));
        AbstractC3255y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3426l(Context context) {
        this(r.f35037c.a(context));
        AbstractC3255y.i(context, "context");
    }

    private C3426l(r rVar) {
        this(rVar.g(), rVar.h());
    }
}
