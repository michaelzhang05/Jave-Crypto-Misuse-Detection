package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.c;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.e0.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19488f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final int f19489g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19490h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19491i;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", HttpUrl.FRAGMENT_ENCODE_SET, "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.e0.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final IntProgression a(int i2, int i3, int i4) {
            return new IntProgression(i2, i3, i4);
        }
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f19489g = i2;
            this.f19490h = c.b(i2, i3, i4);
            this.f19491i = i4;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    /* renamed from: a, reason: from getter */
    public final int getF19489g() {
        return this.f19489g;
    }

    /* renamed from: b, reason: from getter */
    public final int getF19490h() {
        return this.f19490h;
    }

    public boolean equals(Object other) {
        if (other instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) other).isEmpty()) {
                IntProgression intProgression = (IntProgression) other;
                if (this.f19489g != intProgression.f19489g || this.f19490h != intProgression.f19490h || this.f19491i != intProgression.f19491i) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final int getF19491i() {
        return this.f19491i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19489g * 31) + this.f19490h) * 31) + this.f19491i;
    }

    public boolean isEmpty() {
        if (this.f19491i > 0) {
            if (this.f19489g > this.f19490h) {
                return true;
            }
        } else if (this.f19489g < this.f19490h) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f19491i > 0) {
            sb = new StringBuilder();
            sb.append(this.f19489g);
            sb.append("..");
            sb.append(this.f19490h);
            sb.append(" step ");
            i2 = this.f19491i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f19489g);
            sb.append(" downTo ");
            sb.append(this.f19490h);
            sb.append(" step ");
            i2 = -this.f19491i;
        }
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f19489g, this.f19490h, this.f19491i);
    }
}
