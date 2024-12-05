package R;

import P.g;
import R.AbstractC1318o;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import r0.C3679j;

/* loaded from: classes3.dex */
final class J implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P.g f8460a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3679j f8461b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1318o.a f8462c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f8463d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(P.g gVar, C3679j c3679j, AbstractC1318o.a aVar, L l8) {
        this.f8460a = gVar;
        this.f8461b = c3679j;
        this.f8462c = aVar;
        this.f8463d = l8;
    }

    @Override // P.g.a
    public final void a(Status status) {
        if (status.L()) {
            this.f8461b.c(this.f8462c.a(this.f8460a.b(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f8461b.b(AbstractC1305b.a(status));
        }
    }
}
