package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m765boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m766constructorimpl(T t8) {
        return t8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m767equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && AbstractC3255y.d(obj, ((StableValue) obj2).m771unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m768equalsimpl0(Object obj, Object obj2) {
        return AbstractC3255y.d(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m769hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m770toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m767equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m769hashCodeimpl(this.value);
    }

    public String toString() {
        return m770toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m771unboximpl() {
        return this.value;
    }
}
