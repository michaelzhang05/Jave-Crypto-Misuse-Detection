package androidx.work.impl.utils;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private androidx.work.impl.j f2064f;

    /* renamed from: g, reason: collision with root package name */
    private String f2065g;

    /* renamed from: h, reason: collision with root package name */
    private WorkerParameters.a f2066h;

    public h(androidx.work.impl.j jVar, String str, WorkerParameters.a aVar) {
        this.f2064f = jVar;
        this.f2065g = str;
        this.f2066h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2064f.r().k(this.f2065g, this.f2066h);
    }
}
