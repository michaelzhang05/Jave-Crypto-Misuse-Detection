package rx.n.e;

import java.util.Queue;
import rx.exceptions.MissingBackpressureException;
import rx.n.e.o.s;
import rx.n.e.o.z;

/* compiled from: RxRingBuffer.java */
/* loaded from: classes3.dex */
public class h implements rx.k {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23108f;

    /* renamed from: g, reason: collision with root package name */
    private Queue<Object> f23109g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23110h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Object f23111i;

    static {
        int i2 = g.b() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i2 = Integer.parseInt(property);
            } catch (NumberFormatException e2) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e2.getMessage());
            }
        }
        f23108f = i2;
    }

    private h(Queue<Object> queue, int i2) {
        this.f23109g = queue;
        this.f23110h = i2;
    }

    public static h a() {
        if (z.b()) {
            return new h(true, f23108f);
        }
        return new h();
    }

    public static h b() {
        if (z.b()) {
            return new h(false, f23108f);
        }
        return new h();
    }

    public Object c(Object obj) {
        return rx.n.a.h.e(obj);
    }

    public boolean d(Object obj) {
        return rx.n.a.h.f(obj);
    }

    public boolean e() {
        Queue<Object> queue = this.f23109g;
        return queue == null || queue.isEmpty();
    }

    public void f() {
        if (this.f23111i == null) {
            this.f23111i = rx.n.a.h.b();
        }
    }

    public void g(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.f23109g;
            z = true;
            z2 = false;
            if (queue != null) {
                z2 = !queue.offer(rx.n.a.h.g(obj));
                z = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z2) {
            throw new MissingBackpressureException();
        }
    }

    public Object h() {
        synchronized (this) {
            Queue<Object> queue = this.f23109g;
            if (queue == null) {
                return null;
            }
            Object peek = queue.peek();
            Object obj = this.f23111i;
            if (peek == null && obj != null && queue.peek() == null) {
                peek = obj;
            }
            return peek;
        }
    }

    public Object i() {
        synchronized (this) {
            Queue<Object> queue = this.f23109g;
            if (queue == null) {
                return null;
            }
            Object poll = queue.poll();
            Object obj = this.f23111i;
            if (poll == null && obj != null && queue.peek() == null) {
                this.f23111i = null;
                poll = obj;
            }
            return poll;
        }
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23109g == null;
    }

    public synchronized void j() {
    }

    @Override // rx.k
    public void unsubscribe() {
        j();
    }

    private h(boolean z, int i2) {
        this.f23109g = z ? new rx.n.e.o.k<>(i2) : new s<>(i2);
        this.f23110h = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    h() {
        /*
            r2 = this;
            rx.n.e.n.e r0 = new rx.n.e.n.e
            int r1 = rx.n.e.h.f23108f
            r0.<init>(r1)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.n.e.h.<init>():void");
    }
}
