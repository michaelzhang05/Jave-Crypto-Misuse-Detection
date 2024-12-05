package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.i0.b;
import e.h.a.m;
import java.lang.ref.WeakReference;

/* compiled from: FDServiceSharedHandler.java */
/* loaded from: classes2.dex */
public class e extends b.a implements j {

    /* renamed from: f, reason: collision with root package name */
    private final g f17215f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<FileDownloadService> f17216g;

    /* compiled from: FDServiceSharedHandler.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f17216g = weakReference;
        this.f17215f = gVar;
    }

    @Override // com.liulishuo.filedownloader.services.j
    public IBinder C(Intent intent) {
        return null;
    }

    @Override // e.h.a.i0.b
    public byte D(int i2) {
        return this.f17215f.f(i2);
    }

    @Override // e.h.a.i0.b
    public void F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.f17215f.n(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // e.h.a.i0.b
    public long H5(int i2) {
        return this.f17215f.e(i2);
    }

    @Override // e.h.a.i0.b
    public boolean K(int i2) {
        return this.f17215f.k(i2);
    }

    @Override // com.liulishuo.filedownloader.services.j
    public void R(Intent intent, int i2, int i3) {
        m.a().a(this);
    }

    @Override // e.h.a.i0.b
    public boolean R2(int i2) {
        return this.f17215f.m(i2);
    }

    @Override // e.h.a.i0.b
    public boolean T(int i2) {
        return this.f17215f.d(i2);
    }

    @Override // e.h.a.i0.b
    public void X(boolean z) {
        WeakReference<FileDownloadService> weakReference = this.f17216g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17216g.get().stopForeground(z);
    }

    @Override // e.h.a.i0.b
    public void c2() {
        this.f17215f.c();
    }

    @Override // e.h.a.i0.b
    public void c7(int i2, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.f17216g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17216g.get().startForeground(i2, notification);
    }

    @Override // e.h.a.i0.b
    public void d5(e.h.a.i0.a aVar) {
    }

    @Override // e.h.a.i0.b
    public void j1(e.h.a.i0.a aVar) {
    }

    @Override // e.h.a.i0.b
    public boolean j5() {
        return this.f17215f.j();
    }

    @Override // e.h.a.i0.b
    public long s4(int i2) {
        return this.f17215f.g(i2);
    }

    @Override // e.h.a.i0.b
    public boolean w2(String str, String str2) {
        return this.f17215f.i(str, str2);
    }

    @Override // e.h.a.i0.b
    public void z7() {
        this.f17215f.l();
    }
}
