package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressNoopOutputStream.java */
/* loaded from: classes.dex */
public class o extends OutputStream implements q {

    /* renamed from: f, reason: collision with root package name */
    private final Map<GraphRequest, r> f9370f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Handler f9371g;

    /* renamed from: h, reason: collision with root package name */
    private GraphRequest f9372h;

    /* renamed from: i, reason: collision with root package name */
    private r f9373i;

    /* renamed from: j, reason: collision with root package name */
    private int f9374j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Handler handler) {
        this.f9371g = handler;
    }

    @Override // com.facebook.q
    public void a(GraphRequest graphRequest) {
        this.f9372h = graphRequest;
        this.f9373i = graphRequest != null ? this.f9370f.get(graphRequest) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j2) {
        if (this.f9373i == null) {
            r rVar = new r(this.f9371g, this.f9372h);
            this.f9373i = rVar;
            this.f9370f.put(this.f9372h, rVar);
        }
        this.f9373i.b(j2);
        this.f9374j = (int) (this.f9374j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f9374j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<GraphRequest, r> o() {
        return this.f9370f;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        b(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        b(i3);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        b(1L);
    }
}
