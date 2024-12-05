package e.h.a;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.e;

/* compiled from: FileDownloadServiceProxy.java */
/* loaded from: classes2.dex */
public class m implements u {

    /* renamed from: f, reason: collision with root package name */
    private final u f17903f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileDownloadServiceProxy.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private static final m a = new m();
    }

    public static e.a a() {
        if (b().f17903f instanceof n) {
            return (e.a) b().f17903f;
        }
        return null;
    }

    public static m b() {
        return b.a;
    }

    @Override // e.h.a.u
    public byte D(int i2) {
        return this.f17903f.D(i2);
    }

    @Override // e.h.a.u
    public boolean F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        return this.f17903f.F(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // e.h.a.u
    public boolean K(int i2) {
        return this.f17903f.K(i2);
    }

    @Override // e.h.a.u
    public boolean T(int i2) {
        return this.f17903f.T(i2);
    }

    @Override // e.h.a.u
    public void X(boolean z) {
        this.f17903f.X(z);
    }

    @Override // e.h.a.u
    public void Y(Context context) {
        this.f17903f.Y(context);
    }

    @Override // e.h.a.u
    public boolean Z() {
        return this.f17903f.Z();
    }

    @Override // e.h.a.u
    public boolean isConnected() {
        return this.f17903f.isConnected();
    }

    private m() {
        this.f17903f = e.h.a.k0.e.a().f17893d ? new n() : new o();
    }
}
