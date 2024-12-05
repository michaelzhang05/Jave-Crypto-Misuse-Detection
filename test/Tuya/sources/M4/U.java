package m4;

import M5.AbstractC1246t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.os.LocaleListCompat;
import d6.C2559c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.U;

/* loaded from: classes4.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35272a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C2559c f35273b = new C2559c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private static final Map f35274c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List a(String str) {
            Map map = U.f35274c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (AbstractC3159y.d(((b) entry.getValue()).b(), str)) {
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
                AbstractC3159y.f(locale);
                if (a8.contains(locale.getCountry())) {
                    return locale.getCountry();
                }
            }
            return (String) AbstractC1246t.m0(a8);
        }

        public final U c(String countryCode) {
            AbstractC3159y.i(countryCode, "countryCode");
            Map map = U.f35274c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return new d(bVar);
            }
            return new c(countryCode);
        }

        public final U d(String phoneNumber) {
            AbstractC3159y.i(phoneNumber, "phoneNumber");
            int i8 = 1;
            while (i8 < g6.n.M(phoneNumber) && i8 < 4) {
                i8++;
                String substring = phoneNumber.substring(0, i8);
                AbstractC3159y.h(substring, "substring(...)");
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                AbstractC3159y.h(adjustedDefault, "getAdjustedDefault(...)");
                String b8 = b(substring, adjustedDefault);
                if (b8 != null) {
                    return c(b8);
                }
            }
            return null;
        }

        public final C2559c e() {
            return U.f35273b;
        }

        public final Integer f(String countryCode) {
            String a8;
            AbstractC3159y.i(countryCode, "countryCode");
            Map map = U.f35274c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
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
            AbstractC3159y.i(countryCode, "countryCode");
            Map map = U.f35274c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends U {

        /* renamed from: d, reason: collision with root package name */
        private final String f35278d;

        /* renamed from: e, reason: collision with root package name */
        private final String f35279e;

        /* renamed from: f, reason: collision with root package name */
        private final String f35280f;

        /* renamed from: g, reason: collision with root package name */
        private final VisualTransformation f35281g;

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
            AbstractC3159y.i(countryCode, "countryCode");
            this.f35278d = countryCode;
            this.f35279e = "";
            this.f35280f = "+############";
            this.f35281g = new VisualTransformation() { // from class: m4.V
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
            AbstractC3159y.i(text, "text");
            return new TransformedText(new AnnotatedString("+" + text.getText(), null, null, 6, null), new a());
        }

        @Override // m4.U
        public String c() {
            return this.f35278d;
        }

        @Override // m4.U
        public String d() {
            return this.f35280f;
        }

        @Override // m4.U
        public String e() {
            return this.f35279e;
        }

        @Override // m4.U
        public VisualTransformation f() {
            return this.f35281g;
        }

        @Override // m4.U
        public String g(String input) {
            AbstractC3159y.i(input, "input");
            return "+" + g6.n.N0(h(input), '0');
        }

        @Override // m4.U
        public String h(String input) {
            AbstractC3159y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f35272a.e().l(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends U {

        /* renamed from: d, reason: collision with root package name */
        private final b f35282d;

        /* renamed from: e, reason: collision with root package name */
        private final String f35283e;

        /* renamed from: f, reason: collision with root package name */
        private final String f35284f;

        /* renamed from: g, reason: collision with root package name */
        private final String f35285g;

        /* renamed from: h, reason: collision with root package name */
        private final VisualTransformation f35286h;

        /* loaded from: classes4.dex */
        public static final class a implements VisualTransformation {

            /* renamed from: m4.U$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0798a implements OffsetMapping {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f35288a;

                C0798a(d dVar) {
                    this.f35288a = dVar;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int i8) {
                    if (this.f35288a.f35282d.a() == null) {
                        return i8;
                    }
                    String a8 = this.f35288a.f35282d.a();
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
                    if (this.f35288a.f35282d.a() != null) {
                        if (i8 == 0) {
                            return 0;
                        }
                        String a8 = this.f35288a.f35282d.a();
                        String substring = a8.substring(0, Math.min(i8, a8.length()));
                        AbstractC3159y.h(substring, "substring(...)");
                        StringBuilder sb = new StringBuilder();
                        int length = substring.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            char charAt = substring.charAt(i9);
                            if (charAt != '#') {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        AbstractC3159y.h(sb2, "toString(...)");
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
                AbstractC3159y.i(text, "text");
                return new TransformedText(new AnnotatedString(d.this.j(text.getText()), null, null, 6, null), new C0798a(d.this));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b metadata) {
            super(null);
            String z8;
            AbstractC3159y.i(metadata, "metadata");
            this.f35282d = metadata;
            this.f35283e = metadata.b();
            String a8 = metadata.a();
            this.f35284f = (a8 == null || (z8 = g6.n.z(a8, '#', '5', false, 4, null)) == null) ? "" : z8;
            this.f35285g = metadata.c();
            this.f35286h = new a();
        }

        @Override // m4.U
        public String c() {
            return this.f35285g;
        }

        @Override // m4.U
        public String d() {
            return this.f35284f;
        }

        @Override // m4.U
        public String e() {
            return this.f35283e;
        }

        @Override // m4.U
        public VisualTransformation f() {
            return this.f35286h;
        }

        @Override // m4.U
        public String g(String input) {
            AbstractC3159y.i(input, "input");
            return e() + g6.n.N0(h(input), '0');
        }

        @Override // m4.U
        public String h(String input) {
            AbstractC3159y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f35272a.e().l(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }

        public final String j(String filteredInput) {
            AbstractC3159y.i(filteredInput, "filteredInput");
            if (this.f35282d.a() == null) {
                return filteredInput;
            }
            StringBuilder sb = new StringBuilder();
            String a8 = this.f35282d.a();
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
                AbstractC3159y.h(substring, "substring(...)");
                char[] charArray = substring.toCharArray();
                AbstractC3159y.h(charArray, "toCharArray(...)");
                sb.append(charArray);
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            return sb2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i8 = 4;
        AbstractC3151p abstractC3151p = null;
        String str = null;
        int i9 = 4;
        AbstractC3151p abstractC3151p2 = null;
        String str2 = null;
        int i10 = 4;
        AbstractC3151p abstractC3151p3 = null;
        String str3 = null;
        int i11 = 4;
        AbstractC3151p abstractC3151p4 = null;
        String str4 = null;
        f35274c = M5.Q.k(L5.x.a("US", new b("+1", "US", "(###) ###-####")), L5.x.a("CA", new b("+1", "CA", "(###) ###-####")), L5.x.a("AG", new b("+1", "AG", "(###) ###-####")), L5.x.a("AS", new b("+1", "AS", "(###) ###-####")), L5.x.a("AI", new b("+1", "AI", "(###) ###-####")), L5.x.a("BB", new b("+1", "BB", "(###) ###-####")), L5.x.a("BM", new b("+1", "BM", "(###) ###-####")), L5.x.a("BS", new b("+1", "BS", "(###) ###-####")), L5.x.a("DM", new b("+1", "DM", "(###) ###-####")), L5.x.a("DO", new b("+1", "DO", "(###) ###-####")), L5.x.a("GD", new b("+1", "GD", "(###) ###-####")), L5.x.a("GU", new b("+1", "GU", "(###) ###-####")), L5.x.a("JM", new b("+1", "JM", "(###) ###-####")), L5.x.a("KN", new b("+1", "KN", "(###) ###-####")), L5.x.a("KY", new b("+1", "KY", "(###) ###-####")), L5.x.a("LC", new b("+1", "LC", "(###) ###-####")), L5.x.a("MP", new b("+1", "MP", "(###) ###-####")), L5.x.a("MS", new b("+1", "MS", "(###) ###-####")), L5.x.a("PR", new b("+1", "PR", "(###) ###-####")), L5.x.a("SX", new b("+1", "SX", "(###) ###-####")), L5.x.a("TC", new b("+1", "TC", "(###) ###-####")), L5.x.a("TT", new b("+1", "TT", "(###) ###-####")), L5.x.a("VC", new b("+1", "VC", "(###) ###-####")), L5.x.a("VG", new b("+1", "VG", "(###) ###-####")), L5.x.a("VI", new b("+1", "VI", "(###) ###-####")), L5.x.a("EG", new b("+20", "EG", "### ### ####")), L5.x.a("SS", new b("+211", "SS", "### ### ###")), L5.x.a("MA", new b("+212", "MA", "###-######")), L5.x.a("EH", new b("+212", "EH", "###-######")), L5.x.a("DZ", new b("+213", "DZ", "### ## ## ##")), L5.x.a("TN", new b("+216", "TN", "## ### ###")), L5.x.a("LY", new b("+218", "LY", "##-#######")), L5.x.a("GM", new b("+220", "GM", "### ####")), L5.x.a("SN", new b("+221", "SN", "## ### ## ##")), L5.x.a("MR", new b("+222", "MR", "## ## ## ##")), L5.x.a("ML", new b("+223", "ML", "## ## ## ##")), L5.x.a("GN", new b("+224", "GN", "### ## ## ##")), L5.x.a("CI", new b("+225", "CI", "## ## ## ##")), L5.x.a("BF", new b("+226", "BF", "## ## ## ##")), L5.x.a("NE", new b("+227", "NE", "## ## ## ##")), L5.x.a("TG", new b("+228", "TG", "## ## ## ##")), L5.x.a("BJ", new b("+229", "BJ", "## ## ## ##")), L5.x.a("MU", new b("+230", "MU", "#### ####")), L5.x.a("LR", new b("+231", "LR", "### ### ###")), L5.x.a("SL", new b("+232", "SL", "## ######")), L5.x.a("GH", new b("+233", "GH", "## ### ####")), L5.x.a("NG", new b("+234", "NG", "### ### ####")), L5.x.a("TD", new b("+235", "TD", "## ## ## ##")), L5.x.a("CF", new b("+236", "CF", "## ## ## ##")), L5.x.a("CM", new b("+237", "CM", "## ## ## ##")), L5.x.a("CV", new b("+238", "CV", "### ## ##")), L5.x.a("ST", new b("+239", "ST", "### ####")), L5.x.a("GQ", new b("+240", "GQ", "### ### ###")), L5.x.a("GA", new b("+241", "GA", "## ## ## ##")), L5.x.a("CG", new b("+242", "CG", "## ### ####")), L5.x.a("CD", new b("+243", "CD", "### ### ###")), L5.x.a("AO", new b("+244", "AO", "### ### ###")), L5.x.a("GW", new b("+245", "GW", "### ####")), L5.x.a("IO", new b("+246", "IO", "### ####")), L5.x.a("AC", new b("+247", "AC", null, 4, null)), L5.x.a("SC", new b("+248", "SC", "# ### ###")), L5.x.a("RW", new b("+250", "RW", "### ### ###")), L5.x.a("ET", new b("+251", "ET", "## ### ####")), L5.x.a("SO", new b("+252", "SO", "## #######")), L5.x.a("DJ", new b("+253", "DJ", "## ## ## ##")), L5.x.a("KE", new b("+254", "KE", "## #######")), L5.x.a("TZ", new b("+255", "TZ", "### ### ###")), L5.x.a("UG", new b("+256", "UG", "### ######")), L5.x.a("BI", new b("+257", "BI", "## ## ## ##")), L5.x.a("MZ", new b("+258", "MZ", "## ### ####")), L5.x.a("ZM", new b("+260", "ZM", "## #######")), L5.x.a("MG", new b("+261", "MG", "## ## ### ##")), L5.x.a("RE", new b("+262", "RE", str, i8, abstractC3151p)), L5.x.a("TF", new b("+262", "TF", str, i8, abstractC3151p)), L5.x.a("YT", new b("+262", "YT", "### ## ## ##")), L5.x.a("ZW", new b("+263", "ZW", "## ### ####")), L5.x.a("NA", new b("+264", "NA", "## ### ####")), L5.x.a("MW", new b("+265", "MW", "### ## ## ##")), L5.x.a("LS", new b("+266", "LS", "#### ####")), L5.x.a("BW", new b("+267", "BW", "## ### ###")), L5.x.a("SZ", new b("+268", "SZ", "#### ####")), L5.x.a("KM", new b("+269", "KM", "### ## ##")), L5.x.a("ZA", new b("+27", "ZA", "## ### ####")), L5.x.a("SH", new b("+290", "SH", str2, i9, abstractC3151p2)), L5.x.a("TA", new b("+290", "TA", str2, i9, abstractC3151p2)), L5.x.a("ER", new b("+291", "ER", "# ### ###")), L5.x.a("AW", new b("+297", "AW", "### ####")), L5.x.a("FO", new b("+298", "FO", "######")), L5.x.a("GL", new b("+299", "GL", "## ## ##")), L5.x.a("GR", new b("+30", "GR", "### ### ####")), L5.x.a("NL", new b("+31", "NL", "# ########")), L5.x.a("BE", new b("+32", "BE", "### ## ## ##")), L5.x.a("FR", new b("+33", "FR", "# ## ## ## ##")), L5.x.a("ES", new b("+34", "ES", "### ## ## ##")), L5.x.a("GI", new b("+350", "GI", "### #####")), L5.x.a("PT", new b("+351", "PT", "### ### ###")), L5.x.a("LU", new b("+352", "LU", "## ## ## ###")), L5.x.a("IE", new b("+353", "IE", "## ### ####")), L5.x.a("IS", new b("+354", "IS", "### ####")), L5.x.a("AL", new b("+355", "AL", "## ### ####")), L5.x.a("MT", new b("+356", "MT", "#### ####")), L5.x.a("CY", new b("+357", "CY", "## ######")), L5.x.a("FI", new b("+358", "FI", "## ### ## ##")), L5.x.a("AX", new b("+358", "AX", null, 4, null)), L5.x.a("BG", new b("+359", "BG", "### ### ##")), L5.x.a("HU", new b("+36", "HU", "## ### ####")), L5.x.a("LT", new b("+370", "LT", "### #####")), L5.x.a("LV", new b("+371", "LV", "## ### ###")), L5.x.a("EE", new b("+372", "EE", "#### ####")), L5.x.a("MD", new b("+373", "MD", "### ## ###")), L5.x.a("AM", new b("+374", "AM", "## ######")), L5.x.a("BY", new b("+375", "BY", "## ###-##-##")), L5.x.a("AD", new b("+376", "AD", "### ###")), L5.x.a("MC", new b("+377", "MC", "# ## ## ## ##")), L5.x.a("SM", new b("+378", "SM", "## ## ## ##")), L5.x.a("VA", new b("+379", "VA", null, 4, null)), L5.x.a("UA", new b("+380", "UA", "## ### ####")), L5.x.a("RS", new b("+381", "RS", "## #######")), L5.x.a("ME", new b("+382", "ME", "## ### ###")), L5.x.a("XK", new b("+383", "XK", "## ### ###")), L5.x.a("HR", new b("+385", "HR", "## ### ####")), L5.x.a("SI", new b("+386", "SI", "## ### ###")), L5.x.a("BA", new b("+387", "BA", "## ###-###")), L5.x.a("MK", new b("+389", "MK", "## ### ###")), L5.x.a("IT", new b("+39", "IT", "## #### ####")), L5.x.a("RO", new b("+40", "RO", "## ### ####")), L5.x.a("CH", new b("+41", "CH", "## ### ## ##")), L5.x.a("CZ", new b("+420", "CZ", "### ### ###")), L5.x.a("SK", new b("+421", "SK", "### ### ###")), L5.x.a("LI", new b("+423", "LI", "### ### ###")), L5.x.a("AT", new b("+43", "AT", "### ######")), L5.x.a("GB", new b("+44", "GB", "#### ######")), L5.x.a("GG", new b("+44", "GG", "#### ######")), L5.x.a("JE", new b("+44", "JE", "#### ######")), L5.x.a("IM", new b("+44", "IM", "#### ######")), L5.x.a("DK", new b("+45", "DK", "## ## ## ##")), L5.x.a("SE", new b("+46", "SE", "##-### ## ##")), L5.x.a("NO", new b("+47", "NO", "### ## ###")), L5.x.a("BV", new b("+47", "BV", null, 4, null)), L5.x.a("SJ", new b("+47", "SJ", "## ## ## ##")), L5.x.a("PL", new b("+48", "PL", "## ### ## ##")), L5.x.a("DE", new b("+49", "DE", "### #######")), L5.x.a("FK", new b("+500", "FK", str3, i10, abstractC3151p3)), L5.x.a("GS", new b("+500", "GS", str3, i10, abstractC3151p3)), L5.x.a("BZ", new b("+501", "BZ", "###-####")), L5.x.a("GT", new b("+502", "GT", "#### ####")), L5.x.a("SV", new b("+503", "SV", "#### ####")), L5.x.a("HN", new b("+504", "HN", "####-####")), L5.x.a("NI", new b("+505", "NI", "#### ####")), L5.x.a("CR", new b("+506", "CR", "#### ####")), L5.x.a("PA", new b("+507", "PA", "####-####")), L5.x.a("PM", new b("+508", "PM", "## ## ##")), L5.x.a("HT", new b("+509", "HT", "## ## ####")), L5.x.a("PE", new b("+51", "PE", "### ### ###")), L5.x.a("MX", new b("+52", "MX", "### ### ####")), L5.x.a("CY", new b("+537", "CY", null, 4, null)), L5.x.a("AR", new b("+54", "AR", "## ##-####-####")), L5.x.a("BR", new b("+55", "BR", "## #####-####")), L5.x.a("CL", new b("+56", "CL", "# #### ####")), L5.x.a("CO", new b("+57", "CO", "### #######")), L5.x.a("VE", new b("+58", "VE", "###-#######")), L5.x.a("BL", new b("+590", "BL", "### ## ## ##")), L5.x.a("MF", new b("+590", "MF", null, 4, null)), L5.x.a("GP", new b("+590", "GP", "### ## ## ##")), L5.x.a("BO", new b("+591", "BO", "########")), L5.x.a("GY", new b("+592", "GY", "### ####")), L5.x.a("EC", new b("+593", "EC", "## ### ####")), L5.x.a("GF", new b("+594", "GF", "### ## ## ##")), L5.x.a("PY", new b("+595", "PY", "## #######")), L5.x.a("MQ", new b("+596", "MQ", "### ## ## ##")), L5.x.a("SR", new b("+597", "SR", "###-####")), L5.x.a("UY", new b("+598", "UY", "#### ####")), L5.x.a("CW", new b("+599", "CW", "# ### ####")), L5.x.a("BQ", new b("+599", "BQ", "### ####")), L5.x.a("MY", new b("+60", "MY", "##-### ####")), L5.x.a("AU", new b("+61", "AU", "### ### ###")), L5.x.a("ID", new b("+62", "ID", "###-###-###")), L5.x.a("PH", new b("+63", "PH", "#### ######")), L5.x.a("NZ", new b("+64", "NZ", "## ### ####")), L5.x.a("SG", new b("+65", "SG", "#### ####")), L5.x.a("TH", new b("+66", "TH", "## ### ####")), L5.x.a("TL", new b("+670", "TL", "#### ####")), L5.x.a("AQ", new b("+672", "AQ", "## ####")), L5.x.a("BN", new b("+673", "BN", "### ####")), L5.x.a("NR", new b("+674", "NR", "### ####")), L5.x.a("PG", new b("+675", "PG", "### ####")), L5.x.a("TO", new b("+676", "TO", "### ####")), L5.x.a("SB", new b("+677", "SB", "### ####")), L5.x.a("VU", new b("+678", "VU", "### ####")), L5.x.a("FJ", new b("+679", "FJ", "### ####")), L5.x.a("WF", new b("+681", "WF", "## ## ##")), L5.x.a("CK", new b("+682", "CK", "## ###")), L5.x.a("NU", new b("+683", "NU", str4, i11, abstractC3151p4)), L5.x.a("WS", new b("+685", "WS", str4, i11, abstractC3151p4)), L5.x.a("KI", new b("+686", "KI", str4, i11, abstractC3151p4)), L5.x.a("NC", new b("+687", "NC", "########")), L5.x.a("TV", new b("+688", "TV", null, 4, null)), L5.x.a("PF", new b("+689", "PF", "## ## ##")), L5.x.a("TK", new b("+690", "TK", null, 4, null)), L5.x.a("RU", new b("+7", "RU", "### ###-##-##")), L5.x.a("KZ", new b("+7", "KZ", 0 == true ? 1 : 0, 4, null)), L5.x.a("JP", new b("+81", "JP", "##-####-####")), L5.x.a("KR", new b("+82", "KR", "##-####-####")), L5.x.a("VN", new b("+84", "VN", "## ### ## ##")), L5.x.a("HK", new b("+852", "HK", "#### ####")), L5.x.a("MO", new b("+853", "MO", "#### ####")), L5.x.a("KH", new b("+855", "KH", "## ### ###")), L5.x.a("LA", new b("+856", "LA", "## ## ### ###")), L5.x.a("CN", new b("+86", "CN", "### #### ####")), L5.x.a("PN", new b("+872", "PN", null, 4, null)), L5.x.a("BD", new b("+880", "BD", "####-######")), L5.x.a("TW", new b("+886", "TW", "### ### ###")), L5.x.a("TR", new b("+90", "TR", "### ### ####")), L5.x.a("IN", new b("+91", "IN", "## ## ######")), L5.x.a("PK", new b("+92", "PK", "### #######")), L5.x.a("AF", new b("+93", "AF", "## ### ####")), L5.x.a("LK", new b("+94", "LK", "## # ######")), L5.x.a("MM", new b("+95", "MM", "# ### ####")), L5.x.a("MV", new b("+960", "MV", "###-####")), L5.x.a("LB", new b("+961", "LB", "## ### ###")), L5.x.a("JO", new b("+962", "JO", "# #### ####")), L5.x.a("IQ", new b("+964", "IQ", "### ### ####")), L5.x.a("KW", new b("+965", "KW", "### #####")), L5.x.a("SA", new b("+966", "SA", "## ### ####")), L5.x.a("YE", new b("+967", "YE", "### ### ###")), L5.x.a("OM", new b("+968", "OM", "#### ####")), L5.x.a("PS", new b("+970", "PS", "### ### ###")), L5.x.a("AE", new b("+971", "AE", "## ### ####")), L5.x.a("IL", new b("+972", "IL", "##-###-####")), L5.x.a("BH", new b("+973", "BH", "#### ####")), L5.x.a("QA", new b("+974", "QA", "#### ####")), L5.x.a("BT", new b("+975", "BT", "## ## ## ##")), L5.x.a("MN", new b("+976", "MN", "#### ####")), L5.x.a("NP", new b("+977", "NP", "###-#######")), L5.x.a("TJ", new b("+992", "TJ", "### ## ####")), L5.x.a("TM", new b("+993", "TM", "## ##-##-##")), L5.x.a("AZ", new b("+994", "AZ", "## ### ## ##")), L5.x.a("GE", new b("+995", "GE", "### ## ## ##")), L5.x.a("KG", new b("+996", "KG", "### ### ###")), L5.x.a("UZ", new b("+998", "UZ", "## ### ## ##")));
    }

    private U() {
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract VisualTransformation f();

    public abstract String g(String str);

    public abstract String h(String str);

    public /* synthetic */ U(AbstractC3151p abstractC3151p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f35275a;

        /* renamed from: b, reason: collision with root package name */
        private final String f35276b;

        /* renamed from: c, reason: collision with root package name */
        private final String f35277c;

        public b(String prefix, String regionCode, String str) {
            AbstractC3159y.i(prefix, "prefix");
            AbstractC3159y.i(regionCode, "regionCode");
            this.f35275a = prefix;
            this.f35276b = regionCode;
            this.f35277c = str;
            if (str != null && str.length() <= 0) {
                throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.".toString());
            }
        }

        public final String a() {
            return this.f35277c;
        }

        public final String b() {
            return this.f35275a;
        }

        public final String c() {
            return this.f35276b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f35275a, bVar.f35275a) && AbstractC3159y.d(this.f35276b, bVar.f35276b) && AbstractC3159y.d(this.f35277c, bVar.f35277c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f35275a.hashCode() * 31) + this.f35276b.hashCode()) * 31;
            String str = this.f35277c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Metadata(prefix=" + this.f35275a + ", regionCode=" + this.f35276b + ", pattern=" + this.f35277c + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this(str, str2, (i8 & 4) != 0 ? null : str3);
        }
    }
}
