package io.sentry;

import io.sentry.util.m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeSender.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class i1 extends e1 implements t1 {

    /* renamed from: c, reason: collision with root package name */
    private final v1 f18955c;

    /* renamed from: d, reason: collision with root package name */
    private final c2 f18956d;

    /* renamed from: e, reason: collision with root package name */
    private final w1 f18957e;

    public i1(v1 v1Var, c2 c2Var, w1 w1Var, long j2) {
        super(w1Var, j2);
        this.f18955c = (v1) io.sentry.util.q.c(v1Var, "Hub is required.");
        this.f18956d = (c2) io.sentry.util.q.c(c2Var, "Serializer is required.");
        this.f18957e = (w1) io.sentry.util.q.c(w1Var, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(io.sentry.hints.i iVar) {
        if (iVar.e()) {
            return;
        }
        this.f18957e.c(s4.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j(Throwable th, File file, io.sentry.hints.k kVar) {
        kVar.d(false);
        this.f18957e.a(s4.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(File file, io.sentry.hints.k kVar) {
        if (!kVar.b()) {
            m(file, "after trying to capture it");
            this.f18957e.c(s4.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        } else {
            this.f18957e.c(s4.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        }
    }

    private void m(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f18957e.c(s4.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f18957e.a(s4.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.t1
    public void a(String str, n1 n1Var) {
        io.sentry.util.q.c(str, "Path is required.");
        f(new File(str), n1Var);
    }

    @Override // io.sentry.e1
    protected boolean b(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.e1
    public /* bridge */ /* synthetic */ void e(File file) {
        super.e(file);
    }

    @Override // io.sentry.e1
    protected void f(final File file, n1 n1Var) {
        w1 w1Var;
        m.a aVar;
        if (!file.isFile()) {
            this.f18957e.c(s4.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!b(file.getName())) {
            this.f18957e.c(s4.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f18957e.c(s4.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            h4 d2 = this.f18956d.d(bufferedInputStream);
                            if (d2 == null) {
                                this.f18957e.c(s4.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                            } else {
                                this.f18955c.f(d2, n1Var);
                            }
                            io.sentry.util.m.m(n1Var, io.sentry.hints.i.class, this.f18957e, new m.a() { // from class: io.sentry.d
                                @Override // io.sentry.util.m.a
                                public final void a(Object obj) {
                                    i1.this.h((io.sentry.hints.i) obj);
                                }
                            });
                            bufferedInputStream.close();
                            w1Var = this.f18957e;
                            aVar = new m.a() { // from class: io.sentry.e
                                @Override // io.sentry.util.m.a
                                public final void a(Object obj) {
                                    i1.this.l(file, (io.sentry.hints.k) obj);
                                }
                            };
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f18957e.a(s4.ERROR, th2, "Failed to capture cached envelope %s", file.getAbsolutePath());
                        io.sentry.util.m.m(n1Var, io.sentry.hints.k.class, this.f18957e, new m.a() { // from class: io.sentry.c
                            @Override // io.sentry.util.m.a
                            public final void a(Object obj) {
                                i1.this.j(th2, file, (io.sentry.hints.k) obj);
                            }
                        });
                        w1Var = this.f18957e;
                        aVar = new m.a() { // from class: io.sentry.e
                            @Override // io.sentry.util.m.a
                            public final void a(Object obj) {
                                i1.this.l(file, (io.sentry.hints.k) obj);
                            }
                        };
                    }
                } catch (FileNotFoundException e2) {
                    this.f18957e.a(s4.ERROR, e2, "File '%s' cannot be found.", file.getAbsolutePath());
                    w1Var = this.f18957e;
                    aVar = new m.a() { // from class: io.sentry.e
                        @Override // io.sentry.util.m.a
                        public final void a(Object obj) {
                            i1.this.l(file, (io.sentry.hints.k) obj);
                        }
                    };
                }
            } catch (IOException e3) {
                this.f18957e.a(s4.ERROR, e3, "I/O on file '%s' failed.", file.getAbsolutePath());
                w1Var = this.f18957e;
                aVar = new m.a() { // from class: io.sentry.e
                    @Override // io.sentry.util.m.a
                    public final void a(Object obj) {
                        i1.this.l(file, (io.sentry.hints.k) obj);
                    }
                };
            }
            io.sentry.util.m.m(n1Var, io.sentry.hints.k.class, w1Var, aVar);
        } catch (Throwable th3) {
            io.sentry.util.m.m(n1Var, io.sentry.hints.k.class, this.f18957e, new m.a() { // from class: io.sentry.e
                @Override // io.sentry.util.m.a
                public final void a(Object obj) {
                    i1.this.l(file, (io.sentry.hints.k) obj);
                }
            });
            throw th3;
        }
    }
}
