package P;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC2062b;

/* loaded from: classes3.dex */
public final class q extends n {

    /* renamed from: c, reason: collision with root package name */
    private final O.e f8646c;

    public q(O.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f8646c = eVar;
    }

    @Override // O.f
    public final AbstractC2062b a(AbstractC2062b abstractC2062b) {
        return this.f8646c.f(abstractC2062b);
    }

    @Override // O.f
    public final Looper c() {
        return this.f8646c.m();
    }
}
