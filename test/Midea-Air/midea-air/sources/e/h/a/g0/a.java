package e.h.a.g0;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.g0.b;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ConnectTask.java */
/* loaded from: classes2.dex */
public class a {
    final int a;

    /* renamed from: b, reason: collision with root package name */
    final String f17792b;

    /* renamed from: c, reason: collision with root package name */
    final FileDownloadHeader f17793c;

    /* renamed from: d, reason: collision with root package name */
    private e.h.a.g0.b f17794d;

    /* renamed from: e, reason: collision with root package name */
    private String f17795e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, List<String>> f17796f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f17797g;

    /* compiled from: ConnectTask.java */
    /* loaded from: classes2.dex */
    static class b {
        private Integer a;

        /* renamed from: b, reason: collision with root package name */
        private String f17798b;

        /* renamed from: c, reason: collision with root package name */
        private String f17799c;

        /* renamed from: d, reason: collision with root package name */
        private FileDownloadHeader f17800d;

        /* renamed from: e, reason: collision with root package name */
        private e.h.a.g0.b f17801e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a() {
            e.h.a.g0.b bVar;
            Integer num = this.a;
            if (num != null && (bVar = this.f17801e) != null && this.f17798b != null) {
                return new a(bVar, num.intValue(), this.f17798b, this.f17799c, this.f17800d);
            }
            throw new IllegalArgumentException();
        }

        public b b(e.h.a.g0.b bVar) {
            this.f17801e = bVar;
            return this;
        }

        public b c(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public b d(String str) {
            this.f17799c = str;
            return this;
        }

        public b e(FileDownloadHeader fileDownloadHeader) {
            this.f17800d = fileDownloadHeader;
            return this;
        }

        public b f(String str) {
            this.f17798b = str;
            return this;
        }
    }

    private void a(e.h.a.e0.b bVar) throws ProtocolException {
        if (bVar.c(this.f17795e, this.f17794d.a)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f17795e)) {
            bVar.f("If-Match", this.f17795e);
        }
        this.f17794d.a(bVar);
    }

    private void b(e.h.a.e0.b bVar) {
        HashMap<String, List<String>> b2;
        FileDownloadHeader fileDownloadHeader = this.f17793c;
        if (fileDownloadHeader == null || (b2 = fileDownloadHeader.b()) == null) {
            return;
        }
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.h(this, "%d add outside header: %s", Integer.valueOf(this.a), b2);
        }
        for (Map.Entry<String, List<String>> entry : b2.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    bVar.f(key, it.next());
                }
            }
        }
    }

    private void d(e.h.a.e0.b bVar) {
        FileDownloadHeader fileDownloadHeader = this.f17793c;
        if (fileDownloadHeader == null || fileDownloadHeader.b().get("User-Agent") == null) {
            bVar.f("User-Agent", e.h.a.k0.f.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.h.a.e0.b c() throws IOException, IllegalAccessException {
        e.h.a.e0.b a = c.j().a(this.f17792b);
        b(a);
        a(a);
        d(a);
        this.f17796f = a.i();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "<---- %s request header %s", Integer.valueOf(this.a), this.f17796f);
        }
        a.execute();
        ArrayList arrayList = new ArrayList();
        this.f17797g = arrayList;
        e.h.a.e0.b c2 = e.h.a.e0.d.c(this.f17796f, a, arrayList);
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "----> %s response header %s", Integer.valueOf(this.a), c2.b());
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        List<String> list = this.f17797g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f17797g.get(r0.size() - 1);
    }

    public e.h.a.g0.b f() {
        return this.f17794d;
    }

    public Map<String, List<String>> g() {
        return this.f17796f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f17794d.f17802b > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(long j2) {
        e.h.a.g0.b bVar = this.f17794d;
        long j3 = bVar.f17802b;
        if (j2 == j3) {
            e.h.a.k0.d.i(this, "no data download, no need to update", new Object[0]);
            return;
        }
        e.h.a.g0.b b2 = b.C0234b.b(bVar.a, j2, bVar.f17803c, bVar.f17804d - (j2 - j3));
        this.f17794d = b2;
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.e(this, "after update profile:%s", b2);
        }
    }

    private a(e.h.a.g0.b bVar, int i2, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.a = i2;
        this.f17792b = str;
        this.f17795e = str2;
        this.f17793c = fileDownloadHeader;
        this.f17794d = bVar;
    }
}
