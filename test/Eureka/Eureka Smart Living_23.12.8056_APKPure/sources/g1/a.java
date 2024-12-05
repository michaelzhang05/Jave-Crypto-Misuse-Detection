package g1;

import d1.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f6662e = new C0100a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f6663a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6664b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6665c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6666d;

    /* renamed from: g1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0100a {

        /* renamed from: a, reason: collision with root package name */
        private f f6667a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f6668b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f6669c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f6670d = "";

        C0100a() {
        }

        public C0100a a(d dVar) {
            this.f6668b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f6667a, Collections.unmodifiableList(this.f6668b), this.f6669c, this.f6670d);
        }

        public C0100a c(String str) {
            this.f6670d = str;
            return this;
        }

        public C0100a d(b bVar) {
            this.f6669c = bVar;
            return this;
        }

        public C0100a e(f fVar) {
            this.f6667a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f6663a = fVar;
        this.f6664b = list;
        this.f6665c = bVar;
        this.f6666d = str;
    }

    public static C0100a e() {
        return new C0100a();
    }

    public String a() {
        return this.f6666d;
    }

    public b b() {
        return this.f6665c;
    }

    public List c() {
        return this.f6664b;
    }

    public f d() {
        return this.f6663a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
