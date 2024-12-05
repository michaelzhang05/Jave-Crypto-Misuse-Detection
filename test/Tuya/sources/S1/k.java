package s1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import t1.AbstractC3778i;
import t1.AbstractC3779j;
import t1.l;

/* loaded from: classes3.dex */
public class k extends AbstractC3733a {
    public k(List list) {
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        if (str.charAt(16) == '1') {
            this.f37835a = l.a(str.substring(17));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List a8 = AbstractC3778i.a(str.substring(17));
        for (int i8 = 0; i8 < a8.size(); i8++) {
            if (((Boolean) a8.get(i8)).booleanValue()) {
                arrayList.add(Integer.valueOf(i8 + 1));
            }
        }
        this.f37835a = arrayList;
    }

    @Override // s1.AbstractC3733a
    public String b() {
        int i8;
        if (((List) this.f37835a).size() > 0) {
            i8 = ((Integer) ((List) this.f37835a).get(((List) r0).size() - 1)).intValue();
        } else {
            i8 = 0;
        }
        String b8 = l.b((List) this.f37835a);
        if (b8.length() <= i8) {
            return AbstractC3779j.b(i8, 16) + "1" + b8;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == ((Integer) ((List) this.f37835a).get(i9)).intValue() - 1) {
                arrayList.add(Boolean.TRUE);
                i9++;
            } else {
                arrayList.add(Boolean.FALSE);
            }
        }
        return AbstractC3779j.b(i8, 16) + MBridgeConstans.ENDCARD_URL_TYPE_PL + AbstractC3778i.b(arrayList, i8);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        int i9 = i8 + 16;
        int a8 = AbstractC3779j.a(str.substring(i8, i9));
        if (str.charAt(i9) == '1') {
            StringBuilder sb = new StringBuilder();
            int i10 = i8 + 17;
            sb.append(str.substring(i8, i10));
            sb.append(new C3740h().e(str, i10));
            return sb.toString();
        }
        return str.substring(i8, i8 + 17 + a8);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
