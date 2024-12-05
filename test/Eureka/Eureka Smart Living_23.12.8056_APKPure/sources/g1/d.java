package g1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f6688c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f6689a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6690b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f6691a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f6692b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f6691a, Collections.unmodifiableList(this.f6692b));
        }

        public a b(List list) {
            this.f6692b = list;
            return this;
        }

        public a c(String str) {
            this.f6691a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f6689a = str;
        this.f6690b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f6690b;
    }

    public String b() {
        return this.f6689a;
    }
}
