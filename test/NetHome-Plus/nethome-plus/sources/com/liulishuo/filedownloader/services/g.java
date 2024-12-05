package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import e.h.a.y;
import java.util.Iterator;
import java.util.List;

/* compiled from: FileDownloadManager.java */
/* loaded from: classes2.dex */
class g implements y {
    private final e.h.a.f0.a a;

    /* renamed from: b, reason: collision with root package name */
    private final h f17217b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        e.h.a.g0.c j2 = e.h.a.g0.c.j();
        this.a = j2.f();
        this.f17217b = new h(j2.k());
    }

    @Override // e.h.a.y
    public boolean a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean g2 = this.f17217b.g(fileDownloadModel.e());
        if (com.liulishuo.filedownloader.model.b.e(fileDownloadModel.h())) {
            if (!g2) {
                return false;
            }
        } else if (!g2) {
            e.h.a.k0.d.b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.e()), Byte.valueOf(fileDownloadModel.h()));
            return false;
        }
        return true;
    }

    @Override // e.h.a.y
    public int b(String str, int i2) {
        return this.f17217b.e(str, i2);
    }

    public void c() {
        this.a.clear();
    }

    public boolean d(int i2) {
        if (i2 == 0) {
            e.h.a.k0.d.i(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        if (h(i2)) {
            e.h.a.k0.d.i(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        this.a.remove(i2);
        this.a.h(i2);
        return true;
    }

    public long e(int i2) {
        FileDownloadModel o = this.a.o(i2);
        if (o == null) {
            return 0L;
        }
        int a = o.a();
        if (a <= 1) {
            return o.g();
        }
        List<com.liulishuo.filedownloader.model.a> n = this.a.n(i2);
        if (n == null || n.size() != a) {
            return 0L;
        }
        return com.liulishuo.filedownloader.model.a.f(n);
    }

    public byte f(int i2) {
        FileDownloadModel o = this.a.o(i2);
        if (o == null) {
            return (byte) 0;
        }
        return o.h();
    }

    public long g(int i2) {
        FileDownloadModel o = this.a.o(i2);
        if (o == null) {
            return 0L;
        }
        return o.k();
    }

    public boolean h(int i2) {
        return a(this.a.o(i2));
    }

    public boolean i(String str, String str2) {
        return h(e.h.a.k0.f.r(str, str2));
    }

    public boolean j() {
        return this.f17217b.b() <= 0;
    }

    public boolean k(int i2) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "request pause the task %d", Integer.valueOf(i2));
        }
        FileDownloadModel o = this.a.o(i2);
        if (o == null) {
            return false;
        }
        o.z((byte) -2);
        this.f17217b.a(i2);
        return true;
    }

    public void l() {
        List<Integer> f2 = this.f17217b.f();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "pause all tasks %d", Integer.valueOf(f2.size()));
        }
        Iterator<Integer> it = f2.iterator();
        while (it.hasNext()) {
            k(it.next().intValue());
        }
    }

    public synchronized boolean m(int i2) {
        return this.f17217b.h(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0184 A[Catch: all -> 0x01cf, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0065, B:19:0x0072, B:21:0x0078, B:23:0x007c, B:28:0x008d, B:29:0x0096, B:31:0x009f, B:33:0x00a3, B:38:0x00b6, B:40:0x00bf, B:41:0x00c8, B:43:0x00d7, B:45:0x00db, B:47:0x00ec, B:51:0x00fa, B:53:0x0101, B:55:0x0108, B:57:0x010e, B:59:0x0115, B:61:0x011b, B:63:0x0121, B:65:0x013b, B:66:0x013f, B:68:0x0145, B:72:0x0184, B:73:0x0189, B:76:0x0154, B:78:0x015e, B:80:0x0164, B:81:0x016a, B:82:0x00c4, B:84:0x0092), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void n(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.liulishuo.filedownloader.model.FileDownloadHeader r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.g.n(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }
}
