package e.h.a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import com.liulishuo.filedownloader.services.e;
import e.h.a.h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileDownloadServiceSharedTransmit.java */
/* loaded from: classes2.dex */
public class n implements u, e.a {

    /* renamed from: f, reason: collision with root package name */
    private static final Class<?> f17904f = FileDownloadService.SharedMainProcessService.class;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17905g = false;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<Runnable> f17906h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private com.liulishuo.filedownloader.services.e f17907i;

    @Override // e.h.a.u
    public byte D(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.b(i2);
        }
        return this.f17907i.D(i2);
    }

    @Override // e.h.a.u
    public boolean F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return e.h.a.k0.a.e(str, str2, z);
        }
        this.f17907i.F(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
        return true;
    }

    @Override // e.h.a.u
    public boolean K(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.d(i2);
        }
        return this.f17907i.K(i2);
    }

    @Override // e.h.a.u
    public boolean T(int i2) {
        if (!isConnected()) {
            return e.h.a.k0.a.a(i2);
        }
        return this.f17907i.T(i2);
    }

    @Override // e.h.a.u
    public void X(boolean z) {
        if (!isConnected()) {
            e.h.a.k0.a.f(z);
        } else {
            this.f17907i.X(z);
            this.f17905g = false;
        }
    }

    @Override // e.h.a.u
    public void Y(Context context) {
        b(context, null);
    }

    @Override // e.h.a.u
    public boolean Z() {
        return this.f17905g;
    }

    @Override // com.liulishuo.filedownloader.services.e.a
    public void a(com.liulishuo.filedownloader.services.e eVar) {
        this.f17907i = eVar;
        List list = (List) this.f17906h.clone();
        this.f17906h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        f.e().b(new e.h.a.h0.b(b.a.connected, f17904f));
    }

    public void b(Context context, Runnable runnable) {
        if (runnable != null && !this.f17906h.contains(runnable)) {
            this.f17906h.add(runnable);
        }
        Intent intent = new Intent(context, f17904f);
        boolean P = e.h.a.k0.f.P(context);
        this.f17905g = P;
        intent.putExtra("is_foreground", P);
        if (this.f17905g) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "start foreground service", new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            }
            return;
        }
        context.startService(intent);
    }

    @Override // e.h.a.u
    public boolean isConnected() {
        return this.f17907i != null;
    }
}
