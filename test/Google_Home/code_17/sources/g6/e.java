package G6;

import O5.I;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import P5.N;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import g6.i;
import g6.m;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import u1.C4053a;
import y5.C4209b;
import y5.EnumC4210c;
import z1.l;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public C4053a f3419a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.f f3420b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f3421c;

    /* renamed from: d, reason: collision with root package name */
    public final USRegulationData f3422d;

    public e() {
        R7.d dVar = R7.d.f9662a;
        this.f3419a = dVar.g();
        this.f3420b = dVar.j();
        this.f3421c = dVar.m();
        this.f3422d = new USRegulationData(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 131071, null);
    }

    public final String a() {
        try {
            String d8 = this.f3419a.d();
            AbstractC3255y.h(d8, "{ gppModel.encode() }");
            return d8;
        } catch (Exception unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, EnumC4210c.CONSOLE, null, 22);
            return "";
        }
    }

    public String b(F6.b field) {
        AbstractC3255y.i(field, "field");
        switch (field.ordinal()) {
            case 0:
                String SHARING_NOTICE = y1.g.f40860b;
                AbstractC3255y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case 1:
                String SALE_OPT_OUT_NOTICE = y1.g.f40861c;
                AbstractC3255y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case 2:
                String SHARING_OPT_OUT_NOTICE = y1.g.f40862d;
                AbstractC3255y.h(SHARING_OPT_OUT_NOTICE, "SHARING_OPT_OUT_NOTICE");
                return SHARING_OPT_OUT_NOTICE;
            case 3:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = y1.g.f40863e;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case 4:
                String SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE = y1.g.f40864f;
                AbstractC3255y.h(SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE, "SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE");
                return SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE;
            case 5:
                String SENSITIVE_DATA_LIMIT_USE_NOTICE = y1.g.f40865g;
                AbstractC3255y.h(SENSITIVE_DATA_LIMIT_USE_NOTICE, "SENSITIVE_DATA_LIMIT_USE_NOTICE");
                return SENSITIVE_DATA_LIMIT_USE_NOTICE;
            case 6:
                String SALE_OPT_OUT = y1.g.f40866h;
                AbstractC3255y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case 7:
                String SHARING_OPT_OUT = y1.g.f40867i;
                AbstractC3255y.h(SHARING_OPT_OUT, "SHARING_OPT_OUT");
                return SHARING_OPT_OUT;
            case 8:
                String TARGETED_ADVERTISING_OPT_OUT = y1.g.f40868j;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case 9:
                String SENSITIVE_DATA_PROCESSING = y1.g.f40869k;
                AbstractC3255y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case 10:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = y1.g.f40870l;
                AbstractC3255y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case 11:
                String PERSONAL_DATA_CONSENTS = y1.g.f40871m;
                AbstractC3255y.h(PERSONAL_DATA_CONSENTS, "PERSONAL_DATA_CONSENTS");
                return PERSONAL_DATA_CONSENTS;
            case 12:
                String MSPA_COVERED_TRANSACTION = y1.g.f40872n;
                AbstractC3255y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case 13:
                String MSPA_OPT_OUT_OPTION_MODE = y1.g.f40873o;
                AbstractC3255y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case 14:
                String MSPA_SERVICE_PROVIDER_MODE = y1.g.f40874p;
                AbstractC3255y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
            default:
                return "";
        }
    }

    public final void c(F6.b field, Object value) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(value, "value");
        try {
            this.f3419a.k(g(), b(field), value);
        } catch (Exception unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, EnumC4210c.CONSOLE, null, 22);
        }
    }

    public void d(F6.b field, boolean z8) {
        List<Integer> p8;
        AbstractC3255y.i(field, "field");
        if (z8) {
            p8 = AbstractC1378t.p(1, 1);
        } else {
            p8 = AbstractC1378t.p(2, 2);
        }
        c(field, p8);
        this.f3422d.setKnownChildSensitiveDataConsents(p8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.ArrayList] */
    public final void e(List purposes, boolean z8, Function1 function1) {
        ?? m8;
        int i8;
        int i9;
        I i10;
        List<F6.f> list;
        F6.b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3255y.i(purposes, "purposes");
        int i17 = this.f3421c.i(Q7.a.SAVED_MSPA_SECTION_ID);
        String str = "";
        this.f3421c.g(n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i17), false, 4, null), "");
        try {
            JSONArray jSONArray = new JSONArray(this.f3421c.j(Q7.a.HDR_SECTION_LIST));
            i s8 = m.s(0, jSONArray.length());
            m8 = new ArrayList(AbstractC1378t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                m8.add(Integer.valueOf(jSONArray.getInt(((N) it).nextInt())));
            }
        } catch (JSONException unused) {
            m8 = AbstractC1378t.m();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m8) {
            if (((Number) obj).intValue() != i17) {
                arrayList.add(obj);
            }
        }
        this.f3421c.e(Q7.a.HDR_SECTION_LIST, arrayList.toString());
        this.f3421c.e(Q7.a.HDR_SECTION_ID, AbstractC1378t.w0(arrayList, "_", null, null, 0, null, null, 62, null));
        this.f3419a.b(i17);
        this.f3421c.e(Q7.a.GPP_STRING, a());
        Iterator it2 = purposes.iterator();
        while (true) {
            int i18 = 2;
            if (it2.hasNext()) {
                F6.e eVar = (F6.e) it2.next();
                Integer num = eVar.f2839a;
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            bVar = F6.b.SharingOptOut;
                            break;
                        case 2:
                            bVar = F6.b.SaleOptOut;
                            break;
                        case 3:
                            bVar = F6.b.TargetedAdvertisingOptOut;
                            break;
                        case 4:
                            bVar = F6.b.PersonalDataConsents;
                            break;
                        case 5:
                            bVar = F6.b.SensitiveDataProcessing;
                            break;
                        case 6:
                            bVar = F6.b.KnownChildSensitiveDataConsents;
                            break;
                        default:
                            bVar = F6.b.NONE;
                            break;
                    }
                    Object obj2 = 0;
                    switch (bVar.ordinal()) {
                        case 6:
                            if (z8) {
                                i11 = 1;
                            } else {
                                i11 = 2;
                            }
                            c(F6.b.SaleOptOutNotice, Integer.valueOf(i11));
                            this.f3422d.setSaleOptOutNotice(i11);
                            if (z8) {
                                if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                            } else {
                                i12 = 0;
                            }
                            Integer valueOf = Integer.valueOf(i12);
                            USRegulationData uSRegulationData = this.f3422d;
                            if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                i18 = 1;
                            }
                            uSRegulationData.setSaleOptOut(i18);
                            c(bVar, valueOf);
                            break;
                        case 7:
                            j(z8);
                            k(z8);
                            if (b(bVar).length() <= 0) {
                                break;
                            } else {
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                } else {
                                    i13 = 0;
                                }
                                Integer valueOf2 = Integer.valueOf(i13);
                                USRegulationData uSRegulationData2 = this.f3422d;
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData2.setSharingOptOut(i18);
                                c(bVar, valueOf2);
                                break;
                            }
                        case 8:
                            if (b(bVar).length() > 0) {
                                l(z8);
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i14 = 1;
                                    } else {
                                        i14 = 2;
                                    }
                                } else {
                                    i14 = 0;
                                }
                                Integer valueOf3 = Integer.valueOf(i14);
                                USRegulationData uSRegulationData3 = this.f3422d;
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData3.setTargetedAdvertisingOptOut(i18);
                                c(bVar, valueOf3);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            List<F6.f> list2 = eVar.f2845g;
                            if (list2 != null) {
                                h(z8);
                                f(z8);
                                int[] iArr = new int[12];
                                for (int i19 = 0; i19 < 12; i19++) {
                                    iArr[i19] = 0;
                                }
                                for (F6.f fVar : list2) {
                                    if (fVar.f2847b != null && new i(1, 12).m(fVar.f2847b.intValue())) {
                                        int intValue = fVar.f2847b.intValue() - 1;
                                        Boolean bool = fVar.f2849d;
                                        if (bool == null) {
                                            bool = eVar.f2842d;
                                        }
                                        if (AbstractC3255y.d(bool, Boolean.TRUE)) {
                                            i15 = 1;
                                        } else {
                                            i15 = 2;
                                        }
                                        iArr[intValue] = i15;
                                    }
                                }
                                obj2 = AbstractC1371l.U0(iArr);
                                this.f3422d.setSensitiveDataProcessing(AbstractC1371l.U0(iArr));
                            }
                            c(bVar, obj2);
                            break;
                        case 10:
                            d(bVar, AbstractC3255y.d(eVar.f2842d, Boolean.TRUE));
                            break;
                        case 11:
                            if (b(bVar).length() <= 0) {
                                break;
                            } else {
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i16 = 1;
                                    } else {
                                        i16 = 2;
                                    }
                                } else {
                                    i16 = 0;
                                }
                                Integer valueOf4 = Integer.valueOf(i16);
                                USRegulationData uSRegulationData4 = this.f3422d;
                                if (z8) {
                                    if (AbstractC3255y.d(eVar.f2842d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData4.setPersonalDataConsents(i18);
                                c(bVar, valueOf4);
                                break;
                            }
                    }
                }
            } else {
                if (this.f3420b.f3925b.f3874K) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                c(F6.b.MspaCoveredTransaction, Integer.valueOf(i8));
                this.f3422d.setMspaCoveredTransaction(i8);
                String str2 = this.f3420b.f3925b.f3875L;
                F6.e eVar2 = null;
                if (str2 == null) {
                    i10 = null;
                } else {
                    if (AbstractC3255y.d(str2, "OPT_OUT")) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    if (AbstractC3255y.d(str2, "SERVICE-PROVIDER")) {
                        i18 = 1;
                    }
                    c(F6.b.MspaOptOutOptionMode, Integer.valueOf(i9));
                    c(F6.b.MspaServiceProviderMode, Integer.valueOf(i18));
                    this.f3422d.setMspaOptOutOptionMode(i9);
                    this.f3422d.setMspaServiceProviderMode(i18);
                    i10 = I.f8278a;
                }
                if (i10 == null) {
                    c(F6.b.MspaOptOutOptionMode, 0);
                    c(F6.b.MspaServiceProviderMode, 0);
                    this.f3422d.setMspaOptOutOptionMode(0);
                    this.f3422d.setMspaServiceProviderMode(0);
                }
                Vector vector = new Vector(null, 1, null);
                Iterator it3 = purposes.iterator();
                while (it3.hasNext()) {
                    F6.e eVar3 = (F6.e) it3.next();
                    Integer num2 = eVar3.f2839a;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (AbstractC3255y.d(eVar3.f2842d, Boolean.TRUE)) {
                            vector.set(intValue2);
                        } else {
                            vector.unset(intValue2);
                        }
                    }
                }
                this.f3421c.d(Q7.a.MSPA_PURPOSE_CONSENT, vector);
                Vector vector2 = new Vector(null, 1, null);
                Iterator it4 = purposes.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        ?? next = it4.next();
                        Integer num3 = ((F6.e) next).f2839a;
                        int b02 = AbstractC1371l.b0(F6.i.f2862c);
                        if (num3 != null && num3.intValue() == b02) {
                            eVar2 = next;
                        }
                    }
                }
                F6.e eVar4 = eVar2;
                if (eVar4 != null && (list = eVar4.f2845g) != null) {
                    for (F6.f fVar2 : list) {
                        Integer num4 = fVar2.f2847b;
                        if (num4 != null) {
                            int intValue3 = num4.intValue();
                            if (AbstractC3255y.d(fVar2.f2849d, Boolean.TRUE)) {
                                vector2.set(intValue3);
                            } else {
                                vector2.unset(intValue3);
                            }
                        }
                    }
                }
                this.f3421c.d(Q7.a.MSPA_SENSITIVE_PURPOSE_CONSENT, vector2);
                R7.d dVar = R7.d.f9662a;
                C4053a gppModel = this.f3419a;
                AbstractC3255y.i(gppModel, "gppModel");
                R7.d.f9676o = gppModel;
                this.f3422d.setGppString(a());
                this.f3422d.setVersion(1);
                this.f3421c.c(Q7.a.SAVED_MSPA_SECTION_ID, i());
                this.f3421c.e(Q7.a.HDR_GPP_VERSION, String.valueOf(this.f3419a.e().g()));
                this.f3421c.e(Q7.a.HDR_SECTION_LIST, this.f3419a.h().toString());
                SharedStorage sharedStorage = this.f3421c;
                Q7.a aVar = Q7.a.HDR_SECTION_ID;
                List h8 = this.f3419a.h();
                AbstractC3255y.h(h8, "gppModel.sectionIds");
                sharedStorage.e(aVar, AbstractC1378t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String A8 = n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i()), false, 4, null);
                SharedStorage sharedStorage2 = this.f3421c;
                try {
                    String b8 = this.f3419a.g(g()).b();
                    AbstractC3255y.h(b8, "{\n            gppModel.g…ction).encode()\n        }");
                    str = b8;
                } catch (Exception unused2) {
                }
                sharedStorage2.g(A8, str);
                this.f3421c.e(Q7.a.HDR_GPP_STRING, this.f3422d.getGppString());
                this.f3421c.e(Q7.a.SAVED_MSPA_JURISDICTION, F6.d.f2837h.f942a);
                this.f3421c.e(Q7.a.SAVED_REGION, R7.d.f9675n);
                this.f3421c.e(Q7.a.GPP_STRING, this.f3422d.getGppString());
                function1.invoke(this.f3422d);
                return;
            }
        }
    }

    public void f(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(F6.b.SensitiveDataLimitUseNotice, Integer.valueOf(i8));
        this.f3422d.setSensitiveDataLimitUseNotice(i8);
    }

    public String g() {
        String NAME = l.f41103f;
        AbstractC3255y.h(NAME, "NAME");
        return NAME;
    }

    public void h(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(F6.b.SensitiveDataProcessingOptOutNotice, Integer.valueOf(i8));
        this.f3422d.setSensitiveDataProcessingOptOutNotice(i8);
    }

    public int i() {
        return l.f41101d;
    }

    public void j(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(F6.b.SharingNotice, Integer.valueOf(i8));
        this.f3422d.setSharingNotice(i8);
    }

    public void k(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(F6.b.SharingOptOutNotice, Integer.valueOf(i8));
        this.f3422d.setSharingOptOutNotice(i8);
    }

    public void l(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(F6.b.TargetedAdvertisingOptOutNotice, Integer.valueOf(i8));
        this.f3422d.setTargetedAdvertisingOptOutNotice(i8);
    }
}
