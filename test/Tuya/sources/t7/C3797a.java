package t7;

import R6.C1347n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import t7.g;
import t7.i;
import t7.j;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3797a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient k f38261a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38262b;

    /* renamed from: c, reason: collision with root package name */
    private final List f38263c;

    /* renamed from: d, reason: collision with root package name */
    private int f38264d;

    /* renamed from: e, reason: collision with root package name */
    private u f38265e;

    /* renamed from: f, reason: collision with root package name */
    private List f38266f;

    /* renamed from: g, reason: collision with root package name */
    private Map f38267g;

    /* renamed from: h, reason: collision with root package name */
    private Stack f38268h;

    /* renamed from: i, reason: collision with root package name */
    private Map f38269i;

    /* renamed from: j, reason: collision with root package name */
    private int f38270j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38271k;

    /* renamed from: l, reason: collision with root package name */
    private transient int f38272l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(C3797a c3797a) {
        this.f38261a = new k(c3797a.f38261a.d());
        this.f38262b = c3797a.f38262b;
        this.f38264d = c3797a.f38264d;
        this.f38265e = c3797a.f38265e;
        ArrayList arrayList = new ArrayList();
        this.f38266f = arrayList;
        arrayList.addAll(c3797a.f38266f);
        this.f38267g = new TreeMap();
        for (Integer num : c3797a.f38267g.keySet()) {
            this.f38267g.put(num, (LinkedList) ((LinkedList) c3797a.f38267g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38268h = stack;
        stack.addAll(c3797a.f38268h);
        this.f38263c = new ArrayList();
        Iterator it = c3797a.f38263c.iterator();
        while (it.hasNext()) {
            this.f38263c.add(((c) it.next()).clone());
        }
        this.f38269i = new TreeMap(c3797a.f38269i);
        this.f38270j = c3797a.f38270j;
        this.f38272l = c3797a.f38272l;
        this.f38271k = c3797a.f38271k;
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f38263c) {
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
            for (int i8 = 0; i8 < (1 << this.f38262b); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i8).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                k kVar = this.f38261a;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                n e8 = this.f38261a.e(jVar);
                iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i8).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
                u a8 = v.a(this.f38261a, e8, iVar);
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i8).f(gVar.a())).k();
                while (!this.f38268h.isEmpty() && ((u) this.f38268h.peek()).a() == a8.a()) {
                    int a9 = i8 / (1 << a8.a());
                    if (a9 == 1) {
                        this.f38266f.add(a8);
                    }
                    if (a9 == 3 && a8.a() < this.f38262b - this.f38264d) {
                        ((c) this.f38263c.get(a8.a())).h(a8);
                    }
                    if (a9 >= 3 && (a9 & 1) == 1 && a8.a() >= this.f38262b - this.f38264d && a8.a() <= this.f38262b - 2) {
                        if (this.f38267g.get(Integer.valueOf(a8.a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a8);
                            this.f38267g.put(Integer.valueOf(a8.a()), linkedList);
                        } else {
                            ((LinkedList) this.f38267g.get(Integer.valueOf(a8.a()))).add(a8);
                        }
                    }
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(this.f38261a, (u) this.f38268h.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                this.f38268h.push(a8);
            }
            this.f38265e = (u) this.f38268h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object removeFirst;
        if (jVar != null) {
            if (!this.f38271k) {
                int i8 = this.f38270j;
                if (i8 <= this.f38272l - 1) {
                    int b8 = A.b(i8, this.f38262b);
                    if (((this.f38270j >> (b8 + 1)) & 1) == 0 && b8 < this.f38262b - 1) {
                        this.f38269i.put(Integer.valueOf(b8), this.f38266f.get(b8));
                    }
                    i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
                    g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
                    if (b8 == 0) {
                        jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f38270j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                        k kVar = this.f38261a;
                        kVar.h(kVar.g(bArr2, jVar), bArr);
                        this.f38266f.set(0, v.a(this.f38261a, this.f38261a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f38270j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
                    } else {
                        int i9 = b8 - 1;
                        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i9).n(this.f38270j >> b8).f(gVar.a())).k();
                        k kVar2 = this.f38261a;
                        kVar2.h(kVar2.g(bArr2, jVar), bArr);
                        u b9 = v.b(this.f38261a, (u) this.f38266f.get(i9), (u) this.f38269i.get(Integer.valueOf(i9)), gVar2);
                        this.f38266f.set(b8, new u(b9.a() + 1, b9.b()));
                        this.f38269i.remove(Integer.valueOf(i9));
                        for (int i10 = 0; i10 < b8; i10++) {
                            if (i10 < this.f38262b - this.f38264d) {
                                list = this.f38266f;
                                removeFirst = ((c) this.f38263c.get(i10)).d();
                            } else {
                                list = this.f38266f;
                                removeFirst = ((LinkedList) this.f38267g.get(Integer.valueOf(i10))).removeFirst();
                            }
                            list.set(i10, removeFirst);
                        }
                        int min = Math.min(b8, this.f38262b - this.f38264d);
                        for (int i11 = 0; i11 < min; i11++) {
                            int i12 = this.f38270j + 1 + ((1 << i11) * 3);
                            if (i12 < (1 << this.f38262b)) {
                                ((c) this.f38263c.get(i11)).e(i12);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < ((this.f38262b - this.f38264d) >> 1); i13++) {
                        c a8 = a();
                        if (a8 != null) {
                            a8.j(this.f38268h, this.f38261a, bArr, bArr2, jVar);
                        }
                    }
                    this.f38270j++;
                    return;
                }
                throw new IllegalStateException("index out of bounds");
            }
            throw new IllegalStateException("index already used");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void g() {
        if (this.f38266f != null) {
            if (this.f38267g != null) {
                if (this.f38268h != null) {
                    if (this.f38263c != null) {
                        if (this.f38269i != null) {
                            if (A.l(this.f38262b, this.f38270j)) {
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
        return this.f38270j;
    }

    public int c() {
        return this.f38272l;
    }

    public C3797a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C3797a(this, bArr, bArr2, jVar);
    }

    public C3797a h(C1347n c1347n) {
        return new C3797a(this, c1347n);
    }

    private C3797a(C3797a c3797a, C1347n c1347n) {
        this.f38261a = new k(new m(c1347n));
        this.f38262b = c3797a.f38262b;
        this.f38264d = c3797a.f38264d;
        this.f38265e = c3797a.f38265e;
        ArrayList arrayList = new ArrayList();
        this.f38266f = arrayList;
        arrayList.addAll(c3797a.f38266f);
        this.f38267g = new TreeMap();
        for (Integer num : c3797a.f38267g.keySet()) {
            this.f38267g.put(num, (LinkedList) ((LinkedList) c3797a.f38267g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38268h = stack;
        stack.addAll(c3797a.f38268h);
        this.f38263c = new ArrayList();
        Iterator it = c3797a.f38263c.iterator();
        while (it.hasNext()) {
            this.f38263c.add(((c) it.next()).clone());
        }
        this.f38269i = new TreeMap(c3797a.f38269i);
        this.f38270j = c3797a.f38270j;
        this.f38272l = c3797a.f38272l;
        this.f38271k = c3797a.f38271k;
        g();
    }

    private C3797a(C3797a c3797a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f38261a = new k(c3797a.f38261a.d());
        this.f38262b = c3797a.f38262b;
        this.f38264d = c3797a.f38264d;
        this.f38265e = c3797a.f38265e;
        ArrayList arrayList = new ArrayList();
        this.f38266f = arrayList;
        arrayList.addAll(c3797a.f38266f);
        this.f38267g = new TreeMap();
        for (Integer num : c3797a.f38267g.keySet()) {
            this.f38267g.put(num, (LinkedList) ((LinkedList) c3797a.f38267g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38268h = stack;
        stack.addAll(c3797a.f38268h);
        this.f38263c = new ArrayList();
        Iterator it = c3797a.f38263c.iterator();
        while (it.hasNext()) {
            this.f38263c.add(((c) it.next()).clone());
        }
        this.f38269i = new TreeMap(c3797a.f38269i);
        this.f38270j = c3797a.f38270j;
        this.f38272l = c3797a.f38272l;
        this.f38271k = false;
        f(bArr, bArr2, jVar);
    }

    private C3797a(k kVar, int i8, int i9, int i10) {
        this.f38261a = kVar;
        this.f38262b = i8;
        this.f38272l = i10;
        this.f38264d = i9;
        if (i9 <= i8 && i9 >= 2) {
            int i11 = i8 - i9;
            if (i11 % 2 == 0) {
                this.f38266f = new ArrayList();
                this.f38267g = new TreeMap();
                this.f38268h = new Stack();
                this.f38263c = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f38263c.add(new c(i12));
                }
                this.f38269i = new TreeMap();
                this.f38270j = 0;
                this.f38271k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, int i8, int i9) {
        this(xVar.i(), xVar.b(), xVar.c(), i9);
        this.f38272l = i8;
        this.f38270j = i9;
        this.f38271k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i8) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f38270j < i8) {
            f(bArr, bArr2, jVar);
            this.f38271k = false;
        }
    }
}
