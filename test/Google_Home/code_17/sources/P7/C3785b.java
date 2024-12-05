package p7;

import G7.h;
import G7.i;
import G7.k;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3785b extends AbstractC3784a {

    /* renamed from: c, reason: collision with root package name */
    private int f37982c;

    /* renamed from: d, reason: collision with root package name */
    private int f37983d;

    /* renamed from: e, reason: collision with root package name */
    private G7.b f37984e;

    /* renamed from: f, reason: collision with root package name */
    private i f37985f;

    /* renamed from: g, reason: collision with root package name */
    private h f37986g;

    /* renamed from: h, reason: collision with root package name */
    private G7.a f37987h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f37988i;

    public C3785b(int i8, int i9, G7.b bVar, i iVar, G7.a aVar, h hVar, String str) {
        super(true, str);
        this.f37982c = i8;
        this.f37983d = i9;
        this.f37984e = bVar;
        this.f37985f = iVar;
        this.f37987h = aVar;
        this.f37986g = hVar;
        this.f37988i = new k(bVar, iVar).c();
    }

    public G7.b b() {
        return this.f37984e;
    }

    public i c() {
        return this.f37985f;
    }

    public G7.a d() {
        return this.f37987h;
    }

    public int e() {
        return this.f37983d;
    }

    public int f() {
        return this.f37982c;
    }

    public h g() {
        return this.f37986g;
    }

    public C3785b(int i8, int i9, G7.b bVar, i iVar, h hVar, String str) {
        this(i8, i9, bVar, iVar, G7.c.a(bVar, iVar), hVar, str);
    }
}
