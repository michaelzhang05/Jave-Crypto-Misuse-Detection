package w7;

import U6.C1456n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import w7.g;
import w7.i;
import w7.j;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4151a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient k f40388a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40389b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40390c;

    /* renamed from: d, reason: collision with root package name */
    private int f40391d;

    /* renamed from: e, reason: collision with root package name */
    private u f40392e;

    /* renamed from: f, reason: collision with root package name */
    private List f40393f;

    /* renamed from: g, reason: collision with root package name */
    private Map f40394g;

    /* renamed from: h, reason: collision with root package name */
    private Stack f40395h;

    /* renamed from: i, reason: collision with root package name */
    private Map f40396i;

    /* renamed from: j, reason: collision with root package name */
    private int f40397j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40398k;

    /* renamed from: l, reason: collision with root package name */
    private transient int f40399l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4151a(C4151a c4151a) {
        this.f40388a = new k(c4151a.f40388a.d());
        this.f40389b = c4151a.f40389b;
        this.f40391d = c4151a.f40391d;
        this.f40392e = c4151a.f40392e;
        ArrayList arrayList = new ArrayList();
        this.f40393f = arrayList;
        arrayList.addAll(c4151a.f40393f);
        this.f40394g = new TreeMap();
        for (Integer num : c4151a.f40394g.keySet()) {
            this.f40394g.put(num, (LinkedList) ((LinkedList) c4151a.f40394g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f40395h = stack;
        stack.addAll(c4151a.f40395h);
        this.f40390c = new ArrayList();
        Iterator it = c4151a.f40390c.iterator();
        while (it.hasNext()) {
            this.f40390c.add(((c) it.next()).clone());
        }
        this.f40396i = new TreeMap(c4151a.f40396i);
        this.f40397j = c4151a.f40397j;
        this.f40399l = c4151a.f40399l;
        this.f40398k = c4151a.f40398k;
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f40390c) {
            if (!cVar2.f() && cVar2.g() && (cVar == null || cVar2.b() < cVar.b() || (cVar2.b() == cVar.b() && cVar2.c() < cVar.c()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
            g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
            for (int i8 = 0; i8 < (1 << this.f40389b); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i8).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                k kVar = this.f40388a;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                n e8 = this.f40388a.e(jVar);
                iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i8).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
                u a8 = v.a(this.f40388a, e8, iVar);
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i8).f(gVar.a())).k();
                while (!this.f40395h.isEmpty() && ((u) this.f40395h.peek()).a() == a8.a()) {
                    int a9 = i8 / (1 << a8.a());
                    if (a9 == 1) {
                        this.f40393f.add(a8);
                    }
                    if (a9 == 3 && a8.a() < this.f40389b - this.f40391d) {
                        ((c) this.f40390c.get(a8.a())).h(a8);
                    }
                    if (a9 >= 3 && (a9 & 1) == 1 && a8.a() >= this.f40389b - this.f40391d && a8.a() <= this.f40389b - 2) {
                        if (this.f40394g.get(Integer.valueOf(a8.a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a8);
                            this.f40394g.put(Integer.valueOf(a8.a()), linkedList);
                        } else {
                            ((LinkedList) this.f40394g.get(Integer.valueOf(a8.a()))).add(a8);
                        }
                    }
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(this.f40388a, (u) this.f40395h.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                this.f40395h.push(a8);
            }
            this.f40392e = (u) this.f40395h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object removeFirst;
        if (jVar != null) {
            if (!this.f40398k) {
                int i8 = this.f40397j;
                if (i8 <= this.f40399l - 1) {
                    int b8 = A.b(i8, this.f40389b);
                    if (((this.f40397j >> (b8 + 1)) & 1) == 0 && b8 < this.f40389b - 1) {
                        this.f40396i.put(Integer.valueOf(b8), this.f40393f.get(b8));
                    }
                    i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
                    g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
                    if (b8 == 0) {
                        jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f40397j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                        k kVar = this.f40388a;
                        kVar.h(kVar.g(bArr2, jVar), bArr);
                        this.f40393f.set(0, v.a(this.f40388a, this.f40388a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f40397j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
                    } else {
                        int i9 = b8 - 1;
                        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i9).n(this.f40397j >> b8).f(gVar.a())).k();
                        k kVar2 = this.f40388a;
                        kVar2.h(kVar2.g(bArr2, jVar), bArr);
                        u b9 = v.b(this.f40388a, (u) this.f40393f.get(i9), (u) this.f40396i.get(Integer.valueOf(i9)), gVar2);
                        this.f40393f.set(b8, new u(b9.a() + 1, b9.b()));
                        this.f40396i.remove(Integer.valueOf(i9));
                        for (int i10 = 0; i10 < b8; i10++) {
                            if (i10 < this.f40389b - this.f40391d) {
                                list = this.f40393f;
                                removeFirst = ((c) this.f40390c.get(i10)).d();
                            } else {
                                list = this.f40393f;
                                removeFirst = ((LinkedList) this.f40394g.get(Integer.valueOf(i10))).removeFirst();
                            }
                            list.set(i10, removeFirst);
                        }
                        int min = Math.min(b8, this.f40389b - this.f40391d);
                        for (int i11 = 0; i11 < min; i11++) {
                            int i12 = this.f40397j + 1 + ((1 << i11) * 3);
                            if (i12 < (1 << this.f40389b)) {
                                ((c) this.f40390c.get(i11)).e(i12);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < ((this.f40389b - this.f40391d) >> 1); i13++) {
                        c a8 = a();
                        if (a8 != null) {
                            a8.i(this.f40395h, this.f40388a, bArr, bArr2, jVar);
                        }
                    }
                    this.f40397j++;
                    return;
                }
                throw new IllegalStateException("index out of bounds");
            }
            throw new IllegalStateException("index already used");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void g() {
        if (this.f40393f != null) {
            if (this.f40394g != null) {
                if (this.f40395h != null) {
                    if (this.f40390c != null) {
                        if (this.f40396i != null) {
                            if (A.l(this.f40389b, this.f40397j)) {
                                return;
                            } else {
                                throw new IllegalStateException("index in BDS state out of bounds");
                            }
                        }
                        throw new IllegalStateException("keep == null");
                    }
                    throw new IllegalStateException("treeHashInstances == null");
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return this.f40397j;
    }

    public int c() {
        return this.f40399l;
    }

    public C4151a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C4151a(this, bArr, bArr2, jVar);
    }

    public C4151a h(C1456n c1456n) {
        return new C4151a(this, c1456n);
    }

    private C4151a(C4151a c4151a, C1456n c1456n) {
        this.f40388a = new k(new m(c1456n));
        this.f40389b = c4151a.f40389b;
        this.f40391d = c4151a.f40391d;
        this.f40392e = c4151a.f40392e;
        ArrayList arrayList = new ArrayList();
        this.f40393f = arrayList;
        arrayList.addAll(c4151a.f40393f);
        this.f40394g = new TreeMap();
        for (Integer num : c4151a.f40394g.keySet()) {
            this.f40394g.put(num, (LinkedList) ((LinkedList) c4151a.f40394g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f40395h = stack;
        stack.addAll(c4151a.f40395h);
        this.f40390c = new ArrayList();
        Iterator it = c4151a.f40390c.iterator();
        while (it.hasNext()) {
            this.f40390c.add(((c) it.next()).clone());
        }
        this.f40396i = new TreeMap(c4151a.f40396i);
        this.f40397j = c4151a.f40397j;
        this.f40399l = c4151a.f40399l;
        this.f40398k = c4151a.f40398k;
        g();
    }

    private C4151a(C4151a c4151a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f40388a = new k(c4151a.f40388a.d());
        this.f40389b = c4151a.f40389b;
        this.f40391d = c4151a.f40391d;
        this.f40392e = c4151a.f40392e;
        ArrayList arrayList = new ArrayList();
        this.f40393f = arrayList;
        arrayList.addAll(c4151a.f40393f);
        this.f40394g = new TreeMap();
        for (Integer num : c4151a.f40394g.keySet()) {
            this.f40394g.put(num, (LinkedList) ((LinkedList) c4151a.f40394g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f40395h = stack;
        stack.addAll(c4151a.f40395h);
        this.f40390c = new ArrayList();
        Iterator it = c4151a.f40390c.iterator();
        while (it.hasNext()) {
            this.f40390c.add(((c) it.next()).clone());
        }
        this.f40396i = new TreeMap(c4151a.f40396i);
        this.f40397j = c4151a.f40397j;
        this.f40399l = c4151a.f40399l;
        this.f40398k = false;
        f(bArr, bArr2, jVar);
    }

    private C4151a(k kVar, int i8, int i9, int i10) {
        this.f40388a = kVar;
        this.f40389b = i8;
        this.f40399l = i10;
        this.f40391d = i9;
        if (i9 <= i8 && i9 >= 2) {
            int i11 = i8 - i9;
            if (i11 % 2 == 0) {
                this.f40393f = new ArrayList();
                this.f40394g = new TreeMap();
                this.f40395h = new Stack();
                this.f40390c = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f40390c.add(new c(i12));
                }
                this.f40396i = new TreeMap();
                this.f40397j = 0;
                this.f40398k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4151a(x xVar, int i8, int i9) {
        this(xVar.i(), xVar.b(), xVar.c(), i9);
        this.f40399l = i8;
        this.f40397j = i9;
        this.f40398k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4151a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4151a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i8) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f40397j < i8) {
            f(bArr, bArr2, jVar);
            this.f40398k = false;
        }
    }
}
