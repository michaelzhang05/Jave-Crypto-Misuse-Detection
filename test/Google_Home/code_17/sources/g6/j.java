package g6;

import P5.O;
import b6.InterfaceC1985a;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes5.dex */
public abstract class j implements Iterable, InterfaceC1985a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f32081d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f32082a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32083b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32084c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public j(long j8, long j9, long j10) {
        if (j10 != 0) {
            if (j10 != Long.MIN_VALUE) {
                this.f32082a = j8;
                this.f32083b = V5.c.d(j8, j9, j10);
                this.f32084c = j10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long e() {
        return this.f32082a;
    }

    public final long f() {
        return this.f32083b;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public O iterator() {
        return new k(this.f32082a, this.f32083b, this.f32084c);
    }
}
