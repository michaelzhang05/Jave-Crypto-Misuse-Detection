package Q;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n0.C3453a;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1388d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f8979a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8980b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8981c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8982d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8983e;

    /* renamed from: f, reason: collision with root package name */
    private final View f8984f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8985g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8986h;

    /* renamed from: i, reason: collision with root package name */
    private final C3453a f8987i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8988j;

    /* renamed from: Q.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f8989a;

        /* renamed from: b, reason: collision with root package name */
        private ArraySet f8990b;

        /* renamed from: c, reason: collision with root package name */
        private String f8991c;

        /* renamed from: d, reason: collision with root package name */
        private String f8992d;

        /* renamed from: e, reason: collision with root package name */
        private final C3453a f8993e = C3453a.f35269j;

        public C1388d a() {
            return new C1388d(this.f8989a, this.f8990b, null, 0, null, this.f8991c, this.f8992d, this.f8993e, false);
        }

        public a b(String str) {
            this.f8991c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f8990b == null) {
                this.f8990b = new ArraySet();
            }
            this.f8990b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f8989a = account;
            return this;
        }

        public final a e(String str) {
            this.f8992d = str;
            return this;
        }
    }

    public C1388d(Account account, Set set, Map map, int i8, View view, String str, String str2, C3453a c3453a, boolean z8) {
        Set unmodifiableSet;
        this.f8979a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.f8980b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f8982d = map;
        this.f8984f = view;
        this.f8983e = i8;
        this.f8985g = str;
        this.f8986h = str2;
        this.f8987i = c3453a == null ? C3453a.f35269j : c3453a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f8981c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f8979a;
    }

    public String b() {
        Account account = this.f8979a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f8979a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f8981c;
    }

    public Set e(O.a aVar) {
        android.support.v4.media.a.a(this.f8982d.get(aVar));
        return this.f8980b;
    }

    public String f() {
        return this.f8985g;
    }

    public Set g() {
        return this.f8980b;
    }

    public final C3453a h() {
        return this.f8987i;
    }

    public final Integer i() {
        return this.f8988j;
    }

    public final String j() {
        return this.f8986h;
    }

    public final void k(Integer num) {
        this.f8988j = num;
    }
}
