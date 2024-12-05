package c.h.i;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {
    static final d a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f2710b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f2711c;

    /* renamed from: d, reason: collision with root package name */
    static final a f2712d;

    /* renamed from: e, reason: collision with root package name */
    static final a f2713e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2714f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2715g;

    /* renamed from: h, reason: collision with root package name */
    private final d f2716h;

    /* compiled from: BidiFormatter.java */
    /* renamed from: c.h.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0059a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f2717b;

        /* renamed from: c, reason: collision with root package name */
        private d f2718c;

        public C0059a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f2713e : a.f2712d;
        }

        private void c(boolean z) {
            this.a = z;
            this.f2718c = a.a;
            this.f2717b = 2;
        }

        public a a() {
            if (this.f2717b == 2 && this.f2718c == a.a) {
                return b(this.a);
            }
            return new a(this.a, this.f2717b, this.f2718c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* loaded from: classes.dex */
    public static class b {
        private static final byte[] a = new byte[1792];

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f2719b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2720c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2721d;

        /* renamed from: e, reason: collision with root package name */
        private int f2722e;

        /* renamed from: f, reason: collision with root package name */
        private char f2723f;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                a[i2] = Character.getDirectionality(i2);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f2719b = charSequence;
            this.f2720c = z;
            this.f2721d = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i2 = this.f2722e;
            do {
                int i3 = this.f2722e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2719b;
                int i4 = i3 - 1;
                this.f2722e = i4;
                charAt = charSequence.charAt(i4);
                this.f2723f = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2722e = i2;
            this.f2723f = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i2 = this.f2722e;
                if (i2 >= this.f2721d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2719b;
                this.f2722e = i2 + 1;
                charAt = charSequence.charAt(i2);
                this.f2723f = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i2 = this.f2722e;
            while (true) {
                int i3 = this.f2722e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2719b;
                int i4 = i3 - 1;
                this.f2722e = i4;
                char charAt2 = charSequence.charAt(i4);
                this.f2723f = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i5 = this.f2722e;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.f2719b;
                            int i6 = i5 - 1;
                            this.f2722e = i6;
                            charAt = charSequence2.charAt(i6);
                            this.f2723f = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2722e = i2;
            this.f2723f = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i2 = this.f2722e;
            while (true) {
                int i3 = this.f2722e;
                if (i3 < this.f2721d) {
                    CharSequence charSequence = this.f2719b;
                    this.f2722e = i3 + 1;
                    char charAt2 = charSequence.charAt(i3);
                    this.f2723f = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.f2722e;
                            if (i4 < this.f2721d) {
                                CharSequence charSequence2 = this.f2719b;
                                this.f2722e = i4 + 1;
                                charAt = charSequence2.charAt(i4);
                                this.f2723f = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2722e = i2;
                    this.f2723f = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f2719b.charAt(this.f2722e - 1);
            this.f2723f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2719b, this.f2722e);
                this.f2722e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2722e--;
            byte c2 = c(this.f2723f);
            if (!this.f2720c) {
                return c2;
            }
            char c3 = this.f2723f;
            if (c3 == '>') {
                return h();
            }
            return c3 == ';' ? f() : c2;
        }

        byte b() {
            char charAt = this.f2719b.charAt(this.f2722e);
            this.f2723f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2719b, this.f2722e);
                this.f2722e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2722e++;
            byte c2 = c(this.f2723f);
            if (!this.f2720c) {
                return c2;
            }
            char c3 = this.f2723f;
            if (c3 == '<') {
                return i();
            }
            return c3 == '&' ? g() : c2;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        int d() {
            this.f2722e = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f2722e < this.f2721d && i2 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f2722e > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        i4--;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        i4--;
                    case 18:
                        i4++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        int e() {
            this.f2722e = this.f2721d;
            int i2 = 0;
            int i3 = 0;
            while (this.f2722e > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            i3 = i2;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                    break;
                                } else {
                                    i3 = i2;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            return 0;
        }
    }

    static {
        d dVar = e.f2737c;
        a = dVar;
        f2710b = Character.toString((char) 8206);
        f2711c = Character.toString((char) 8207);
        f2712d = new a(false, 2, dVar);
        f2713e = new a(true, 2, dVar);
    }

    a(boolean z, int i2, d dVar) {
        this.f2714f = z;
        this.f2715g = i2;
        this.f2716h = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0059a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        if (this.f2714f || !(a2 || b(charSequence) == 1)) {
            return this.f2714f ? (!a2 || b(charSequence) == -1) ? f2711c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return f2710b;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        if (this.f2714f || !(a2 || a(charSequence) == 1)) {
            return this.f2714f ? (!a2 || a(charSequence) == -1) ? f2711c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return f2710b;
    }

    public boolean d() {
        return (this.f2715g & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2716h, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a2 ? e.f2736b : e.a));
        }
        if (a2 != this.f2714f) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a2 ? e.f2736b : e.a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2716h, true);
    }

    public String k(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z).toString();
    }
}
