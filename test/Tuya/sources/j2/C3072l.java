package j2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r2.C3681a;

/* renamed from: j2.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3072l {

    /* renamed from: d, reason: collision with root package name */
    private static final a f32998d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f32999a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33000b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33001c;

    /* renamed from: j2.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3072l(String publishableKey, String str) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        this.f32999a = str;
        this.f33000b = C3681a.f37559a.a().b(publishableKey);
        this.f33001c = "20.49.0";
    }

    private final String a() {
        String str = this.f32999a;
        if (str != null) {
            String str2 = this.f33000b + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.f33000b;
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.f33001c).put("stripe:publishableKey", a()));
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3072l(Context context) {
        this(r.f33061c.a(context));
        AbstractC3159y.i(context, "context");
    }

    private C3072l(r rVar) {
        this(rVar.e(), rVar.f());
    }
}
