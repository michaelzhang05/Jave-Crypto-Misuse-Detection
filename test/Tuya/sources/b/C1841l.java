package b;

import A5.a;
import A5.g;
import C5.d;
import C5.g;
import C5.h;
import L7.m;
import L7.o;
import L7.q;
import L7.u;
import L7.w;
import M5.AbstractC1246t;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import g6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3159y;
import v1.AbstractC3822c;
import v5.C3832b;
import v5.EnumC3833c;
import w1.InterfaceC3842c;
import y5.AbstractC3995b;
import y5.C3998e;
import y5.EnumC3996c;
import y5.s;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841l {

    /* renamed from: a, reason: collision with root package name */
    public SharedStorage f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final s f14223b;

    /* renamed from: c, reason: collision with root package name */
    public final E6.f f14224c;

    /* renamed from: d, reason: collision with root package name */
    public final q f14225d;

    /* renamed from: e, reason: collision with root package name */
    public final L7.c f14226e;

    /* renamed from: f, reason: collision with root package name */
    public final u f14227f;

    /* renamed from: g, reason: collision with root package name */
    public w f14228g;

    /* renamed from: h, reason: collision with root package name */
    public final m f14229h;

    /* renamed from: i, reason: collision with root package name */
    public final o f14230i;

    /* renamed from: j, reason: collision with root package name */
    public final L7.k f14231j;

    /* renamed from: k, reason: collision with root package name */
    public final L7.e f14232k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14233l;

    /* renamed from: m, reason: collision with root package name */
    public C3998e f14234m;

    /* renamed from: n, reason: collision with root package name */
    public J5.b f14235n;

    /* renamed from: o, reason: collision with root package name */
    public int f14236o;

    /* renamed from: p, reason: collision with root package name */
    public y5.g f14237p;

    public C1841l(SharedStorage storage, s tcModel, E6.f portalConfig, q gvlRepository, L7.c cmpRepository, u portalConfigRepository, w translationsTextRepository, m geoIPRepository, o googleVendorsRepository, L7.k gbcRepository, L7.e consentRepository) {
        AbstractC3159y.i(storage, "storage");
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(gvlRepository, "gvlRepository");
        AbstractC3159y.i(cmpRepository, "cmpRepository");
        AbstractC3159y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3159y.i(geoIPRepository, "geoIPRepository");
        AbstractC3159y.i(googleVendorsRepository, "googleVendorsRepository");
        AbstractC3159y.i(gbcRepository, "gbcRepository");
        AbstractC3159y.i(consentRepository, "consentRepository");
        this.f14222a = storage;
        this.f14223b = tcModel;
        this.f14224c = portalConfig;
        this.f14225d = gvlRepository;
        this.f14226e = cmpRepository;
        this.f14227f = portalConfigRepository;
        this.f14228g = translationsTextRepository;
        this.f14229h = geoIPRepository;
        this.f14230i = googleVendorsRepository;
        this.f14231j = gbcRepository;
        this.f14232k = consentRepository;
        this.f14234m = new C3998e(null, 1);
        this.f14236o = -1;
        this.f14237p = new y5.g(null, null, 3);
        this.f14236o = g();
    }

    public final Vector a(Object obj) {
        ArrayList arrayList;
        Boolean bool;
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            int i8 = 0;
            for (Object obj2 : arrayList) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1246t.w();
                }
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                } else {
                    bool = null;
                }
                if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                    vector.set(i9);
                }
                i8 = i9;
            }
        }
        return vector;
    }

    public final boolean b() {
        String str;
        String upperCase;
        if (this.f14224c.f2375b.f2330Q.contains("EEA")) {
            J5.b bVar = this.f14235n;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f5502a;
            }
            int[] a8 = AbstractC3995b.a(32);
            int length = a8.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = a8[i8];
                i8++;
                String a9 = J5.a.a(i9);
                if (str == null) {
                    upperCase = null;
                } else {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if (AbstractC3159y.d(a9, upperCase)) {
                    return true;
                }
            }
        }
        if (!this.f14224c.f2375b.f2330Q.contains("WORLDWIDE")) {
            return false;
        }
        return true;
    }

    public final boolean c(Set set) {
        List list = this.f14224c.f2375b.f2340h;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Vector d(Object obj) {
        ArrayList arrayList;
        Integer num;
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    vector.set(num.intValue());
                }
            }
        }
        return vector;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14224c.f2375b.f2332S.f2363c);
        sb.append(this.f14224c.f2375b.f2332S.f2361a);
        return I7.b.b(sb.toString());
    }

    public final String f() {
        return I7.b.b(this.f14224c.f2376c.f2373c + this.f14224c.f2375b.f2358z + this.f14224c.f2375b.f2354v + this.f14224c.f2375b.f2355w + this.f14224c.f2375b.f2353u + this.f14224c.f2375b.f2351s + this.f14224c.f2375b.f2352t);
    }

    public final int g() {
        int i8 = this.f14222a.i(N7.a.TCF_POLICY_VERSION);
        if (i8 == 0) {
            return this.f14222a.i(N7.a.GPP_POLICY_VERSION);
        }
        return i8;
    }

    public final int h() {
        Integer num;
        B6.e eVar = this.f14223b.f39932a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f1037c;
        }
        if (num == null) {
            int i8 = this.f14222a.i(N7.a.TCF_POLICY_VERSION);
            if (i8 == 0) {
                return this.f14222a.i(N7.a.GPP_POLICY_VERSION);
            }
            return i8;
        }
        return num.intValue();
    }

    public final int i() {
        Integer num;
        B6.e eVar = this.f14223b.f39932a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f1036b;
        }
        if (num == null) {
            return this.f14222a.i(N7.a.VENDOR_LIST_VERSION);
        }
        return num.intValue();
    }

    public final boolean j() {
        if (m()) {
            return !AbstractC3159y.d(this.f14222a.j(N7.a.GBC_PURPOSE_HASH), e());
        }
        return false;
    }

    public final boolean k() {
        if (this.f14224c.f2375b.f2326M) {
            String str = O7.d.f7819n;
            C6.g state = C6.g.CALIFORNIA;
            AbstractC3159y.i(state, "state");
            if (AbstractC3159y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        String str;
        J5.b bVar = this.f14235n;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.f5502a;
        }
        return n.s(str, "USA", true);
    }

    public final boolean m() {
        String str;
        String str2;
        String str3;
        String str4;
        String upperCase;
        E6.c cVar = this.f14224c.f2375b.f2332S;
        if (!cVar.f2361a) {
            return false;
        }
        if (!cVar.f2362b.contains("WORLDWIDE")) {
            String str5 = null;
            if (this.f14224c.f2375b.f2332S.f2362b.contains("EEA")) {
                J5.b bVar = this.f14235n;
                if (bVar == null) {
                    str4 = null;
                } else {
                    str4 = bVar.f5502a;
                }
                int[] a8 = AbstractC3995b.a(32);
                int length = a8.length;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = a8[i8];
                    i8++;
                    String a9 = J5.a.a(i9);
                    if (str4 == null) {
                        upperCase = null;
                    } else {
                        upperCase = str4.toUpperCase(Locale.ROOT);
                        AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    }
                    if (AbstractC3159y.d(a9, upperCase)) {
                        break;
                    }
                }
            }
            List list = this.f14224c.f2375b.f2332S.f2362b;
            J5.b bVar2 = this.f14235n;
            if (bVar2 == null || (str3 = bVar2.f5502a) == null) {
                str = null;
            } else {
                str = str3.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            if (!AbstractC1246t.d0(list, str)) {
                List list2 = this.f14224c.f2375b.f2332S.f2362b;
                J5.b bVar3 = this.f14235n;
                if (bVar3 != null && (str2 = bVar3.f5502a) != null) {
                    str5 = str2.toLowerCase(Locale.ROOT);
                    AbstractC3159y.h(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                if (AbstractC1246t.d0(list2, str5)) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean n() {
        SharedStorage sharedStorage = this.f14222a;
        N7.a preferenceKey = N7.a.VENDOR_LIST_LAST_UPDATED;
        sharedStorage.getClass();
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f17845a.getLong("gvl_last_updated", 0L)) >= this.f14224c.f2375b.f2314A && i() > this.f14222a.i(N7.a.VENDOR_LIST_VERSION)) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.f14224c.f2375b.f2334b.contains("USP") && (this.f14224c.f2375b.f2330Q.contains("WORLDWIDE") || this.f14224c.f2375b.f2330Q.contains("USA"))) {
            return true;
        }
        return false;
    }

    public final void p() {
        List list;
        String[] strArr;
        String value;
        int i8;
        String[] strArr2;
        int i9;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        int intValue;
        int i13;
        int intValue2;
        String str4;
        int intValue3;
        int i14;
        int intValue4;
        String str5;
        int intValue5;
        int i15;
        int intValue6;
        Integer b8;
        int intValue7;
        C1841l c1841l = this;
        O7.d dVar = O7.d.f7806a;
        int i16 = 0;
        if (dVar.g().i(w1.h.f38960d)) {
            InterfaceC3842c f8 = dVar.g().f(w1.h.f38960d);
            Vector vector = c1841l.f14223b.f39949r;
            Object c8 = f8.c(AbstractC3822c.f38671m);
            AbstractC3159y.h(c8, "gppModel.getFieldValue(\n…ONSENTS\n                )");
            vector.set(c1841l.a(c8));
            Vector vector2 = c1841l.f14223b.f39950s;
            vector2.unsetAllOwnedItems();
            Object c9 = f8.c(AbstractC3822c.f38672n);
            AbstractC3159y.h(c9, "gppModel.getFieldValue(T…OSE_LEGITIMATE_INTERESTS)");
            vector2.set(c1841l.a(c9));
            Vector vector3 = c1841l.f14223b.f39948q;
            Object c10 = f8.c(AbstractC3822c.f38670l);
            AbstractC3159y.h(c10, "gppModel.getFieldValue(T…d.SPECIAL_FEATURE_OPTINS)");
            vector3.set(c1841l.a(c10));
            Vector vector4 = c1841l.f14223b.f39957z;
            vector4.unsetAllOwnedItems();
            Object c11 = f8.c(AbstractC3822c.f38675q);
            AbstractC3159y.h(c11, "gppModel.getFieldValue(T…uV2Field.VENDOR_CONSENTS)");
            vector4.setOwnedItems(c1841l.d(c11));
            Vector vector5 = c1841l.f14223b.f39927C;
            vector5.unsetAllOwnedItems();
            Object c12 = f8.c(AbstractC3822c.f38676r);
            AbstractC3159y.h(c12, "gppModel.getFieldValue(T…DOR_LEGITIMATE_INTERESTS)");
            vector5.setOwnedItems(c1841l.d(c12));
        } else {
            String j8 = c1841l.f14222a.j(N7.a.TC_STRING);
            String encodedTCString = j8.length() > 0 ? j8 : null;
            if (encodedTCString != null) {
                AbstractC3159y.i(encodedTCString, "encodedTCString");
                List s02 = n.s0(encodedTCString, new String[]{"."}, false, 0, 6, null);
                int size = s02.size();
                s tcModel = new s(null);
                int i17 = 0;
                while (i17 < size) {
                    int i18 = i17 + 1;
                    String encodedString = (String) s02.get(i17);
                    a.C0000a c0000a = A5.a.f484a;
                    String a8 = c0000a.a(String.valueOf(encodedString.charAt(i16)));
                    A5.c cVar = A5.c.f488a;
                    A5.d dVar2 = A5.d.SEGMENT_TYPE;
                    Integer a9 = cVar.a(dVar2);
                    String substring = a8.substring(i16, a9 == null ? 0 : a9.intValue());
                    AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Set set = y5.m.f39918b;
                    d.a aVar = C5.d.f1293a;
                    Integer a10 = cVar.a(dVar2);
                    y5.l segment = (y5.l) AbstractC1246t.h0(set, aVar.a(substring, a10 == null ? 0 : a10.intValue()));
                    g.a aVar2 = A5.g.f508a;
                    String str6 = "encodedString";
                    AbstractC3159y.i(encodedString, "encodedString");
                    AbstractC3159y.i(tcModel, "tcModel");
                    AbstractC3159y.i(segment, "segment");
                    String a11 = c0000a.a(encodedString);
                    y5.l lVar = y5.l.CORE;
                    String str7 = LeanbackPreferenceDialogFragment.ARG_KEY;
                    if (segment == lVar) {
                        EnumC3996c key = EnumC3996c.VERSION;
                        AbstractC3159y.i(key, "key");
                        Map map = A5.c.f489b;
                        Integer num = (Integer) map.get(key);
                        if (num == null) {
                            list = s02;
                            intValue7 = 0;
                        } else {
                            list = s02;
                            intValue7 = num.intValue();
                        }
                        String substring2 = a11.substring(i16, intValue7);
                        AbstractC3159y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        AbstractC3159y.i(key, "key");
                        Integer num2 = (Integer) map.get(key);
                        tcModel.f39940i = aVar.a(substring2, num2 == null ? 0 : num2.intValue());
                    } else {
                        list = s02;
                    }
                    int intValue8 = (segment == lVar || (b8 = cVar.b("segmentType")) == null) ? 0 : b8.intValue();
                    if (tcModel.f39940i == 1) {
                        strArr = (String[]) E5.a.f2312b.get(segment.f39916a);
                    } else {
                        strArr = (String[]) E5.a.f2313c.get(segment.f39916a);
                    }
                    if (strArr != null) {
                        int length = strArr.length;
                        int i19 = 0;
                        while (i19 < length) {
                            String str8 = strArr[i19];
                            int i20 = i19 + 1;
                            C5.b bVar = C5.b.f1290a;
                            AbstractC3159y.i(str8, str7);
                            Integer b9 = A5.c.f488a.b(str8);
                            if (b9 == null && A5.g.f508a.a(str8)) {
                                b9 = Integer.valueOf(tcModel.f39947p);
                            }
                            if ((b9 != null && b9.intValue() == 0) || b9 == null) {
                                size = size;
                                strArr = strArr;
                                length = length;
                                i18 = i18;
                                a11 = a11;
                                str6 = str6;
                                i19 = i20;
                                str7 = str7;
                                intValue8 = intValue8;
                            } else {
                                try {
                                    value = a11.substring(intValue8, b9.intValue() + intValue8);
                                    AbstractC3159y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                } catch (IndexOutOfBoundsException unused) {
                                    value = n.c0(a11, b9.intValue() + intValue8, '0').substring(intValue8, b9.intValue() + intValue8);
                                    AbstractC3159y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                if (AbstractC3159y.d(str8, "version")) {
                                    tcModel.f39940i = C5.d.f1293a.a(value, b9.intValue());
                                    i11 = intValue8;
                                    i8 = size;
                                    strArr2 = strArr;
                                } else {
                                    if (AbstractC3159y.d(str8, "created")) {
                                        i8 = size;
                                        strArr2 = strArr;
                                        tcModel.f39933b = C5.a.f1289a.a(value, b9.intValue());
                                    } else {
                                        i8 = size;
                                        strArr2 = strArr;
                                        if (AbstractC3159y.d(str8, "lastUpdated")) {
                                            tcModel.f39934c = C5.a.f1289a.a(value, b9.intValue());
                                        } else {
                                            i9 = i18;
                                            if (AbstractC3159y.d(str8, "cmpId")) {
                                                int a12 = C5.d.f1293a.a(value, b9.intValue());
                                                if (a12 > -1) {
                                                    tcModel.f39944m = a12;
                                                } else {
                                                    y5.u uVar = new y5.u("cmpId", String.valueOf(a12), "");
                                                    C3832b c3832b = C3832b.f38876a;
                                                    ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3159y.h("f.s", "TAG");
                                                    String message = uVar.getMessage();
                                                    c3832b.a(choiceError, "f.s", message == null ? "" : message, EnumC3833c.CONSOLE_AND_CALLBACK, uVar);
                                                }
                                            } else if (AbstractC3159y.d(str8, "cmpVersion")) {
                                                int a13 = C5.d.f1293a.a(value, b9.intValue());
                                                if (a13 > -1) {
                                                    tcModel.f39945n = a13;
                                                } else {
                                                    y5.u uVar2 = new y5.u("cmpVersion", String.valueOf(a13), "");
                                                    C3832b c3832b2 = C3832b.f38876a;
                                                    ChoiceError choiceError2 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3159y.h("f.s", "TAG");
                                                    String message2 = uVar2.getMessage();
                                                    c3832b2.a(choiceError2, "f.s", message2 == null ? "" : message2, EnumC3833c.CONSOLE_AND_CALLBACK, uVar2);
                                                }
                                            } else if (AbstractC3159y.d(str8, "consentScreen")) {
                                                int a14 = C5.d.f1293a.a(value, b9.intValue());
                                                if (a14 > -1) {
                                                    tcModel.f39941j = a14;
                                                } else {
                                                    y5.u uVar3 = new y5.u("consentScreen", String.valueOf(a14), "");
                                                    C3832b c3832b3 = C3832b.f38876a;
                                                    ChoiceError choiceError3 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3159y.h("f.s", "TAG");
                                                    String message3 = uVar3.getMessage();
                                                    c3832b3.a(choiceError3, "f.s", message3 == null ? "" : message3, EnumC3833c.CONSOLE_AND_CALLBACK, uVar3);
                                                }
                                            } else if (AbstractC3159y.d(str8, "consentLanguage")) {
                                                String a15 = C5.e.f1294a.a(value, b9.intValue());
                                                AbstractC3159y.i(a15, "<set-?>");
                                                tcModel.f39943l = a15;
                                            } else if (AbstractC3159y.d(str8, "vendorListVersion")) {
                                                int a16 = C5.d.f1293a.a(value, b9.intValue());
                                                tcModel.f39946o = a16;
                                                if (a16 < 0) {
                                                    y5.u uVar4 = new y5.u("vendorListVersion", String.valueOf(a16), "");
                                                    C3832b c3832b4 = C3832b.f38876a;
                                                    ChoiceError choiceError4 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3159y.h("f.s", "TAG");
                                                    String message4 = uVar4.getMessage();
                                                    c3832b4.a(choiceError4, "f.s", message4 == null ? "" : message4, EnumC3833c.CONSOLE_AND_CALLBACK, uVar4);
                                                }
                                            } else if (AbstractC3159y.d(str8, "policyVersion")) {
                                                int a17 = C5.d.f1293a.a(value, b9.intValue());
                                                tcModel.f39942k = a17;
                                                if (a17 < 0) {
                                                    y5.u uVar5 = new y5.u("policyVersion", String.valueOf(a17), "");
                                                    C3832b c3832b5 = C3832b.f38876a;
                                                    ChoiceError choiceError5 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3159y.h("f.s", "TAG");
                                                    String message5 = uVar5.getMessage();
                                                    c3832b5.a(choiceError5, "f.s", message5 == null ? "" : message5, EnumC3833c.CONSOLE_AND_CALLBACK, uVar5);
                                                }
                                            } else {
                                                String str9 = "1";
                                                String str10 = "value";
                                                if (AbstractC3159y.d(str8, "isServiceSpecific")) {
                                                    AbstractC3159y.i(value, "value");
                                                    tcModel.f39936e = AbstractC3159y.d(value, "1");
                                                } else if (AbstractC3159y.d(str8, "useNonStandardStacks")) {
                                                    AbstractC3159y.i(value, "value");
                                                    tcModel.f39937f = AbstractC3159y.d(value, "1");
                                                } else if (AbstractC3159y.d(str8, "specialFeatureOptions")) {
                                                    tcModel.f39948q = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                } else if (AbstractC3159y.d(str8, "purposeConsents")) {
                                                    tcModel.f39949r = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                } else if (AbstractC3159y.d(str8, "purposeLegitimateInterests")) {
                                                    tcModel.f39950s = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                } else if (AbstractC3159y.d(str8, "purposeOneTreatment")) {
                                                    AbstractC3159y.i(value, "value");
                                                    tcModel.f39938g = AbstractC3159y.d(value, "1");
                                                } else if (AbstractC3159y.d(str8, "publisherCountryCode")) {
                                                    tcModel.b(C5.e.f1294a.a(value, b9.intValue()));
                                                } else {
                                                    i10 = length;
                                                    if (AbstractC3159y.d(str8, "vendorConsents")) {
                                                        h.a aVar3 = C5.h.f1297a;
                                                        String substring3 = a11.substring(intValue8);
                                                        AbstractC3159y.h(substring3, "this as java.lang.String).substring(startIndex)");
                                                        Vector a18 = aVar3.a(substring3);
                                                        AbstractC3159y.i(a18, "<set-?>");
                                                        tcModel.f39957z = a18;
                                                        b9 = Integer.valueOf(a18.getBitLength());
                                                    } else if (AbstractC3159y.d(str8, "vendorLegitimateInterests")) {
                                                        h.a aVar4 = C5.h.f1297a;
                                                        String substring4 = a11.substring(intValue8);
                                                        AbstractC3159y.h(substring4, "this as java.lang.String).substring(startIndex)");
                                                        Vector a19 = aVar4.a(substring4);
                                                        AbstractC3159y.i(a19, "<set-?>");
                                                        tcModel.f39927C = a19;
                                                        b9 = Integer.valueOf(a19.getBitLength());
                                                    } else {
                                                        if (AbstractC3159y.d(str8, "publisherRestrictions")) {
                                                            g.a aVar5 = C5.g.f1296a;
                                                            B6.e gvl = new B6.e();
                                                            AbstractC3159y.i(value, str6);
                                                            AbstractC3159y.i(gvl, "gvl");
                                                            y5.j jVar = new y5.j(gvl, null, null, null, 14);
                                                            d.a aVar6 = C5.d.f1293a;
                                                            A5.c cVar2 = A5.c.f488a;
                                                            str = a11;
                                                            A5.d dVar3 = A5.d.NUM_RESTRICTIONS;
                                                            Integer a20 = cVar2.a(dVar3);
                                                            if (a20 == null) {
                                                                i12 = i20;
                                                                str2 = str6;
                                                                intValue = 0;
                                                            } else {
                                                                i12 = i20;
                                                                intValue = a20.intValue();
                                                                str2 = str6;
                                                            }
                                                            String substring5 = value.substring(0, intValue);
                                                            AbstractC3159y.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            Integer a21 = cVar2.a(dVar3);
                                                            int a22 = aVar6.a(substring5, a21 == null ? 0 : a21.intValue());
                                                            Integer a23 = cVar2.a(dVar3);
                                                            int intValue9 = a23 == null ? 0 : a23.intValue();
                                                            int i21 = 0;
                                                            while (i21 < a22) {
                                                                int i22 = i21 + 1;
                                                                d.a aVar7 = C5.d.f1293a;
                                                                A5.c cVar3 = A5.c.f488a;
                                                                int i23 = a22;
                                                                A5.d dVar4 = A5.d.PURPOSE_ID;
                                                                Integer a24 = cVar3.a(dVar4);
                                                                if (a24 == null) {
                                                                    i13 = i22;
                                                                    intValue2 = 0;
                                                                } else {
                                                                    i13 = i22;
                                                                    intValue2 = a24.intValue();
                                                                }
                                                                String substring6 = value.substring(intValue9, intValue2);
                                                                AbstractC3159y.h(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a25 = cVar3.a(dVar4);
                                                                if (a25 == null) {
                                                                    str4 = str7;
                                                                    intValue3 = 0;
                                                                } else {
                                                                    str4 = str7;
                                                                    intValue3 = a25.intValue();
                                                                }
                                                                int a26 = aVar7.a(substring6, intValue3);
                                                                Integer a27 = cVar3.a(dVar4);
                                                                int intValue10 = intValue9 + (a27 == null ? 0 : a27.intValue());
                                                                A5.d dVar5 = A5.d.RESTRICTION_TYPE;
                                                                Integer a28 = cVar3.a(dVar5);
                                                                String substring7 = value.substring(intValue10, a28 == null ? 0 : a28.intValue());
                                                                AbstractC3159y.h(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a29 = cVar3.a(dVar5);
                                                                int a30 = aVar7.a(substring7, a29 == null ? 0 : a29.intValue());
                                                                Integer a31 = cVar3.a(dVar5);
                                                                int intValue11 = intValue10 + (a31 == null ? 0 : a31.intValue());
                                                                y5.i iVar = new y5.i(a26, y5.k.valueOf(String.valueOf(a30)));
                                                                A5.d dVar6 = A5.d.NUM_ENTRIES;
                                                                Integer a32 = cVar3.a(dVar6);
                                                                String substring8 = value.substring(intValue11, a32 == null ? 0 : a32.intValue());
                                                                AbstractC3159y.h(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a33 = cVar3.a(dVar6);
                                                                int a34 = aVar7.a(substring8, a33 == null ? 0 : a33.intValue());
                                                                Integer a35 = cVar3.a(dVar6);
                                                                intValue9 = intValue11 + (a35 == null ? 0 : a35.intValue());
                                                                if (a34 >= 0) {
                                                                    int i24 = 0;
                                                                    while (true) {
                                                                        int i25 = i24 + 1;
                                                                        A5.c cVar4 = A5.c.f488a;
                                                                        A5.d dVar7 = A5.d.ANY_BOOLEAN;
                                                                        Integer a36 = cVar4.a(dVar7);
                                                                        if (a36 == null) {
                                                                            i14 = i25;
                                                                            intValue4 = 0;
                                                                        } else {
                                                                            i14 = i25;
                                                                            intValue4 = a36.intValue();
                                                                        }
                                                                        String substring9 = value.substring(intValue9, intValue4);
                                                                        AbstractC3159y.h(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                        AbstractC3159y.i(substring9, str10);
                                                                        boolean d8 = AbstractC3159y.d(substring9, str9);
                                                                        Integer a37 = cVar4.a(dVar7);
                                                                        int intValue12 = intValue9 + (a37 == null ? 0 : a37.intValue());
                                                                        d.a aVar8 = C5.d.f1293a;
                                                                        String str11 = str9;
                                                                        A5.d dVar8 = A5.d.VENDOR_ID;
                                                                        Integer a38 = cVar4.a(dVar8);
                                                                        if (a38 == null) {
                                                                            str5 = str10;
                                                                            intValue5 = 0;
                                                                        } else {
                                                                            str5 = str10;
                                                                            intValue5 = a38.intValue();
                                                                        }
                                                                        String substring10 = value.substring(intValue12, intValue5);
                                                                        AbstractC3159y.h(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                        Integer a39 = cVar4.a(dVar8);
                                                                        if (a39 == null) {
                                                                            i15 = intValue8;
                                                                            intValue6 = 0;
                                                                        } else {
                                                                            i15 = intValue8;
                                                                            intValue6 = a39.intValue();
                                                                        }
                                                                        int a40 = aVar8.a(substring10, intValue6);
                                                                        Integer a41 = cVar4.a(dVar8);
                                                                        intValue9 = intValue12 + (a41 == null ? 0 : a41.intValue());
                                                                        if (d8) {
                                                                            Integer a42 = cVar4.a(dVar8);
                                                                            String substring11 = value.substring(intValue9, a42 == null ? 0 : a42.intValue());
                                                                            AbstractC3159y.h(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            Integer a43 = cVar4.a(dVar8);
                                                                            int a44 = aVar8.a(substring11, a43 == null ? 0 : a43.intValue());
                                                                            Integer a45 = cVar4.a(dVar8);
                                                                            intValue9 += a45 == null ? 0 : a45.intValue();
                                                                            if (a44 < a40) {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                g.a aVar9 = C5.g.f1296a;
                                                                                sb.append((Object) "h.g");
                                                                                sb.append(": Invalid RangeEntry: endVendorId ");
                                                                                sb.append(a44);
                                                                                sb.append(" is less than ");
                                                                                sb.append(a40);
                                                                                throw new A5.e(sb.toString());
                                                                            }
                                                                            if (a40 <= a44) {
                                                                                while (true) {
                                                                                    int i26 = a40 + 1;
                                                                                    jVar.c(a40, iVar);
                                                                                    if (a40 == a44) {
                                                                                        break;
                                                                                    } else {
                                                                                        a40 = i26;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            jVar.c(a40, iVar);
                                                                        }
                                                                        if (i24 == a34) {
                                                                            a22 = i23;
                                                                            str9 = str11;
                                                                            i21 = i13;
                                                                            str7 = str4;
                                                                            str10 = str5;
                                                                            intValue8 = i15;
                                                                            break;
                                                                        }
                                                                        str9 = str11;
                                                                        i24 = i14;
                                                                        str10 = str5;
                                                                        intValue8 = i15;
                                                                    }
                                                                } else {
                                                                    a22 = i23;
                                                                    i21 = i13;
                                                                    str7 = str4;
                                                                }
                                                            }
                                                            i11 = intValue8;
                                                            str3 = str7;
                                                            AbstractC3159y.i(jVar, "<set-?>");
                                                            tcModel.f39931G = jVar;
                                                        } else {
                                                            i11 = intValue8;
                                                            str = a11;
                                                            i12 = i20;
                                                            str2 = str6;
                                                            str3 = str7;
                                                            if (AbstractC3159y.d(str8, "publisherConsents")) {
                                                                tcModel.f39953v = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                            } else if (AbstractC3159y.d(str8, "publisherLegitimateInterests")) {
                                                                tcModel.f39954w = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                            } else if (AbstractC3159y.d(str8, "numCustomPurposes")) {
                                                                tcModel.f39947p = C5.d.f1293a.a(value, b9.intValue());
                                                            } else if (AbstractC3159y.d(str8, "publisherCustomConsents")) {
                                                                tcModel.f39955x = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                            } else if (AbstractC3159y.d(str8, "publisherCustomLegitimateInterests")) {
                                                                tcModel.f39956y = AbstractC1831b.a(b9, C5.c.f1292a, value, "<set-?>");
                                                            } else if (AbstractC3159y.d(str8, "vendorsAllowed")) {
                                                                Vector a46 = C5.h.f1297a.a(value);
                                                                AbstractC3159y.i(a46, "<set-?>");
                                                                tcModel.f39930F = a46;
                                                            } else if (AbstractC3159y.d(str8, "vendorsDisclosed")) {
                                                                Vector a47 = C5.h.f1297a.a(value);
                                                                AbstractC3159y.i(a47, "<set-?>");
                                                                tcModel.f39929E = a47;
                                                            } else {
                                                                g.a aVar10 = A5.g.f508a;
                                                                throw new A5.e(((Object) "g.g") + ": Unable to find: " + str8 + " field on TCModel, segment");
                                                            }
                                                        }
                                                        intValue8 = b9.intValue() + i11;
                                                        size = i8;
                                                        strArr = strArr2;
                                                        length = i10;
                                                        i18 = i9;
                                                        a11 = str;
                                                        str6 = str2;
                                                        i19 = i12;
                                                        str7 = str3;
                                                    }
                                                    i11 = intValue8;
                                                    str = a11;
                                                    i12 = i20;
                                                    str2 = str6;
                                                    str3 = str7;
                                                    intValue8 = b9.intValue() + i11;
                                                    size = i8;
                                                    strArr = strArr2;
                                                    length = i10;
                                                    i18 = i9;
                                                    a11 = str;
                                                    str6 = str2;
                                                    i19 = i12;
                                                    str7 = str3;
                                                }
                                            }
                                            i11 = intValue8;
                                            str = a11;
                                            i10 = length;
                                            i12 = i20;
                                            str2 = str6;
                                            str3 = str7;
                                            intValue8 = b9.intValue() + i11;
                                            size = i8;
                                            strArr = strArr2;
                                            length = i10;
                                            i18 = i9;
                                            a11 = str;
                                            str6 = str2;
                                            i19 = i12;
                                            str7 = str3;
                                        }
                                    }
                                    i11 = intValue8;
                                }
                                str = a11;
                                i9 = i18;
                                i10 = length;
                                i12 = i20;
                                str2 = str6;
                                str3 = str7;
                                intValue8 = b9.intValue() + i11;
                                size = i8;
                                strArr = strArr2;
                                length = i10;
                                i18 = i9;
                                a11 = str;
                                str6 = str2;
                                i19 = i12;
                                str7 = str3;
                            }
                        }
                    }
                    c1841l = this;
                    s02 = list;
                    size = size;
                    i17 = i18;
                    i16 = 0;
                }
                c1841l.f14223b.f39949r.set(tcModel.f39949r);
                Vector vector6 = c1841l.f14223b.f39950s;
                vector6.unsetAllOwnedItems();
                vector6.set(tcModel.f39950s);
                c1841l.f14223b.f39948q.set(tcModel.f39948q);
                Vector vector7 = c1841l.f14223b.f39957z;
                vector7.unsetAllOwnedItems();
                vector7.setOwnedItems(tcModel.f39957z);
                Vector vector8 = c1841l.f14223b.f39927C;
                vector8.unsetAllOwnedItems();
                vector8.setOwnedItems(tcModel.f39927C);
            }
        }
        O7.d dVar9 = O7.d.f7806a;
        if (dVar9.g().j(w1.h.f38962f) || c1841l.f14222a.j(N7.a.TC_STRING).length() > 0) {
            String str12 = c1841l.f14224c.f2375b.f2322I;
            if (str12 != null) {
                PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
                if (str12.equals(privacyEncodingMode.getValue())) {
                    if (!dVar9.g().i(w1.h.f38960d)) {
                        c1841l.f14232k.a(privacyEncodingMode, false);
                    }
                    c1841l.f14222a.b(N7.a.TCF_CMP_SDK_ID);
                    c1841l.f14222a.b(N7.a.TCF_CMP_SDK_VERSION);
                    c1841l.f14222a.b(N7.a.TCF_POLICY_VERSION);
                    c1841l.f14222a.b(N7.a.TCF_GDPR_APPLIES);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_CC);
                    c1841l.f14222a.b(N7.a.TCF_PURPOSE_ONE_TREATMENT);
                    c1841l.f14222a.b(N7.a.TCF_USE_NON_STANDARD_STACKS);
                    c1841l.f14222a.b(N7.a.TC_STRING);
                    c1841l.f14222a.b(N7.a.TCF_VENDOR_CONSENTS);
                    c1841l.f14222a.b(N7.a.TCF_VENDOR_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.TCF_PURPOSE_CONSENTS);
                    c1841l.f14222a.b(N7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.TCF_SPECIAL_FEATURES_OPT_INS);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_RESTRICTIONS);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_CONSENT);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1841l.f14222a.b(N7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    return;
                }
            }
            String str13 = c1841l.f14224c.f2375b.f2322I;
            if (str13 != null) {
                PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
                if (str13.equals(privacyEncodingMode2.getValue())) {
                    dVar9.g().b(w1.h.f38960d);
                    c1841l.f14222a.b(N7.a.GPP_CMP_SDK_ID);
                    c1841l.f14222a.b(N7.a.GPP_CMP_SDK_VERSION);
                    c1841l.f14222a.b(N7.a.GPP_POLICY_VERSION);
                    c1841l.f14222a.b(N7.a.GPP_GDPR_APPLIES);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_CC);
                    c1841l.f14222a.b(N7.a.GPP_PURPOSE_ONE_TREATMENT);
                    c1841l.f14222a.b(N7.a.GPP_USE_NON_STANDARD_STACKS);
                    c1841l.f14222a.b(N7.a.GPP_STRING);
                    c1841l.f14222a.b(N7.a.GPP_VENDOR_CONSENTS);
                    c1841l.f14222a.b(N7.a.GPP_VENDOR_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.GPP_PURPOSE_CONSENTS);
                    c1841l.f14222a.b(N7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.GPP_SPECIAL_FEATURES_OPT_INS);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_RESTRICTIONS);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_CONSENT);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1841l.f14222a.b(N7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    if (c1841l.f14222a.j(N7.a.TC_STRING).length() == 0) {
                        c1841l.f14232k.a(privacyEncodingMode2, false);
                        return;
                    }
                    return;
                }
            }
            if (!dVar9.g().i(w1.h.f38960d)) {
                c1841l.f14232k.a(PrivacyEncodingMode.GPP, false);
            }
            if (c1841l.f14222a.j(N7.a.TC_STRING).length() == 0) {
                c1841l.f14232k.a(PrivacyEncodingMode.TCF, false);
            }
        }
    }

    public final void q() {
        this.f14222a.c(N7.a.GPP_CMP_SDK_ID, this.f14223b.f39944m);
        this.f14222a.c(N7.a.GPP_CMP_SDK_VERSION, this.f14223b.f39945n);
        this.f14222a.c(N7.a.GPP_POLICY_VERSION, this.f14223b.f());
        this.f14222a.c(N7.a.GPP_GDPR_APPLIES, b() ? 1 : 0);
        this.f14222a.e(N7.a.GPP_PUBLISHER_CC, this.f14224c.f2375b.f2338f);
        this.f14222a.c(N7.a.GPP_PURPOSE_ONE_TREATMENT, this.f14223b.f39938g ? 1 : 0);
        this.f14222a.c(N7.a.GPP_USE_NON_STANDARD_STACKS, this.f14223b.f39937f ? 1 : 0);
    }

    public final void r() {
        this.f14222a.c(N7.a.TCF_CMP_SDK_ID, this.f14223b.f39944m);
        this.f14222a.c(N7.a.TCF_CMP_SDK_VERSION, this.f14223b.f39945n);
        this.f14222a.c(N7.a.TCF_POLICY_VERSION, this.f14223b.f());
        this.f14222a.c(N7.a.TCF_GDPR_APPLIES, b() ? 1 : 0);
        this.f14222a.e(N7.a.TCF_PUBLISHER_CC, this.f14224c.f2375b.f2338f);
        this.f14222a.c(N7.a.TCF_PURPOSE_ONE_TREATMENT, this.f14223b.f39938g ? 1 : 0);
        this.f14222a.c(N7.a.TCF_USE_NON_STANDARD_STACKS, this.f14223b.f39937f ? 1 : 0);
    }

    public final boolean s() {
        boolean z8;
        if (this.f14222a.j(N7.a.TRANSLATIONS_TEXT).length() > 0 && this.f14222a.j(N7.a.PORTAL_CONFIG).length() > 0 && (!this.f14237p.f39894b.containsKey(String.valueOf(this.f14223b.f39944m)) || !n() || !AbstractC3159y.d(AbstractC3159y.q(this.f14222a.j(N7.a.NON_IAB_VENDOR_CONSENT_HASH), f()), this.f14222a.j(N7.a.OPTION_HASH)) || this.f14236o != h() || ((this.f14222a.j(N7.a.TC_STRING).length() == 0 && !O7.d.f7806a.g().j(w1.h.f38962f)) || j()))) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (m()) {
            this.f14222a.e(N7.a.GBC_PURPOSE_HASH, e());
        }
        return z8;
    }
}
