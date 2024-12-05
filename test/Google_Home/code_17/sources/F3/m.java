package f3;

import P5.AbstractC1378t;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class m implements InterfaceC4225a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f31896f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f31897b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.a f31898c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31899d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f31900e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31901a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.f25418c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.f25419d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.f25420e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31901a = iArr;
        }
    }

    public m(String str, i.b.a paymentMode, String apiKey, Function0 timeProvider) {
        AbstractC3255y.i(paymentMode, "paymentMode");
        AbstractC3255y.i(apiKey, "apiKey");
        AbstractC3255y.i(timeProvider, "timeProvider");
        this.f31897b = str;
        this.f31898c = paymentMode;
        this.f31899d = apiKey;
        this.f31900e = timeProvider;
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n a(JSONObject json) {
        n.b bVar;
        AbstractC3255y.i(json, "json");
        InterfaceC4225a.C0936a c0936a = InterfaceC4225a.f41117a;
        List a8 = c0936a.a(json.optJSONArray("payment_method_types"));
        List a9 = c0936a.a(json.optJSONArray("unactivated_payment_method_types"));
        List a10 = c0936a.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(a10, 10));
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String l8 = y2.e.l(json, "country_code");
        int i8 = b.f31901a[this.f31898c.b().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    bVar = n.b.f25420e;
                } else {
                    throw new O5.p();
                }
            } else {
                bVar = n.b.f25419d;
            }
        } else {
            bVar = n.b.f25418c;
        }
        n.b bVar2 = bVar;
        String str = this.f31897b;
        boolean z8 = !j6.n.H(this.f31899d, "test", false, 2, null);
        return new com.stripe.android.model.n(str, a8, Long.valueOf(this.f31898c.a()), 0L, null, bVar2, null, null, l8, ((Number) this.f31900e.invoke()).longValue(), this.f31898c.M(), null, z8, null, null, null, null, this.f31898c.G(), null, null, a9, arrayList, null, null, 13494424, null);
    }
}
