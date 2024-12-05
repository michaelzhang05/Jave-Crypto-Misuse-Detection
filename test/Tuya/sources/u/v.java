package u;

import C.InterfaceC1070d;
import android.content.Context;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class v implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        a a(Context context);

        v build();
    }

    abstract InterfaceC1070d a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
