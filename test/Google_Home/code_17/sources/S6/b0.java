package S6;

import O5.AbstractC1349e;
import S6.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class b0 extends AbstractC1423k {

    /* renamed from: i, reason: collision with root package name */
    private static final a f9868i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Q f9869j = Q.a.e(Q.f9832b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final Q f9870e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1423k f9871f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f9872g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9873h;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public b0(Q zipPath, AbstractC1423k fileSystem, Map entries, String str) {
        AbstractC3255y.i(zipPath, "zipPath");
        AbstractC3255y.i(fileSystem, "fileSystem");
        AbstractC3255y.i(entries, "entries");
        this.f9870e = zipPath;
        this.f9871f = fileSystem;
        this.f9872g = entries;
        this.f9873h = str;
    }

    private final Q m(Q q8) {
        return f9869j.k(q8, true);
    }

    @Override // S6.AbstractC1423k
    public void a(Q source, Q target) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // S6.AbstractC1423k
    public void d(Q dir, boolean z8) {
        AbstractC3255y.i(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // S6.AbstractC1423k
    public void f(Q path, boolean z8) {
        AbstractC3255y.i(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // S6.AbstractC1423k
    public C1422j h(Q path) {
        Long valueOf;
        InterfaceC1419g interfaceC1419g;
        AbstractC3255y.i(path, "path");
        T6.i iVar = (T6.i) this.f9872g.get(m(path));
        Throwable th = null;
        if (iVar == null) {
            return null;
        }
        boolean z8 = !iVar.h();
        boolean h8 = iVar.h();
        if (iVar.h()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(iVar.g());
        }
        C1422j c1422j = new C1422j(z8, h8, null, valueOf, null, iVar.e(), null, null, 128, null);
        if (iVar.f() == -1) {
            return c1422j;
        }
        AbstractC1421i i8 = this.f9871f.i(this.f9870e);
        try {
            interfaceC1419g = L.d(i8.E(iVar.f()));
            if (i8 != null) {
                try {
                    i8.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (i8 != null) {
                try {
                    i8.close();
                } catch (Throwable th4) {
                    AbstractC1349e.a(th3, th4);
                }
            }
            th = th3;
            interfaceC1419g = null;
        }
        if (th == null) {
            AbstractC3255y.f(interfaceC1419g);
            return T6.j.h(interfaceC1419g, c1422j);
        }
        throw th;
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i i(Q file) {
        AbstractC3255y.i(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i k(Q file, boolean z8, boolean z9) {
        AbstractC3255y.i(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // S6.AbstractC1423k
    public Z l(Q file) {
        InterfaceC1419g interfaceC1419g;
        AbstractC3255y.i(file, "file");
        T6.i iVar = (T6.i) this.f9872g.get(m(file));
        if (iVar != null) {
            AbstractC1421i i8 = this.f9871f.i(this.f9870e);
            Throwable th = null;
            try {
                interfaceC1419g = L.d(i8.E(iVar.f()));
                if (i8 != null) {
                    try {
                        i8.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (i8 != null) {
                    try {
                        i8.close();
                    } catch (Throwable th4) {
                        AbstractC1349e.a(th3, th4);
                    }
                }
                interfaceC1419g = null;
                th = th3;
            }
            if (th == null) {
                AbstractC3255y.f(interfaceC1419g);
                T6.j.k(interfaceC1419g);
                if (iVar.d() == 0) {
                    return new T6.g(interfaceC1419g, iVar.g(), true);
                }
                return new T6.g(new C1428p(new T6.g(interfaceC1419g, iVar.c(), true), new Inflater(true)), iVar.g(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }
}
