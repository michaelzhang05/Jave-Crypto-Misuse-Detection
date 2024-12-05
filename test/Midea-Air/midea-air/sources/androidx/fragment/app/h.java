package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: f, reason: collision with root package name */
    static final f f1125f = new f();

    /* renamed from: g, reason: collision with root package name */
    private f f1126g = null;

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface a {
        String getName();
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static abstract class b {
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public abstract m a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean c();

    public abstract Fragment d(int i2);

    public abstract Fragment e(String str);

    public abstract a f(int i2);

    public abstract int g();

    public abstract Fragment h(Bundle bundle, String str);

    public f i() {
        if (this.f1126g == null) {
            this.f1126g = f1125f;
        }
        return this.f1126g;
    }

    public abstract List<Fragment> j();

    public abstract void k();

    public abstract void l(int i2, int i3);

    public abstract void m(String str, int i2);

    public abstract boolean n();

    public abstract void o(Bundle bundle, String str, Fragment fragment);

    public abstract Fragment.SavedState p(Fragment fragment);

    public void q(f fVar) {
        this.f1126g = fVar;
    }
}
