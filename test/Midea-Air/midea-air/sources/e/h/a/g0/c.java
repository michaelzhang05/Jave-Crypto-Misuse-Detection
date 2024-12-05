package e.h.a.g0;

import com.liulishuo.filedownloader.services.c;
import com.liulishuo.filedownloader.services.i;
import e.h.a.k0.c;
import java.io.File;
import java.io.IOException;

/* compiled from: CustomComponentHolder.java */
/* loaded from: classes2.dex */
public class c {
    private com.liulishuo.filedownloader.services.c a;

    /* renamed from: b, reason: collision with root package name */
    private c.a f17807b;

    /* renamed from: c, reason: collision with root package name */
    private c.b f17808c;

    /* renamed from: d, reason: collision with root package name */
    private c.e f17809d;

    /* renamed from: e, reason: collision with root package name */
    private e.h.a.f0.a f17810e;

    /* renamed from: f, reason: collision with root package name */
    private c.d f17811f;

    /* renamed from: g, reason: collision with root package name */
    private i f17812g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomComponentHolder.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final c a = new c();
    }

    private c.a d() {
        c.a aVar = this.f17807b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f17807b == null) {
                this.f17807b = g().a();
            }
        }
        return this.f17807b;
    }

    private c.b e() {
        c.b bVar = this.f17808c;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.f17808c == null) {
                this.f17808c = g().b();
            }
        }
        return this.f17808c;
    }

    private com.liulishuo.filedownloader.services.c g() {
        com.liulishuo.filedownloader.services.c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new com.liulishuo.filedownloader.services.c();
            }
        }
        return this.a;
    }

    public static c j() {
        return a.a;
    }

    private c.e l() {
        c.e eVar = this.f17809d;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.f17809d == null) {
                this.f17809d = g().l();
            }
        }
        return this.f17809d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
    
        if (r8.g() > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0051, code lost:
    
        if (r8.g() <= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:26:0x00f1, B:15:0x00fb, B:17:0x0111, B:19:0x0115, B:20:0x012d, B:21:0x0134, B:51:0x00a3, B:52:0x00c5, B:54:0x00cc, B:57:0x00da, B:60:0x00e5), top: B:25:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:72:0x0034, B:74:0x003b, B:76:0x0042, B:78:0x0049, B:10:0x0056, B:36:0x0065, B:38:0x0070, B:9:0x0053), top: B:71:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:26:0x00f1, B:15:0x00fb, B:17:0x0111, B:19:0x0115, B:20:0x012d, B:21:0x0134, B:51:0x00a3, B:52:0x00c5, B:54:0x00cc, B:57:0x00da, B:60:0x00e5), top: B:25:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(e.h.a.f0.a.InterfaceC0231a r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.g0.c.n(e.h.a.f0.a$a):void");
    }

    public e.h.a.e0.b a(String str) throws IOException {
        return e().a(str);
    }

    public e.h.a.j0.a b(File file) throws IOException {
        return l().a(file);
    }

    public int c(int i2, String str, String str2, long j2) {
        return d().a(i2, str, str2, j2);
    }

    public e.h.a.f0.a f() {
        e.h.a.f0.a aVar = this.f17810e;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f17810e == null) {
                e.h.a.f0.a c2 = g().c();
                this.f17810e = c2;
                n(c2.b());
            }
        }
        return this.f17810e;
    }

    public i h() {
        i iVar = this.f17812g;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f17812g == null) {
                this.f17812g = g().j();
            }
        }
        return this.f17812g;
    }

    public c.d i() {
        c.d dVar = this.f17811f;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.f17811f == null) {
                this.f17811f = g().k();
            }
        }
        return this.f17811f;
    }

    public int k() {
        return g().n();
    }

    public boolean m() {
        return l().b();
    }

    public void o(c.a aVar) {
        synchronized (this) {
            this.a = new com.liulishuo.filedownloader.services.c(aVar);
            this.f17808c = null;
            this.f17809d = null;
            this.f17810e = null;
            this.f17811f = null;
        }
    }
}
