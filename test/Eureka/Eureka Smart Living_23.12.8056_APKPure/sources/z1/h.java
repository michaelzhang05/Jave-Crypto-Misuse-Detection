package z1;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
