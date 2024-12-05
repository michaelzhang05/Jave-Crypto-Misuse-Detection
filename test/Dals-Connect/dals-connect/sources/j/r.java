package j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class r {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final b0 b(File file) throws FileNotFoundException {
        kotlin.jvm.internal.l.f(file, "$this$appendingSink");
        return q.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        kotlin.jvm.internal.l.f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.v.F(message, "getsockname failed", false, 2, null) : false;
    }

    public static final b0 d(File file, boolean z) throws FileNotFoundException {
        kotlin.jvm.internal.l.f(file, "$this$sink");
        return q.g(new FileOutputStream(file, z));
    }

    public static final b0 e(OutputStream outputStream) {
        kotlin.jvm.internal.l.f(outputStream, "$this$sink");
        return new u(outputStream, new e0());
    }

    public static final b0 f(Socket socket) throws IOException {
        kotlin.jvm.internal.l.f(socket, "$this$sink");
        c0 c0Var = new c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l.e(outputStream, "getOutputStream()");
        return c0Var.sink(new u(outputStream, c0Var));
    }

    public static /* synthetic */ b0 g(File file, boolean z, int i2, Object obj) throws FileNotFoundException {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return q.f(file, z);
    }

    public static final d0 h(File file) throws FileNotFoundException {
        kotlin.jvm.internal.l.f(file, "$this$source");
        return q.k(new FileInputStream(file));
    }

    public static final d0 i(InputStream inputStream) {
        kotlin.jvm.internal.l.f(inputStream, "$this$source");
        return new p(inputStream, new e0());
    }

    public static final d0 j(Socket socket) throws IOException {
        kotlin.jvm.internal.l.f(socket, "$this$source");
        c0 c0Var = new c0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l.e(inputStream, "getInputStream()");
        return c0Var.source(new p(inputStream, c0Var));
    }
}
