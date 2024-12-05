package m7;

import D7.h;
import D7.i;
import D7.k;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3442b extends AbstractC3441a {

    /* renamed from: c, reason: collision with root package name */
    private int f35956c;

    /* renamed from: d, reason: collision with root package name */
    private int f35957d;

    /* renamed from: e, reason: collision with root package name */
    private D7.b f35958e;

    /* renamed from: f, reason: collision with root package name */
    private i f35959f;

    /* renamed from: g, reason: collision with root package name */
    private h f35960g;

    /* renamed from: h, reason: collision with root package name */
    private D7.a f35961h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f35962i;

    public C3442b(int i8, int i9, D7.b bVar, i iVar, D7.a aVar, h hVar, String str) {
        super(true, str);
        this.f35956c = i8;
        this.f35957d = i9;
        this.f35958e = bVar;
        this.f35959f = iVar;
        this.f35961h = aVar;
        this.f35960g = hVar;
        this.f35962i = new k(bVar, iVar).c();
    }

    public D7.b b() {
        return this.f35958e;
    }

    public i c() {
        return this.f35959f;
    }

    public D7.a d() {
        return this.f35961h;
    }

    public int e() {
        return this.f35957d;
    }

    public int f() {
        return this.f35956c;
    }

    public h g() {
        return this.f35960g;
    }

    public C3442b(int i8, int i9, D7.b bVar, i iVar, h hVar, String str) {
        this(i8, i9, bVar, iVar, D7.c.a(bVar, iVar), hVar, str);
    }
}
