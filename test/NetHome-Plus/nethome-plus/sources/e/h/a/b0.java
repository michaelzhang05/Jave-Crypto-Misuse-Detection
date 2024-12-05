package e.h.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;

/* compiled from: PauseAllMarker.java */
/* loaded from: classes2.dex */
public class b0 implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static File f17741f;

    /* renamed from: g, reason: collision with root package name */
    private static final Long f17742g = 1000L;

    /* renamed from: h, reason: collision with root package name */
    private HandlerThread f17743h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f17744i;

    /* renamed from: j, reason: collision with root package name */
    private final e.h.a.i0.b f17745j;

    public b0(e.h.a.i0.b bVar) {
        this.f17745j = bVar;
    }

    public static void a() {
        File c2 = c();
        if (c2.exists()) {
            e.h.a.k0.d.a(b0.class, "delete marker file " + c2.delete(), new Object[0]);
        }
    }

    private static boolean b() {
        return c().exists();
    }

    private static File c() {
        if (f17741f == null) {
            f17741f = new File(e.h.a.k0.c.a().getCacheDir() + File.separator + ".filedownloader_pause_all_marker.b");
        }
        return f17741f;
    }

    public void d() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.f17743h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f17743h.getLooper(), this);
        this.f17744i = handler;
        handler.sendEmptyMessageDelayed(0, f17742g.longValue());
    }

    public void e() {
        this.f17744i.removeMessages(0);
        this.f17743h.quit();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (b()) {
                try {
                    this.f17745j.z7();
                } catch (RemoteException e2) {
                    e.h.a.k0.d.c(this, e2, "pause all failed", new Object[0]);
                }
            }
            this.f17744i.sendEmptyMessageDelayed(0, f17742g.longValue());
            return true;
        } finally {
            a();
        }
    }
}
