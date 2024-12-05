package Q6;

import P6.AbstractC1287m;
import P6.C1279e;
import P6.Z;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class g extends AbstractC1287m {

    /* renamed from: b, reason: collision with root package name */
    private final long f8345b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8346c;

    /* renamed from: d, reason: collision with root package name */
    private long f8347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z delegate, long j8, boolean z8) {
        super(delegate);
        AbstractC3159y.i(delegate, "delegate");
        this.f8345b = j8;
        this.f8346c = z8;
    }

    private final void b(C1279e c1279e, long j8) {
        C1279e c1279e2 = new C1279e();
        c1279e2.K(c1279e);
        c1279e.C(c1279e2, j8);
        c1279e2.a();
    }

    @Override // P6.AbstractC1287m, P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        long j9 = this.f8347d;
        long j10 = this.f8345b;
        if (j9 > j10) {
            j8 = 0;
        } else if (this.f8346c) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j11);
        }
        long y8 = super.y(sink, j8);
        if (y8 != -1) {
            this.f8347d += y8;
        }
        long j12 = this.f8347d;
        long j13 = this.f8345b;
        if ((j12 < j13 && y8 == -1) || j12 > j13) {
            if (y8 > 0 && j12 > j13) {
                b(sink, sink.x() - (this.f8347d - this.f8345b));
            }
            throw new IOException("expected " + this.f8345b + " bytes but got " + this.f8347d);
        }
        return y8;
    }
}
