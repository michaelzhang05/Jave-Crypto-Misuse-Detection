package c.l.a;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: c.l.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0066a<D> {
        void a(c.l.b.b<D> bVar, D d2);

        c.l.b.b<D> b(int i2, Bundle bundle);

        void c(c.l.b.b<D> bVar);
    }

    public static <T extends j & x> a b(T t) {
        return new b(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> c.l.b.b<D> c(int i2, Bundle bundle, InterfaceC0066a<D> interfaceC0066a);

    public abstract void d();
}
