package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class u {
    private final Map<String, Object> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f1279b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f1279b = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }
}
