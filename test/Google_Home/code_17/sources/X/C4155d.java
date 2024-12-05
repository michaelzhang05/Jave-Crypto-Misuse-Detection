package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4155d {

    /* renamed from: c, reason: collision with root package name */
    private static final C4155d f40550c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f40551a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40552b;

    /* renamed from: x.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40553a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f40554b = new ArrayList();

        a() {
        }

        public C4155d a() {
            return new C4155d(this.f40553a, DesugarCollections.unmodifiableList(this.f40554b));
        }

        public a b(List list) {
            this.f40554b = list;
            return this;
        }

        public a c(String str) {
            this.f40553a = str;
            return this;
        }
    }

    C4155d(String str, List list) {
        this.f40551a = str;
        this.f40552b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f40552b;
    }

    public String b() {
        return this.f40551a;
    }
}
