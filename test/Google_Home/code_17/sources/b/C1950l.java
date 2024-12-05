package b;

import B5.s;
import D5.a;
import D5.g;
import F5.d;
import F5.g;
import F5.h;
import O7.m;
import O7.o;
import O7.q;
import O7.u;
import O7.w;
import P5.AbstractC1378t;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import j6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3255y;
import y1.AbstractC4199c;
import y5.C4209b;
import y5.EnumC4210c;
import z1.InterfaceC4222c;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950l {

    /* renamed from: a, reason: collision with root package name */
    public SharedStorage f15023a;

    /* renamed from: b, reason: collision with root package name */
    public final s f15024b;

    /* renamed from: c, reason: collision with root package name */
    public final H6.f f15025c;

    /* renamed from: d, reason: collision with root package name */
    public final q f15026d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.c f15027e;

    /* renamed from: f, reason: collision with root package name */
    public final u f15028f;

    /* renamed from: g, reason: collision with root package name */
    public w f15029g;

    /* renamed from: h, reason: collision with root package name */
    public final m f15030h;

    /* renamed from: i, reason: collision with root package name */
    public final o f15031i;

    /* renamed from: j, reason: collision with root package name */
    public final O7.k f15032j;

    /* renamed from: k, reason: collision with root package name */
    public final O7.e f15033k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15034l;

    /* renamed from: m, reason: collision with root package name */
    public B5.e f15035m;

    /* renamed from: n, reason: collision with root package name */
    public M5.b f15036n;

    /* renamed from: o, reason: collision with root package name */
    public int f15037o;

    /* renamed from: p, reason: collision with root package name */
    public B5.g f15038p;

    public C1950l(SharedStorage storage, s tcModel, H6.f portalConfig, q gvlRepository, O7.c cmpRepository, u portalConfigRepository, w translationsTextRepository, m geoIPRepository, o googleVendorsRepository, O7.k gbcRepository, O7.e consentRepository) {
        AbstractC3255y.i(storage, "storage");
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(gvlRepository, "gvlRepository");
        AbstractC3255y.i(cmpRepository, "cmpRepository");
        AbstractC3255y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3255y.i(geoIPRepository, "geoIPRepository");
        AbstractC3255y.i(googleVendorsRepository, "googleVendorsRepository");
        AbstractC3255y.i(gbcRepository, "gbcRepository");
        AbstractC3255y.i(consentRepository, "consentRepository");
        this.f15023a = storage;
        this.f15024b = tcModel;
        this.f15025c = portalConfig;
        this.f15026d = gvlRepository;
        this.f15027e = cmpRepository;
        this.f15028f = portalConfigRepository;
        this.f15029g = translationsTextRepository;
        this.f15030h = geoIPRepository;
        this.f15031i = googleVendorsRepository;
        this.f15032j = gbcRepository;
        this.f15033k = consentRepository;
        this.f15035m = new B5.e(null, 1);
        this.f15037o = -1;
        this.f15038p = new B5.g(null, null, 3);
        this.f15037o = g();
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
                    AbstractC1378t.w();
                }
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                } else {
                    bool = null;
                }
                if (AbstractC3255y.d(bool, Boolean.TRUE)) {
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
        if (this.f15025c.f3925b.f3880Q.contains("EEA")) {
            M5.b bVar = this.f15036n;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f7208a;
            }
            int[] a8 = B5.b.a(32);
            int length = a8.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = a8[i8];
                i8++;
                String a9 = M5.a.a(i9);
                if (str == null) {
                    upperCase = null;
                } else {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if (AbstractC3255y.d(a9, upperCase)) {
                    return true;
                }
            }
        }
        if (!this.f15025c.f3925b.f3880Q.contains("WORLDWIDE")) {
            return false;
        }
        return true;
    }

    public final boolean c(Set set) {
        List list = this.f15025c.f3925b.f3890h;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1941c.a((Number) it.next(), list)) {
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
        sb.append(this.f15025c.f3925b.f3882S.f3913c);
        sb.append(this.f15025c.f3925b.f3882S.f3911a);
        return L7.b.b(sb.toString());
    }

    public final String f() {
        return L7.b.b(this.f15025c.f3926c.f3923c + this.f15025c.f3925b.f3908z + this.f15025c.f3925b.f3904v + this.f15025c.f3925b.f3905w + this.f15025c.f3925b.f3903u + this.f15025c.f3925b.f3901s + this.f15025c.f3925b.f3902t);
    }

    public final int g() {
        int i8 = this.f15023a.i(Q7.a.TCF_POLICY_VERSION);
        if (i8 == 0) {
            return this.f15023a.i(Q7.a.GPP_POLICY_VERSION);
        }
        return i8;
    }

    public final int h() {
        Integer num;
        E6.e eVar = this.f15024b.f976a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f2632c;
        }
        if (num == null) {
            int i8 = this.f15023a.i(Q7.a.TCF_POLICY_VERSION);
            if (i8 == 0) {
                return this.f15023a.i(Q7.a.GPP_POLICY_VERSION);
            }
            return i8;
        }
        return num.intValue();
    }

    public final int i() {
        Integer num;
        E6.e eVar = this.f15024b.f976a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f2631b;
        }
        if (num == null) {
            return this.f15023a.i(Q7.a.VENDOR_LIST_VERSION);
        }
        return num.intValue();
    }

    public final boolean j() {
        if (m()) {
            return !AbstractC3255y.d(this.f15023a.j(Q7.a.GBC_PURPOSE_HASH), e());
        }
        return false;
    }

    public final boolean k() {
        if (this.f15025c.f3925b.f3876M) {
            String str = R7.d.f9675n;
            F6.g state = F6.g.CALIFORNIA;
            AbstractC3255y.i(state, "state");
            if (AbstractC3255y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        String str;
        M5.b bVar = this.f15036n;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.f7208a;
        }
        return n.s(str, "USA", true);
    }

    public final boolean m() {
        String str;
        String str2;
        String str3;
        String str4;
        String upperCase;
        H6.c cVar = this.f15025c.f3925b.f3882S;
        if (!cVar.f3911a) {
            return false;
        }
        if (!cVar.f3912b.contains("WORLDWIDE")) {
            String str5 = null;
            if (this.f15025c.f3925b.f3882S.f3912b.contains("EEA")) {
                M5.b bVar = this.f15036n;
                if (bVar == null) {
                    str4 = null;
                } else {
                    str4 = bVar.f7208a;
                }
                int[] a8 = B5.b.a(32);
                int length = a8.length;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = a8[i8];
                    i8++;
                    String a9 = M5.a.a(i9);
                    if (str4 == null) {
                        upperCase = null;
                    } else {
                        upperCase = str4.toUpperCase(Locale.ROOT);
                        AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    }
                    if (AbstractC3255y.d(a9, upperCase)) {
                        break;
                    }
                }
            }
            List list = this.f15025c.f3925b.f3882S.f3912b;
            M5.b bVar2 = this.f15036n;
            if (bVar2 == null || (str3 = bVar2.f7208a) == null) {
                str = null;
            } else {
                str = str3.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            if (!AbstractC1378t.d0(list, str)) {
                List list2 = this.f15025c.f3925b.f3882S.f3912b;
                M5.b bVar3 = this.f15036n;
                if (bVar3 != null && (str2 = bVar3.f7208a) != null) {
                    str5 = str2.toLowerCase(Locale.ROOT);
                    AbstractC3255y.h(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                if (AbstractC1378t.d0(list2, str5)) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean n() {
        SharedStorage sharedStorage = this.f15023a;
        Q7.a preferenceKey = Q7.a.VENDOR_LIST_LAST_UPDATED;
        sharedStorage.getClass();
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f18900a.getLong("gvl_last_updated", 0L)) >= this.f15025c.f3925b.f3864A && i() > this.f15023a.i(Q7.a.VENDOR_LIST_VERSION)) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.f15025c.f3925b.f3884b.contains("USP") && (this.f15025c.f3925b.f3880Q.contains("WORLDWIDE") || this.f15025c.f3925b.f3880Q.contains("USA"))) {
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
        C1950l c1950l = this;
        R7.d dVar = R7.d.f9662a;
        int i16 = 0;
        if (dVar.g().i(z1.h.f41083d)) {
            InterfaceC4222c f8 = dVar.g().f(z1.h.f41083d);
            Vector vector = c1950l.f15024b.f993r;
            Object c8 = f8.c(AbstractC4199c.f40802m);
            AbstractC3255y.h(c8, "gppModel.getFieldValue(\n…ONSENTS\n                )");
            vector.set(c1950l.a(c8));
            Vector vector2 = c1950l.f15024b.f994s;
            vector2.unsetAllOwnedItems();
            Object c9 = f8.c(AbstractC4199c.f40803n);
            AbstractC3255y.h(c9, "gppModel.getFieldValue(T…OSE_LEGITIMATE_INTERESTS)");
            vector2.set(c1950l.a(c9));
            Vector vector3 = c1950l.f15024b.f992q;
            Object c10 = f8.c(AbstractC4199c.f40801l);
            AbstractC3255y.h(c10, "gppModel.getFieldValue(T…d.SPECIAL_FEATURE_OPTINS)");
            vector3.set(c1950l.a(c10));
            Vector vector4 = c1950l.f15024b.f1001z;
            vector4.unsetAllOwnedItems();
            Object c11 = f8.c(AbstractC4199c.f40806q);
            AbstractC3255y.h(c11, "gppModel.getFieldValue(T…uV2Field.VENDOR_CONSENTS)");
            vector4.setOwnedItems(c1950l.d(c11));
            Vector vector5 = c1950l.f15024b.f971C;
            vector5.unsetAllOwnedItems();
            Object c12 = f8.c(AbstractC4199c.f40807r);
            AbstractC3255y.h(c12, "gppModel.getFieldValue(T…DOR_LEGITIMATE_INTERESTS)");
            vector5.setOwnedItems(c1950l.d(c12));
        } else {
            String j8 = c1950l.f15023a.j(Q7.a.TC_STRING);
            String encodedTCString = j8.length() > 0 ? j8 : null;
            if (encodedTCString != null) {
                AbstractC3255y.i(encodedTCString, "encodedTCString");
                List s02 = n.s0(encodedTCString, new String[]{"."}, false, 0, 6, null);
                int size = s02.size();
                s tcModel = new s(null);
                int i17 = 0;
                while (i17 < size) {
                    int i18 = i17 + 1;
                    String encodedString = (String) s02.get(i17);
                    a.C0025a c0025a = D5.a.f2206a;
                    String a8 = c0025a.a(String.valueOf(encodedString.charAt(i16)));
                    D5.c cVar = D5.c.f2210a;
                    D5.d dVar2 = D5.d.SEGMENT_TYPE;
                    Integer a9 = cVar.a(dVar2);
                    String substring = a8.substring(i16, a9 == null ? 0 : a9.intValue());
                    AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Set set = B5.m.f962b;
                    d.a aVar = F5.d.f2803a;
                    Integer a10 = cVar.a(dVar2);
                    B5.l segment = (B5.l) AbstractC1378t.h0(set, aVar.a(substring, a10 == null ? 0 : a10.intValue()));
                    g.a aVar2 = D5.g.f2230a;
                    String str6 = "encodedString";
                    AbstractC3255y.i(encodedString, "encodedString");
                    AbstractC3255y.i(tcModel, "tcModel");
                    AbstractC3255y.i(segment, "segment");
                    String a11 = c0025a.a(encodedString);
                    B5.l lVar = B5.l.CORE;
                    String str7 = LeanbackPreferenceDialogFragment.ARG_KEY;
                    if (segment == lVar) {
                        B5.c key = B5.c.VERSION;
                        AbstractC3255y.i(key, "key");
                        Map map = D5.c.f2211b;
                        Integer num = (Integer) map.get(key);
                        if (num == null) {
                            list = s02;
                            intValue7 = 0;
                        } else {
                            list = s02;
                            intValue7 = num.intValue();
                        }
                        String substring2 = a11.substring(i16, intValue7);
                        AbstractC3255y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        AbstractC3255y.i(key, "key");
                        Integer num2 = (Integer) map.get(key);
                        tcModel.f984i = aVar.a(substring2, num2 == null ? 0 : num2.intValue());
                    } else {
                        list = s02;
                    }
                    int intValue8 = (segment == lVar || (b8 = cVar.b("segmentType")) == null) ? 0 : b8.intValue();
                    if (tcModel.f984i == 1) {
                        strArr = (String[]) H5.a.f3862b.get(segment.f960a);
                    } else {
                        strArr = (String[]) H5.a.f3863c.get(segment.f960a);
                    }
                    if (strArr != null) {
                        int length = strArr.length;
                        int i19 = 0;
                        while (i19 < length) {
                            String str8 = strArr[i19];
                            int i20 = i19 + 1;
                            F5.b bVar = F5.b.f2800a;
                            AbstractC3255y.i(str8, str7);
                            Integer b9 = D5.c.f2210a.b(str8);
                            if (b9 == null && D5.g.f2230a.a(str8)) {
                                b9 = Integer.valueOf(tcModel.f991p);
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
                                    AbstractC3255y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                } catch (IndexOutOfBoundsException unused) {
                                    value = n.c0(a11, b9.intValue() + intValue8, '0').substring(intValue8, b9.intValue() + intValue8);
                                    AbstractC3255y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                if (AbstractC3255y.d(str8, "version")) {
                                    tcModel.f984i = F5.d.f2803a.a(value, b9.intValue());
                                    i11 = intValue8;
                                    i8 = size;
                                    strArr2 = strArr;
                                } else {
                                    if (AbstractC3255y.d(str8, "created")) {
                                        i8 = size;
                                        strArr2 = strArr;
                                        tcModel.f977b = F5.a.f2799a.a(value, b9.intValue());
                                    } else {
                                        i8 = size;
                                        strArr2 = strArr;
                                        if (AbstractC3255y.d(str8, "lastUpdated")) {
                                            tcModel.f978c = F5.a.f2799a.a(value, b9.intValue());
                                        } else {
                                            i9 = i18;
                                            if (AbstractC3255y.d(str8, "cmpId")) {
                                                int a12 = F5.d.f2803a.a(value, b9.intValue());
                                                if (a12 > -1) {
                                                    tcModel.f988m = a12;
                                                } else {
                                                    B5.u uVar = new B5.u("cmpId", String.valueOf(a12), "");
                                                    C4209b c4209b = C4209b.f41007a;
                                                    ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3255y.h("f.s", "TAG");
                                                    String message = uVar.getMessage();
                                                    c4209b.a(choiceError, "f.s", message == null ? "" : message, EnumC4210c.CONSOLE_AND_CALLBACK, uVar);
                                                }
                                            } else if (AbstractC3255y.d(str8, "cmpVersion")) {
                                                int a13 = F5.d.f2803a.a(value, b9.intValue());
                                                if (a13 > -1) {
                                                    tcModel.f989n = a13;
                                                } else {
                                                    B5.u uVar2 = new B5.u("cmpVersion", String.valueOf(a13), "");
                                                    C4209b c4209b2 = C4209b.f41007a;
                                                    ChoiceError choiceError2 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3255y.h("f.s", "TAG");
                                                    String message2 = uVar2.getMessage();
                                                    c4209b2.a(choiceError2, "f.s", message2 == null ? "" : message2, EnumC4210c.CONSOLE_AND_CALLBACK, uVar2);
                                                }
                                            } else if (AbstractC3255y.d(str8, "consentScreen")) {
                                                int a14 = F5.d.f2803a.a(value, b9.intValue());
                                                if (a14 > -1) {
                                                    tcModel.f985j = a14;
                                                } else {
                                                    B5.u uVar3 = new B5.u("consentScreen", String.valueOf(a14), "");
                                                    C4209b c4209b3 = C4209b.f41007a;
                                                    ChoiceError choiceError3 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3255y.h("f.s", "TAG");
                                                    String message3 = uVar3.getMessage();
                                                    c4209b3.a(choiceError3, "f.s", message3 == null ? "" : message3, EnumC4210c.CONSOLE_AND_CALLBACK, uVar3);
                                                }
                                            } else if (AbstractC3255y.d(str8, "consentLanguage")) {
                                                String a15 = F5.e.f2804a.a(value, b9.intValue());
                                                AbstractC3255y.i(a15, "<set-?>");
                                                tcModel.f987l = a15;
                                            } else if (AbstractC3255y.d(str8, "vendorListVersion")) {
                                                int a16 = F5.d.f2803a.a(value, b9.intValue());
                                                tcModel.f990o = a16;
                                                if (a16 < 0) {
                                                    B5.u uVar4 = new B5.u("vendorListVersion", String.valueOf(a16), "");
                                                    C4209b c4209b4 = C4209b.f41007a;
                                                    ChoiceError choiceError4 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3255y.h("f.s", "TAG");
                                                    String message4 = uVar4.getMessage();
                                                    c4209b4.a(choiceError4, "f.s", message4 == null ? "" : message4, EnumC4210c.CONSOLE_AND_CALLBACK, uVar4);
                                                }
                                            } else if (AbstractC3255y.d(str8, "policyVersion")) {
                                                int a17 = F5.d.f2803a.a(value, b9.intValue());
                                                tcModel.f986k = a17;
                                                if (a17 < 0) {
                                                    B5.u uVar5 = new B5.u("policyVersion", String.valueOf(a17), "");
                                                    C4209b c4209b5 = C4209b.f41007a;
                                                    ChoiceError choiceError5 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3255y.h("f.s", "TAG");
                                                    String message5 = uVar5.getMessage();
                                                    c4209b5.a(choiceError5, "f.s", message5 == null ? "" : message5, EnumC4210c.CONSOLE_AND_CALLBACK, uVar5);
                                                }
                                            } else {
                                                String str9 = "1";
                                                String str10 = "value";
                                                if (AbstractC3255y.d(str8, "isServiceSpecific")) {
                                                    AbstractC3255y.i(value, "value");
                                                    tcModel.f980e = AbstractC3255y.d(value, "1");
                                                } else if (AbstractC3255y.d(str8, "useNonStandardStacks")) {
                                                    AbstractC3255y.i(value, "value");
                                                    tcModel.f981f = AbstractC3255y.d(value, "1");
                                                } else if (AbstractC3255y.d(str8, "specialFeatureOptions")) {
                                                    tcModel.f992q = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                } else if (AbstractC3255y.d(str8, "purposeConsents")) {
                                                    tcModel.f993r = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                } else if (AbstractC3255y.d(str8, "purposeLegitimateInterests")) {
                                                    tcModel.f994s = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                } else if (AbstractC3255y.d(str8, "purposeOneTreatment")) {
                                                    AbstractC3255y.i(value, "value");
                                                    tcModel.f982g = AbstractC3255y.d(value, "1");
                                                } else if (AbstractC3255y.d(str8, "publisherCountryCode")) {
                                                    tcModel.b(F5.e.f2804a.a(value, b9.intValue()));
                                                } else {
                                                    i10 = length;
                                                    if (AbstractC3255y.d(str8, "vendorConsents")) {
                                                        h.a aVar3 = F5.h.f2807a;
                                                        String substring3 = a11.substring(intValue8);
                                                        AbstractC3255y.h(substring3, "this as java.lang.String).substring(startIndex)");
                                                        Vector a18 = aVar3.a(substring3);
                                                        AbstractC3255y.i(a18, "<set-?>");
                                                        tcModel.f1001z = a18;
                                                        b9 = Integer.valueOf(a18.getBitLength());
                                                    } else if (AbstractC3255y.d(str8, "vendorLegitimateInterests")) {
                                                        h.a aVar4 = F5.h.f2807a;
                                                        String substring4 = a11.substring(intValue8);
                                                        AbstractC3255y.h(substring4, "this as java.lang.String).substring(startIndex)");
                                                        Vector a19 = aVar4.a(substring4);
                                                        AbstractC3255y.i(a19, "<set-?>");
                                                        tcModel.f971C = a19;
                                                        b9 = Integer.valueOf(a19.getBitLength());
                                                    } else {
                                                        if (AbstractC3255y.d(str8, "publisherRestrictions")) {
                                                            g.a aVar5 = F5.g.f2806a;
                                                            E6.e gvl = new E6.e();
                                                            AbstractC3255y.i(value, str6);
                                                            AbstractC3255y.i(gvl, "gvl");
                                                            B5.j jVar = new B5.j(gvl, null, null, null, 14);
                                                            d.a aVar6 = F5.d.f2803a;
                                                            D5.c cVar2 = D5.c.f2210a;
                                                            str = a11;
                                                            D5.d dVar3 = D5.d.NUM_RESTRICTIONS;
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
                                                            AbstractC3255y.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            Integer a21 = cVar2.a(dVar3);
                                                            int a22 = aVar6.a(substring5, a21 == null ? 0 : a21.intValue());
                                                            Integer a23 = cVar2.a(dVar3);
                                                            int intValue9 = a23 == null ? 0 : a23.intValue();
                                                            int i21 = 0;
                                                            while (i21 < a22) {
                                                                int i22 = i21 + 1;
                                                                d.a aVar7 = F5.d.f2803a;
                                                                D5.c cVar3 = D5.c.f2210a;
                                                                int i23 = a22;
                                                                D5.d dVar4 = D5.d.PURPOSE_ID;
                                                                Integer a24 = cVar3.a(dVar4);
                                                                if (a24 == null) {
                                                                    i13 = i22;
                                                                    intValue2 = 0;
                                                                } else {
                                                                    i13 = i22;
                                                                    intValue2 = a24.intValue();
                                                                }
                                                                String substring6 = value.substring(intValue9, intValue2);
                                                                AbstractC3255y.h(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
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
                                                                D5.d dVar5 = D5.d.RESTRICTION_TYPE;
                                                                Integer a28 = cVar3.a(dVar5);
                                                                String substring7 = value.substring(intValue10, a28 == null ? 0 : a28.intValue());
                                                                AbstractC3255y.h(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a29 = cVar3.a(dVar5);
                                                                int a30 = aVar7.a(substring7, a29 == null ? 0 : a29.intValue());
                                                                Integer a31 = cVar3.a(dVar5);
                                                                int intValue11 = intValue10 + (a31 == null ? 0 : a31.intValue());
                                                                B5.i iVar = new B5.i(a26, B5.k.valueOf(String.valueOf(a30)));
                                                                D5.d dVar6 = D5.d.NUM_ENTRIES;
                                                                Integer a32 = cVar3.a(dVar6);
                                                                String substring8 = value.substring(intValue11, a32 == null ? 0 : a32.intValue());
                                                                AbstractC3255y.h(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a33 = cVar3.a(dVar6);
                                                                int a34 = aVar7.a(substring8, a33 == null ? 0 : a33.intValue());
                                                                Integer a35 = cVar3.a(dVar6);
                                                                intValue9 = intValue11 + (a35 == null ? 0 : a35.intValue());
                                                                if (a34 >= 0) {
                                                                    int i24 = 0;
                                                                    while (true) {
                                                                        int i25 = i24 + 1;
                                                                        D5.c cVar4 = D5.c.f2210a;
                                                                        D5.d dVar7 = D5.d.ANY_BOOLEAN;
                                                                        Integer a36 = cVar4.a(dVar7);
                                                                        if (a36 == null) {
                                                                            i14 = i25;
                                                                            intValue4 = 0;
                                                                        } else {
                                                                            i14 = i25;
                                                                            intValue4 = a36.intValue();
                                                                        }
                                                                        String substring9 = value.substring(intValue9, intValue4);
                                                                        AbstractC3255y.h(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                        AbstractC3255y.i(substring9, str10);
                                                                        boolean d8 = AbstractC3255y.d(substring9, str9);
                                                                        Integer a37 = cVar4.a(dVar7);
                                                                        int intValue12 = intValue9 + (a37 == null ? 0 : a37.intValue());
                                                                        d.a aVar8 = F5.d.f2803a;
                                                                        String str11 = str9;
                                                                        D5.d dVar8 = D5.d.VENDOR_ID;
                                                                        Integer a38 = cVar4.a(dVar8);
                                                                        if (a38 == null) {
                                                                            str5 = str10;
                                                                            intValue5 = 0;
                                                                        } else {
                                                                            str5 = str10;
                                                                            intValue5 = a38.intValue();
                                                                        }
                                                                        String substring10 = value.substring(intValue12, intValue5);
                                                                        AbstractC3255y.h(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
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
                                                                            AbstractC3255y.h(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            Integer a43 = cVar4.a(dVar8);
                                                                            int a44 = aVar8.a(substring11, a43 == null ? 0 : a43.intValue());
                                                                            Integer a45 = cVar4.a(dVar8);
                                                                            intValue9 += a45 == null ? 0 : a45.intValue();
                                                                            if (a44 < a40) {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                g.a aVar9 = F5.g.f2806a;
                                                                                sb.append((Object) "h.g");
                                                                                sb.append(": Invalid RangeEntry: endVendorId ");
                                                                                sb.append(a44);
                                                                                sb.append(" is less than ");
                                                                                sb.append(a40);
                                                                                throw new D5.e(sb.toString());
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
                                                            AbstractC3255y.i(jVar, "<set-?>");
                                                            tcModel.f975G = jVar;
                                                        } else {
                                                            i11 = intValue8;
                                                            str = a11;
                                                            i12 = i20;
                                                            str2 = str6;
                                                            str3 = str7;
                                                            if (AbstractC3255y.d(str8, "publisherConsents")) {
                                                                tcModel.f997v = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                            } else if (AbstractC3255y.d(str8, "publisherLegitimateInterests")) {
                                                                tcModel.f998w = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                            } else if (AbstractC3255y.d(str8, "numCustomPurposes")) {
                                                                tcModel.f991p = F5.d.f2803a.a(value, b9.intValue());
                                                            } else if (AbstractC3255y.d(str8, "publisherCustomConsents")) {
                                                                tcModel.f999x = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                            } else if (AbstractC3255y.d(str8, "publisherCustomLegitimateInterests")) {
                                                                tcModel.f1000y = AbstractC1940b.a(b9, F5.c.f2802a, value, "<set-?>");
                                                            } else if (AbstractC3255y.d(str8, "vendorsAllowed")) {
                                                                Vector a46 = F5.h.f2807a.a(value);
                                                                AbstractC3255y.i(a46, "<set-?>");
                                                                tcModel.f974F = a46;
                                                            } else if (AbstractC3255y.d(str8, "vendorsDisclosed")) {
                                                                Vector a47 = F5.h.f2807a.a(value);
                                                                AbstractC3255y.i(a47, "<set-?>");
                                                                tcModel.f973E = a47;
                                                            } else {
                                                                g.a aVar10 = D5.g.f2230a;
                                                                throw new D5.e(((Object) "g.g") + ": Unable to find: " + str8 + " field on TCModel, segment");
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
                    c1950l = this;
                    s02 = list;
                    size = size;
                    i17 = i18;
                    i16 = 0;
                }
                c1950l.f15024b.f993r.set(tcModel.f993r);
                Vector vector6 = c1950l.f15024b.f994s;
                vector6.unsetAllOwnedItems();
                vector6.set(tcModel.f994s);
                c1950l.f15024b.f992q.set(tcModel.f992q);
                Vector vector7 = c1950l.f15024b.f1001z;
                vector7.unsetAllOwnedItems();
                vector7.setOwnedItems(tcModel.f1001z);
                Vector vector8 = c1950l.f15024b.f971C;
                vector8.unsetAllOwnedItems();
                vector8.setOwnedItems(tcModel.f971C);
            }
        }
        R7.d dVar9 = R7.d.f9662a;
        if (dVar9.g().j(z1.h.f41085f) || c1950l.f15023a.j(Q7.a.TC_STRING).length() > 0) {
            String str12 = c1950l.f15025c.f3925b.f3872I;
            if (str12 != null) {
                PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
                if (str12.equals(privacyEncodingMode.getValue())) {
                    if (!dVar9.g().i(z1.h.f41083d)) {
                        c1950l.f15033k.a(privacyEncodingMode, false);
                    }
                    c1950l.f15023a.b(Q7.a.TCF_CMP_SDK_ID);
                    c1950l.f15023a.b(Q7.a.TCF_CMP_SDK_VERSION);
                    c1950l.f15023a.b(Q7.a.TCF_POLICY_VERSION);
                    c1950l.f15023a.b(Q7.a.TCF_GDPR_APPLIES);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_CC);
                    c1950l.f15023a.b(Q7.a.TCF_PURPOSE_ONE_TREATMENT);
                    c1950l.f15023a.b(Q7.a.TCF_USE_NON_STANDARD_STACKS);
                    c1950l.f15023a.b(Q7.a.TC_STRING);
                    c1950l.f15023a.b(Q7.a.TCF_VENDOR_CONSENTS);
                    c1950l.f15023a.b(Q7.a.TCF_VENDOR_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.TCF_PURPOSE_CONSENTS);
                    c1950l.f15023a.b(Q7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.TCF_SPECIAL_FEATURES_OPT_INS);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_RESTRICTIONS);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_CONSENT);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1950l.f15023a.b(Q7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    return;
                }
            }
            String str13 = c1950l.f15025c.f3925b.f3872I;
            if (str13 != null) {
                PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
                if (str13.equals(privacyEncodingMode2.getValue())) {
                    dVar9.g().b(z1.h.f41083d);
                    c1950l.f15023a.b(Q7.a.GPP_CMP_SDK_ID);
                    c1950l.f15023a.b(Q7.a.GPP_CMP_SDK_VERSION);
                    c1950l.f15023a.b(Q7.a.GPP_POLICY_VERSION);
                    c1950l.f15023a.b(Q7.a.GPP_GDPR_APPLIES);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_CC);
                    c1950l.f15023a.b(Q7.a.GPP_PURPOSE_ONE_TREATMENT);
                    c1950l.f15023a.b(Q7.a.GPP_USE_NON_STANDARD_STACKS);
                    c1950l.f15023a.b(Q7.a.GPP_STRING);
                    c1950l.f15023a.b(Q7.a.GPP_VENDOR_CONSENTS);
                    c1950l.f15023a.b(Q7.a.GPP_VENDOR_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.GPP_PURPOSE_CONSENTS);
                    c1950l.f15023a.b(Q7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.GPP_SPECIAL_FEATURES_OPT_INS);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_RESTRICTIONS);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_CONSENT);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1950l.f15023a.b(Q7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    if (c1950l.f15023a.j(Q7.a.TC_STRING).length() == 0) {
                        c1950l.f15033k.a(privacyEncodingMode2, false);
                        return;
                    }
                    return;
                }
            }
            if (!dVar9.g().i(z1.h.f41083d)) {
                c1950l.f15033k.a(PrivacyEncodingMode.GPP, false);
            }
            if (c1950l.f15023a.j(Q7.a.TC_STRING).length() == 0) {
                c1950l.f15033k.a(PrivacyEncodingMode.TCF, false);
            }
        }
    }

    public final void q() {
        this.f15023a.c(Q7.a.GPP_CMP_SDK_ID, this.f15024b.f988m);
        this.f15023a.c(Q7.a.GPP_CMP_SDK_VERSION, this.f15024b.f989n);
        this.f15023a.c(Q7.a.GPP_POLICY_VERSION, this.f15024b.f());
        this.f15023a.c(Q7.a.GPP_GDPR_APPLIES, b() ? 1 : 0);
        this.f15023a.e(Q7.a.GPP_PUBLISHER_CC, this.f15025c.f3925b.f3888f);
        this.f15023a.c(Q7.a.GPP_PURPOSE_ONE_TREATMENT, this.f15024b.f982g ? 1 : 0);
        this.f15023a.c(Q7.a.GPP_USE_NON_STANDARD_STACKS, this.f15024b.f981f ? 1 : 0);
    }

    public final void r() {
        this.f15023a.c(Q7.a.TCF_CMP_SDK_ID, this.f15024b.f988m);
        this.f15023a.c(Q7.a.TCF_CMP_SDK_VERSION, this.f15024b.f989n);
        this.f15023a.c(Q7.a.TCF_POLICY_VERSION, this.f15024b.f());
        this.f15023a.c(Q7.a.TCF_GDPR_APPLIES, b() ? 1 : 0);
        this.f15023a.e(Q7.a.TCF_PUBLISHER_CC, this.f15025c.f3925b.f3888f);
        this.f15023a.c(Q7.a.TCF_PURPOSE_ONE_TREATMENT, this.f15024b.f982g ? 1 : 0);
        this.f15023a.c(Q7.a.TCF_USE_NON_STANDARD_STACKS, this.f15024b.f981f ? 1 : 0);
    }

    public final boolean s() {
        boolean z8;
        if (this.f15023a.j(Q7.a.TRANSLATIONS_TEXT).length() > 0 && this.f15023a.j(Q7.a.PORTAL_CONFIG).length() > 0 && (!this.f15038p.f938b.containsKey(String.valueOf(this.f15024b.f988m)) || !n() || !AbstractC3255y.d(AbstractC3255y.q(this.f15023a.j(Q7.a.NON_IAB_VENDOR_CONSENT_HASH), f()), this.f15023a.j(Q7.a.OPTION_HASH)) || this.f15037o != h() || ((this.f15023a.j(Q7.a.TC_STRING).length() == 0 && !R7.d.f9662a.g().j(z1.h.f41085f)) || j()))) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (m()) {
            this.f15023a.e(Q7.a.GBC_PURPOSE_HASH, e());
        }
        return z8;
    }
}
