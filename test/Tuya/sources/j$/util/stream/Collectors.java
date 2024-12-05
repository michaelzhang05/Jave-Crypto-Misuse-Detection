package j$.util.stream;

import j$.util.AbstractC2877d;
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
    static final Set f32286a;

    /* renamed from: b, reason: collision with root package name */
    static final Set f32287b;

    static {
        EnumC2932i enumC2932i = EnumC2932i.CONCURRENT;
        EnumC2932i enumC2932i2 = EnumC2932i.UNORDERED;
        EnumC2932i enumC2932i3 = EnumC2932i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC2932i, enumC2932i2, enumC2932i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2932i, enumC2932i2));
        f32286a = Collections.unmodifiableSet(EnumSet.of(enumC2932i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2932i2, enumC2932i3));
        f32287b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC2932i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Function function, Function function2, Map map, Object obj) {
        Object apply = function.apply(obj);
        Object requireNonNull = Objects.requireNonNull(function2.apply(obj));
        Object t8 = AbstractC2877d.t(map, apply, requireNonNull);
        if (t8 != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, t8, requireNonNull));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object requireNonNull = Objects.requireNonNull(entry.getValue());
            Object t8 = AbstractC2877d.t(map, key, requireNonNull);
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
        return new C2957n(new C2892a(1, charSequence), new C2947l(24), new C2947l(25), new C2947l(26), f32287b);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C2957n(new C2947l(20), new C2947l(21), new C2947l(1));
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C2957n(new C2947l(27), new C2952m(0, function, function2), new C2947l(0));
    }
}
