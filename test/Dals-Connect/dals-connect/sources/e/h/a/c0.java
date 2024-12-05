package e.h.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import e.h.a.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueuesHandler.java */
/* loaded from: classes2.dex */
public class c0 implements w {
    private final SparseArray<Handler> a = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueuesHandler.java */
    /* loaded from: classes2.dex */
    public static class b implements a.InterfaceC0230a {
        private final WeakReference<c> a;

        /* renamed from: b, reason: collision with root package name */
        private int f17756b;

        @Override // e.h.a.a.InterfaceC0230a
        public void a(e.h.a.a aVar) {
            WeakReference<c> weakReference = this.a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a.get().c(this.f17756b);
        }

        public a.InterfaceC0230a b(int i2) {
            this.f17756b = i2;
            return this;
        }

        private b(WeakReference<c> weakReference) {
            this.a = weakReference;
        }
    }

    /* compiled from: QueuesHandler.java */
    /* loaded from: classes2.dex */
    private class c implements Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private Handler f17757f;

        /* renamed from: g, reason: collision with root package name */
        private List<a.b> f17758g;

        /* renamed from: h, reason: collision with root package name */
        private int f17759h = 0;

        /* renamed from: i, reason: collision with root package name */
        private b f17760i = new b(new WeakReference(this));

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i2) {
            Handler handler = this.f17757f;
            if (handler != null && this.f17758g != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 1;
                obtainMessage.arg1 = i2;
                if (e.h.a.k0.d.a) {
                    Object[] objArr = new Object[2];
                    List<a.b> list = this.f17758g;
                    i iVar = null;
                    if (list != null && list.get(0) != null) {
                        iVar = this.f17758g.get(0).v().F();
                    }
                    objArr[0] = iVar;
                    objArr[1] = Integer.valueOf(obtainMessage.arg1);
                    e.h.a.k0.d.a(c.class, "start next %s %s", objArr);
                }
                this.f17757f.sendMessage(obtainMessage);
                return;
            }
            e.h.a.k0.d.i(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i2), this.f17757f, this.f17758g);
        }

        public void b() {
            this.f17758g.get(this.f17759h).v().I(this.f17760i);
            this.f17757f.removeCallbacksAndMessages(null);
        }

        public void d(Handler handler) {
            this.f17757f = handler;
        }

        public void e(List<a.b> list) {
            this.f17758g = list;
        }

        public void f() {
            c(this.f17759h);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                if (message.arg1 >= this.f17758g.size()) {
                    synchronized (c0.this.a) {
                        c0.this.a.remove(this.f17758g.get(0).x());
                    }
                    Handler handler = this.f17757f;
                    i iVar = null;
                    if (handler != null && handler.getLooper() != null) {
                        this.f17757f.getLooper().quit();
                        this.f17757f = null;
                        this.f17758g = null;
                        this.f17760i = null;
                    }
                    if (e.h.a.k0.d.a) {
                        Object[] objArr = new Object[2];
                        List<a.b> list = this.f17758g;
                        if (list != null && list.get(0) != null) {
                            iVar = this.f17758g.get(0).v().F();
                        }
                        objArr[0] = iVar;
                        objArr[1] = Integer.valueOf(message.arg1);
                        e.h.a.k0.d.a(c.class, "final serial %s %d", objArr);
                    }
                    return true;
                }
                int i3 = message.arg1;
                this.f17759h = i3;
                a.b bVar = this.f17758g.get(i3);
                synchronized (bVar.H()) {
                    if (bVar.v().getStatus() == 0 && !h.i().k(bVar)) {
                        bVar.v().t(this.f17760i.b(this.f17759h + 1));
                        bVar.K();
                    }
                    if (e.h.a.k0.d.a) {
                        e.h.a.k0.d.a(c.class, "direct go next by not contains %s %d", bVar, Integer.valueOf(message.arg1));
                    }
                    c(message.arg1 + 1);
                    return true;
                }
            }
            if (i2 == 2) {
                b();
            } else if (i2 == 3) {
                f();
            }
            return true;
        }
    }

    private void h(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    private boolean i(int i2, List<a.b> list, i iVar, boolean z) {
        if (l.b()) {
            l.a().a(list.size(), true, iVar);
        }
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.h(q.class, "start list attachKey[%d] size[%d] listener[%s] isSerial[%B]", Integer.valueOf(i2), Integer.valueOf(list.size()), iVar, Boolean.valueOf(z));
        }
        if (list != null && !list.isEmpty()) {
            return false;
        }
        e.h.a.k0.d.i(q.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", iVar, Boolean.valueOf(z));
        return true;
    }

    private void j(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // e.h.a.w
    public int a() {
        return this.a.size();
    }

    @Override // e.h.a.w
    public void b() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            h(this.a.get(this.a.keyAt(i2)));
        }
    }

    @Override // e.h.a.w
    public boolean c(i iVar) {
        int hashCode = iVar.hashCode();
        List<a.b> c2 = h.i().c(hashCode, iVar);
        if (i(hashCode, c2, iVar, false)) {
            return false;
        }
        Iterator<a.b> it = c2.iterator();
        while (it.hasNext()) {
            it.next().K();
        }
        return true;
    }

    @Override // e.h.a.w
    public void d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            j(this.a.get(it.next().intValue()));
        }
    }

    @Override // e.h.a.w
    public boolean e(i iVar) {
        c cVar = new c();
        int hashCode = cVar.hashCode();
        List<a.b> c2 = h.i().c(hashCode, iVar);
        if (i(hashCode, c2, iVar, true)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(e.h.a.k0.f.o("filedownloader serial thread %s-%d", iVar, Integer.valueOf(hashCode)));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), cVar);
        cVar.d(handler);
        cVar.e(c2);
        cVar.c(0);
        synchronized (this.a) {
            this.a.put(hashCode, handler);
        }
        return true;
    }

    @Override // e.h.a.w
    public boolean f(int i2) {
        return this.a.get(i2) != null;
    }
}
