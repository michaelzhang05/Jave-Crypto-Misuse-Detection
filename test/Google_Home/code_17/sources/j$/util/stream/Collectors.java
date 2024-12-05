package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class Collectors {

    /* renamed from: a, reason: collision with root package name */
    static final Set f33480a;

    /* renamed from: b, reason: collision with root package name */
    static final Set f33481b;

    static {
        EnumC3082i enumC3082i = EnumC3082i.CONCURRENT;
        EnumC3082i enumC3082i2 = EnumC3082i.UNORDERED;
        EnumC3082i enumC3082i3 = EnumC3082i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC3082i, enumC3082i2, enumC3082i3));
        Collections.unmodifiableSet(EnumSet.of(enumC3082i, enumC3082i2));
        f33480a = Collections.unmodifiableSet(EnumSet.of(enumC3082i3));
        Collections.unmodifiableSet(EnumSet.of(enumC3082i2, enumC3082i3));
        f33481b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC3082i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Function function, Function function2, Map map, Object obj) {
        Object apply = function.apply(obj);
        Object requireNonNull = Objects.requireNonNull(function2.apply(obj));
        Object t8 = AbstractC3027d.t(map, apply, requireNonNull);
        if (t8 != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, t8, requireNonNull));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object requireNonNull = Objects.requireNonNull(entry.getValue());
            Object t8 = AbstractC3027d.t(map, key, requireNonNull);
            if (t8 != null) {
                throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, t8, requireNonNull));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(double[] dArr, double d8) {
        double d9 = d8 - dArr[1];
        double d10 = dArr[0];
        double d11 = d10 + d9;
        dArr[1] = (d11 - d10) - d9;
        dArr[0] = d11;
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new C3107n(new C3042a(1, charSequence), new C3097l(24), new C3097l(25), new C3097l(26), f33481b);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C3107n(new C3097l(20), new C3097l(21), new C3097l(1));
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C3107n(new C3097l(27), new C3102m(0, function, function2), new C3097l(0));
    }
}
