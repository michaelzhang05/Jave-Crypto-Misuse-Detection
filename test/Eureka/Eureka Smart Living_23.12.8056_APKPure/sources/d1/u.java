package d1;

import android.content.Context;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        u a();

        a b(Context context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g().close();
    }

    abstract l1.d g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract t q();
}
