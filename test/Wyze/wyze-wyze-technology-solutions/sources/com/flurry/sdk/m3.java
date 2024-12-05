package com.flurry.sdk;

import com.flurry.sdk.g0;
import com.flurry.sdk.i2;
import com.flurry.sdk.p3;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class m3 extends l2 implements p3 {
    protected static BufferedOutputStream o;
    private static int p;
    private o3 q;
    private ReentrantLock r;

    /* loaded from: classes2.dex */
    final class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f10030h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p3.a f10031i;

        a(u6 u6Var, p3.a aVar) {
            this.f10030h = u6Var;
            this.f10031i = aVar;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            m3.this.r.lock();
            try {
                m3.t(m3.this, this.f10030h);
                p3.a aVar = this.f10031i;
                if (aVar != null) {
                    aVar.a();
                }
            } finally {
                m3.this.r.unlock();
            }
        }
    }

    /* loaded from: classes2.dex */
    final class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f10033h;

        b(u6 u6Var) {
            this.f10033h = u6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            m3.this.r.lock();
            try {
                m3.t(m3.this, this.f10033h);
            } finally {
                m3.this.r.unlock();
            }
        }
    }

    public m3() {
        super("BufferedFrameAppender", i2.a(i2.b.CORE));
        this.q = null;
        this.r = new ReentrantLock(true);
        this.q = new o3();
    }

    static /* synthetic */ void t(m3 m3Var, u6 u6Var) {
        boolean z = true;
        p++;
        byte[] a2 = m3Var.q.a(u6Var);
        if (a2 != null) {
            try {
                o.write(a2);
                o.flush();
            } catch (IOException e2) {
                d1.c(2, "BufferedFrameAppender", "Error appending frame:" + e2.getMessage());
            }
            d1.c(2, "BufferedFrameAppender", "Appending Frame " + u6Var.a() + " frameSaved:" + z + " frameCount:" + p);
        }
        z = false;
        d1.c(2, "BufferedFrameAppender", "Appending Frame " + u6Var.a() + " frameSaved:" + z + " frameCount:" + p);
    }

    @Override // com.flurry.sdk.p3
    public final void a() {
        d1.c(2, "BufferedFrameAppender", "Close");
        this.r.lock();
        try {
            p = 0;
            c2.f(o);
            o = null;
        } finally {
            this.r.unlock();
        }
    }

    @Override // com.flurry.sdk.p3
    public final void b(u6 u6Var) {
        d1.c(2, "BufferedFrameAppender", "Appending Frame:" + u6Var.a());
        n(new b(u6Var));
    }

    @Override // com.flurry.sdk.p3
    public final boolean c() {
        return o != null;
    }

    @Override // com.flurry.sdk.p3
    public final void d() {
        this.r.lock();
        try {
            if (c()) {
                a();
            }
            w6 w6Var = new w6(q2.e(), "currentFile");
            File file = new File(w6Var.a, w6Var.f10247b);
            g0.b a2 = n3.a(file);
            if (a2 != g0.b.SUCCEED) {
                g0.a().b(a2);
                d1.c(5, "BufferedFrameAppender", "File deleted status: " + file.delete() + " InProgress.");
            } else {
                boolean z = false;
                w6 w6Var2 = new w6(q2.c(), String.format(Locale.US, "completed-%d", Long.valueOf(System.currentTimeMillis())));
                if (r2.a(w6Var, w6Var2) && r2.b(w6Var.a, w6Var.f10247b, w6Var2.a, w6Var2.f10247b)) {
                    boolean b2 = x6.b(w6Var, w6Var2);
                    z = b2 ? x6.a(w6Var) : b2;
                }
                d1.c(4, "BufferedFrameAppender", "File moved status: " + z + " InProgress to Completed.");
            }
        } finally {
            this.r.unlock();
        }
    }

    @Override // com.flurry.sdk.p3
    public final void f(u6 u6Var, p3.a aVar) {
        d1.c(2, "BufferedFrameAppender", "Appending Frame:" + u6Var.a());
        m(new a(u6Var, aVar));
    }

    @Override // com.flurry.sdk.p3
    public final boolean i(String str, String str2) {
        d1.c(2, "BufferedFrameAppender", "Open");
        this.r.lock();
        boolean z = true;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists() && !b2.b(file)) {
                    throw new IOException("Frame file: Error creating directory for :" + file.getAbsolutePath());
                }
                o = new BufferedOutputStream(new FileOutputStream(file, true));
                try {
                    p = 0;
                } catch (IOException e2) {
                    e = e2;
                    d1.c(6, "BufferedFrameAppender", "Error in opening file:" + str2 + " Message:" + e.getMessage());
                    return z;
                }
            } finally {
                this.r.unlock();
            }
        } catch (IOException e3) {
            e = e3;
            z = false;
        }
        return z;
    }
}
