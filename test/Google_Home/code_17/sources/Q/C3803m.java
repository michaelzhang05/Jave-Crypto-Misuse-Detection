package q;

import O5.I;
import P5.AbstractC1371l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import c.C2001i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y5.C4209b;
import y5.EnumC4210c;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3803m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final F6.a f38044a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.i f38045b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f38046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38047d;

    /* renamed from: q.m$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC3256z implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            I i8;
            ChoiceCmpCallback choiceCmpCallback;
            ChoiceCmpCallback choiceCmpCallback2;
            USRegulationData uSRegulationData = (USRegulationData) obj;
            if (uSRegulationData == null || (choiceCmpCallback2 = C3803m.this.f38046c) == null) {
                i8 = null;
            } else {
                choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
                i8 = I.f8278a;
            }
            if (i8 == null && (choiceCmpCallback = C3803m.this.f38046c) != null) {
                choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
            }
            return I.f8278a;
        }
    }

    public C3803m(F6.a mspaConfig, O7.i gbcConsentRepository, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3255y.i(mspaConfig, "mspaConfig");
        AbstractC3255y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f38044a = mspaConfig;
        this.f38045b = gbcConsentRepository;
        this.f38046c = choiceCmpCallback;
        this.f38047d = 2;
    }

    public final LiveData a() {
        if (C2001i.f15552b) {
            this.f38045b.a();
        }
        F6.d dVar = F6.d.f2830a;
        F6.a mspaConfig = this.f38044a;
        a completion = new a();
        AbstractC3255y.i(mspaConfig, "mspaConfig");
        AbstractC3255y.i(completion, "completion");
        G6.e eVar = F6.d.f2833d;
        if (eVar != null) {
            List<F6.e> purposes = mspaConfig.f2811d;
            if (purposes != null) {
                F6.c completion2 = new F6.c(completion);
                AbstractC3255y.i(purposes, "purposes");
                AbstractC3255y.i(completion2, "completion");
                for (F6.e eVar2 : purposes) {
                    eVar2.f2842d = Boolean.FALSE;
                    List list = eVar2.f2845g;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((F6.f) it.next()).f2849d = Boolean.FALSE;
                        }
                    }
                }
                eVar.e(purposes, true, new G6.d(completion2));
            }
        } else {
            C4209b.b(C4209b.f41007a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, EnumC4210c.CONSOLE, null, 22);
            completion.invoke(null);
        }
        return K7.m.f5260a.a(K7.n.ACCEPT_ALL, K7.a.ACCEPT_ALL);
    }

    public final List b(int[] iArr) {
        ArrayList<F6.e> arrayList;
        boolean U8;
        String str;
        ArrayList arrayList2 = new ArrayList();
        List list = this.f38044a.f2811d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((F6.e) obj).f2839a;
                if (num == null) {
                    U8 = false;
                } else {
                    U8 = AbstractC1371l.U(iArr, num.intValue());
                }
                if (U8) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (F6.e eVar : arrayList) {
                Integer num2 = eVar.f2839a;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    J5.a aVar = eVar.f2843e;
                    if (aVar == null) {
                        str = null;
                    } else {
                        str = aVar.f4930c;
                    }
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(new U7.d(new E6.f(intValue, str), eVar.f2842d, null, U7.e.MSPA_PURPOSE, false, null, null, 116));
                }
            }
        }
        return arrayList2;
    }
}
