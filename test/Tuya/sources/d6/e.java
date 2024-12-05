package D6;

import L5.I;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.N;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import d6.i;
import d6.m;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import r1.C3680a;
import v5.C3832b;
import v5.EnumC3833c;
import w1.l;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public C3680a f1877a;

    /* renamed from: b, reason: collision with root package name */
    public final E6.f f1878b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f1879c;

    /* renamed from: d, reason: collision with root package name */
    public final USRegulationData f1880d;

    public e() {
        O7.d dVar = O7.d.f7806a;
        this.f1877a = dVar.g();
        this.f1878b = dVar.j();
        this.f1879c = dVar.m();
        this.f1880d = new USRegulationData(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 131071, null);
    }

    public final String a() {
        try {
            String d8 = this.f1877a.d();
            AbstractC3159y.h(d8, "{ gppModel.encode() }");
            return d8;
        } catch (Exception unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, EnumC3833c.CONSOLE, null, 22);
            return "";
        }
    }

    public String b(C6.b field) {
        AbstractC3159y.i(field, "field");
        switch (field.ordinal()) {
            case 0:
                String SHARING_NOTICE = v1.g.f38729b;
                AbstractC3159y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case 1:
                String SALE_OPT_OUT_NOTICE = v1.g.f38730c;
                AbstractC3159y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case 2:
                String SHARING_OPT_OUT_NOTICE = v1.g.f38731d;
                AbstractC3159y.h(SHARING_OPT_OUT_NOTICE, "SHARING_OPT_OUT_NOTICE");
                return SHARING_OPT_OUT_NOTICE;
            case 3:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = v1.g.f38732e;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case 4:
                String SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE = v1.g.f38733f;
                AbstractC3159y.h(SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE, "SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE");
                return SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE;
            case 5:
                String SENSITIVE_DATA_LIMIT_USE_NOTICE = v1.g.f38734g;
                AbstractC3159y.h(SENSITIVE_DATA_LIMIT_USE_NOTICE, "SENSITIVE_DATA_LIMIT_USE_NOTICE");
                return SENSITIVE_DATA_LIMIT_USE_NOTICE;
            case 6:
                String SALE_OPT_OUT = v1.g.f38735h;
                AbstractC3159y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case 7:
                String SHARING_OPT_OUT = v1.g.f38736i;
                AbstractC3159y.h(SHARING_OPT_OUT, "SHARING_OPT_OUT");
                return SHARING_OPT_OUT;
            case 8:
                String TARGETED_ADVERTISING_OPT_OUT = v1.g.f38737j;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case 9:
                String SENSITIVE_DATA_PROCESSING = v1.g.f38738k;
                AbstractC3159y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case 10:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = v1.g.f38739l;
                AbstractC3159y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case 11:
                String PERSONAL_DATA_CONSENTS = v1.g.f38740m;
                AbstractC3159y.h(PERSONAL_DATA_CONSENTS, "PERSONAL_DATA_CONSENTS");
                return PERSONAL_DATA_CONSENTS;
            case 12:
                String MSPA_COVERED_TRANSACTION = v1.g.f38741n;
                AbstractC3159y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case 13:
                String MSPA_OPT_OUT_OPTION_MODE = v1.g.f38742o;
                AbstractC3159y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case 14:
                String MSPA_SERVICE_PROVIDER_MODE = v1.g.f38743p;
                AbstractC3159y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
            default:
                return "";
        }
    }

    public final void c(C6.b field, Object value) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(value, "value");
        try {
            this.f1877a.k(g(), b(field), value);
        } catch (Exception unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, EnumC3833c.CONSOLE, null, 22);
        }
    }

    public void d(C6.b field, boolean z8) {
        List<Integer> p8;
        AbstractC3159y.i(field, "field");
        if (z8) {
            p8 = AbstractC1246t.p(1, 1);
        } else {
            p8 = AbstractC1246t.p(2, 2);
        }
        c(field, p8);
        this.f1880d.setKnownChildSensitiveDataConsents(p8);
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
        List<C6.f> list;
        C6.b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3159y.i(purposes, "purposes");
        int i17 = this.f1879c.i(N7.a.SAVED_MSPA_SECTION_ID);
        String str = "";
        this.f1879c.g(n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i17), false, 4, null), "");
        try {
            JSONArray jSONArray = new JSONArray(this.f1879c.j(N7.a.HDR_SECTION_LIST));
            i s8 = m.s(0, jSONArray.length());
            m8 = new ArrayList(AbstractC1246t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                m8.add(Integer.valueOf(jSONArray.getInt(((N) it).nextInt())));
            }
        } catch (JSONException unused) {
            m8 = AbstractC1246t.m();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m8) {
            if (((Number) obj).intValue() != i17) {
                arrayList.add(obj);
            }
        }
        this.f1879c.e(N7.a.HDR_SECTION_LIST, arrayList.toString());
        this.f1879c.e(N7.a.HDR_SECTION_ID, AbstractC1246t.w0(arrayList, "_", null, null, 0, null, null, 62, null));
        this.f1877a.b(i17);
        this.f1879c.e(N7.a.GPP_STRING, a());
        Iterator it2 = purposes.iterator();
        while (true) {
            int i18 = 2;
            if (it2.hasNext()) {
                C6.e eVar = (C6.e) it2.next();
                Integer num = eVar.f1329a;
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            bVar = C6.b.SharingOptOut;
                            break;
                        case 2:
                            bVar = C6.b.SaleOptOut;
                            break;
                        case 3:
                            bVar = C6.b.TargetedAdvertisingOptOut;
                            break;
                        case 4:
                            bVar = C6.b.PersonalDataConsents;
                            break;
                        case 5:
                            bVar = C6.b.SensitiveDataProcessing;
                            break;
                        case 6:
                            bVar = C6.b.KnownChildSensitiveDataConsents;
                            break;
                        default:
                            bVar = C6.b.NONE;
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
                            c(C6.b.SaleOptOutNotice, Integer.valueOf(i11));
                            this.f1880d.setSaleOptOutNotice(i11);
                            if (z8) {
                                if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                            } else {
                                i12 = 0;
                            }
                            Integer valueOf = Integer.valueOf(i12);
                            USRegulationData uSRegulationData = this.f1880d;
                            if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
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
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                } else {
                                    i13 = 0;
                                }
                                Integer valueOf2 = Integer.valueOf(i13);
                                USRegulationData uSRegulationData2 = this.f1880d;
                                if (z8) {
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
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
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
                                        i14 = 1;
                                    } else {
                                        i14 = 2;
                                    }
                                } else {
                                    i14 = 0;
                                }
                                Integer valueOf3 = Integer.valueOf(i14);
                                USRegulationData uSRegulationData3 = this.f1880d;
                                if (z8) {
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
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
                            List<C6.f> list2 = eVar.f1335g;
                            if (list2 != null) {
                                h(z8);
                                f(z8);
                                int[] iArr = new int[12];
                                for (int i19 = 0; i19 < 12; i19++) {
                                    iArr[i19] = 0;
                                }
                                for (C6.f fVar : list2) {
                                    if (fVar.f1337b != null && new i(1, 12).p(fVar.f1337b.intValue())) {
                                        int intValue = fVar.f1337b.intValue() - 1;
                                        Boolean bool = fVar.f1339d;
                                        if (bool == null) {
                                            bool = eVar.f1332d;
                                        }
                                        if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                                            i15 = 1;
                                        } else {
                                            i15 = 2;
                                        }
                                        iArr[intValue] = i15;
                                    }
                                }
                                obj2 = AbstractC1239l.U0(iArr);
                                this.f1880d.setSensitiveDataProcessing(AbstractC1239l.U0(iArr));
                            }
                            c(bVar, obj2);
                            break;
                        case 10:
                            d(bVar, AbstractC3159y.d(eVar.f1332d, Boolean.TRUE));
                            break;
                        case 11:
                            if (b(bVar).length() <= 0) {
                                break;
                            } else {
                                if (z8) {
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
                                        i16 = 1;
                                    } else {
                                        i16 = 2;
                                    }
                                } else {
                                    i16 = 0;
                                }
                                Integer valueOf4 = Integer.valueOf(i16);
                                USRegulationData uSRegulationData4 = this.f1880d;
                                if (z8) {
                                    if (AbstractC3159y.d(eVar.f1332d, Boolean.TRUE)) {
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
                if (this.f1878b.f2375b.f2324K) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                c(C6.b.MspaCoveredTransaction, Integer.valueOf(i8));
                this.f1880d.setMspaCoveredTransaction(i8);
                String str2 = this.f1878b.f2375b.f2325L;
                C6.e eVar2 = null;
                if (str2 == null) {
                    i10 = null;
                } else {
                    if (AbstractC3159y.d(str2, "OPT_OUT")) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    if (AbstractC3159y.d(str2, "SERVICE-PROVIDER")) {
                        i18 = 1;
                    }
                    c(C6.b.MspaOptOutOptionMode, Integer.valueOf(i9));
                    c(C6.b.MspaServiceProviderMode, Integer.valueOf(i18));
                    this.f1880d.setMspaOptOutOptionMode(i9);
                    this.f1880d.setMspaServiceProviderMode(i18);
                    i10 = I.f6487a;
                }
                if (i10 == null) {
                    c(C6.b.MspaOptOutOptionMode, 0);
                    c(C6.b.MspaServiceProviderMode, 0);
                    this.f1880d.setMspaOptOutOptionMode(0);
                    this.f1880d.setMspaServiceProviderMode(0);
                }
                Vector vector = new Vector(null, 1, null);
                Iterator it3 = purposes.iterator();
                while (it3.hasNext()) {
                    C6.e eVar3 = (C6.e) it3.next();
                    Integer num2 = eVar3.f1329a;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (AbstractC3159y.d(eVar3.f1332d, Boolean.TRUE)) {
                            vector.set(intValue2);
                        } else {
                            vector.unset(intValue2);
                        }
                    }
                }
                this.f1879c.d(N7.a.MSPA_PURPOSE_CONSENT, vector);
                Vector vector2 = new Vector(null, 1, null);
                Iterator it4 = purposes.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        ?? next = it4.next();
                        Integer num3 = ((C6.e) next).f1329a;
                        int b02 = AbstractC1239l.b0(C6.i.f1352c);
                        if (num3 != null && num3.intValue() == b02) {
                            eVar2 = next;
                        }
                    }
                }
                C6.e eVar4 = eVar2;
                if (eVar4 != null && (list = eVar4.f1335g) != null) {
                    for (C6.f fVar2 : list) {
                        Integer num4 = fVar2.f1337b;
                        if (num4 != null) {
                            int intValue3 = num4.intValue();
                            if (AbstractC3159y.d(fVar2.f1339d, Boolean.TRUE)) {
                                vector2.set(intValue3);
                            } else {
                                vector2.unset(intValue3);
                            }
                        }
                    }
                }
                this.f1879c.d(N7.a.MSPA_SENSITIVE_PURPOSE_CONSENT, vector2);
                O7.d dVar = O7.d.f7806a;
                C3680a gppModel = this.f1877a;
                AbstractC3159y.i(gppModel, "gppModel");
                O7.d.f7820o = gppModel;
                this.f1880d.setGppString(a());
                this.f1880d.setVersion(1);
                this.f1879c.c(N7.a.SAVED_MSPA_SECTION_ID, i());
                this.f1879c.e(N7.a.HDR_GPP_VERSION, String.valueOf(this.f1877a.e().g()));
                this.f1879c.e(N7.a.HDR_SECTION_LIST, this.f1877a.h().toString());
                SharedStorage sharedStorage = this.f1879c;
                N7.a aVar = N7.a.HDR_SECTION_ID;
                List h8 = this.f1877a.h();
                AbstractC3159y.h(h8, "gppModel.sectionIds");
                sharedStorage.e(aVar, AbstractC1246t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String A8 = n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i()), false, 4, null);
                SharedStorage sharedStorage2 = this.f1879c;
                try {
                    String b8 = this.f1877a.g(g()).b();
                    AbstractC3159y.h(b8, "{\n            gppModel.g…ction).encode()\n        }");
                    str = b8;
                } catch (Exception unused2) {
                }
                sharedStorage2.g(A8, str);
                this.f1879c.e(N7.a.HDR_GPP_STRING, this.f1880d.getGppString());
                this.f1879c.e(N7.a.SAVED_MSPA_JURISDICTION, C6.d.f1327h.f39898a);
                this.f1879c.e(N7.a.SAVED_REGION, O7.d.f7819n);
                this.f1879c.e(N7.a.GPP_STRING, this.f1880d.getGppString());
                function1.invoke(this.f1880d);
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
        c(C6.b.SensitiveDataLimitUseNotice, Integer.valueOf(i8));
        this.f1880d.setSensitiveDataLimitUseNotice(i8);
    }

    public String g() {
        String NAME = l.f38980f;
        AbstractC3159y.h(NAME, "NAME");
        return NAME;
    }

    public void h(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(C6.b.SensitiveDataProcessingOptOutNotice, Integer.valueOf(i8));
        this.f1880d.setSensitiveDataProcessingOptOutNotice(i8);
    }

    public int i() {
        return l.f38978d;
    }

    public void j(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(C6.b.SharingNotice, Integer.valueOf(i8));
        this.f1880d.setSharingNotice(i8);
    }

    public void k(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(C6.b.SharingOptOutNotice, Integer.valueOf(i8));
        this.f1880d.setSharingOptOutNotice(i8);
    }

    public void l(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(C6.b.TargetedAdvertisingOptOutNotice, Integer.valueOf(i8));
        this.f1880d.setTargetedAdvertisingOptOutNotice(i8);
    }
}
