package F5;

import B5.i;
import F5.d;
import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class f extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f2805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(T t8) {
        super(2);
        this.f2805a = t8;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        String str;
        int intValue3;
        int intValue4;
        String hash = (String) obj;
        Set vendorIds = (Set) obj2;
        AbstractC3255y.i(hash, "hash");
        AbstractC3255y.i(vendorIds, "vendorIds");
        i a8 = i.f943c.a(hash);
        T t8 = this.f2805a;
        String str2 = (String) t8.f34162a;
        d.a aVar = d.f2803a;
        Integer valueOf = Integer.valueOf(a8.f944a);
        D5.c cVar = D5.c.f2210a;
        Integer a9 = cVar.a(D5.d.PURPOSE_ID);
        int i8 = 0;
        if (a9 == null) {
            intValue = 0;
        } else {
            intValue = a9.intValue();
        }
        t8.f34162a = AbstractC3255y.q(str2, aVar.b(valueOf, intValue));
        T t9 = this.f2805a;
        String str3 = (String) t9.f34162a;
        Integer valueOf2 = Integer.valueOf(a8.f945b.f954a);
        Integer a10 = cVar.a(D5.d.RESTRICTION_TYPE);
        if (a10 == null) {
            intValue2 = 0;
        } else {
            intValue2 = a10.intValue();
        }
        t9.f34162a = AbstractC3255y.q(str3, aVar.b(valueOf2, intValue2));
        List O02 = AbstractC1378t.O0(vendorIds);
        int size = O02.size();
        String str4 = "";
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            while (i9 < size) {
                int i12 = i9 + 1;
                int intValue5 = ((Number) O02.get(i9)).intValue();
                if (i11 == 0) {
                    i10++;
                    i11 = intValue5;
                }
                boolean z8 = true;
                if (i9 != O02.size() - 1 && ((Number) O02.get(i12)).intValue() <= intValue5 + 1) {
                    i9 = i12;
                } else {
                    if (intValue5 == i11) {
                        z8 = false;
                    }
                    if (z8) {
                        str = "1";
                    } else {
                        str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    String q8 = AbstractC3255y.q(str4, str);
                    d.a aVar2 = d.f2803a;
                    Integer valueOf3 = Integer.valueOf(i11);
                    D5.c cVar2 = D5.c.f2210a;
                    D5.d dVar = D5.d.VENDOR_ID;
                    Integer a11 = cVar2.a(dVar);
                    if (a11 == null) {
                        intValue3 = 0;
                    } else {
                        intValue3 = a11.intValue();
                    }
                    str4 = AbstractC3255y.q(q8, aVar2.b(valueOf3, intValue3));
                    if (z8) {
                        Integer valueOf4 = Integer.valueOf(intValue5);
                        Integer a12 = cVar2.a(dVar);
                        if (a12 == null) {
                            intValue4 = 0;
                        } else {
                            intValue4 = a12.intValue();
                        }
                        str4 = AbstractC3255y.q(str4, aVar2.b(valueOf4, intValue4));
                    }
                    i9 = i12;
                }
            }
            break loop0;
        }
        T t10 = this.f2805a;
        String str5 = (String) t10.f34162a;
        d.a aVar3 = d.f2803a;
        Integer valueOf5 = Integer.valueOf(i10);
        Integer a13 = D5.c.f2210a.a(D5.d.NUM_ENTRIES);
        if (a13 != null) {
            i8 = a13.intValue();
        }
        t10.f34162a = AbstractC3255y.q(str5, aVar3.b(valueOf5, i8));
        T t11 = this.f2805a;
        t11.f34162a = AbstractC3255y.q((String) t11.f34162a, str4);
        return I.f8278a;
    }
}
