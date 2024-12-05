package e.h.a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.a;
import e.h.a.d;
import e.h.a.x;
import java.io.File;
import java.util.ArrayList;

/* compiled from: DownloadTask.java */
/* loaded from: classes2.dex */
public class c implements e.h.a.a, a.b, d.a {
    private final x a;

    /* renamed from: b, reason: collision with root package name */
    private final x.a f17746b;

    /* renamed from: c, reason: collision with root package name */
    private int f17747c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<a.InterfaceC0230a> f17748d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17749e;

    /* renamed from: f, reason: collision with root package name */
    private String f17750f;

    /* renamed from: g, reason: collision with root package name */
    private String f17751g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17752h;

    /* renamed from: i, reason: collision with root package name */
    private FileDownloadHeader f17753i;

    /* renamed from: j, reason: collision with root package name */
    private i f17754j;

    /* renamed from: k, reason: collision with root package name */
    private SparseArray<Object> f17755k;
    private Object l;
    private final Object u;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private int p = 100;
    private int q = 10;
    private boolean r = false;
    volatile int s = 0;
    private boolean t = false;
    private final Object v = new Object();
    private volatile boolean w = false;

    /* compiled from: DownloadTask.java */
    /* loaded from: classes2.dex */
    private static final class b implements a.c {
        private final c a;

        @Override // e.h.a.a.c
        public int a() {
            int id = this.a.getId();
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            h.i().b(this.a);
            return id;
        }

        private b(c cVar) {
            this.a = cVar;
            cVar.t = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        this.f17749e = str;
        Object obj = new Object();
        this.u = obj;
        d dVar = new d(this, obj);
        this.a = dVar;
        this.f17746b = dVar;
    }

    private void X() {
        if (this.f17753i == null) {
            synchronized (this.v) {
                if (this.f17753i == null) {
                    this.f17753i = new FileDownloadHeader();
                }
            }
        }
    }

    private int b0() {
        if (Z()) {
            if (Y()) {
                throw new IllegalStateException(e.h.a.k0.f.o("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
            }
            throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.a.toString());
        }
        if (!o()) {
            E();
        }
        this.a.i();
        return getId();
    }

    @Override // e.h.a.a.b
    public boolean A(int i2) {
        return getId() == i2;
    }

    @Override // e.h.a.a.b
    public void B(int i2) {
        this.s = i2;
    }

    @Override // e.h.a.d.a
    public ArrayList<a.InterfaceC0230a> C() {
        return this.f17748d;
    }

    @Override // e.h.a.a
    public long D() {
        return this.a.l();
    }

    @Override // e.h.a.a.b
    public void E() {
        int hashCode;
        if (F() != null) {
            hashCode = F().hashCode();
        } else {
            hashCode = hashCode();
        }
        this.s = hashCode;
    }

    @Override // e.h.a.a
    public i F() {
        return this.f17754j;
    }

    @Override // e.h.a.a.b
    public boolean G() {
        return this.w;
    }

    @Override // e.h.a.a.b
    public Object H() {
        return this.u;
    }

    @Override // e.h.a.a
    public boolean I(a.InterfaceC0230a interfaceC0230a) {
        ArrayList<a.InterfaceC0230a> arrayList = this.f17748d;
        return arrayList != null && arrayList.remove(interfaceC0230a);
    }

    @Override // e.h.a.a
    public int J() {
        return this.p;
    }

    @Override // e.h.a.a.b
    public void K() {
        b0();
    }

    @Override // e.h.a.a
    public boolean L() {
        return this.r;
    }

    @Override // e.h.a.d.a
    public FileDownloadHeader M() {
        return this.f17753i;
    }

    @Override // e.h.a.a
    public e.h.a.a N(int i2) {
        this.m = i2;
        return this;
    }

    @Override // e.h.a.a.b
    public boolean O() {
        return com.liulishuo.filedownloader.model.b.e(getStatus());
    }

    @Override // e.h.a.a
    public boolean P() {
        return this.f17752h;
    }

    @Override // e.h.a.a
    public e.h.a.a Q(int i2) {
        this.p = i2;
        return this;
    }

    @Override // e.h.a.a.b
    public boolean R() {
        ArrayList<a.InterfaceC0230a> arrayList = this.f17748d;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // e.h.a.a.b
    public void S() {
        this.w = true;
    }

    @Override // e.h.a.a
    public boolean T() {
        return this.n;
    }

    @Override // e.h.a.a
    public String U() {
        return this.f17751g;
    }

    @Override // e.h.a.a
    public e.h.a.a V(i iVar) {
        this.f17754j = iVar;
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "setListener %s", iVar);
        }
        return this;
    }

    public boolean Y() {
        if (q.e().f().a(this)) {
            return true;
        }
        return com.liulishuo.filedownloader.model.b.a(getStatus());
    }

    public boolean Z() {
        return this.a.getStatus() != 0;
    }

    @Override // e.h.a.d.a
    public void a(String str) {
        this.f17751g = str;
    }

    public e.h.a.a a0(String str, boolean z) {
        this.f17750f = str;
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "setPath %s", str);
        }
        this.f17752h = z;
        if (z) {
            this.f17751g = null;
        } else {
            this.f17751g = new File(str).getName();
        }
        return this;
    }

    @Override // e.h.a.a.b
    public void b() {
        this.a.b();
        if (h.i().k(this)) {
            this.w = false;
        }
    }

    @Override // e.h.a.a
    public String c() {
        return this.f17750f;
    }

    @Override // e.h.a.a
    public int d() {
        return this.a.d();
    }

    @Override // e.h.a.a
    public Throwable e() {
        return this.a.e();
    }

    @Override // e.h.a.a
    public e.h.a.a f(String str, String str2) {
        X();
        this.f17753i.a(str, str2);
        return this;
    }

    @Override // e.h.a.a
    public boolean g() {
        return this.a.g();
    }

    @Override // e.h.a.a
    public int getId() {
        int i2 = this.f17747c;
        if (i2 != 0) {
            return i2;
        }
        if (TextUtils.isEmpty(this.f17750f) || TextUtils.isEmpty(this.f17749e)) {
            return 0;
        }
        int s = e.h.a.k0.f.s(this.f17749e, this.f17750f, this.f17752h);
        this.f17747c = s;
        return s;
    }

    @Override // e.h.a.a
    public byte getStatus() {
        return this.a.getStatus();
    }

    @Override // e.h.a.a
    public Object getTag() {
        return this.l;
    }

    @Override // e.h.a.a
    public int h() {
        if (this.a.l() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.a.l();
    }

    @Override // e.h.a.a
    public e.h.a.a i(int i2, Object obj) {
        if (this.f17755k == null) {
            this.f17755k = new SparseArray<>(2);
        }
        this.f17755k.put(i2, obj);
        return this;
    }

    @Override // e.h.a.a
    public e.h.a.a j(String str) {
        return a0(str, false);
    }

    @Override // e.h.a.a
    public String k() {
        return e.h.a.k0.f.B(c(), P(), U());
    }

    @Override // e.h.a.a
    public a.c l() {
        return new b();
    }

    @Override // e.h.a.a
    public String m() {
        return this.f17749e;
    }

    @Override // e.h.a.a
    public long n() {
        return this.a.j();
    }

    @Override // e.h.a.a
    public boolean o() {
        return this.s != 0;
    }

    @Override // e.h.a.a
    public int p() {
        return this.q;
    }

    @Override // e.h.a.a
    public boolean pause() {
        boolean pause;
        synchronized (this.u) {
            pause = this.a.pause();
        }
        return pause;
    }

    @Override // e.h.a.a
    public boolean q() {
        return this.o;
    }

    @Override // e.h.a.d.a
    public a.b r() {
        return this;
    }

    @Override // e.h.a.a
    public int s() {
        return this.m;
    }

    @Override // e.h.a.a
    public e.h.a.a t(a.InterfaceC0230a interfaceC0230a) {
        if (this.f17748d == null) {
            this.f17748d = new ArrayList<>();
        }
        if (!this.f17748d.contains(interfaceC0230a)) {
            this.f17748d.add(interfaceC0230a);
        }
        return this;
    }

    public String toString() {
        return e.h.a.k0.f.o("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // e.h.a.a
    public int u() {
        if (this.a.j() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.a.j();
    }

    @Override // e.h.a.a.b
    public e.h.a.a v() {
        return this;
    }

    @Override // e.h.a.a.b
    public void w() {
        b0();
    }

    @Override // e.h.a.a.b
    public int x() {
        return this.s;
    }

    @Override // e.h.a.a.b
    public x.a y() {
        return this.f17746b;
    }

    @Override // e.h.a.a.b
    public boolean z(i iVar) {
        return F() == iVar;
    }
}
