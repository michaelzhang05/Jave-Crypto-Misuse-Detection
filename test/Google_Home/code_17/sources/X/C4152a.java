package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u.m;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4152a {

    /* renamed from: e, reason: collision with root package name */
    private static final C4152a f40524e = new C0920a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f40525a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40526b;

    /* renamed from: c, reason: collision with root package name */
    private final C4153b f40527c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40528d;

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0920a {

        /* renamed from: a, reason: collision with root package name */
        private f f40529a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f40530b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C4153b f40531c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f40532d = "";

        C0920a() {
        }

        public C0920a a(C4155d c4155d) {
            this.f40530b.add(c4155d);
            return this;
        }

        public C4152a b() {
            return new C4152a(this.f40529a, DesugarCollections.unmodifiableList(this.f40530b), this.f40531c, this.f40532d);
        }

        public C0920a c(String str) {
            this.f40532d = str;
            return this;
        }

        public C0920a d(C4153b c4153b) {
            this.f40531c = c4153b;
            return this;
        }

        public C0920a e(f fVar) {
            this.f40529a = fVar;
            return this;
        }
    }

    C4152a(f fVar, List list, C4153b c4153b, String str) {
        this.f40525a = fVar;
        this.f40526b = list;
        this.f40527c = c4153b;
        this.f40528d = str;
    }

    public static C0920a e() {
        return new C0920a();
    }

    public String a() {
        return this.f40528d;
    }

    public C4153b b() {
        return this.f40527c;
    }

    public List c() {
        return this.f40526b;
    }

    public f d() {
        return this.f40525a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
