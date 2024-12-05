package B3;

import L5.x;
import M5.Q;
import com.stripe.android.financialconnections.R;
import f6.AbstractC2683j;
import g6.l;
import j2.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f741a = a.f742a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f742a = new a();

        private a() {
        }

        public final int a(String str) {
            Integer num;
            if (str == null) {
                return R.drawable.stripe_ic_bank;
            }
            l lVar = l.f31324c;
            Map k8 = Q.k(x.a(new g6.j("Bank of America", lVar), Integer.valueOf(z.f33141h)), x.a(new g6.j("Capital One", lVar), Integer.valueOf(z.f33143j)), x.a(new g6.j("Citibank", lVar), Integer.valueOf(z.f33145l)), x.a(new g6.j("BBVA|COMPASS", lVar), Integer.valueOf(z.f33146m)), x.a(new g6.j("MORGAN CHASE|JP MORGAN|Chase", lVar), Integer.valueOf(z.f33154u)), x.a(new g6.j("NAVY FEDERAL CREDIT UNION", lVar), Integer.valueOf(z.f33156w)), x.a(new g6.j("PNC\\s?BANK|PNC Bank", lVar), Integer.valueOf(z.f33158y)), x.a(new g6.j("SUNTRUST|SunTrust Bank", lVar), Integer.valueOf(z.f33117E)), x.a(new g6.j("Silicon Valley Bank", lVar), Integer.valueOf(z.f33118F)), x.a(new g6.j("Stripe|TestInstitution", lVar), Integer.valueOf(z.f33116D)), x.a(new g6.j("TD Bank", lVar), Integer.valueOf(z.f33119G)), x.a(new g6.j("USAA FEDERAL SAVINGS BANK|USAA Bank", lVar), Integer.valueOf(z.f33121I)), x.a(new g6.j("U\\.?S\\. BANK|US Bank", lVar), Integer.valueOf(z.f33122J)), x.a(new g6.j("Wells Fargo", lVar), Integer.valueOf(z.f33123K)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = k8.entrySet().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (AbstractC2683j.l(g6.j.d((g6.j) entry.getKey(), str, 0, 2, null))) {
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
