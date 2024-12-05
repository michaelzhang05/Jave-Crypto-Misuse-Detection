package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u.m;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3855a {

    /* renamed from: e, reason: collision with root package name */
    private static final C3855a f39062e = new C0907a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f39063a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39064b;

    /* renamed from: c, reason: collision with root package name */
    private final C3856b f39065c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39066d;

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0907a {

        /* renamed from: a, reason: collision with root package name */
        private f f39067a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f39068b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C3856b f39069c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f39070d = "";

        C0907a() {
        }

        public C0907a a(d dVar) {
            this.f39068b.add(dVar);
            return this;
        }

        public C3855a b() {
            return new C3855a(this.f39067a, DesugarCollections.unmodifiableList(this.f39068b), this.f39069c, this.f39070d);
        }

        public C0907a c(String str) {
            this.f39070d = str;
            return this;
        }

        public C0907a d(C3856b c3856b) {
            this.f39069c = c3856b;
            return this;
        }

        public C0907a e(f fVar) {
            this.f39067a = fVar;
            return this;
        }
    }

    C3855a(f fVar, List list, C3856b c3856b, String str) {
        this.f39063a = fVar;
        this.f39064b = list;
        this.f39065c = c3856b;
        this.f39066d = str;
    }

    public static C0907a e() {
        return new C0907a();
    }

    public String a() {
        return this.f39066d;
    }

    public C3856b b() {
        return this.f39065c;
    }

    public List c() {
        return this.f39064b;
    }

    public f d() {
        return this.f39063a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
