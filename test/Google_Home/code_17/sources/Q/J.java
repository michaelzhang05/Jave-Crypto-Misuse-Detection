package Q;

import O.g;
import Q.AbstractC1399o;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import q0.C3826j;

/* loaded from: classes3.dex */
final class J implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O.g f8922a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3826j f8923b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1399o.a f8924c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f8925d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(O.g gVar, C3826j c3826j, AbstractC1399o.a aVar, L l8) {
        this.f8922a = gVar;
        this.f8923b = c3826j;
        this.f8924c = aVar;
        this.f8925d = l8;
    }

    @Override // O.g.a
    public final void a(Status status) {
        if (status.H()) {
            this.f8923b.c(this.f8924c.a(this.f8922a.b(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f8923b.b(AbstractC1386b.a(status));
        }
    }
}
