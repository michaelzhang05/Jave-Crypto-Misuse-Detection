package e.h.a;

import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import e.h.a.i0.a;
import e.h.a.i0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileDownloadServiceUIGuard.java */
/* loaded from: classes2.dex */
public class o extends com.liulishuo.filedownloader.services.a<a, e.h.a.i0.b> {

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: FileDownloadServiceUIGuard.java */
    /* loaded from: classes2.dex */
    public static class a extends a.AbstractBinderC0237a {
        protected a() {
        }

        @Override // e.h.a.i0.a
        public void J4(MessageSnapshot messageSnapshot) throws RemoteException {
            com.liulishuo.filedownloader.message.b.a().b(messageSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    @Override // e.h.a.u
    public byte D(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.b(i2);
        }
        try {
            return d().D(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // e.h.a.u
    public boolean F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return e.h.a.k0.a.e(str, str2, z);
        }
        try {
            d().F(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
            return true;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // e.h.a.u
    public boolean K(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.d(i2);
        }
        try {
            return d().K(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // e.h.a.u
    public boolean T(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.a(i2);
        }
        try {
            return d().T(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // e.h.a.u
    public void X(boolean z) {
        if (!isConnected()) {
            e.h.a.k0.a.f(z);
            return;
        }
        try {
            try {
                d().X(z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        } finally {
            this.f17203i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e.h.a.i0.b a(IBinder iBinder) {
        return b.a.i0(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(e.h.a.i0.b bVar, a aVar) throws RemoteException {
        bVar.j1(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(e.h.a.i0.b bVar, a aVar) throws RemoteException {
        bVar.d5(aVar);
    }
}
