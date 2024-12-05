package v1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import w1.AbstractC4132i;
import w1.AbstractC4133j;
import w1.l;

/* loaded from: classes4.dex */
public class k extends AbstractC4086a {
    public k(List list) {
        d(list);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        if (str.charAt(16) == '1') {
            this.f40108a = l.a(str.substring(17));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List a8 = AbstractC4132i.a(str.substring(17));
        for (int i8 = 0; i8 < a8.size(); i8++) {
            if (((Boolean) a8.get(i8)).booleanValue()) {
                arrayList.add(Integer.valueOf(i8 + 1));
            }
        }
        this.f40108a = arrayList;
    }

    @Override // v1.AbstractC4086a
    public String b() {
        int i8;
        if (((List) this.f40108a).size() > 0) {
            i8 = ((Integer) ((List) this.f40108a).get(((List) r0).size() - 1)).intValue();
        } else {
            i8 = 0;
        }
        String b8 = l.b((List) this.f40108a);
        if (b8.length() <= i8) {
            return AbstractC4133j.b(i8, 16) + "1" + b8;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == ((Integer) ((List) this.f40108a).get(i9)).intValue() - 1) {
                arrayList.add(Boolean.TRUE);
                i9++;
            } else {
                arrayList.add(Boolean.FALSE);
            }
        }
        return AbstractC4133j.b(i8, 16) + MBridgeConstans.ENDCARD_URL_TYPE_PL + AbstractC4132i.b(arrayList, i8);
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        int i9 = i8 + 16;
        int a8 = AbstractC4133j.a(str.substring(i8, i9));
        if (str.charAt(i9) == '1') {
            StringBuilder sb = new StringBuilder();
            int i10 = i8 + 17;
            sb.append(str.substring(i8, i10));
            sb.append(new C4093h().e(str, i10));
            return sb.toString();
        }
        return str.substring(i8, i8 + 17 + a8);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
