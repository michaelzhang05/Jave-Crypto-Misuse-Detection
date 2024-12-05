package j6;

import P5.AbstractC1378t;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;

/* loaded from: classes5.dex */
public final class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34045b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f34046a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i8) {
            if ((i8 & 2) != 0) {
                return i8 | 64;
            }
            return i8;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f34048b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34049c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i8) {
            super(0);
            this.f34048b = charSequence;
            this.f34049c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return j.this.a(this.f34048b, this.f34049c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C3252v implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34050a = new c();

        c() {
            super(1, h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h invoke(h p02) {
            AbstractC3255y.i(p02, "p0");
            return p02.next();
        }
    }

    public j(Pattern nativePattern) {
        AbstractC3255y.i(nativePattern, "nativePattern");
        this.f34046a = nativePattern;
    }

    public static /* synthetic */ h b(j jVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return jVar.a(charSequence, i8);
    }

    public static /* synthetic */ InterfaceC2998g d(j jVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return jVar.c(charSequence, i8);
    }

    public final h a(CharSequence input, int i8) {
        AbstractC3255y.i(input, "input");
        Matcher matcher = this.f34046a.matcher(input);
        AbstractC3255y.h(matcher, "matcher(...)");
        return k.a(matcher, i8, input);
    }

    public final InterfaceC2998g c(CharSequence input, int i8) {
        AbstractC3255y.i(input, "input");
        if (i8 >= 0 && i8 <= input.length()) {
            return AbstractC3001j.j(new b(input, i8), c.f34050a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i8 + ", input length: " + input.length());
    }

    public final boolean e(CharSequence input) {
        AbstractC3255y.i(input, "input");
        return this.f34046a.matcher(input).matches();
    }

    public final String f(CharSequence input, String replacement) {
        AbstractC3255y.i(input, "input");
        AbstractC3255y.i(replacement, "replacement");
        String replaceAll = this.f34046a.matcher(input).replaceAll(replacement);
        AbstractC3255y.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String g(CharSequence input, Function1 transform) {
        AbstractC3255y.i(input, "input");
        AbstractC3255y.i(transform, "transform");
        int i8 = 0;
        h b8 = b(this, input, 0, 2, null);
        if (b8 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i8, b8.b().getStart().intValue());
            sb.append((CharSequence) transform.invoke(b8));
            i8 = b8.b().getEndInclusive().intValue() + 1;
            b8 = b8.next();
            if (i8 >= length) {
                break;
            }
        } while (b8 != null);
        if (i8 < length) {
            sb.append(input, i8, length);
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    public final String h(CharSequence input, String replacement) {
        AbstractC3255y.i(input, "input");
        AbstractC3255y.i(replacement, "replacement");
        String replaceFirst = this.f34046a.matcher(input).replaceFirst(replacement);
        AbstractC3255y.h(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List i(CharSequence input, int i8) {
        AbstractC3255y.i(input, "input");
        x.n0(i8);
        Matcher matcher = this.f34046a.matcher(input);
        if (i8 != 1 && matcher.find()) {
            int i9 = 10;
            if (i8 > 0) {
                i9 = g6.m.g(i8, 10);
            }
            ArrayList arrayList = new ArrayList(i9);
            int i10 = i8 - 1;
            int i11 = 0;
            do {
                arrayList.add(input.subSequence(i11, matcher.start()).toString());
                i11 = matcher.end();
                if (i10 >= 0 && arrayList.size() == i10) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i11, input.length()).toString());
            return arrayList;
        }
        return AbstractC1378t.e(input.toString());
    }

    public String toString() {
        String pattern = this.f34046a.toString();
        AbstractC3255y.h(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.j.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.String r2, j6.l r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
            j6.j$a r0 = j6.j.f34045b
            int r3 = r3.b()
            int r3 = j6.j.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.j.<init>(java.lang.String, j6.l):void");
    }
}
