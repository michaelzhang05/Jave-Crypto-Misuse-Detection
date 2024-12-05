package O4;

import H4.j;
import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8233g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f8234a;

    /* renamed from: b, reason: collision with root package name */
    private final d f8235b;

    /* renamed from: c, reason: collision with root package name */
    private final O4.a f8236c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f8237d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f8238e;

    /* renamed from: f, reason: collision with root package name */
    private N4.c f8239f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public c(i nsdListener, Context context) {
        AbstractC3255y.i(nsdListener, "nsdListener");
        AbstractC3255y.i(context, "context");
        this.f8234a = nsdListener;
        this.f8235b = new d(context, nsdListener, this);
        this.f8236c = new O4.a(nsdListener, this);
    }

    private final void a() {
        try {
            Socket socket = this.f8237d;
            if (socket != null) {
                socket.close();
            }
            this.f8237d = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void b() {
        try {
            Socket socket = this.f8238e;
            if (socket != null) {
                socket.close();
            }
            this.f8238e = null;
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
            this.f8234a.z(nsdServiceInfo);
        } catch (ConnectException unused) {
            this.f8234a.c();
        } catch (IOException unused2) {
            this.f8234a.c();
        }
    }

    private final synchronized void n(Socket socket) {
        Socket socket2 = this.f8238e;
        if (socket2 != null && socket2.isConnected()) {
            try {
                Socket socket3 = this.f8238e;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        this.f8238e = socket;
    }

    public final void c() {
        NsdServiceInfo nsdServiceInfo;
        h l8 = j.f3824g.l();
        if (l8 != null) {
            nsdServiceInfo = l8.e();
        } else {
            nsdServiceInfo = null;
        }
        if (nsdServiceInfo != null) {
            d(nsdServiceInfo);
        }
    }

    public final N4.c e() {
        return this.f8239f;
    }

    public final Socket f() {
        return this.f8237d;
    }

    public final Socket g() {
        return this.f8238e;
    }

    public final O4.a h() {
        return this.f8236c;
    }

    public final d i() {
        return this.f8235b;
    }

    public final boolean j() {
        Socket socket = this.f8237d;
        if (socket != null) {
            AbstractC3255y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        Socket socket = this.f8238e;
        if (socket != null) {
            AbstractC3255y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final void l(N4.c cVar) {
        this.f8239f = cVar;
    }

    public final synchronized void m(Socket socket) {
        try {
            AbstractC3255y.i(socket, "socket");
            Socket socket2 = this.f8237d;
            if (socket2 != null) {
                AbstractC3255y.f(socket2);
                if (socket2.isConnected()) {
                    n(socket);
                }
            }
            this.f8237d = socket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z8) {
        Socket socket = this.f8237d;
        if (socket != null) {
            AbstractC3255y.f(socket);
            if (!socket.isClosed()) {
                this.f8236c.g(z8);
                return;
            }
        }
        this.f8234a.q("Socket to write OK is null or closed");
    }

    public final void p() {
        Socket socket = this.f8237d;
        if (socket != null) {
            AbstractC3255y.f(socket);
            if (!socket.isClosed()) {
                this.f8236c.h(j.f3824g.m());
                return;
            }
        }
        this.f8234a.q("Socket to write ServiceName is null or closed");
    }

    public final void q(N4.c fti) {
        AbstractC3255y.i(fti, "fti");
        Socket socket = this.f8237d;
        if (socket != null) {
            AbstractC3255y.f(socket);
            if (!socket.isClosed()) {
                this.f8236c.i(fti);
                return;
            }
        }
        this.f8234a.q("Socket to write FTI is null or closed");
    }

    public final void r() {
        this.f8235b.p();
        b();
        a();
    }
}
