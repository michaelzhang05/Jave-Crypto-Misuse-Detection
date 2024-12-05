package androidx.work.impl;

import androidx.lifecycle.p;
import androidx.work.q;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public class c implements q {

    /* renamed from: c, reason: collision with root package name */
    private final p<q.b> f1882c = new p<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.o.c<q.b.c> f1883d = androidx.work.impl.utils.o.c.u();

    public c() {
        a(q.f2151b);
    }

    public void a(q.b bVar) {
        this.f1882c.j(bVar);
        if (bVar instanceof q.b.c) {
            this.f1883d.q((q.b.c) bVar);
        } else if (bVar instanceof q.b.a) {
            this.f1883d.r(((q.b.a) bVar).a());
        }
    }
}
