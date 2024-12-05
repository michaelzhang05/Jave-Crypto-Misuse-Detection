package F6;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class w implements e {

    /* renamed from: a, reason: collision with root package name */
    final u f3022a;

    /* renamed from: b, reason: collision with root package name */
    final J6.j f3023b;

    /* renamed from: c, reason: collision with root package name */
    private o f3024c;

    /* renamed from: d, reason: collision with root package name */
    final x f3025d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f3026e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3027f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends G6.b {
    }

    private w(u uVar, x xVar, boolean z8) {
        this.f3022a = uVar;
        this.f3025d = xVar;
        this.f3026e = z8;
        this.f3023b = new J6.j(uVar, z8);
    }

    private void a() {
        this.f3023b.h(N6.f.i().m("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w d(u uVar, x xVar, boolean z8) {
        w wVar = new w(uVar, xVar, z8);
        wVar.f3024c = uVar.k().a(wVar);
        return wVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w clone() {
        return d(this.f3022a, this.f3025d, this.f3026e);
    }

    z c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3022a.o());
        arrayList.add(this.f3023b);
        arrayList.add(new J6.a(this.f3022a.h()));
        arrayList.add(new H6.a(this.f3022a.p()));
        arrayList.add(new I6.a(this.f3022a));
        if (!this.f3026e) {
            arrayList.addAll(this.f3022a.q());
        }
        arrayList.add(new J6.b(this.f3026e));
        return new J6.g(arrayList, null, null, null, 0, this.f3025d, this, this.f3024c, this.f3022a.e(), this.f3022a.x(), this.f3022a.D()).a(this.f3025d);
    }

    @Override // F6.e
    public z execute() {
        synchronized (this) {
            if (!this.f3027f) {
                this.f3027f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f3024c.c(this);
        try {
            try {
                this.f3022a.i().a(this);
                z c8 = c();
                if (c8 != null) {
                    return c8;
                }
                throw new IOException("Canceled");
            } catch (IOException e8) {
                this.f3024c.b(this, e8);
                throw e8;
            }
        } finally {
            this.f3022a.i().c(this);
        }
    }
}
