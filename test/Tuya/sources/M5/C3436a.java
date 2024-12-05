package m5;

import M5.AbstractC1239l;
import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3436a extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final C0824a f35862b = new C0824a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f35863a;

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0824a {
        private C0824a() {
        }

        public /* synthetic */ C0824a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3436a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        AbstractC3159y.h(socketFactory, "context.socketFactory");
        this.f35863a = socketFactory;
    }

    private final ArrayList a(SSLSocket sSLSocket, String str, ArrayList arrayList) {
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC3159y.h(supportedCipherSuites, "socket.supportedCipherSuites");
        if (AbstractC1239l.W(supportedCipherSuites, str)) {
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
            AbstractC3159y.h(supportedProtocols, "socket.supportedProtocols");
            if (AbstractC1239l.W(supportedProtocols, "TLSv1.3")) {
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
        Socket createSocket = this.f35863a.createSocket();
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory.createSocket()");
        return b(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f35863a.getDefaultCipherSuites();
        AbstractC3159y.h(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f35863a.getSupportedCipherSuites();
        AbstractC3159y.h(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s8, String host, int i8, boolean z8) {
        AbstractC3159y.i(s8, "s");
        AbstractC3159y.i(host, "host");
        Socket createSocket = this.f35863a.createSocket(s8, host, i8, z8);
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory…s, host, port, autoClose)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8) {
        AbstractC3159y.i(host, "host");
        Socket createSocket = this.f35863a.createSocket(host, i8);
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i8, InetAddress localHost, int i9) {
        AbstractC3159y.i(host, "host");
        AbstractC3159y.i(localHost, "localHost");
        Socket createSocket = this.f35863a.createSocket(host, i8, localHost, i9);
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i8) {
        AbstractC3159y.i(host, "host");
        Socket createSocket = this.f35863a.createSocket(host, i8);
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return b(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i8, InetAddress localAddress, int i9) {
        AbstractC3159y.i(address, "address");
        AbstractC3159y.i(localAddress, "localAddress");
        Socket createSocket = this.f35863a.createSocket(address, i8, localAddress, i9);
        AbstractC3159y.h(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return b(createSocket);
    }
}
