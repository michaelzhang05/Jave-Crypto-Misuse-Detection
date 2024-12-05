package S6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Y extends C1415c {

    /* renamed from: o, reason: collision with root package name */
    private final Socket f9858o;

    public Y(Socket socket) {
        AbstractC3255y.i(socket, "socket");
        this.f9858o = socket;
    }

    @Override // S6.C1415c
    protected void B() {
        Logger logger;
        Logger logger2;
        try {
            this.f9858o.close();
        } catch (AssertionError e8) {
            if (L.e(e8)) {
                logger2 = M.f9829a;
                logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f9858o, (Throwable) e8);
                return;
            }
            throw e8;
        } catch (Exception e9) {
            logger = M.f9829a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f9858o, (Throwable) e9);
        }
    }

    @Override // S6.C1415c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
