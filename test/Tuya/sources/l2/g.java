package l2;

import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import b3.C1866a;
import b3.C1868c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f33826a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f33827b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f33828c;

    static {
        C1868c c1868c = new C1868c("4000000000000000", "4999999999999999");
        C1866a.EnumC0355a enumC0355a = C1866a.EnumC0355a.f14406j;
        f33827b = Q.k(x.a("4000002500001001", AbstractC1246t.p(new C1866a(c1868c, 16, enumC0355a, null, 8, null), new C1866a(new C1868c("4000000000000000", "4999999999999999"), 16, C1866a.EnumC0355a.f14399c, null, 8, null))), x.a("5555552500001001", AbstractC1246t.p(new C1866a(new C1868c("5100000000000000", "5599999999999999"), 16, enumC0355a, null, 8, null), new C1866a(new C1868c("5100000000000000", "5599999999999999"), 16, C1866a.EnumC0355a.f14400d, null, 8, null))));
        f33828c = 8;
    }

    private g() {
    }

    public final List a(f.b cardNumber) {
        List list;
        AbstractC3159y.i(cardNumber, "cardNumber");
        Map map = f33827b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (g6.n.C(cardNumber.g(), (String) entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC1246t.L0(linkedHashMap.entrySet());
        if (entry2 != null) {
            list = (List) entry2.getValue();
        }
        if (list == null) {
            return AbstractC1246t.m();
        }
        return list;
    }
}
