package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.i0.b;
import java.lang.ref.WeakReference;

/* compiled from: FDServiceSeparateHandler.java */
/* loaded from: classes2.dex */
public class d extends b.a implements b.InterfaceC0207b, j {

    /* renamed from: f, reason: collision with root package name */
    private final RemoteCallbackList<e.h.a.i0.a> f17212f = new RemoteCallbackList<>();

    /* renamed from: g, reason: collision with root package name */
    private final g f17213g;

    /* renamed from: h, reason: collision with root package name */
    private final WeakReference<FileDownloadService> f17214h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f17214h = weakReference;
        this.f17213g = gVar;
        com.liulishuo.filedownloader.message.b.a().c(this);
    }

    private synchronized int C3(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList<e.h.a.i0.a> remoteCallbackList;
        beginBroadcast = this.f17212f.beginBroadcast();
        for (int i2 = 0; i2 < beginBroadcast; i2++) {
            try {
                try {
                    this.f17212f.getBroadcastItem(i2).J4(messageSnapshot);
                } catch (Throwable th) {
                    this.f17212f.finishBroadcast();
                    throw th;
                }
            } catch (RemoteException e2) {
                e.h.a.k0.d.c(this, e2, "callback error", new Object[0]);
                remoteCallbackList = this.f17212f;
            }
        }
        remoteCallbackList = this.f17212f;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    @Override // com.liulishuo.filedownloader.services.j
    public IBinder C(Intent intent) {
        return this;
    }

    @Override // e.h.a.i0.b
    public byte D(int i2) throws RemoteException {
        return this.f17213g.f(i2);
    }

    @Override // e.h.a.i0.b
    public void F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
        this.f17213g.n(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // e.h.a.i0.b
    public long H5(int i2) throws RemoteException {
        return this.f17213g.e(i2);
    }

    @Override // e.h.a.i0.b
    public boolean K(int i2) throws RemoteException {
        return this.f17213g.k(i2);
    }

    @Override // com.liulishuo.filedownloader.services.j
    public void R(Intent intent, int i2, int i3) {
    }

    @Override // e.h.a.i0.b
    public boolean R2(int i2) throws RemoteException {
        return this.f17213g.m(i2);
    }

    @Override // e.h.a.i0.b
    public boolean T(int i2) throws RemoteException {
        return this.f17213g.d(i2);
    }

    @Override // e.h.a.i0.b
    public void X(boolean z) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f17214h;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17214h.get().stopForeground(z);
    }

    @Override // e.h.a.i0.b
    public void c2() throws RemoteException {
        this.f17213g.c();
    }

    @Override // e.h.a.i0.b
    public void c7(int i2, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f17214h;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17214h.get().startForeground(i2, notification);
    }

    @Override // e.h.a.i0.b
    public void d5(e.h.a.i0.a aVar) throws RemoteException {
        this.f17212f.unregister(aVar);
    }

    @Override // e.h.a.i0.b
    public void j1(e.h.a.i0.a aVar) throws RemoteException {
        this.f17212f.register(aVar);
    }

    @Override // e.h.a.i0.b
    public boolean j5() throws RemoteException {
        return this.f17213g.j();
    }

    @Override // e.h.a.i0.b
    public long s4(int i2) throws RemoteException {
        return this.f17213g.g(i2);
    }

    @Override // com.liulishuo.filedownloader.message.b.InterfaceC0207b
    public void u(MessageSnapshot messageSnapshot) {
        C3(messageSnapshot);
    }

    @Override // e.h.a.i0.b
    public boolean w2(String str, String str2) throws RemoteException {
        return this.f17213g.i(str, str2);
    }

    @Override // e.h.a.i0.b
    public void z7() throws RemoteException {
        this.f17213g.l();
    }
}
