package T6;

import S6.AbstractC1425m;
import S6.C1417e;
import S6.Z;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class g extends AbstractC1425m {

    /* renamed from: b, reason: collision with root package name */
    private final long f10142b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10143c;

    /* renamed from: d, reason: collision with root package name */
    private long f10144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z delegate, long j8, boolean z8) {
        super(delegate);
        AbstractC3255y.i(delegate, "delegate");
        this.f10142b = j8;
        this.f10143c = z8;
    }

    private final void b(C1417e c1417e, long j8) {
        C1417e c1417e2 = new C1417e();
        c1417e2.L(c1417e);
        c1417e.h(c1417e2, j8);
        c1417e2.a();
    }

    @Override // S6.AbstractC1425m, S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        long j9 = this.f10144d;
        long j10 = this.f10142b;
        if (j9 > j10) {
            j8 = 0;
        } else if (this.f10143c) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j11);
        }
        long C8 = super.C(sink, j8);
        if (C8 != -1) {
            this.f10144d += C8;
        }
        long j12 = this.f10144d;
        long j13 = this.f10142b;
        if ((j12 < j13 && C8 == -1) || j12 > j13) {
            if (C8 > 0 && j12 > j13) {
                b(sink, sink.E() - (this.f10144d - this.f10142b));
            }
            throw new IOException("expected " + this.f10142b + " bytes but got " + this.f10144d);
        }
        return C8;
    }
}
