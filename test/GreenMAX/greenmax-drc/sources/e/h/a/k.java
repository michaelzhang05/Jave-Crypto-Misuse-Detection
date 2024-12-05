package e.h.a;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import e.h.a.a;
import e.h.a.x;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: FileDownloadMessenger.java */
/* loaded from: classes2.dex */
class k implements t {
    private a.b a;

    /* renamed from: b, reason: collision with root package name */
    private a.d f17884b;

    /* renamed from: c, reason: collision with root package name */
    private Queue<MessageSnapshot> f17885c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17886d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(a.b bVar, a.d dVar) {
        n(bVar, dVar);
    }

    private void n(a.b bVar, a.d dVar) {
        this.a = bVar;
        this.f17884b = dVar;
        this.f17885c = new LinkedBlockingQueue();
    }

    private void o(int i2) {
        if (com.liulishuo.filedownloader.model.b.e(i2)) {
            if (!this.f17885c.isEmpty()) {
                MessageSnapshot peek = this.f17885c.peek();
                e.h.a.k0.d.i(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(peek.e()), Integer.valueOf(this.f17885c.size()), Byte.valueOf(peek.k()));
            }
            this.a = null;
        }
    }

    private void q(MessageSnapshot messageSnapshot) {
        a.b bVar = this.a;
        if (bVar == null) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.e()), Byte.valueOf(messageSnapshot.k()));
            }
        } else {
            if (!this.f17886d && bVar.v().F() != null) {
                this.f17885c.offer(messageSnapshot);
                j.d().i(this);
                return;
            }
            if ((l.b() || this.a.R()) && messageSnapshot.k() == 4) {
                this.f17884b.f();
            }
            o(messageSnapshot.k());
        }
    }

    @Override // e.h.a.t
    public boolean a() {
        return this.a.v().T();
    }

    @Override // e.h.a.t
    public void b(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify pending %s", this.a);
        }
        this.f17884b.n();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void c(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify paused %s", this.a);
        }
        this.f17884b.f();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void d(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            a.b bVar = this.a;
            e.h.a.k0.d.a(this, "notify error %s %s", bVar, bVar.v().e());
        }
        this.f17884b.f();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void e(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            a v = this.a.v();
            e.h.a.k0.d.a(this, "notify retry %s %d %d %s", this.a, Integer.valueOf(v.s()), Integer.valueOf(v.d()), v.e());
        }
        this.f17884b.n();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void f(MessageSnapshot messageSnapshot) {
        a v = this.a.v();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify progress %s %d %d", v, Long.valueOf(v.n()), Long.valueOf(v.D()));
        }
        if (v.J() <= 0) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "notify progress but client not request notify %s", this.a);
            }
        } else {
            this.f17884b.n();
            q(messageSnapshot);
        }
    }

    @Override // e.h.a.t
    public void g(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify warn %s", this.a);
        }
        this.f17884b.f();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void h(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify connected %s", this.a);
        }
        this.f17884b.n();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public boolean i() {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify begin %s", this.a);
        }
        if (this.a == null) {
            e.h.a.k0.d.i(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f17885c.size()));
            return false;
        }
        this.f17884b.p();
        return true;
    }

    @Override // e.h.a.t
    public boolean j() {
        return this.f17885c.peek().k() == 4;
    }

    @Override // e.h.a.t
    public void k(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify block completed %s %s", this.a, Thread.currentThread().getName());
        }
        this.f17884b.n();
        q(messageSnapshot);
    }

    @Override // e.h.a.t
    public void l(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify started %s", this.a);
        }
        this.f17884b.n();
        q(messageSnapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.h.a.t
    public void m() {
        if (this.f17886d) {
            return;
        }
        MessageSnapshot poll = this.f17885c.poll();
        byte k2 = poll.k();
        a.b bVar = this.a;
        if (bVar != null) {
            a v = bVar.v();
            i F = v.F();
            x.a y = bVar.y();
            o(k2);
            if (F == null || F.isInvalid()) {
                return;
            }
            if (k2 == 4) {
                try {
                    F.blockComplete(v);
                    p(((BlockCompleteMessage) poll).b());
                    return;
                } catch (Throwable th) {
                    d(y.k(th));
                    return;
                }
            }
            g gVar = F instanceof g ? (g) F : null;
            if (k2 == -4) {
                F.warn(v);
                return;
            }
            if (k2 == -3) {
                F.completed(v);
                return;
            }
            if (k2 == -2) {
                if (gVar != null) {
                    gVar.paused(v, poll.f(), poll.g());
                    return;
                } else {
                    F.paused(v, poll.i(), poll.j());
                    return;
                }
            }
            if (k2 == -1) {
                F.error(v, poll.l());
                return;
            }
            if (k2 == 1) {
                if (gVar != null) {
                    gVar.pending(v, poll.f(), poll.g());
                    return;
                } else {
                    F.pending(v, poll.i(), poll.j());
                    return;
                }
            }
            if (k2 == 2) {
                if (gVar != null) {
                    gVar.connected(v, poll.c(), poll.n(), v.n(), poll.g());
                    return;
                } else {
                    F.connected(v, poll.c(), poll.n(), v.u(), poll.j());
                    return;
                }
            }
            if (k2 == 3) {
                if (gVar != null) {
                    gVar.progress(v, poll.f(), v.D());
                    return;
                } else {
                    F.progress(v, poll.i(), v.h());
                    return;
                }
            }
            if (k2 != 5) {
                if (k2 != 6) {
                    return;
                }
                F.started(v);
                return;
            } else if (gVar != null) {
                gVar.retry(v, poll.l(), poll.h(), poll.f());
                return;
            } else {
                F.retry(v, poll.l(), poll.h(), poll.i());
                return;
            }
        }
        throw new IllegalArgumentException(e.h.a.k0.f.o("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(k2), Integer.valueOf(this.f17885c.size())));
    }

    public void p(MessageSnapshot messageSnapshot) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "notify completed %s", this.a);
        }
        this.f17884b.f();
        q(messageSnapshot);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        a.b bVar = this.a;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.v().getId());
        objArr[1] = super.toString();
        return e.h.a.k0.f.o("%d:%s", objArr);
    }
}
