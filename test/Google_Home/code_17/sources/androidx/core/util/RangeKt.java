package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import g6.InterfaceC2886f;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t8) {
        return range.extend((Range<T>) t8);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t8, T t9) {
        return new Range<>(t8, t9);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> InterfaceC2886f toClosedRange(final Range<T> range) {
        return new InterfaceC2886f() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return InterfaceC2886f.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // g6.InterfaceC2886f
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // g6.InterfaceC2886f
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // g6.InterfaceC2886f
            public boolean isEmpty() {
                return InterfaceC2886f.a.b(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(InterfaceC2886f interfaceC2886f) {
        return new Range<>(interfaceC2886f.getStart(), interfaceC2886f.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
