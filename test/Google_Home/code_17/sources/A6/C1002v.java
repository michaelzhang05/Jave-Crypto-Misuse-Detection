package A6;

import P5.AbstractC1371l;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1002v {

    /* renamed from: e, reason: collision with root package name */
    private static final a f613e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f614f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final y6.f f615a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1668n f616b;

    /* renamed from: c, reason: collision with root package name */
    private long f617c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f618d;

    /* renamed from: A6.v$a */
    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1002v(y6.f descriptor, InterfaceC1668n readIfAbsent) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(readIfAbsent, "readIfAbsent");
        this.f615a = descriptor;
        this.f616b = readIfAbsent;
        int e8 = descriptor.e();
        if (e8 <= 64) {
            this.f617c = e8 != 64 ? (-1) << e8 : 0L;
            this.f618d = f614f;
        } else {
            this.f617c = 0L;
            this.f618d = e(e8);
        }
    }

    private final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f618d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    private final int c() {
        int length = this.f618d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f618d[i8];
            while (j8 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << numberOfTrailingZeros;
                int i11 = numberOfTrailingZeros + i10;
                if (((Boolean) this.f616b.invoke(this.f615a, Integer.valueOf(i11))).booleanValue()) {
                    this.f618d[i8] = j8;
                    return i11;
                }
            }
            this.f618d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    private final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[AbstractC1371l.h0(jArr)] = (-1) << i8;
        }
        return jArr;
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f617c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int e8 = this.f615a.e();
        do {
            long j8 = this.f617c;
            if (j8 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                this.f617c |= 1 << numberOfTrailingZeros;
            } else {
                if (e8 > 64) {
                    return c();
                }
                return -1;
            }
        } while (!((Boolean) this.f616b.invoke(this.f615a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
