package io.sentry.cache;

import io.sentry.c2;
import io.sentry.d5;
import io.sentry.h4;
import io.sentry.j4;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.x4;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CacheStrategy.java */
/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: f, reason: collision with root package name */
    protected static final Charset f18877f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    protected final x4 f18878g;

    /* renamed from: h, reason: collision with root package name */
    protected final c2 f18879h;

    /* renamed from: i, reason: collision with root package name */
    protected final File f18880i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18881j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(x4 x4Var, String str, int i2) {
        io.sentry.util.q.c(str, "Directory is required.");
        this.f18878g = (x4) io.sentry.util.q.c(x4Var, "SentryOptions is required.");
        this.f18879h = x4Var.getSerializer();
        this.f18880i = new File(str);
        this.f18881j = i2;
    }

    private void D(File file, File[] fileArr) {
        Boolean g2;
        int i2;
        File file2;
        h4 J;
        j4 j4Var;
        d5 K;
        h4 J2 = J(file);
        if (J2 == null || !w(J2)) {
            return;
        }
        this.f18878g.getClientReportRecorder().b(io.sentry.clientreport.e.CACHE_OVERFLOW, J2);
        d5 b2 = b(J2);
        if (b2 == null || !x(b2) || (g2 = b2.g()) == null || !g2.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i2 = 0; i2 < length; i2++) {
            file2 = fileArr[i2];
            J = J(file2);
            if (J != null && w(J)) {
                j4Var = null;
                Iterator<j4> it = J.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j4 next = it.next();
                    if (o(next) && (K = K(next)) != null && x(K)) {
                        Boolean g3 = K.g();
                        if (g3 != null && g3.booleanValue()) {
                            this.f18878g.getLogger().c(s4.ERROR, "Session %s has 2 times the init flag.", b2.j());
                            return;
                        }
                        if (b2.j() != null && b2.j().equals(K.j())) {
                            K.n();
                            try {
                                j4Var = j4.f(this.f18879h, K);
                                it.remove();
                                break;
                            } catch (IOException e2) {
                                this.f18878g.getLogger().a(s4.ERROR, e2, "Failed to create new envelope item for the session %s", b2.j());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (j4Var != null) {
            h4 a = a(J, j4Var);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f18878g.getLogger().c(s4.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            M(a, file2, lastModified);
            return;
        }
    }

    private h4 J(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                h4 d2 = this.f18879h.d(bufferedInputStream);
                bufferedInputStream.close();
                return d2;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f18878g.getLogger().b(s4.ERROR, "Failed to deserialize the envelope.", e2);
            return null;
        }
    }

    private d5 K(j4 j4Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(j4Var.h()), f18877f));
            try {
                d5 d5Var = (d5) this.f18879h.c(bufferedReader, d5.class);
                bufferedReader.close();
                return d5Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f18878g.getLogger().b(s4.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    private void M(h4 h4Var, File file, long j2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f18879h.b(h4Var, fileOutputStream);
                file.setLastModified(j2);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f18878g.getLogger().b(s4.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    private void N(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.z((File) obj, (File) obj2);
                }
            });
        }
    }

    private h4 a(h4 h4Var, j4 j4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<j4> it = h4Var.c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(j4Var);
        return new h4(h4Var.b(), arrayList);
    }

    private d5 b(h4 h4Var) {
        for (j4 j4Var : h4Var.c()) {
            if (o(j4Var)) {
                return K(j4Var);
            }
        }
        return null;
    }

    private boolean o(j4 j4Var) {
        if (j4Var == null) {
            return false;
        }
        return j4Var.i().b().equals(r4.Session);
    }

    private boolean w(h4 h4Var) {
        return h4Var.c().iterator().hasNext();
    }

    private boolean x(d5 d5Var) {
        return d5Var.l().equals(d5.b.Ok) && d5Var.j() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int z(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f18881j) {
            this.f18878g.getLogger().c(s4.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i2 = (length - this.f18881j) + 1;
            N(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i2, length);
            for (int i3 = 0; i3 < i2; i3++) {
                File file = fileArr[i3];
                D(file, fileArr2);
                if (!file.delete()) {
                    this.f18878g.getLogger().c(s4.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f() {
        if (this.f18880i.isDirectory() && this.f18880i.canWrite() && this.f18880i.canRead()) {
            return true;
        }
        this.f18878g.getLogger().c(s4.ERROR, "The directory for caching files is inaccessible.: %s", this.f18880i.getAbsolutePath());
        return false;
    }
}
