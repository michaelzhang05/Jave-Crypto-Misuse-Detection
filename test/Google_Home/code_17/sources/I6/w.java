package I6;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class w implements e {

    /* renamed from: a, reason: collision with root package name */
    final u f4562a;

    /* renamed from: b, reason: collision with root package name */
    final M6.j f4563b;

    /* renamed from: c, reason: collision with root package name */
    private o f4564c;

    /* renamed from: d, reason: collision with root package name */
    final x f4565d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f4566e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4567f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends J6.b {
    }

    private w(u uVar, x xVar, boolean z8) {
        this.f4562a = uVar;
        this.f4565d = xVar;
        this.f4566e = z8;
        this.f4563b = new M6.j(uVar, z8);
    }

    private void a() {
        this.f4563b.h(Q6.f.i().m("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w d(u uVar, x xVar, boolean z8) {
        w wVar = new w(uVar, xVar, z8);
        wVar.f4564c = uVar.k().a(wVar);
        return wVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w clone() {
        return d(this.f4562a, this.f4565d, this.f4566e);
    }

    z c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f4562a.o());
        arrayList.add(this.f4563b);
        arrayList.add(new M6.a(this.f4562a.h()));
        arrayList.add(new K6.a(this.f4562a.p()));
        arrayList.add(new L6.a(this.f4562a));
        if (!this.f4566e) {
            arrayList.addAll(this.f4562a.q());
        }
        arrayList.add(new M6.b(this.f4566e));
        return new M6.g(arrayList, null, null, null, 0, this.f4565d, this, this.f4564c, this.f4562a.e(), this.f4562a.z(), this.f4562a.F()).a(this.f4565d);
    }

    @Override // I6.e
    public z execute() {
        synchronized (this) {
            if (!this.f4567f) {
                this.f4567f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f4564c.c(this);
        try {
            try {
                this.f4562a.i().a(this);
                z c8 = c();
                if (c8 != null) {
                    return c8;
                }
                throw new IOException("Canceled");
            } catch (IOException e8) {
                this.f4564c.b(this, e8);
                throw e8;
            }
        } finally {
            this.f4562a.i().c(this);
        }
    }
}
