package P6;

import L5.AbstractC1221e;
import P6.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class b0 extends AbstractC1285k {

    /* renamed from: i, reason: collision with root package name */
    private static final a f8037i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Q f8038j = Q.a.e(Q.f8001b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final Q f8039e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1285k f8040f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f8041g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8042h;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public b0(Q zipPath, AbstractC1285k fileSystem, Map entries, String str) {
        AbstractC3159y.i(zipPath, "zipPath");
        AbstractC3159y.i(fileSystem, "fileSystem");
        AbstractC3159y.i(entries, "entries");
        this.f8039e = zipPath;
        this.f8040f = fileSystem;
        this.f8041g = entries;
        this.f8042h = str;
    }

    private final Q m(Q q8) {
        return f8038j.k(q8, true);
    }

    @Override // P6.AbstractC1285k
    public void a(Q source, Q target) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // P6.AbstractC1285k
    public void d(Q dir, boolean z8) {
        AbstractC3159y.i(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // P6.AbstractC1285k
    public void f(Q path, boolean z8) {
        AbstractC3159y.i(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // P6.AbstractC1285k
    public C1284j h(Q path) {
        Long valueOf;
        InterfaceC1281g interfaceC1281g;
        AbstractC3159y.i(path, "path");
        Q6.i iVar = (Q6.i) this.f8041g.get(m(path));
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
        C1284j c1284j = new C1284j(z8, h8, null, valueOf, null, iVar.e(), null, null, 128, null);
        if (iVar.f() == -1) {
            return c1284j;
        }
        AbstractC1283i i8 = this.f8040f.i(this.f8039e);
        try {
            interfaceC1281g = L.d(i8.E(iVar.f()));
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
                    AbstractC1221e.a(th3, th4);
                }
            }
            th = th3;
            interfaceC1281g = null;
        }
        if (th == null) {
            AbstractC3159y.f(interfaceC1281g);
            return Q6.j.h(interfaceC1281g, c1284j);
        }
        throw th;
    }

    @Override // P6.AbstractC1285k
    public AbstractC1283i i(Q file) {
        AbstractC3159y.i(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // P6.AbstractC1285k
    public AbstractC1283i k(Q file, boolean z8, boolean z9) {
        AbstractC3159y.i(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // P6.AbstractC1285k
    public Z l(Q file) {
        InterfaceC1281g interfaceC1281g;
        AbstractC3159y.i(file, "file");
        Q6.i iVar = (Q6.i) this.f8041g.get(m(file));
        if (iVar != null) {
            AbstractC1283i i8 = this.f8040f.i(this.f8039e);
            Throwable th = null;
            try {
                interfaceC1281g = L.d(i8.E(iVar.f()));
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
                        AbstractC1221e.a(th3, th4);
                    }
                }
                interfaceC1281g = null;
                th = th3;
            }
            if (th == null) {
                AbstractC3159y.f(interfaceC1281g);
                Q6.j.k(interfaceC1281g);
                if (iVar.d() == 0) {
                    return new Q6.g(interfaceC1281g, iVar.g(), true);
                }
                return new Q6.g(new C1290p(new Q6.g(interfaceC1281g, iVar.c(), true), new Inflater(true)), iVar.g(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }
}
