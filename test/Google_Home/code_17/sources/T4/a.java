package T4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: i, reason: collision with root package name */
    String[] f10066i;

    /* renamed from: n, reason: collision with root package name */
    int f10071n;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f10058a = false;

    /* renamed from: b, reason: collision with root package name */
    protected Context f10059b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f10060c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10061d = 0;

    /* renamed from: e, reason: collision with root package name */
    c f10062e = null;

    /* renamed from: f, reason: collision with root package name */
    Handler f10063f = null;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f10064g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f10065h = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f10067j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f10068k = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f10069l = true;

    /* renamed from: m, reason: collision with root package name */
    int f10070m = -1;

    /* renamed from: o, reason: collision with root package name */
    int f10072o = R4.a.f9646b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.getData().getInt("action");
            String string = message.getData().getString(MimeTypes.BASE_TYPE_TEXT);
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        a aVar = a.this;
                        aVar.d(aVar.f10071n, string);
                        return;
                    }
                    return;
                }
                a aVar2 = a.this;
                aVar2.a(aVar2.f10071n, aVar2.f10070m);
                return;
            }
            a aVar3 = a.this;
            aVar3.c(aVar3.f10071n, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final a f10074a;

        public c(a aVar) {
            this.f10074a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVar = this.f10074a;
            if (aVar.f10072o > 0) {
                synchronized (aVar) {
                    try {
                        R4.a.c("Command " + this.f10074a.f10071n + " is waiting for: " + this.f10074a.f10072o);
                        a aVar2 = this.f10074a;
                        aVar2.wait((long) aVar2.f10072o);
                    } catch (InterruptedException e8) {
                        R4.a.c("Exception: " + e8);
                    }
                    if (!this.f10074a.i()) {
                        R4.a.c("Timeout Exception has occurred for command: " + this.f10074a.f10071n + ".");
                        a.this.m("Timeout Exception");
                    }
                }
            }
        }
    }

    public a(int i8, boolean z8, String... strArr) {
        this.f10066i = new String[0];
        this.f10071n = 0;
        this.f10066i = strArr;
        this.f10071n = i8;
        e(z8);
    }

    private void e(boolean z8) {
        this.f10069l = z8;
        if (Looper.myLooper() != null && z8) {
            R4.a.c("CommandHandler created");
            this.f10063f = new b();
        } else {
            R4.a.c("CommandHandler not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (!this.f10068k) {
            synchronized (this) {
                try {
                    Handler handler = this.f10063f;
                    if (handler != null && this.f10069l) {
                        Message obtainMessage = handler.obtainMessage();
                        Bundle bundle = new Bundle();
                        bundle.putInt("action", 2);
                        obtainMessage.setData(bundle);
                        this.f10063f.sendMessage(obtainMessage);
                    } else {
                        a(this.f10071n, this.f10070m);
                    }
                    R4.a.c("Command " + this.f10071n + " finished.");
                    f();
                } finally {
                }
            }
        }
    }

    public void c(int i8, String str) {
        R4.a.e("Command", "ID: " + i8 + ", " + str);
        this.f10061d = this.f10061d + 1;
    }

    protected final void f() {
        this.f10065h = false;
        this.f10067j = true;
        notifyAll();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < this.f10066i.length; i8++) {
            if (i8 > 0) {
                sb.append('\n');
            }
            sb.append(this.f10066i[i8]);
        }
        return sb.toString();
    }

    public final boolean h() {
        return this.f10065h;
    }

    public final boolean i() {
        return this.f10067j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i8, String str) {
        this.f10060c++;
        Handler handler = this.f10063f;
        if (handler != null && this.f10069l) {
            Message obtainMessage = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
            obtainMessage.setData(bundle);
            this.f10063f.sendMessage(obtainMessage);
            return;
        }
        c(i8, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8) {
        synchronized (this) {
            this.f10070m = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.f10064g = true;
        c cVar = new c(this);
        this.f10062e = cVar;
        cVar.setPriority(1);
        this.f10062e.start();
        this.f10065h = true;
    }

    protected final void m(String str) {
        try {
            T4.b.z();
            R4.a.c("Terminating all shells.");
            n(str);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(String str) {
        synchronized (this) {
            try {
                Handler handler = this.f10063f;
                if (handler != null && this.f10069l) {
                    Message obtainMessage = handler.obtainMessage();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 3);
                    bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
                    obtainMessage.setData(bundle);
                    this.f10063f.sendMessage(obtainMessage);
                } else {
                    d(this.f10071n, str);
                }
                R4.a.c("Command " + this.f10071n + " did not finish because it was terminated. Termination reason: " + str);
                k(-1);
                this.f10068k = true;
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i8, int i9) {
    }

    public void d(int i8, String str) {
    }
}
