package p5;

import P5.AbstractC1371l;
import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3779a extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final C0854a f37888b = new C0854a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f37889a;

    /* renamed from: p5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0854a {
        private C0854a() {
        }

        public /* synthetic */ C0854a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3779a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        AbstractC3255y.h(socketFactory, "context.socketFactory");
        this.f37889a = socketFactory;
    }

    private final ArrayList a(SSLSocket sSLSocket, String str, ArrayList arrayList) {
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC3255y.h(supportedCipherSuites, "socket.supportedCipherSuites");
        if (AbstractC1371l.W(supportedCipherSuites, str)) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private final Socket b(Socket socket) {
        if (socket instanceof SSLSocket) {
            c((SSLSocket) socket);
        }
        return socket;
    }

    private final void c(SSLSocket sSLSocket) {
        ArrayList a8;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 != 25 && i8 != 24) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            AbstractC3255y.h(supportedProtocols, "socket.supportedProtocols");
            if (AbstractC1371l.W(supportedProtocols, "TLSv1.3")) {
                arrayList.add("TLSv1.3");
                a8 = a(sSLSocket, "TLS_AES_128_GCM_SHA256", a(sSLSocket, "TLS_CHACHA20_POLY1305_SHA256", a(sSLSocket, "TLS_AES_256_GCM_SHA384", arrayList2)));
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
                sSLSocket.setEnabledCipherSuites((String[]) a8.toArray(new String[0]));
            }
        }
        arrayList.add("TLSv1.2");
        a8 = a(sSLSocket, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", a(sSLSocket, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", a(sSLSocket, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", arrayList2)));
        sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        sSLSocket.setEnabledCipherSuites((String[]) a8.toArray(new String[0]));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.f37889a.createSocket();
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory.createSocket()");
        return b(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f37889a.getDefaultCipherSuites();
        AbstractC3255y.h(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f37889a.getSupportedCipherSuites();
        AbstractC3255y.h(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s8, String host, int i8, boolean z8) {
        AbstractC3255y.i(s8, "s");
        AbstractC3255y.i(host, "host");
        Socket createSocket = this.f37889a.createSocket(s8, host, i8, z8);
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory…s, host, port, autoClose)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8) {
        AbstractC3255y.i(host, "host");
        Socket createSocket = this.f37889a.createSocket(host, i8);
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8, InetAddress localHost, int i9) {
        AbstractC3255y.i(host, "host");
        AbstractC3255y.i(localHost, "localHost");
        Socket createSocket = this.f37889a.createSocket(host, i8, localHost, i9);
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i8) {
        AbstractC3255y.i(host, "host");
        Socket createSocket = this.f37889a.createSocket(host, i8);
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i8, InetAddress localAddress, int i9) {
        AbstractC3255y.i(address, "address");
        AbstractC3255y.i(localAddress, "localAddress");
        Socket createSocket = this.f37889a.createSocket(address, i8, localAddress, i9);
        AbstractC3255y.h(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return b(createSocket);
    }
}
