package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f39088c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39089a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39090b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f39091a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f39092b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f39091a, DesugarCollections.unmodifiableList(this.f39092b));
        }

        public a b(List list) {
            this.f39092b = list;
            return this;
        }

        public a c(String str) {
            this.f39091a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f39089a = str;
        this.f39090b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f39090b;
    }

    public String b() {
        return this.f39089a;
    }
}
