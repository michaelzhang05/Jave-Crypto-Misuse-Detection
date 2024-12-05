package k.b.e;

import java.util.Queue;
import k.b.f.g;

/* compiled from: EventRecodingLogger.java */
/* loaded from: classes2.dex */
public class a implements k.b.b {

    /* renamed from: f, reason: collision with root package name */
    String f19421f;

    /* renamed from: g, reason: collision with root package name */
    g f19422g;

    /* renamed from: h, reason: collision with root package name */
    Queue<d> f19423h;

    public a(g gVar, Queue<d> queue) {
        this.f19422g = gVar;
        this.f19421f = gVar.l();
        this.f19423h = queue;
    }

    private void j(b bVar, String str, Object[] objArr, Throwable th) {
        k(bVar, null, str, objArr, th);
    }

    private void k(b bVar, k.b.d dVar, String str, Object[] objArr, Throwable th) {
        d dVar2 = new d();
        dVar2.i(System.currentTimeMillis());
        dVar2.c(bVar);
        dVar2.d(this.f19422g);
        dVar2.e(this.f19421f);
        dVar2.f(str);
        dVar2.b(objArr);
        dVar2.h(th);
        dVar2.g(Thread.currentThread().getName());
        this.f19423h.add(dVar2);
    }

    @Override // k.b.b
    public void a(String str, Object obj, Object obj2) {
        j(b.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // k.b.b
    public boolean b() {
        return true;
    }

    @Override // k.b.b
    public void c(String str) {
        j(b.TRACE, str, null, null);
    }

    @Override // k.b.b
    public boolean d() {
        return true;
    }

    @Override // k.b.b
    public void e(String str, Throwable th) {
        j(b.INFO, str, null, th);
    }

    @Override // k.b.b
    public void f(String str, Throwable th) {
        j(b.WARN, str, null, th);
    }

    @Override // k.b.b
    public void g(String str, Throwable th) {
        j(b.DEBUG, str, null, th);
    }

    @Override // k.b.b
    public void h(String str) {
        j(b.WARN, str, null, null);
    }

    @Override // k.b.b
    public void i(String str) {
        j(b.TRACE, str, null, null);
    }
}
