package Q;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1938b;

/* loaded from: classes3.dex */
public final class q extends n {

    /* renamed from: c, reason: collision with root package name */
    private final P.e f8155c;

    public q(P.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f8155c = eVar;
    }

    @Override // P.f
    public final AbstractC1938b a(AbstractC1938b abstractC1938b) {
        return this.f8155c.f(abstractC1938b);
    }

    @Override // P.f
    public final Looper c() {
        return this.f8155c.m();
    }
}
