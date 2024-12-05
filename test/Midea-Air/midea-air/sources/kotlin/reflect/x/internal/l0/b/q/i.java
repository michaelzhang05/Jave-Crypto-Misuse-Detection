package kotlin.reflect.x.internal.l0.b.q;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.b.x;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.i.u.e;

/* compiled from: JvmBuiltInsSignatures.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final i a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f19810b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f19811c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f19812d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f19813e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<String> f19814f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f19815g;

    static {
        Set<String> k2;
        Set j2;
        Set j3;
        Set j4;
        Set j5;
        Set j6;
        Set<String> j7;
        Set j8;
        Set j9;
        Set j10;
        Set j11;
        Set j12;
        Set<String> j13;
        Set j14;
        Set<String> j15;
        Set j16;
        Set<String> j17;
        i iVar = new i();
        a = iVar;
        x xVar = x.a;
        k2 = v0.k(xVar.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f19810b = k2;
        j2 = v0.j(iVar.b(), xVar.f("List", "sort(Ljava/util/Comparator;)V"));
        j3 = v0.j(j2, xVar.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        j4 = v0.j(j3, xVar.e("Double", "isInfinite()Z", "isNaN()Z"));
        j5 = v0.j(j4, xVar.e("Float", "isInfinite()Z", "isNaN()Z"));
        j6 = v0.j(j5, xVar.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        j7 = v0.j(j6, xVar.e("CharSequence", "isEmpty()Z"));
        f19811c = j7;
        j8 = v0.j(xVar.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), xVar.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        j9 = v0.j(j8, xVar.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        j10 = v0.j(j9, xVar.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        j11 = v0.j(j10, xVar.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        j12 = v0.j(j11, xVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        j13 = v0.j(j12, xVar.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f19812d = j13;
        j14 = v0.j(xVar.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), xVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        j15 = v0.j(j14, xVar.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f19813e = j15;
        Set<String> a2 = iVar.a();
        String[] b2 = xVar.b("D");
        j16 = v0.j(a2, xVar.e("Float", (String[]) Arrays.copyOf(b2, b2.length)));
        String[] b3 = xVar.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        j17 = v0.j(j16, xVar.e("String", (String[]) Arrays.copyOf(b3, b3.length)));
        f19814f = j17;
        String[] b4 = xVar.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f19815g = xVar.e("Throwable", (String[]) Arrays.copyOf(b4, b4.length));
    }

    private i() {
    }

    private final Set<String> a() {
        List l;
        x xVar = x.a;
        e eVar = e.BYTE;
        l = t.l(e.BOOLEAN, eVar, e.DOUBLE, e.FLOAT, eVar, e.INT, e.LONG, e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String f2 = ((e) it.next()).B().g().f();
            l.e(f2, "it.wrapperFqName.shortName().asString()");
            String[] b2 = xVar.b("Ljava/lang/String;");
            y.y(linkedHashSet, xVar.e(f2, (String[]) Arrays.copyOf(b2, b2.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        List<e> l;
        x xVar = x.a;
        l = t.l(e.BOOLEAN, e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e eVar : l) {
            String f2 = eVar.B().g().f();
            l.e(f2, "it.wrapperFqName.shortName().asString()");
            y.y(linkedHashSet, xVar.e(f2, eVar.o() + "Value()" + eVar.n()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f19810b;
    }

    public final Set<String> d() {
        return f19814f;
    }

    public final Set<String> e() {
        return f19811c;
    }

    public final Set<String> f() {
        return f19813e;
    }

    public final Set<String> g() {
        return f19815g;
    }

    public final Set<String> h() {
        return f19812d;
    }

    public final boolean i(d dVar) {
        l.f(dVar, "fqName");
        return l.a(dVar, k.a.f19717i) || k.e(dVar);
    }

    public final boolean j(d dVar) {
        l.f(dVar, "fqName");
        if (i(dVar)) {
            return true;
        }
        b n = c.a.n(dVar);
        if (n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
