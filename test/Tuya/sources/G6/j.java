package g6;

import M5.AbstractC1246t;
import f6.AbstractC2683j;
import f6.InterfaceC2680g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;

/* loaded from: classes5.dex */
public final class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31318b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f31319a;

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

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f31321b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i8) {
            super(0);
            this.f31321b = charSequence;
            this.f31322c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return j.this.a(this.f31321b, this.f31322c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C3156v implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31323a = new c();

        c() {
            super(1, h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h invoke(h p02) {
            AbstractC3159y.i(p02, "p0");
            return p02.next();
        }
    }

    public j(Pattern nativePattern) {
        AbstractC3159y.i(nativePattern, "nativePattern");
        this.f31319a = nativePattern;
    }

    public static /* synthetic */ h b(j jVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return jVar.a(charSequence, i8);
    }

    public static /* synthetic */ InterfaceC2680g d(j jVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return jVar.c(charSequence, i8);
    }

    public final h a(CharSequence input, int i8) {
        AbstractC3159y.i(input, "input");
        Matcher matcher = this.f31319a.matcher(input);
        AbstractC3159y.h(matcher, "matcher(...)");
        return k.a(matcher, i8, input);
    }

    public final InterfaceC2680g c(CharSequence input, int i8) {
        AbstractC3159y.i(input, "input");
        if (i8 >= 0 && i8 <= input.length()) {
            return AbstractC2683j.j(new b(input, i8), c.f31323a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i8 + ", input length: " + input.length());
    }

    public final boolean e(CharSequence input) {
        AbstractC3159y.i(input, "input");
        return this.f31319a.matcher(input).matches();
    }

    public final String f(CharSequence input, String replacement) {
        AbstractC3159y.i(input, "input");
        AbstractC3159y.i(replacement, "replacement");
        String replaceAll = this.f31319a.matcher(input).replaceAll(replacement);
        AbstractC3159y.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String g(CharSequence input, Function1 transform) {
        AbstractC3159y.i(input, "input");
        AbstractC3159y.i(transform, "transform");
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
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public final String h(CharSequence input, String replacement) {
        AbstractC3159y.i(input, "input");
        AbstractC3159y.i(replacement, "replacement");
        String replaceFirst = this.f31319a.matcher(input).replaceFirst(replacement);
        AbstractC3159y.h(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List j(CharSequence input, int i8) {
        AbstractC3159y.i(input, "input");
        x.n0(i8);
        Matcher matcher = this.f31319a.matcher(input);
        if (i8 != 1 && matcher.find()) {
            int i9 = 10;
            if (i8 > 0) {
                i9 = d6.m.g(i8, 10);
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
        return AbstractC1246t.e(input.toString());
    }

    public String toString() {
        String pattern = this.f31319a.toString();
        AbstractC3159y.h(pattern, "toString(...)");
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
            kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.j.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.String r2, g6.l r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
            g6.j$a r0 = g6.j.f31318b
            int r3 = r3.b()
            int r3 = g6.j.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.j.<init>(java.lang.String, g6.l):void");
    }
}
