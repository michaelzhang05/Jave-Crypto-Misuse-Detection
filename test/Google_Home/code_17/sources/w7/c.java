package w7;

import java.io.Serializable;
import java.util.Stack;
import w7.g;
import w7.i;
import w7.j;

/* loaded from: classes5.dex */
class c implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private u f40402a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40403b;

    /* renamed from: c, reason: collision with root package name */
    private int f40404c;

    /* renamed from: d, reason: collision with root package name */
    private int f40405d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f40406e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40407f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i8) {
        this.f40403b = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(this.f40403b);
        cVar.f40402a = this.f40402a;
        cVar.f40404c = this.f40404c;
        cVar.f40405d = this.f40405d;
        cVar.f40406e = this.f40406e;
        cVar.f40407f = this.f40407f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if (this.f40406e && !this.f40407f) {
            return this.f40404c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f40405d;
    }

    public u d() {
        return this.f40402a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i8) {
        this.f40402a = null;
        this.f40404c = this.f40403b;
        this.f40405d = i8;
        this.f40406e = true;
        this.f40407f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f40407f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f40406e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f40402a = uVar;
        int a8 = uVar.a();
        this.f40404c = a8;
        if (a8 == this.f40403b) {
            this.f40407f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            if (!this.f40407f && this.f40406e) {
                j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f40405d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f40405d).l();
                g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f40405d).k();
                kVar.h(kVar.g(bArr2, jVar2), bArr);
                u a8 = v.a(kVar, kVar.e(jVar2), iVar);
                while (!stack.isEmpty() && ((u) stack.peek()).a() == a8.a() && ((u) stack.peek()).a() != this.f40403b) {
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(kVar, (u) stack.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                u uVar2 = this.f40402a;
                if (uVar2 == null) {
                    this.f40402a = a8;
                } else if (uVar2.a() == a8.a()) {
                    g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    a8 = new u(this.f40402a.a() + 1, v.b(kVar, this.f40402a, a8, gVar3).b());
                    this.f40402a = a8;
                } else {
                    stack.push(a8);
                }
                if (this.f40402a.a() == this.f40403b) {
                    this.f40407f = true;
                    return;
                } else {
                    this.f40404c = a8.a();
                    this.f40405d++;
                    return;
                }
            }
            throw new IllegalStateException("finished or not initialized");
        }
        throw new NullPointerException("otsHashAddress == null");
    }
}
