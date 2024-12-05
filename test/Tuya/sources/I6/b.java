package I6;

import F6.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f4284a;

    /* renamed from: b, reason: collision with root package name */
    private int f4285b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4286c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4287d;

    public b(List list) {
        this.f4284a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i8 = this.f4285b; i8 < this.f4284a.size(); i8++) {
            if (((j) this.f4284a.get(i8)).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) {
        j jVar;
        int i8 = this.f4285b;
        int size = this.f4284a.size();
        while (true) {
            if (i8 < size) {
                jVar = (j) this.f4284a.get(i8);
                if (jVar.c(sSLSocket)) {
                    this.f4285b = i8 + 1;
                    break;
                }
                i8++;
            } else {
                jVar = null;
                break;
            }
        }
        if (jVar != null) {
            this.f4286c = c(sSLSocket);
            G6.a.f3218a.c(jVar, sSLSocket, this.f4287d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f4287d + ", modes=" + this.f4284a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f4287d = true;
        if (!this.f4286c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z8 = iOException instanceof SSLHandshakeException;
        if ((z8 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z8 || (iOException instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }
}
