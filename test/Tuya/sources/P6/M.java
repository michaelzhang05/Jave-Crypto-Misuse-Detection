package P6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class M {

    /* renamed from: a */
    private static final Logger f7998a = Logger.getLogger("okio.Okio");

    public static final X b(File file) {
        AbstractC3159y.i(file, "<this>");
        return L.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        boolean z8;
        AbstractC3159y.i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z8 = g6.n.H(message, "getsockname failed", false, 2, null);
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        return true;
    }

    public static final X d(File file) {
        X h8;
        AbstractC3159y.i(file, "<this>");
        h8 = h(file, false, 1, null);
        return h8;
    }

    public static final X e(File file, boolean z8) {
        AbstractC3159y.i(file, "<this>");
        return L.h(new FileOutputStream(file, z8));
    }

    public static final X f(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "<this>");
        return new O(outputStream, new a0());
    }

    public static final X g(Socket socket) {
        AbstractC3159y.i(socket, "<this>");
        Y y8 = new Y(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC3159y.h(outputStream, "getOutputStream()");
        return y8.z(new O(outputStream, y8));
    }

    public static /* synthetic */ X h(File file, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return L.g(file, z8);
    }

    public static final Z i(File file) {
        AbstractC3159y.i(file, "<this>");
        return new C1291q(new FileInputStream(file), a0.f8031e);
    }

    public static final Z j(InputStream inputStream) {
        AbstractC3159y.i(inputStream, "<this>");
        return new C1291q(inputStream, new a0());
    }

    public static final Z k(Socket socket) {
        AbstractC3159y.i(socket, "<this>");
        Y y8 = new Y(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC3159y.h(inputStream, "getInputStream()");
        return y8.A(new C1291q(inputStream, y8));
    }
}
