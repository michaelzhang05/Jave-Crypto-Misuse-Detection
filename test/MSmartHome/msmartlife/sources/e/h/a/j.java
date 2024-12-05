package e.h.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: FileDownloadMessageStation.java */
/* loaded from: classes2.dex */
public class j {
    private static final Executor a = e.h.a.k0.b.a(5, "BlockCompleted");

    /* renamed from: b, reason: collision with root package name */
    static int f17875b = 10;

    /* renamed from: c, reason: collision with root package name */
    static int f17876c = 5;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f17877d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue<t> f17878e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f17879f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<t> f17880g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileDownloadMessageStation.java */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f17881f;

        a(t tVar) {
            this.f17881f = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17881f.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileDownloadMessageStation.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private static final j a = new j(null);
    }

    /* compiled from: FileDownloadMessageStation.java */
    /* loaded from: classes2.dex */
    private static class c implements Handler.Callback {
        private c() {
        }

        private void a(ArrayList<t> arrayList) {
            Iterator<t> it = arrayList.iterator();
            while (it.hasNext()) {
                t next = it.next();
                if (!j.f(next)) {
                    next.m();
                }
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                ((t) message.obj).m();
            } else if (i2 == 2) {
                a((ArrayList) message.obj);
                j.d().h();
            }
            return true;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* synthetic */ j(a aVar) {
        this();
    }

    private void c(t tVar) {
        synchronized (this.f17879f) {
            this.f17878e.offer(tVar);
        }
        h();
    }

    public static j d() {
        return b.a;
    }

    private void e(t tVar) {
        Handler handler = this.f17877d;
        handler.sendMessage(handler.obtainMessage(1, tVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(t tVar) {
        if (!tVar.j()) {
            return false;
        }
        a.execute(new a(tVar));
        return true;
    }

    public static boolean g() {
        return f17875b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f17879f) {
            if (this.f17880g.isEmpty()) {
                if (this.f17878e.isEmpty()) {
                    return;
                }
                int i2 = 0;
                if (!g()) {
                    this.f17878e.drainTo(this.f17880g);
                } else {
                    int i3 = f17875b;
                    int min = Math.min(this.f17878e.size(), f17876c);
                    while (i2 < min) {
                        this.f17880g.add(this.f17878e.remove());
                        i2++;
                    }
                    i2 = i3;
                }
                Handler handler = this.f17877d;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f17880g), i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(t tVar) {
        j(tVar, false);
    }

    void j(t tVar, boolean z) {
        if (tVar.a()) {
            tVar.m();
            return;
        }
        if (f(tVar)) {
            return;
        }
        if (!g() && !this.f17878e.isEmpty()) {
            synchronized (this.f17879f) {
                if (!this.f17878e.isEmpty()) {
                    Iterator<t> it = this.f17878e.iterator();
                    while (it.hasNext()) {
                        e(it.next());
                    }
                }
                this.f17878e.clear();
            }
        }
        if (g() && !z) {
            c(tVar);
        } else {
            e(tVar);
        }
    }

    private j() {
        this.f17879f = new Object();
        this.f17880g = new ArrayList<>();
        this.f17877d = new Handler(Looper.getMainLooper(), new c(null));
        this.f17878e = new LinkedBlockingQueue<>();
    }
}
