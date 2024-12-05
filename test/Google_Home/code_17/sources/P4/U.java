package p4;

import P5.AbstractC1378t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.os.LocaleListCompat;
import g6.C2883c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.U;

/* loaded from: classes4.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37298a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C2883c f37299b = new C2883c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private static final Map f37300c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List a(String str) {
            Map map = U.f37300c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (AbstractC3255y.d(((b) entry.getValue()).b(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((b) ((Map.Entry) it.next()).getValue()).c());
            }
            return arrayList;
        }

        private final String b(String str, LocaleListCompat localeListCompat) {
            List a8 = a(str);
            if (!(!a8.isEmpty())) {
                a8 = null;
            }
            if (a8 == null) {
                return null;
            }
            int size = localeListCompat.size();
            for (int i8 = 0; i8 < size; i8++) {
                Locale locale = localeListCompat.get(i8);
                AbstractC3255y.f(locale);
                if (a8.contains(locale.getCountry())) {
                    return locale.getCountry();
                }
            }
            return (String) AbstractC1378t.m0(a8);
        }

        public final U c(String countryCode) {
            AbstractC3255y.i(countryCode, "countryCode");
            Map map = U.f37300c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return new d(bVar);
            }
            return new c(countryCode);
        }

        public final U d(String phoneNumber) {
            AbstractC3255y.i(phoneNumber, "phoneNumber");
            int i8 = 1;
            while (i8 < j6.n.M(phoneNumber) && i8 < 4) {
                i8++;
                String substring = phoneNumber.substring(0, i8);
                AbstractC3255y.h(substring, "substring(...)");
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                AbstractC3255y.h(adjustedDefault, "getAdjustedDefault(...)");
                String b8 = b(substring, adjustedDefault);
                if (b8 != null) {
                    return c(b8);
                }
            }
            return null;
        }

        public final C2883c e() {
            return U.f37299b;
        }

        public final Integer f(String countryCode) {
            String a8;
            AbstractC3255y.i(countryCode, "countryCode");
            Map map = U.f37300c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null && (a8 = bVar.a()) != null) {
                int i8 = 0;
                for (int i9 = 0; i9 < a8.length(); i9++) {
                    if (a8.charAt(i9) == '#') {
                        i8++;
                    }
                }
                return Integer.valueOf(i8);
            }
            return null;
        }

        public final String g(String countryCode) {
            AbstractC3255y.i(countryCode, "countryCode");
            Map map = U.f37300c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends U {

        /* renamed from: d, reason: collision with root package name */
        private final String f37304d;

        /* renamed from: e, reason: collision with root package name */
        private final String f37305e;

        /* renamed from: f, reason: collision with root package name */
        private final String f37306f;

        /* renamed from: g, reason: collision with root package name */
        private final VisualTransformation f37307g;

        /* loaded from: classes4.dex */
        public static final class a implements OffsetMapping {
            a() {
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i8) {
                return i8 + 1;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i8) {
                return Math.max(i8 - 1, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String countryCode) {
            super(null);
            AbstractC3255y.i(countryCode, "countryCode");
            this.f37304d = countryCode;
            this.f37305e = "";
            this.f37306f = "+############";
            this.f37307g = new VisualTransformation() { // from class: p4.V
                @Override // androidx.compose.ui.text.input.VisualTransformation
                public final TransformedText filter(AnnotatedString annotatedString) {
                    TransformedText j8;
                    j8 = U.c.j(annotatedString);
                    return j8;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText j(AnnotatedString text) {
            AbstractC3255y.i(text, "text");
            return new TransformedText(new AnnotatedString("+" + text.getText(), null, null, 6, null), new a());
        }

        @Override // p4.U
        public String c() {
            return this.f37304d;
        }

        @Override // p4.U
        public String d() {
            return this.f37306f;
        }

        @Override // p4.U
        public String e() {
            return this.f37305e;
        }

        @Override // p4.U
        public VisualTransformation f() {
            return this.f37307g;
        }

        @Override // p4.U
        public String g(String input) {
            AbstractC3255y.i(input, "input");
            return "+" + j6.n.N0(h(input), '0');
        }

        @Override // p4.U
        public String h(String input) {
            AbstractC3255y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f37298a.e().k(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3255y.h(substring, "substring(...)");
            return substring;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends U {

        /* renamed from: d, reason: collision with root package name */
        private final b f37308d;

        /* renamed from: e, reason: collision with root package name */
        private final String f37309e;

        /* renamed from: f, reason: collision with root package name */
        private final String f37310f;

        /* renamed from: g, reason: collision with root package name */
        private final String f37311g;

        /* renamed from: h, reason: collision with root package name */
        private final VisualTransformation f37312h;

        /* loaded from: classes4.dex */
        public static final class a implements VisualTransformation {

            /* renamed from: p4.U$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0828a implements OffsetMapping {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f37314a;

                C0828a(d dVar) {
                    this.f37314a = dVar;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int i8) {
                    if (this.f37314a.f37308d.a() == null) {
                        return i8;
                    }
                    String a8 = this.f37314a.f37308d.a();
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = -1;
                    for (int i12 = 0; i12 < a8.length(); i12++) {
                        i9++;
                        if (a8.charAt(i12) == '#' && (i10 = i10 + 1) == i8) {
                            i11 = i9;
                        }
                    }
                    if (i11 == -1) {
                        return a8.length() + 1 + (i8 - i10);
                    }
                    return i11;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int i8) {
                    if (this.f37314a.f37308d.a() != null) {
                        if (i8 == 0) {
                            return 0;
                        }
                        String a8 = this.f37314a.f37308d.a();
                        String substring = a8.substring(0, Math.min(i8, a8.length()));
                        AbstractC3255y.h(substring, "substring(...)");
                        StringBuilder sb = new StringBuilder();
                        int length = substring.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            char charAt = substring.charAt(i9);
                            if (charAt != '#') {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        AbstractC3255y.h(sb2, "toString(...)");
                        int length2 = sb2.length();
                        if (i8 > a8.length()) {
                            length2++;
                        }
                        return i8 - length2;
                    }
                    return i8;
                }
            }

            a() {
            }

            @Override // androidx.compose.ui.text.input.VisualTransformation
            public TransformedText filter(AnnotatedString text) {
                AbstractC3255y.i(text, "text");
                return new TransformedText(new AnnotatedString(d.this.j(text.getText()), null, null, 6, null), new C0828a(d.this));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b metadata) {
            super(null);
            String z8;
            AbstractC3255y.i(metadata, "metadata");
            this.f37308d = metadata;
            this.f37309e = metadata.b();
            String a8 = metadata.a();
            this.f37310f = (a8 == null || (z8 = j6.n.z(a8, '#', '5', false, 4, null)) == null) ? "" : z8;
            this.f37311g = metadata.c();
            this.f37312h = new a();
        }

        @Override // p4.U
        public String c() {
            return this.f37311g;
        }

        @Override // p4.U
        public String d() {
            return this.f37310f;
        }

        @Override // p4.U
        public String e() {
            return this.f37309e;
        }

        @Override // p4.U
        public VisualTransformation f() {
            return this.f37312h;
        }

        @Override // p4.U
        public String g(String input) {
            AbstractC3255y.i(input, "input");
            return e() + j6.n.N0(h(input), '0');
        }

        @Override // p4.U
        public String h(String input) {
            AbstractC3255y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f37298a.e().k(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3255y.h(substring, "substring(...)");
            return substring;
        }

        public final String j(String filteredInput) {
            AbstractC3255y.i(filteredInput, "filteredInput");
            if (this.f37308d.a() == null) {
                return filteredInput;
            }
            StringBuilder sb = new StringBuilder();
            String a8 = this.f37308d.a();
            int i8 = 0;
            for (int i9 = 0; i9 < a8.length(); i9++) {
                char charAt = a8.charAt(i9);
                if (i8 < filteredInput.length()) {
                    if (charAt == '#') {
                        charAt = filteredInput.charAt(i8);
                        i8++;
                    }
                    sb.append(charAt);
                }
            }
            if (i8 < filteredInput.length()) {
                sb.append(' ');
                String substring = filteredInput.substring(i8);
                AbstractC3255y.h(substring, "substring(...)");
                char[] charArray = substring.toCharArray();
                AbstractC3255y.h(charArray, "toCharArray(...)");
                sb.append(charArray);
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            return sb2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i8 = 4;
        AbstractC3247p abstractC3247p = null;
        String str = null;
        int i9 = 4;
        AbstractC3247p abstractC3247p2 = null;
        String str2 = null;
        int i10 = 4;
        AbstractC3247p abstractC3247p3 = null;
        String str3 = null;
        int i11 = 4;
        AbstractC3247p abstractC3247p4 = null;
        String str4 = null;
        f37300c = P5.Q.k(O5.x.a("US", new b("+1", "US", "(###) ###-####")), O5.x.a("CA", new b("+1", "CA", "(###) ###-####")), O5.x.a("AG", new b("+1", "AG", "(###) ###-####")), O5.x.a("AS", new b("+1", "AS", "(###) ###-####")), O5.x.a("AI", new b("+1", "AI", "(###) ###-####")), O5.x.a("BB", new b("+1", "BB", "(###) ###-####")), O5.x.a("BM", new b("+1", "BM", "(###) ###-####")), O5.x.a("BS", new b("+1", "BS", "(###) ###-####")), O5.x.a("DM", new b("+1", "DM", "(###) ###-####")), O5.x.a("DO", new b("+1", "DO", "(###) ###-####")), O5.x.a("GD", new b("+1", "GD", "(###) ###-####")), O5.x.a("GU", new b("+1", "GU", "(###) ###-####")), O5.x.a("JM", new b("+1", "JM", "(###) ###-####")), O5.x.a("KN", new b("+1", "KN", "(###) ###-####")), O5.x.a("KY", new b("+1", "KY", "(###) ###-####")), O5.x.a("LC", new b("+1", "LC", "(###) ###-####")), O5.x.a("MP", new b("+1", "MP", "(###) ###-####")), O5.x.a("MS", new b("+1", "MS", "(###) ###-####")), O5.x.a("PR", new b("+1", "PR", "(###) ###-####")), O5.x.a("SX", new b("+1", "SX", "(###) ###-####")), O5.x.a("TC", new b("+1", "TC", "(###) ###-####")), O5.x.a("TT", new b("+1", "TT", "(###) ###-####")), O5.x.a("VC", new b("+1", "VC", "(###) ###-####")), O5.x.a("VG", new b("+1", "VG", "(###) ###-####")), O5.x.a("VI", new b("+1", "VI", "(###) ###-####")), O5.x.a("EG", new b("+20", "EG", "### ### ####")), O5.x.a("SS", new b("+211", "SS", "### ### ###")), O5.x.a("MA", new b("+212", "MA", "###-######")), O5.x.a("EH", new b("+212", "EH", "###-######")), O5.x.a("DZ", new b("+213", "DZ", "### ## ## ##")), O5.x.a("TN", new b("+216", "TN", "## ### ###")), O5.x.a("LY", new b("+218", "LY", "##-#######")), O5.x.a("GM", new b("+220", "GM", "### ####")), O5.x.a("SN", new b("+221", "SN", "## ### ## ##")), O5.x.a("MR", new b("+222", "MR", "## ## ## ##")), O5.x.a("ML", new b("+223", "ML", "## ## ## ##")), O5.x.a("GN", new b("+224", "GN", "### ## ## ##")), O5.x.a("CI", new b("+225", "CI", "## ## ## ##")), O5.x.a("BF", new b("+226", "BF", "## ## ## ##")), O5.x.a("NE", new b("+227", "NE", "## ## ## ##")), O5.x.a("TG", new b("+228", "TG", "## ## ## ##")), O5.x.a("BJ", new b("+229", "BJ", "## ## ## ##")), O5.x.a("MU", new b("+230", "MU", "#### ####")), O5.x.a("LR", new b("+231", "LR", "### ### ###")), O5.x.a("SL", new b("+232", "SL", "## ######")), O5.x.a("GH", new b("+233", "GH", "## ### ####")), O5.x.a("NG", new b("+234", "NG", "### ### ####")), O5.x.a("TD", new b("+235", "TD", "## ## ## ##")), O5.x.a("CF", new b("+236", "CF", "## ## ## ##")), O5.x.a("CM", new b("+237", "CM", "## ## ## ##")), O5.x.a("CV", new b("+238", "CV", "### ## ##")), O5.x.a("ST", new b("+239", "ST", "### ####")), O5.x.a("GQ", new b("+240", "GQ", "### ### ###")), O5.x.a("GA", new b("+241", "GA", "## ## ## ##")), O5.x.a("CG", new b("+242", "CG", "## ### ####")), O5.x.a("CD", new b("+243", "CD", "### ### ###")), O5.x.a("AO", new b("+244", "AO", "### ### ###")), O5.x.a("GW", new b("+245", "GW", "### ####")), O5.x.a("IO", new b("+246", "IO", "### ####")), O5.x.a("AC", new b("+247", "AC", null, 4, null)), O5.x.a("SC", new b("+248", "SC", "# ### ###")), O5.x.a("RW", new b("+250", "RW", "### ### ###")), O5.x.a("ET", new b("+251", "ET", "## ### ####")), O5.x.a("SO", new b("+252", "SO", "## #######")), O5.x.a("DJ", new b("+253", "DJ", "## ## ## ##")), O5.x.a("KE", new b("+254", "KE", "## #######")), O5.x.a("TZ", new b("+255", "TZ", "### ### ###")), O5.x.a("UG", new b("+256", "UG", "### ######")), O5.x.a("BI", new b("+257", "BI", "## ## ## ##")), O5.x.a("MZ", new b("+258", "MZ", "## ### ####")), O5.x.a("ZM", new b("+260", "ZM", "## #######")), O5.x.a("MG", new b("+261", "MG", "## ## ### ##")), O5.x.a("RE", new b("+262", "RE", str, i8, abstractC3247p)), O5.x.a("TF", new b("+262", "TF", str, i8, abstractC3247p)), O5.x.a("YT", new b("+262", "YT", "### ## ## ##")), O5.x.a("ZW", new b("+263", "ZW", "## ### ####")), O5.x.a("NA", new b("+264", "NA", "## ### ####")), O5.x.a("MW", new b("+265", "MW", "### ## ## ##")), O5.x.a("LS", new b("+266", "LS", "#### ####")), O5.x.a("BW", new b("+267", "BW", "## ### ###")), O5.x.a("SZ", new b("+268", "SZ", "#### ####")), O5.x.a("KM", new b("+269", "KM", "### ## ##")), O5.x.a("ZA", new b("+27", "ZA", "## ### ####")), O5.x.a("SH", new b("+290", "SH", str2, i9, abstractC3247p2)), O5.x.a("TA", new b("+290", "TA", str2, i9, abstractC3247p2)), O5.x.a("ER", new b("+291", "ER", "# ### ###")), O5.x.a("AW", new b("+297", "AW", "### ####")), O5.x.a("FO", new b("+298", "FO", "######")), O5.x.a("GL", new b("+299", "GL", "## ## ##")), O5.x.a("GR", new b("+30", "GR", "### ### ####")), O5.x.a("NL", new b("+31", "NL", "# ########")), O5.x.a("BE", new b("+32", "BE", "### ## ## ##")), O5.x.a("FR", new b("+33", "FR", "# ## ## ## ##")), O5.x.a("ES", new b("+34", "ES", "### ## ## ##")), O5.x.a("GI", new b("+350", "GI", "### #####")), O5.x.a("PT", new b("+351", "PT", "### ### ###")), O5.x.a("LU", new b("+352", "LU", "## ## ## ###")), O5.x.a("IE", new b("+353", "IE", "## ### ####")), O5.x.a("IS", new b("+354", "IS", "### ####")), O5.x.a("AL", new b("+355", "AL", "## ### ####")), O5.x.a("MT", new b("+356", "MT", "#### ####")), O5.x.a("CY", new b("+357", "CY", "## ######")), O5.x.a("FI", new b("+358", "FI", "## ### ## ##")), O5.x.a("AX", new b("+358", "AX", null, 4, null)), O5.x.a("BG", new b("+359", "BG", "### ### ##")), O5.x.a("HU", new b("+36", "HU", "## ### ####")), O5.x.a("LT", new b("+370", "LT", "### #####")), O5.x.a("LV", new b("+371", "LV", "## ### ###")), O5.x.a("EE", new b("+372", "EE", "#### ####")), O5.x.a("MD", new b("+373", "MD", "### ## ###")), O5.x.a("AM", new b("+374", "AM", "## ######")), O5.x.a("BY", new b("+375", "BY", "## ###-##-##")), O5.x.a("AD", new b("+376", "AD", "### ###")), O5.x.a("MC", new b("+377", "MC", "# ## ## ## ##")), O5.x.a("SM", new b("+378", "SM", "## ## ## ##")), O5.x.a("VA", new b("+379", "VA", null, 4, null)), O5.x.a("UA", new b("+380", "UA", "## ### ####")), O5.x.a("RS", new b("+381", "RS", "## #######")), O5.x.a("ME", new b("+382", "ME", "## ### ###")), O5.x.a("XK", new b("+383", "XK", "## ### ###")), O5.x.a("HR", new b("+385", "HR", "## ### ####")), O5.x.a("SI", new b("+386", "SI", "## ### ###")), O5.x.a("BA", new b("+387", "BA", "## ###-###")), O5.x.a("MK", new b("+389", "MK", "## ### ###")), O5.x.a("IT", new b("+39", "IT", "## #### ####")), O5.x.a("RO", new b("+40", "RO", "## ### ####")), O5.x.a("CH", new b("+41", "CH", "## ### ## ##")), O5.x.a("CZ", new b("+420", "CZ", "### ### ###")), O5.x.a("SK", new b("+421", "SK", "### ### ###")), O5.x.a("LI", new b("+423", "LI", "### ### ###")), O5.x.a("AT", new b("+43", "AT", "### ######")), O5.x.a("GB", new b("+44", "GB", "#### ######")), O5.x.a("GG", new b("+44", "GG", "#### ######")), O5.x.a("JE", new b("+44", "JE", "#### ######")), O5.x.a("IM", new b("+44", "IM", "#### ######")), O5.x.a("DK", new b("+45", "DK", "## ## ## ##")), O5.x.a("SE", new b("+46", "SE", "##-### ## ##")), O5.x.a("NO", new b("+47", "NO", "### ## ###")), O5.x.a("BV", new b("+47", "BV", null, 4, null)), O5.x.a("SJ", new b("+47", "SJ", "## ## ## ##")), O5.x.a("PL", new b("+48", "PL", "## ### ## ##")), O5.x.a("DE", new b("+49", "DE", "### #######")), O5.x.a("FK", new b("+500", "FK", str3, i10, abstractC3247p3)), O5.x.a("GS", new b("+500", "GS", str3, i10, abstractC3247p3)), O5.x.a("BZ", new b("+501", "BZ", "###-####")), O5.x.a("GT", new b("+502", "GT", "#### ####")), O5.x.a("SV", new b("+503", "SV", "#### ####")), O5.x.a("HN", new b("+504", "HN", "####-####")), O5.x.a("NI", new b("+505", "NI", "#### ####")), O5.x.a("CR", new b("+506", "CR", "#### ####")), O5.x.a("PA", new b("+507", "PA", "####-####")), O5.x.a("PM", new b("+508", "PM", "## ## ##")), O5.x.a("HT", new b("+509", "HT", "## ## ####")), O5.x.a("PE", new b("+51", "PE", "### ### ###")), O5.x.a("MX", new b("+52", "MX", "### ### ####")), O5.x.a("CY", new b("+537", "CY", null, 4, null)), O5.x.a("AR", new b("+54", "AR", "## ##-####-####")), O5.x.a("BR", new b("+55", "BR", "## #####-####")), O5.x.a("CL", new b("+56", "CL", "# #### ####")), O5.x.a("CO", new b("+57", "CO", "### #######")), O5.x.a("VE", new b("+58", "VE", "###-#######")), O5.x.a("BL", new b("+590", "BL", "### ## ## ##")), O5.x.a("MF", new b("+590", "MF", null, 4, null)), O5.x.a("GP", new b("+590", "GP", "### ## ## ##")), O5.x.a("BO", new b("+591", "BO", "########")), O5.x.a("GY", new b("+592", "GY", "### ####")), O5.x.a("EC", new b("+593", "EC", "## ### ####")), O5.x.a("GF", new b("+594", "GF", "### ## ## ##")), O5.x.a("PY", new b("+595", "PY", "## #######")), O5.x.a("MQ", new b("+596", "MQ", "### ## ## ##")), O5.x.a("SR", new b("+597", "SR", "###-####")), O5.x.a("UY", new b("+598", "UY", "#### ####")), O5.x.a("CW", new b("+599", "CW", "# ### ####")), O5.x.a("BQ", new b("+599", "BQ", "### ####")), O5.x.a("MY", new b("+60", "MY", "##-### ####")), O5.x.a("AU", new b("+61", "AU", "### ### ###")), O5.x.a("ID", new b("+62", "ID", "###-###-###")), O5.x.a("PH", new b("+63", "PH", "#### ######")), O5.x.a("NZ", new b("+64", "NZ", "## ### ####")), O5.x.a("SG", new b("+65", "SG", "#### ####")), O5.x.a("TH", new b("+66", "TH", "## ### ####")), O5.x.a("TL", new b("+670", "TL", "#### ####")), O5.x.a("AQ", new b("+672", "AQ", "## ####")), O5.x.a("BN", new b("+673", "BN", "### ####")), O5.x.a("NR", new b("+674", "NR", "### ####")), O5.x.a("PG", new b("+675", "PG", "### ####")), O5.x.a("TO", new b("+676", "TO", "### ####")), O5.x.a("SB", new b("+677", "SB", "### ####")), O5.x.a("VU", new b("+678", "VU", "### ####")), O5.x.a("FJ", new b("+679", "FJ", "### ####")), O5.x.a("WF", new b("+681", "WF", "## ## ##")), O5.x.a("CK", new b("+682", "CK", "## ###")), O5.x.a("NU", new b("+683", "NU", str4, i11, abstractC3247p4)), O5.x.a("WS", new b("+685", "WS", str4, i11, abstractC3247p4)), O5.x.a("KI", new b("+686", "KI", str4, i11, abstractC3247p4)), O5.x.a("NC", new b("+687", "NC", "########")), O5.x.a("TV", new b("+688", "TV", null, 4, null)), O5.x.a("PF", new b("+689", "PF", "## ## ##")), O5.x.a("TK", new b("+690", "TK", null, 4, null)), O5.x.a("RU", new b("+7", "RU", "### ###-##-##")), O5.x.a("KZ", new b("+7", "KZ", 0 == true ? 1 : 0, 4, null)), O5.x.a("JP", new b("+81", "JP", "##-####-####")), O5.x.a("KR", new b("+82", "KR", "##-####-####")), O5.x.a("VN", new b("+84", "VN", "## ### ## ##")), O5.x.a("HK", new b("+852", "HK", "#### ####")), O5.x.a("MO", new b("+853", "MO", "#### ####")), O5.x.a("KH", new b("+855", "KH", "## ### ###")), O5.x.a("LA", new b("+856", "LA", "## ## ### ###")), O5.x.a("CN", new b("+86", "CN", "### #### ####")), O5.x.a("PN", new b("+872", "PN", null, 4, null)), O5.x.a("BD", new b("+880", "BD", "####-######")), O5.x.a("TW", new b("+886", "TW", "### ### ###")), O5.x.a("TR", new b("+90", "TR", "### ### ####")), O5.x.a("IN", new b("+91", "IN", "## ## ######")), O5.x.a("PK", new b("+92", "PK", "### #######")), O5.x.a("AF", new b("+93", "AF", "## ### ####")), O5.x.a("LK", new b("+94", "LK", "## # ######")), O5.x.a("MM", new b("+95", "MM", "# ### ####")), O5.x.a("MV", new b("+960", "MV", "###-####")), O5.x.a("LB", new b("+961", "LB", "## ### ###")), O5.x.a("JO", new b("+962", "JO", "# #### ####")), O5.x.a("IQ", new b("+964", "IQ", "### ### ####")), O5.x.a("KW", new b("+965", "KW", "### #####")), O5.x.a("SA", new b("+966", "SA", "## ### ####")), O5.x.a("YE", new b("+967", "YE", "### ### ###")), O5.x.a("OM", new b("+968", "OM", "#### ####")), O5.x.a("PS", new b("+970", "PS", "### ### ###")), O5.x.a("AE", new b("+971", "AE", "## ### ####")), O5.x.a("IL", new b("+972", "IL", "##-###-####")), O5.x.a("BH", new b("+973", "BH", "#### ####")), O5.x.a("QA", new b("+974", "QA", "#### ####")), O5.x.a("BT", new b("+975", "BT", "## ## ## ##")), O5.x.a("MN", new b("+976", "MN", "#### ####")), O5.x.a("NP", new b("+977", "NP", "###-#######")), O5.x.a("TJ", new b("+992", "TJ", "### ## ####")), O5.x.a("TM", new b("+993", "TM", "## ##-##-##")), O5.x.a("AZ", new b("+994", "AZ", "## ### ## ##")), O5.x.a("GE", new b("+995", "GE", "### ## ## ##")), O5.x.a("KG", new b("+996", "KG", "### ### ###")), O5.x.a("UZ", new b("+998", "UZ", "## ### ## ##")));
    }

    private U() {
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract VisualTransformation f();

    public abstract String g(String str);

    public abstract String h(String str);

    public /* synthetic */ U(AbstractC3247p abstractC3247p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f37301a;

        /* renamed from: b, reason: collision with root package name */
        private final String f37302b;

        /* renamed from: c, reason: collision with root package name */
        private final String f37303c;

        public b(String prefix, String regionCode, String str) {
            AbstractC3255y.i(prefix, "prefix");
            AbstractC3255y.i(regionCode, "regionCode");
            this.f37301a = prefix;
            this.f37302b = regionCode;
            this.f37303c = str;
            if (str != null && str.length() <= 0) {
                throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.".toString());
            }
        }

        public final String a() {
            return this.f37303c;
        }

        public final String b() {
            return this.f37301a;
        }

        public final String c() {
            return this.f37302b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f37301a, bVar.f37301a) && AbstractC3255y.d(this.f37302b, bVar.f37302b) && AbstractC3255y.d(this.f37303c, bVar.f37303c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f37301a.hashCode() * 31) + this.f37302b.hashCode()) * 31;
            String str = this.f37303c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Metadata(prefix=" + this.f37301a + ", regionCode=" + this.f37302b + ", pattern=" + this.f37303c + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this(str, str2, (i8 & 4) != 0 ? null : str3);
        }
    }
}
