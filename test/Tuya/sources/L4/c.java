package L4;

import E4.j;
import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6442g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f6443a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6444b;

    /* renamed from: c, reason: collision with root package name */
    private final L4.a f6445c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f6446d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f6447e;

    /* renamed from: f, reason: collision with root package name */
    private K4.c f6448f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public c(i nsdListener, Context context) {
        AbstractC3159y.i(nsdListener, "nsdListener");
        AbstractC3159y.i(context, "context");
        this.f6443a = nsdListener;
        this.f6444b = new d(context, nsdListener, this);
        this.f6445c = new L4.a(nsdListener, this);
    }

    private final void a() {
        try {
            Socket socket = this.f6446d;
            if (socket != null) {
                socket.close();
            }
            this.f6446d = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void b() {
        try {
            Socket socket = this.f6447e;
            if (socket != null) {
                socket.close();
            }
            this.f6447e = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void d(NsdServiceInfo nsdServiceInfo) {
        List hostAddresses;
        try {
            InetAddress host = nsdServiceInfo.getHost();
            if (Build.VERSION.SDK_INT >= 34) {
                hostAddresses = nsdServiceInfo.getHostAddresses();
                Iterator it = hostAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (inetAddress != null) {
                        host = inetAddress;
                        break;
                    }
                }
            }
            m(new Socket(host, nsdServiceInfo.getPort()));
            this.f6443a.z(nsdServiceInfo);
        } catch (ConnectException unused) {
            this.f6443a.c();
        } catch (IOException unused2) {
            this.f6443a.c();
        }
    }

    private final synchronized void n(Socket socket) {
        Socket socket2 = this.f6447e;
        if (socket2 != null && socket2.isConnected()) {
            try {
                Socket socket3 = this.f6447e;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        this.f6447e = socket;
    }

    public final void c() {
        NsdServiceInfo nsdServiceInfo;
        h l8 = j.f2274g.l();
        if (l8 != null) {
            nsdServiceInfo = l8.e();
        } else {
            nsdServiceInfo = null;
        }
        if (nsdServiceInfo != null) {
            d(nsdServiceInfo);
        }
    }

    public final K4.c e() {
        return this.f6448f;
    }

    public final Socket f() {
        return this.f6446d;
    }

    public final Socket g() {
        return this.f6447e;
    }

    public final L4.a h() {
        return this.f6445c;
    }

    public final d i() {
        return this.f6444b;
    }

    public final boolean j() {
        Socket socket = this.f6446d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        Socket socket = this.f6447e;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final void l(K4.c cVar) {
        this.f6448f = cVar;
    }

    public final synchronized void m(Socket socket) {
        try {
            AbstractC3159y.i(socket, "socket");
            Socket socket2 = this.f6446d;
            if (socket2 != null) {
                AbstractC3159y.f(socket2);
                if (socket2.isConnected()) {
                    n(socket);
                }
            }
            this.f6446d = socket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z8) {
        Socket socket = this.f6446d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6445c.g(z8);
                return;
            }
        }
        this.f6443a.o("Socket to write OK is null or closed");
    }

    public final void p() {
        Socket socket = this.f6446d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6445c.h(j.f2274g.m());
                return;
            }
        }
        this.f6443a.o("Socket to write ServiceName is null or closed");
    }

    public final void q(K4.c fti) {
        AbstractC3159y.i(fti, "fti");
        Socket socket = this.f6446d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6445c.i(fti);
                return;
            }
        }
        this.f6443a.o("Socket to write FTI is null or closed");
    }

    public final void r() {
        this.f6444b.p();
        b();
        a();
    }
}
