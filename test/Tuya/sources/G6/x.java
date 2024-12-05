package g6;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.N;
import d6.C2563g;
import f6.AbstractC2683j;
import f6.InterfaceC2680g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class x extends w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f31339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z8) {
            super(2);
            this.f31339a = cArr;
            this.f31340b = z8;
        }

        public final L5.r a(CharSequence $receiver, int i8) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            int T7 = x.T($receiver, this.f31339a, i8, this.f31340b);
            if (T7 < 0) {
                return null;
            }
            return L5.x.a(Integer.valueOf(T7), 1);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f31341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z8) {
            super(2);
            this.f31341a = list;
            this.f31342b = z8;
        }

        public final L5.r a(CharSequence $receiver, int i8) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            L5.r K8 = x.K($receiver, this.f31341a, i8, this.f31342b, false);
            if (K8 != null) {
                return L5.x.a(K8.c(), Integer.valueOf(((String) K8.d()).length()));
            }
            return null;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f31343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f31343a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(d6.i it) {
            AbstractC3159y.i(it, "it");
            return x.z0(this.f31343a, it);
        }
    }

    public static final String A0(String str, d6.i range) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        AbstractC3159y.h(substring, "substring(...)");
        return substring;
    }

    public static String B0(String str, char c8, String missingDelimiterValue) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(missingDelimiterValue, "missingDelimiterValue");
        int R8 = n.R(str, c8, 0, false, 6, null);
        if (R8 != -1) {
            String substring = str.substring(R8 + 1, str.length());
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final String C0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(delimiter, "delimiter");
        AbstractC3159y.i(missingDelimiterValue, "missingDelimiterValue");
        int S7 = n.S(str, delimiter, 0, false, 6, null);
        if (S7 != -1) {
            String substring = str.substring(S7 + delimiter.length(), str.length());
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String D0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return n.B0(str, c8, str2);
    }

    public static final boolean E(CharSequence charSequence, char c8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (n.R(charSequence, c8, 0, z8, 2, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String E0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return C0(str, str2, str3);
    }

    public static boolean F(CharSequence charSequence, CharSequence other, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(other, "other");
        if (other instanceof String) {
            if (n.S(charSequence, (String) other, 0, z8, 2, null) < 0) {
                return false;
            }
        } else if (Q(charSequence, other, 0, charSequence.length(), z8, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static String F0(String str, char c8, String missingDelimiterValue) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(missingDelimiterValue, "missingDelimiterValue");
        int W7 = n.W(str, c8, 0, false, 6, null);
        if (W7 != -1) {
            String substring = str.substring(W7 + 1, str.length());
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return E(charSequence, c8, z8);
    }

    public static /* synthetic */ String G0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return n.F0(str, c8, str2);
    }

    public static /* synthetic */ boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.F(charSequence, charSequence2, z8);
    }

    public static final String H0(String str, char c8, String missingDelimiterValue) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(missingDelimiterValue, "missingDelimiterValue");
        int R8 = n.R(str, c8, 0, false, 6, null);
        if (R8 != -1) {
            String substring = str.substring(0, R8);
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final boolean I(CharSequence charSequence, CharSequence suffix, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(suffix, "suffix");
        if (!z8 && (charSequence instanceof String) && (suffix instanceof String)) {
            return n.r((String) charSequence, (String) suffix, false, 2, null);
        }
        return j0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z8);
    }

    public static final String I0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(delimiter, "delimiter");
        AbstractC3159y.i(missingDelimiterValue, "missingDelimiterValue");
        int S7 = n.S(str, delimiter, 0, false, 6, null);
        if (S7 != -1) {
            String substring = str.substring(0, S7);
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return I(charSequence, charSequence2, z8);
    }

    public static /* synthetic */ String J0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return H0(str, c8, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L5.r K(CharSequence charSequence, Collection collection, int i8, boolean z8, boolean z9) {
        C2563g p8;
        Object obj;
        Object obj2;
        int X7;
        if (!z8 && collection.size() == 1) {
            String str = (String) AbstractC1246t.J0(collection);
            if (!z9) {
                X7 = n.S(charSequence, str, i8, false, 4, null);
            } else {
                X7 = n.X(charSequence, str, i8, false, 4, null);
            }
            if (X7 < 0) {
                return null;
            }
            return L5.x.a(Integer.valueOf(X7), str);
        }
        if (!z9) {
            p8 = new d6.i(d6.m.d(i8, 0), charSequence.length());
        } else {
            p8 = d6.m.p(d6.m.g(i8, n.M(charSequence)), 0);
        }
        if (charSequence instanceof String) {
            int g8 = p8.g();
            int h8 = p8.h();
            int i9 = p8.i();
            if ((i9 > 0 && g8 <= h8) || (i9 < 0 && h8 <= g8)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (n.v(str2, 0, (String) charSequence, g8, str2.length(), z8)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return L5.x.a(Integer.valueOf(g8), str3);
                    }
                    if (g8 == h8) {
                        break;
                    }
                    g8 += i9;
                }
            }
        } else {
            int g9 = p8.g();
            int h9 = p8.h();
            int i10 = p8.i();
            if ((i10 > 0 && g9 <= h9) || (i10 < 0 && h9 <= g9)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (j0(str4, 0, charSequence, g9, str4.length(), z8)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return L5.x.a(Integer.valueOf(g9), str5);
                    }
                    if (g9 == h9) {
                        break;
                    }
                    g9 += i10;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String K0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return I0(str, str2, str3);
    }

    public static d6.i L(CharSequence charSequence) {
        AbstractC3159y.i(charSequence, "<this>");
        return new d6.i(0, charSequence.length() - 1);
    }

    public static Boolean L0(String str) {
        AbstractC3159y.i(str, "<this>");
        if (AbstractC3159y.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC3159y.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static int M(CharSequence charSequence) {
        AbstractC3159y.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence M0(CharSequence charSequence) {
        int i8;
        AbstractC3159y.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i9 = 0;
        boolean z8 = false;
        while (i9 <= length) {
            if (!z8) {
                i8 = i9;
            } else {
                i8 = length;
            }
            boolean c8 = AbstractC2725a.c(charSequence.charAt(i8));
            if (!z8) {
                if (!c8) {
                    z8 = true;
                } else {
                    i9++;
                }
            } else {
                if (!c8) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i9, length + 1);
    }

    public static final int N(CharSequence charSequence, char c8, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c8, i8);
        }
        return T(charSequence, new char[]{c8}, i8, z8);
    }

    public static String N0(String str, char... chars) {
        CharSequence charSequence;
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(chars, "chars");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (!AbstractC1239l.T(chars, str.charAt(i8))) {
                    charSequence = str.subSequence(i8, str.length());
                    break;
                }
                i8++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static final int O(CharSequence charSequence, String string, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i8);
        }
        return Q(charSequence, string, i8, charSequence.length(), z8, false, 16, null);
    }

    private static final int P(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9) {
        C2563g p8;
        if (!z9) {
            p8 = new d6.i(d6.m.d(i8, 0), d6.m.g(i9, charSequence.length()));
        } else {
            p8 = d6.m.p(d6.m.g(i8, n.M(charSequence)), d6.m.d(i9, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int g8 = p8.g();
            int h8 = p8.h();
            int i10 = p8.i();
            if ((i10 > 0 && g8 <= h8) || (i10 < 0 && h8 <= g8)) {
                while (!n.v((String) charSequence2, 0, (String) charSequence, g8, charSequence2.length(), z8)) {
                    if (g8 != h8) {
                        g8 += i10;
                    } else {
                        return -1;
                    }
                }
                return g8;
            }
            return -1;
        }
        int g9 = p8.g();
        int h9 = p8.h();
        int i11 = p8.i();
        if ((i11 > 0 && g9 <= h9) || (i11 < 0 && h9 <= g9)) {
            while (!j0(charSequence2, 0, charSequence, g9, charSequence2.length(), z8)) {
                if (g9 != h9) {
                    g9 += i11;
                } else {
                    return -1;
                }
            }
            return g9;
        }
        return -1;
    }

    static /* synthetic */ int Q(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9, int i10, Object obj) {
        boolean z10;
        if ((i10 & 16) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        return P(charSequence, charSequence2, i8, i9, z8, z10);
    }

    public static /* synthetic */ int R(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return N(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return O(charSequence, str, i8, z8);
    }

    public static final int T(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1239l.J0(chars), i8);
        }
        N it = new d6.i(d6.m.d(i8, 0), n.M(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            for (char c8 : chars) {
                if (AbstractC2727c.h(c8, charAt, z8)) {
                    return nextInt;
                }
            }
        }
        return -1;
    }

    public static final int U(CharSequence charSequence, char c8, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c8, i8);
        }
        return Y(charSequence, new char[]{c8}, i8, z8);
    }

    public static final int V(CharSequence charSequence, String string, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i8);
        }
        return P(charSequence, string, i8, 0, z8, true);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = n.M(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return U(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = n.M(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return V(charSequence, str, i8, z8);
    }

    public static final int Y(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1239l.J0(chars), i8);
        }
        for (int g8 = d6.m.g(i8, n.M(charSequence)); -1 < g8; g8--) {
            char charAt = charSequence.charAt(g8);
            for (char c8 : chars) {
                if (AbstractC2727c.h(c8, charAt, z8)) {
                    return g8;
                }
            }
        }
        return -1;
    }

    public static final InterfaceC2680g Z(CharSequence charSequence) {
        AbstractC3159y.i(charSequence, "<this>");
        return u0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List a0(CharSequence charSequence) {
        AbstractC3159y.i(charSequence, "<this>");
        return AbstractC2683j.D(Z(charSequence));
    }

    public static final CharSequence b0(CharSequence charSequence, int i8, char c8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i8);
            sb.append(charSequence);
            N it = new d6.i(1, i8 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c8);
            }
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
    }

    public static String c0(String str, int i8, char c8) {
        AbstractC3159y.i(str, "<this>");
        return b0(str, i8, c8).toString();
    }

    public static final CharSequence d0(CharSequence charSequence, int i8, char c8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i8);
            N it = new d6.i(1, i8 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c8);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
    }

    public static String e0(String str, int i8, char c8) {
        AbstractC3159y.i(str, "<this>");
        return d0(str, i8, c8).toString();
    }

    private static final InterfaceC2680g f0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9) {
        n0(i9);
        return new C2729e(charSequence, i8, i9, new a(cArr, z8));
    }

    private static final InterfaceC2680g g0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9) {
        n0(i9);
        return new C2729e(charSequence, i8, i9, new b(AbstractC1239l.c(strArr), z8));
    }

    static /* synthetic */ InterfaceC2680g h0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return f0(charSequence, cArr, i8, z8, i9);
    }

    static /* synthetic */ InterfaceC2680g i0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return g0(charSequence, strArr, i8, z8, i9);
    }

    public static final boolean j0(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!AbstractC2727c.h(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String k0(String str, CharSequence prefix) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(prefix, "prefix");
        if (y0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String l0(String str, CharSequence suffix) {
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(suffix, "suffix");
        if (n.J(str, suffix, false, 2, null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static CharSequence m0(CharSequence charSequence, int i8, int i9, CharSequence replacement) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(replacement, "replacement");
        if (i9 >= i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i8);
            AbstractC3159y.h(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i9, charSequence.length());
            AbstractC3159y.h(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
    }

    public static final void n0(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List o0(CharSequence charSequence, char[] delimiters, boolean z8, int i8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return q0(charSequence, String.valueOf(delimiters[0]), z8, i8);
        }
        Iterable m8 = AbstractC2683j.m(h0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(m8, 10));
        Iterator it = m8.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (d6.i) it.next()));
        }
        return arrayList;
    }

    public static final List p0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return q0(charSequence, str, z8, i8);
            }
        }
        Iterable m8 = AbstractC2683j.m(i0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(m8, 10));
        Iterator it = m8.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (d6.i) it.next()));
        }
        return arrayList;
    }

    private static final List q0(CharSequence charSequence, String str, boolean z8, int i8) {
        boolean z9;
        n0(i8);
        int i9 = 0;
        int O8 = O(charSequence, str, 0, z8);
        if (O8 != -1 && i8 != 1) {
            if (i8 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = 10;
            if (z9) {
                i10 = d6.m.g(i8, 10);
            }
            ArrayList arrayList = new ArrayList(i10);
            do {
                arrayList.add(charSequence.subSequence(i9, O8).toString());
                i9 = str.length() + O8;
                if (z9 && arrayList.size() == i8 - 1) {
                    break;
                }
                O8 = O(charSequence, str, i9, z8);
            } while (O8 != -1);
            arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
            return arrayList;
        }
        return AbstractC1246t.e(charSequence.toString());
    }

    public static /* synthetic */ List r0(CharSequence charSequence, char[] cArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return o0(charSequence, cArr, z8, i8);
    }

    public static /* synthetic */ List s0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return p0(charSequence, strArr, z8, i8);
    }

    public static final InterfaceC2680g t0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(delimiters, "delimiters");
        return AbstractC2683j.y(i0(charSequence, delimiters, 0, z8, i8, 2, null), new c(charSequence));
    }

    public static /* synthetic */ InterfaceC2680g u0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return t0(charSequence, strArr, z8, i8);
    }

    public static final boolean v0(CharSequence charSequence, char c8, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !AbstractC2727c.h(charSequence.charAt(0), c8, z8)) {
            return false;
        }
        return true;
    }

    public static final boolean w0(CharSequence charSequence, CharSequence prefix, boolean z8) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(prefix, "prefix");
        if (!z8 && (charSequence instanceof String) && (prefix instanceof String)) {
            return n.C((String) charSequence, (String) prefix, false, 2, null);
        }
        return j0(charSequence, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean x0(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return v0(charSequence, c8, z8);
    }

    public static /* synthetic */ boolean y0(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return w0(charSequence, charSequence2, z8);
    }

    public static final String z0(CharSequence charSequence, d6.i range) {
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }
}
