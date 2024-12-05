package I6;

import S6.C1417e;
import j$.util.DesugarCollections;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f4475j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f4476a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4477b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4478c;

    /* renamed from: d, reason: collision with root package name */
    final String f4479d;

    /* renamed from: e, reason: collision with root package name */
    final int f4480e;

    /* renamed from: f, reason: collision with root package name */
    private final List f4481f;

    /* renamed from: g, reason: collision with root package name */
    private final List f4482g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4483h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4484i;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f4485a;

        /* renamed from: d, reason: collision with root package name */
        String f4488d;

        /* renamed from: f, reason: collision with root package name */
        final List f4490f;

        /* renamed from: g, reason: collision with root package name */
        List f4491g;

        /* renamed from: h, reason: collision with root package name */
        String f4492h;

        /* renamed from: b, reason: collision with root package name */
        String f4486b = "";

        /* renamed from: c, reason: collision with root package name */
        String f4487c = "";

        /* renamed from: e, reason: collision with root package name */
        int f4489e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I6.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public enum EnumC0069a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f4490f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i8, int i9) {
            return J6.c.b(r.r(str, i8, i9, false));
        }

        private boolean f(String str) {
            if (!str.equals(".") && !str.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        private boolean g(String str) {
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e") && !str.equalsIgnoreCase("%2e%2e")) {
                return false;
            }
            return true;
        }

        private static int i(String str, int i8, int i9) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(r.a(str, i8, i9, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void j() {
            if (((String) this.f4490f.remove(r0.size() - 1)).isEmpty() && !this.f4490f.isEmpty()) {
                this.f4490f.set(r0.size() - 1, "");
            } else {
                this.f4490f.add("");
            }
        }

        private static int l(String str, int i8, int i9) {
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt != ':') {
                    if (charAt != '[') {
                        i8++;
                    }
                    do {
                        i8++;
                        if (i8 < i9) {
                        }
                        i8++;
                    } while (str.charAt(i8) != ']');
                    i8++;
                } else {
                    return i8;
                }
            }
            return i9;
        }

        private void m(String str, int i8, int i9, boolean z8, boolean z9) {
            String a8 = r.a(str, i8, i9, " \"<>^`{}|/\\?#", z9, false, false, true, null);
            if (f(a8)) {
                return;
            }
            if (g(a8)) {
                j();
                return;
            }
            if (((String) this.f4490f.get(r11.size() - 1)).isEmpty()) {
                this.f4490f.set(r11.size() - 1, a8);
            } else {
                this.f4490f.add(a8);
            }
            if (z8) {
                this.f4490f.add("");
            }
        }

        private void o(String str, int i8, int i9) {
            boolean z8;
            if (i8 == i9) {
                return;
            }
            char charAt = str.charAt(i8);
            if (charAt != '/' && charAt != '\\') {
                List list = this.f4490f;
                list.set(list.size() - 1, "");
            } else {
                this.f4490f.clear();
                this.f4490f.add("");
                i8++;
            }
            while (true) {
                int i10 = i8;
                if (i10 < i9) {
                    i8 = J6.c.l(str, i10, i9, "/\\");
                    if (i8 < i9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    m(str, i10, i8, z8, true);
                    if (z8) {
                        i8++;
                    }
                } else {
                    return;
                }
            }
        }

        private static int q(String str, int i8, int i9) {
            if (i9 - i8 < 2) {
                return -1;
            }
            char charAt = str.charAt(i8);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i8++;
                    if (i8 >= i9) {
                        break;
                    }
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int r(String str, int i8, int i9) {
            int i10 = 0;
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i10++;
                i8++;
            }
            return i10;
        }

        public r a() {
            if (this.f4485a != null) {
                if (this.f4488d != null) {
                    return new r(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int c() {
            int i8 = this.f4489e;
            if (i8 == -1) {
                return r.d(this.f4485a);
            }
            return i8;
        }

        public a d(String str) {
            List list;
            if (str != null) {
                list = r.y(r.b(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f4491g = list;
            return this;
        }

        public a e(String str) {
            if (str != null) {
                String b8 = b(str, 0, str.length());
                if (b8 != null) {
                    this.f4488d = b8;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        EnumC0069a h(r rVar, String str) {
            int l8;
            char c8;
            int i8;
            int z8 = J6.c.z(str, 0, str.length());
            int A8 = J6.c.A(str, z8, str.length());
            if (q(str, z8, A8) != -1) {
                if (str.regionMatches(true, z8, "https:", 0, 6)) {
                    this.f4485a = "https";
                    z8 += 6;
                } else if (str.regionMatches(true, z8, "http:", 0, 5)) {
                    this.f4485a = "http";
                    z8 += 5;
                } else {
                    return EnumC0069a.UNSUPPORTED_SCHEME;
                }
            } else if (rVar != null) {
                this.f4485a = rVar.f4476a;
            } else {
                return EnumC0069a.MISSING_SCHEME;
            }
            int r8 = r(str, z8, A8);
            char c9 = '?';
            char c10 = '#';
            if (r8 < 2 && rVar != null && rVar.f4476a.equals(this.f4485a)) {
                this.f4486b = rVar.j();
                this.f4487c = rVar.f();
                this.f4488d = rVar.f4479d;
                this.f4489e = rVar.f4480e;
                this.f4490f.clear();
                this.f4490f.addAll(rVar.h());
                if (z8 == A8 || str.charAt(z8) == '#') {
                    d(rVar.i());
                }
            } else {
                int i9 = z8 + r8;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    l8 = J6.c.l(str, i9, A8, "@/\\?#");
                    if (l8 != A8) {
                        c8 = str.charAt(l8);
                    } else {
                        c8 = 65535;
                    }
                    if (c8 == 65535 || c8 == c10 || c8 == '/' || c8 == '\\' || c8 == c9) {
                        break;
                    }
                    if (c8 == '@') {
                        if (!z9) {
                            int k8 = J6.c.k(str, i9, l8, ':');
                            i8 = l8;
                            String a8 = r.a(str, i9, k8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z10) {
                                a8 = this.f4486b + "%40" + a8;
                            }
                            this.f4486b = a8;
                            if (k8 != i8) {
                                this.f4487c = r.a(str, k8 + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z9 = true;
                            }
                            z10 = true;
                        } else {
                            i8 = l8;
                            this.f4487c += "%40" + r.a(str, i9, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i9 = i8 + 1;
                    }
                    c9 = '?';
                    c10 = '#';
                }
                int l9 = l(str, i9, l8);
                int i10 = l9 + 1;
                if (i10 < l8) {
                    this.f4488d = b(str, i9, l9);
                    int i11 = i(str, i10, l8);
                    this.f4489e = i11;
                    if (i11 == -1) {
                        return EnumC0069a.INVALID_PORT;
                    }
                } else {
                    this.f4488d = b(str, i9, l9);
                    this.f4489e = r.d(this.f4485a);
                }
                if (this.f4488d == null) {
                    return EnumC0069a.INVALID_HOST;
                }
                z8 = l8;
            }
            int l10 = J6.c.l(str, z8, A8, "?#");
            o(str, z8, l10);
            if (l10 < A8 && str.charAt(l10) == '?') {
                int k9 = J6.c.k(str, l10, A8, '#');
                this.f4491g = r.y(r.a(str, l10 + 1, k9, " \"'<>#", true, false, true, true, null));
                l10 = k9;
            }
            if (l10 < A8 && str.charAt(l10) == '#') {
                this.f4492h = r.a(str, 1 + l10, A8, "", true, false, false, false, null);
            }
            return EnumC0069a.SUCCESS;
        }

        public a k(int i8) {
            if (i8 > 0 && i8 <= 65535) {
                this.f4489e = i8;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i8);
        }

        a n() {
            int size = this.f4490f.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f4490f.set(i8, r.b((String) this.f4490f.get(i8), "[]", true, true, false, true));
            }
            List list = this.f4491g;
            if (list != null) {
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String str = (String) this.f4491g.get(i9);
                    if (str != null) {
                        this.f4491g.set(i9, r.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f4492h;
            if (str2 != null) {
                this.f4492h = r.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a p(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f4485a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f4485a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4485a);
            sb.append("://");
            if (!this.f4486b.isEmpty() || !this.f4487c.isEmpty()) {
                sb.append(this.f4486b);
                if (!this.f4487c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f4487c);
                }
                sb.append('@');
            }
            if (this.f4488d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f4488d);
                sb.append(']');
            } else {
                sb.append(this.f4488d);
            }
            int c8 = c();
            if (c8 != r.d(this.f4485a)) {
                sb.append(':');
                sb.append(c8);
            }
            r.q(sb, this.f4490f);
            if (this.f4491g != null) {
                sb.append('?');
                r.m(sb, this.f4491g);
            }
            if (this.f4492h != null) {
                sb.append('#');
                sb.append(this.f4492h);
            }
            return sb.toString();
        }
    }

    r(a aVar) {
        List list;
        this.f4476a = aVar.f4485a;
        this.f4477b = s(aVar.f4486b, false);
        this.f4478c = s(aVar.f4487c, false);
        this.f4479d = aVar.f4488d;
        this.f4480e = aVar.c();
        this.f4481f = t(aVar.f4490f, false);
        List list2 = aVar.f4491g;
        if (list2 != null) {
            list = t(list2, true);
        } else {
            list = null;
        }
        this.f4482g = list;
        String str = aVar.f4492h;
        this.f4483h = str != null ? s(str, false) : null;
        this.f4484i = aVar.toString();
    }

    static String a(String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        int i10 = i8;
        while (i10 < i9) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z11)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z8 && (!z9 || v(str, i10, i9)))) && (codePointAt != 43 || !z10))) {
                    i10 += Character.charCount(codePointAt);
                }
            }
            C1417e c1417e = new C1417e();
            c1417e.T(str, i8, i10);
            c(c1417e, str, i10, i9, str2, z8, z9, z10, z11, charset);
            return c1417e.readUtf8();
        }
        return str.substring(i8, i9);
    }

    static String b(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11) {
        return a(str, 0, str.length(), str2, z8, z9, z10, z11, null);
    }

    static void c(C1417e c1417e, String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        String str3;
        C1417e c1417e2 = null;
        while (i8 < i9) {
            int codePointAt = str.codePointAt(i8);
            if (!z8 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z10) {
                    if (z8) {
                        str3 = "+";
                    } else {
                        str3 = "%2B";
                    }
                    c1417e.writeUtf8(str3);
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z8 && (!z9 || v(str, i8, i9)))))) {
                    c1417e.U(codePointAt);
                } else {
                    if (c1417e2 == null) {
                        c1417e2 = new C1417e();
                    }
                    if (charset != null && !charset.equals(J6.c.f4948j)) {
                        c1417e2.R(str, i8, Character.charCount(codePointAt) + i8, charset);
                    } else {
                        c1417e2.U(codePointAt);
                    }
                    while (!c1417e2.exhausted()) {
                        byte readByte = c1417e2.readByte();
                        c1417e.writeByte(37);
                        char[] cArr = f4475j;
                        c1417e.writeByte(cArr[((readByte & 255) >> 4) & 15]);
                        c1417e.writeByte(cArr[readByte & 15]);
                    }
                }
            }
            i8 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    static void m(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            String str = (String) list.get(i8);
            String str2 = (String) list.get(i8 + 1);
            if (i8 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static r p(String str) {
        a aVar = new a();
        if (aVar.h(null, str) != a.EnumC0069a.SUCCESS) {
            return null;
        }
        return aVar.a();
    }

    static void q(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append('/');
            sb.append((String) list.get(i8));
        }
    }

    static String r(String str, int i8, int i9, boolean z8) {
        for (int i10 = i8; i10 < i9; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z8)) {
                C1417e c1417e = new C1417e();
                c1417e.T(str, i8, i10);
                u(c1417e, str, i10, i9, z8);
                return c1417e.readUtf8();
            }
        }
        return str.substring(i8, i9);
    }

    static String s(String str, boolean z8) {
        return r(str, 0, str.length(), z8);
    }

    private List t(List list, boolean z8) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = (String) list.get(i8);
            if (str2 != null) {
                str = s(str2, z8);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static void u(C1417e c1417e, String str, int i8, int i9, boolean z8) {
        int i10;
        while (i8 < i9) {
            int codePointAt = str.codePointAt(i8);
            if (codePointAt == 37 && (i10 = i8 + 2) < i9) {
                int h8 = J6.c.h(str.charAt(i8 + 1));
                int h9 = J6.c.h(str.charAt(i10));
                if (h8 != -1 && h9 != -1) {
                    c1417e.writeByte((h8 << 4) + h9);
                    i8 = i10;
                }
                c1417e.U(codePointAt);
            } else {
                if (codePointAt == 43 && z8) {
                    c1417e.writeByte(32);
                }
                c1417e.U(codePointAt);
            }
            i8 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i8, int i9) {
        int i10 = i8 + 2;
        if (i10 < i9 && str.charAt(i8) == '%' && J6.c.h(str.charAt(i8 + 1)) != -1 && J6.c.h(str.charAt(i10)) != -1) {
            return true;
        }
        return false;
    }

    static List y(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 <= str.length()) {
            int indexOf = str.indexOf(38, i8);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i8);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i8, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i8, indexOf));
                arrayList.add(null);
            }
            i8 = indexOf + 1;
        }
        return arrayList;
    }

    public String A() {
        return this.f4476a;
    }

    public URI B() {
        String aVar = n().n().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e8) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public String e() {
        if (this.f4483h == null) {
            return null;
        }
        return this.f4484i.substring(this.f4484i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof r) && ((r) obj).f4484i.equals(this.f4484i)) {
            return true;
        }
        return false;
    }

    public String f() {
        if (this.f4478c.isEmpty()) {
            return "";
        }
        return this.f4484i.substring(this.f4484i.indexOf(58, this.f4476a.length() + 3) + 1, this.f4484i.indexOf(64));
    }

    public String g() {
        int indexOf = this.f4484i.indexOf(47, this.f4476a.length() + 3);
        String str = this.f4484i;
        return this.f4484i.substring(indexOf, J6.c.l(str, indexOf, str.length(), "?#"));
    }

    public List h() {
        int indexOf = this.f4484i.indexOf(47, this.f4476a.length() + 3);
        String str = this.f4484i;
        int l8 = J6.c.l(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < l8) {
            int i8 = indexOf + 1;
            int k8 = J6.c.k(this.f4484i, i8, l8, '/');
            arrayList.add(this.f4484i.substring(i8, k8));
            indexOf = k8;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f4484i.hashCode();
    }

    public String i() {
        if (this.f4482g == null) {
            return null;
        }
        int indexOf = this.f4484i.indexOf(63) + 1;
        String str = this.f4484i;
        return this.f4484i.substring(indexOf, J6.c.k(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f4477b.isEmpty()) {
            return "";
        }
        int length = this.f4476a.length() + 3;
        String str = this.f4484i;
        return this.f4484i.substring(length, J6.c.l(str, length, str.length(), ":@"));
    }

    public String k() {
        return this.f4479d;
    }

    public boolean l() {
        return this.f4476a.equals("https");
    }

    public a n() {
        int i8;
        a aVar = new a();
        aVar.f4485a = this.f4476a;
        aVar.f4486b = j();
        aVar.f4487c = f();
        aVar.f4488d = this.f4479d;
        if (this.f4480e != d(this.f4476a)) {
            i8 = this.f4480e;
        } else {
            i8 = -1;
        }
        aVar.f4489e = i8;
        aVar.f4490f.clear();
        aVar.f4490f.addAll(h());
        aVar.d(i());
        aVar.f4492h = e();
        return aVar;
    }

    public a o(String str) {
        a aVar = new a();
        if (aVar.h(this, str) != a.EnumC0069a.SUCCESS) {
            return null;
        }
        return aVar;
    }

    public String toString() {
        return this.f4484i;
    }

    public int w() {
        return this.f4480e;
    }

    public String x() {
        if (this.f4482g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m(sb, this.f4482g);
        return sb.toString();
    }

    public r z(String str) {
        a o8 = o(str);
        if (o8 != null) {
            return o8.a();
        }
        return null;
    }
}
