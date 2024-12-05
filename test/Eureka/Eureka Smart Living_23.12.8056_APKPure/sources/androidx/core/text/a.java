package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final t f2223d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f2224e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f2225f;

    /* renamed from: g, reason: collision with root package name */
    static final a f2226g;

    /* renamed from: h, reason: collision with root package name */
    static final a f2227h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2228a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2229b;

    /* renamed from: c, reason: collision with root package name */
    private final t f2230c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0031a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2231a;

        /* renamed from: b, reason: collision with root package name */
        private int f2232b;

        /* renamed from: c, reason: collision with root package name */
        private t f2233c;

        public C0031a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z5) {
            return z5 ? a.f2227h : a.f2226g;
        }

        private void c(boolean z5) {
            this.f2231a = z5;
            this.f2233c = a.f2223d;
            this.f2232b = 2;
        }

        public a a() {
            return (this.f2232b == 2 && this.f2233c == a.f2223d) ? b(this.f2231a) : new a(this.f2231a, this.f2232b, this.f2233c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f2234f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f2235a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2236b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2237c;

        /* renamed from: d, reason: collision with root package name */
        private int f2238d;

        /* renamed from: e, reason: collision with root package name */
        private char f2239e;

        static {
            for (int i6 = 0; i6 < 1792; i6++) {
                f2234f[i6] = Character.getDirectionality(i6);
            }
        }

        b(CharSequence charSequence, boolean z5) {
            this.f2235a = charSequence;
            this.f2236b = z5;
            this.f2237c = charSequence.length();
        }

        private static byte c(char c6) {
            return c6 < 1792 ? f2234f[c6] : Character.getDirectionality(c6);
        }

        private byte f() {
            char charAt;
            int i6 = this.f2238d;
            do {
                int i7 = this.f2238d;
                if (i7 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2235a;
                int i8 = i7 - 1;
                this.f2238d = i8;
                charAt = charSequence.charAt(i8);
                this.f2239e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2238d = i6;
            this.f2239e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i6 = this.f2238d;
                if (i6 >= this.f2237c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2235a;
                this.f2238d = i6 + 1;
                charAt = charSequence.charAt(i6);
                this.f2239e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i6 = this.f2238d;
            while (true) {
                int i7 = this.f2238d;
                if (i7 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2235a;
                int i8 = i7 - 1;
                this.f2238d = i8;
                char charAt2 = charSequence.charAt(i8);
                this.f2239e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i9 = this.f2238d;
                        if (i9 > 0) {
                            CharSequence charSequence2 = this.f2235a;
                            int i10 = i9 - 1;
                            this.f2238d = i10;
                            charAt = charSequence2.charAt(i10);
                            this.f2239e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2238d = i6;
            this.f2239e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i6 = this.f2238d;
            while (true) {
                int i7 = this.f2238d;
                if (i7 >= this.f2237c) {
                    this.f2238d = i6;
                    this.f2239e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2235a;
                this.f2238d = i7 + 1;
                char charAt2 = charSequence.charAt(i7);
                this.f2239e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i8 = this.f2238d;
                        if (i8 < this.f2237c) {
                            CharSequence charSequence2 = this.f2235a;
                            this.f2238d = i8 + 1;
                            charAt = charSequence2.charAt(i8);
                            this.f2239e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f2235a.charAt(this.f2238d - 1);
            this.f2239e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2235a, this.f2238d);
                this.f2238d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2238d--;
            byte c6 = c(this.f2239e);
            if (!this.f2236b) {
                return c6;
            }
            char c7 = this.f2239e;
            return c7 == '>' ? h() : c7 == ';' ? f() : c6;
        }

        byte b() {
            char charAt = this.f2235a.charAt(this.f2238d);
            this.f2239e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2235a, this.f2238d);
                this.f2238d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2238d++;
            byte c6 = c(this.f2239e);
            if (!this.f2236b) {
                return c6;
            }
            char c7 = this.f2239e;
            return c7 == '<' ? i() : c7 == '&' ? g() : c6;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        int d() {
            this.f2238d = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (this.f2238d < this.f2237c && i6 == 0) {
                byte b6 = b();
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        if (i8 == 0) {
                            return 1;
                        }
                    } else if (b6 != 9) {
                        switch (b6) {
                            case 14:
                            case 15:
                                i8++;
                                i7 = -1;
                                continue;
                            case 16:
                            case 17:
                                i8++;
                                i7 = 1;
                                continue;
                            case 18:
                                i8--;
                                i7 = 0;
                                continue;
                        }
                    }
                } else if (i8 == 0) {
                    return -1;
                }
                i6 = i8;
            }
            if (i6 == 0) {
                return 0;
            }
            if (i7 != 0) {
                return i7;
            }
            while (this.f2238d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i6 == i8) {
                            return -1;
                        }
                        i8--;
                    case 16:
                    case 17:
                        if (i6 == i8) {
                            return 1;
                        }
                        i8--;
                    case 18:
                        i8++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        int e() {
            this.f2238d = this.f2237c;
            int i6 = 0;
            int i7 = 0;
            while (this.f2238d > 0) {
                byte a6 = a();
                if (a6 != 0) {
                    if (a6 == 1 || a6 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                        if (i7 == 0) {
                            i7 = i6;
                        }
                    } else if (a6 != 9) {
                        switch (a6) {
                            case 14:
                            case 15:
                                if (i7 == i6) {
                                    return -1;
                                }
                                i6--;
                                break;
                            case 16:
                            case 17:
                                if (i7 == i6) {
                                    return 1;
                                }
                                i6--;
                                break;
                            case 18:
                                i6++;
                                break;
                            default:
                                if (i7 != 0) {
                                    break;
                                } else {
                                    i7 = i6;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i6 == 0) {
                        return -1;
                    }
                    if (i7 == 0) {
                        i7 = i6;
                    }
                }
            }
            return 0;
        }
    }

    static {
        t tVar = u.f2252c;
        f2223d = tVar;
        f2224e = Character.toString((char) 8206);
        f2225f = Character.toString((char) 8207);
        f2226g = new a(false, 2, tVar);
        f2227h = new a(true, 2, tVar);
    }

    a(boolean z5, int i6, t tVar) {
        this.f2228a = z5;
        this.f2229b = i6;
        this.f2230c = tVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0031a().a();
    }

    static boolean e(Locale locale) {
        return v.a(locale) == 1;
    }

    private String f(CharSequence charSequence, t tVar) {
        boolean a6 = tVar.a(charSequence, 0, charSequence.length());
        return (this.f2228a || !(a6 || b(charSequence) == 1)) ? this.f2228a ? (!a6 || b(charSequence) == -1) ? f2225f : "" : "" : f2224e;
    }

    private String g(CharSequence charSequence, t tVar) {
        boolean a6 = tVar.a(charSequence, 0, charSequence.length());
        return (this.f2228a || !(a6 || a(charSequence) == 1)) ? this.f2228a ? (!a6 || a(charSequence) == -1) ? f2225f : "" : "" : f2224e;
    }

    public boolean d() {
        return (this.f2229b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2230c, true);
    }

    public CharSequence i(CharSequence charSequence, t tVar, boolean z5) {
        if (charSequence == null) {
            return null;
        }
        boolean a6 = tVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z5) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a6 ? u.f2251b : u.f2250a));
        }
        if (a6 != this.f2228a) {
            spannableStringBuilder.append(a6 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z5) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a6 ? u.f2251b : u.f2250a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2230c, true);
    }

    public String k(String str, t tVar, boolean z5) {
        if (str == null) {
            return null;
        }
        return i(str, tVar, z5).toString();
    }
}
