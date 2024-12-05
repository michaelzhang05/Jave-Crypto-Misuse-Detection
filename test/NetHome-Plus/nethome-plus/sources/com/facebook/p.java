package com.facebook;

import android.os.Handler;
import com.facebook.h;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressOutputStream.java */
/* loaded from: classes.dex */
public class p extends FilterOutputStream implements q {

    /* renamed from: f, reason: collision with root package name */
    private final Map<GraphRequest, r> f9375f;

    /* renamed from: g, reason: collision with root package name */
    private final h f9376g;

    /* renamed from: h, reason: collision with root package name */
    private final long f9377h;

    /* renamed from: i, reason: collision with root package name */
    private long f9378i;

    /* renamed from: j, reason: collision with root package name */
    private long f9379j;

    /* renamed from: k, reason: collision with root package name */
    private long f9380k;
    private r l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressOutputStream.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h.b f9381f;

        a(h.b bVar) {
            this.f9381f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                this.f9381f.b(p.this.f9376g, p.this.f9378i, p.this.f9380k);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(OutputStream outputStream, h hVar, Map<GraphRequest, r> map, long j2) {
        super(outputStream);
        this.f9376g = hVar;
        this.f9375f = map;
        this.f9380k = j2;
        this.f9377h = f.s();
    }

    private void w(long j2) {
        r rVar = this.l;
        if (rVar != null) {
            rVar.a(j2);
        }
        long j3 = this.f9378i + j2;
        this.f9378i = j3;
        if (j3 >= this.f9379j + this.f9377h || j3 >= this.f9380k) {
            z();
        }
    }

    private void z() {
        if (this.f9378i > this.f9379j) {
            for (h.a aVar : this.f9376g.L()) {
                if (aVar instanceof h.b) {
                    Handler K = this.f9376g.K();
                    h.b bVar = (h.b) aVar;
                    if (K == null) {
                        bVar.b(this.f9376g, this.f9378i, this.f9380k);
                    } else {
                        K.post(new a(bVar));
                    }
                }
            }
            this.f9379j = this.f9378i;
        }
    }

    @Override // com.facebook.q
    public void a(GraphRequest graphRequest) {
        this.l = graphRequest != null ? this.f9375f.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<r> it = this.f9375f.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        z();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        w(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
        w(i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        w(1L);
    }
}
