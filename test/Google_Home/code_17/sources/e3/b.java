package E3;

import O5.x;
import P5.Q;
import com.stripe.android.financialconnections.R;
import i6.AbstractC3001j;
import j6.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m2.z;

/* loaded from: classes4.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2336a = a.f2337a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f2337a = new a();

        private a() {
        }

        public final int a(String str) {
            Integer num;
            if (str == null) {
                return R.drawable.stripe_ic_bank;
            }
            l lVar = l.f34051c;
            Map k8 = Q.k(x.a(new j6.j("Bank of America", lVar), Integer.valueOf(z.f35117h)), x.a(new j6.j("Capital One", lVar), Integer.valueOf(z.f35119j)), x.a(new j6.j("Citibank", lVar), Integer.valueOf(z.f35121l)), x.a(new j6.j("BBVA|COMPASS", lVar), Integer.valueOf(z.f35122m)), x.a(new j6.j("MORGAN CHASE|JP MORGAN|Chase", lVar), Integer.valueOf(z.f35130u)), x.a(new j6.j("NAVY FEDERAL CREDIT UNION", lVar), Integer.valueOf(z.f35132w)), x.a(new j6.j("PNC\\s?BANK|PNC Bank", lVar), Integer.valueOf(z.f35134y)), x.a(new j6.j("SUNTRUST|SunTrust Bank", lVar), Integer.valueOf(z.f35093E)), x.a(new j6.j("Silicon Valley Bank", lVar), Integer.valueOf(z.f35094F)), x.a(new j6.j("Stripe|TestInstitution", lVar), Integer.valueOf(z.f35092D)), x.a(new j6.j("TD Bank", lVar), Integer.valueOf(z.f35095G)), x.a(new j6.j("USAA FEDERAL SAVINGS BANK|USAA Bank", lVar), Integer.valueOf(z.f35097I)), x.a(new j6.j("U\\.?S\\. BANK|US Bank", lVar), Integer.valueOf(z.f35098J)), x.a(new j6.j("Wells Fargo", lVar), Integer.valueOf(z.f35099K)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = k8.entrySet().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (AbstractC3001j.l(j6.j.d((j6.j) entry.getKey(), str, 0, 2, null))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Integer num2 = (Integer) ((Map.Entry) it2.next()).getValue();
                if (num2 != null) {
                    num = num2;
                    break;
                }
            }
            if (num != null) {
                return num.intValue();
            }
            return R.drawable.stripe_ic_bank;
        }
    }
}
