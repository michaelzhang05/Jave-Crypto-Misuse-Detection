package q;

import L5.I;
import M5.AbstractC1239l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import c.C1895i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v5.C3832b;
import v5.EnumC3833c;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3639m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final C6.a f37183a;

    /* renamed from: b, reason: collision with root package name */
    public final L7.i f37184b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f37185c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37186d;

    /* renamed from: q.m$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC3160z implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            I i8;
            ChoiceCmpCallback choiceCmpCallback;
            ChoiceCmpCallback choiceCmpCallback2;
            USRegulationData uSRegulationData = (USRegulationData) obj;
            if (uSRegulationData == null || (choiceCmpCallback2 = C3639m.this.f37185c) == null) {
                i8 = null;
            } else {
                choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
                i8 = I.f6487a;
            }
            if (i8 == null && (choiceCmpCallback = C3639m.this.f37185c) != null) {
                choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
            }
            return I.f6487a;
        }
    }

    public C3639m(C6.a mspaConfig, L7.i gbcConsentRepository, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3159y.i(mspaConfig, "mspaConfig");
        AbstractC3159y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f37183a = mspaConfig;
        this.f37184b = gbcConsentRepository;
        this.f37185c = choiceCmpCallback;
        this.f37186d = 2;
    }

    public final LiveData a() {
        if (C1895i.f14840b) {
            this.f37184b.a();
        }
        C6.d dVar = C6.d.f1320a;
        C6.a mspaConfig = this.f37183a;
        a completion = new a();
        AbstractC3159y.i(mspaConfig, "mspaConfig");
        AbstractC3159y.i(completion, "completion");
        D6.e eVar = C6.d.f1323d;
        if (eVar != null) {
            List<C6.e> purposes = mspaConfig.f1301d;
            if (purposes != null) {
                C6.c completion2 = new C6.c(completion);
                AbstractC3159y.i(purposes, "purposes");
                AbstractC3159y.i(completion2, "completion");
                for (C6.e eVar2 : purposes) {
                    eVar2.f1332d = Boolean.FALSE;
                    List list = eVar2.f1335g;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C6.f) it.next()).f1339d = Boolean.FALSE;
                        }
                    }
                }
                eVar.e(purposes, true, new D6.d(completion2));
            }
        } else {
            C3832b.b(C3832b.f38876a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, EnumC3833c.CONSOLE, null, 22);
            completion.invoke(null);
        }
        return H7.m.f3657a.a(H7.n.ACCEPT_ALL, H7.a.ACCEPT_ALL);
    }

    public final List b(int[] iArr) {
        ArrayList<C6.e> arrayList;
        boolean U7;
        String str;
        ArrayList arrayList2 = new ArrayList();
        List list = this.f37183a.f1301d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((C6.e) obj).f1329a;
                if (num == null) {
                    U7 = false;
                } else {
                    U7 = AbstractC1239l.U(iArr, num.intValue());
                }
                if (U7) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (C6.e eVar : arrayList) {
                Integer num2 = eVar.f1329a;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    G5.a aVar = eVar.f1333e;
                    if (aVar == null) {
                        str = null;
                    } else {
                        str = aVar.f3211c;
                    }
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(new R7.d(new B6.f(intValue, str), eVar.f1332d, null, R7.e.MSPA_PURPOSE, false, null, null, 116));
                }
            }
        }
        return arrayList2;
    }
}
