package t7;

import java.io.Serializable;
import java.util.Stack;
import t7.g;
import t7.i;
import t7.j;

/* loaded from: classes5.dex */
class c implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private u f38275a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38276b;

    /* renamed from: c, reason: collision with root package name */
    private int f38277c;

    /* renamed from: d, reason: collision with root package name */
    private int f38278d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38279e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38280f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i8) {
        this.f38276b = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(this.f38276b);
        cVar.f38275a = this.f38275a;
        cVar.f38277c = this.f38277c;
        cVar.f38278d = this.f38278d;
        cVar.f38279e = this.f38279e;
        cVar.f38280f = this.f38280f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if (this.f38279e && !this.f38280f) {
            return this.f38277c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f38278d;
    }

    public u d() {
        return this.f38275a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i8) {
        this.f38275a = null;
        this.f38277c = this.f38276b;
        this.f38278d = i8;
        this.f38279e = true;
        this.f38280f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f38280f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f38279e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f38275a = uVar;
        int a8 = uVar.a();
        this.f38277c = a8;
        if (a8 == this.f38276b) {
            this.f38280f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            if (!this.f38280f && this.f38279e) {
                j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f38278d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f38278d).l();
                g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f38278d).k();
                kVar.h(kVar.g(bArr2, jVar2), bArr);
                u a8 = v.a(kVar, kVar.e(jVar2), iVar);
                while (!stack.isEmpty() && ((u) stack.peek()).a() == a8.a() && ((u) stack.peek()).a() != this.f38276b) {
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(kVar, (u) stack.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                u uVar2 = this.f38275a;
                if (uVar2 == null) {
                    this.f38275a = a8;
                } else if (uVar2.a() == a8.a()) {
                    g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    a8 = new u(this.f38275a.a() + 1, v.b(kVar, this.f38275a, a8, gVar3).b());
                    this.f38275a = a8;
                } else {
                    stack.push(a8);
                }
                if (this.f38275a.a() == this.f38276b) {
                    this.f38280f = true;
                    return;
                } else {
                    this.f38277c = a8.a();
                    this.f38278d++;
                    return;
                }
            }
            throw new IllegalStateException("finished or not initialized");
        }
        throw new NullPointerException("otsHashAddress == null");
    }
}
