package com.bumptech.glide.r;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream.java */
/* loaded from: classes.dex */
public class d extends InputStream {

    /* renamed from: f, reason: collision with root package name */
    private static final Queue<d> f8952f = k.f(0);

    /* renamed from: g, reason: collision with root package name */
    private InputStream f8953g;

    /* renamed from: h, reason: collision with root package name */
    private IOException f8954h;

    d() {
    }

    public static d b(InputStream inputStream) {
        d poll;
        Queue<d> queue = f8952f;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.o(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f8954h;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f8953g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8953g.close();
    }

    public void f() {
        this.f8954h = null;
        this.f8953g = null;
        Queue<d> queue = f8952f;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f8953g.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f8953g.markSupported();
    }

    void o(InputStream inputStream) {
        this.f8953g = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f8953g.read(bArr);
        } catch (IOException e2) {
            this.f8954h = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f8953g.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f8953g.skip(j2);
        } catch (IOException e2) {
            this.f8954h = e2;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f8953g.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f8954h = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f8953g.read();
        } catch (IOException e2) {
            this.f8954h = e2;
            return -1;
        }
    }
}
