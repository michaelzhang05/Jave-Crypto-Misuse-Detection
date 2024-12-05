package R;

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
import o0.C3519a;

/* renamed from: R.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1307d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f8517a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8518b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8519c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8520d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8521e;

    /* renamed from: f, reason: collision with root package name */
    private final View f8522f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8523g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8524h;

    /* renamed from: i, reason: collision with root package name */
    private final C3519a f8525i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8526j;

    /* renamed from: R.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f8527a;

        /* renamed from: b, reason: collision with root package name */
        private ArraySet f8528b;

        /* renamed from: c, reason: collision with root package name */
        private String f8529c;

        /* renamed from: d, reason: collision with root package name */
        private String f8530d;

        /* renamed from: e, reason: collision with root package name */
        private final C3519a f8531e = C3519a.f36344j;

        public C1307d a() {
            return new C1307d(this.f8527a, this.f8528b, null, 0, null, this.f8529c, this.f8530d, this.f8531e, false);
        }

        public a b(String str) {
            this.f8529c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f8528b == null) {
                this.f8528b = new ArraySet();
            }
            this.f8528b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f8527a = account;
            return this;
        }

        public final a e(String str) {
            this.f8530d = str;
            return this;
        }
    }

    public C1307d(Account account, Set set, Map map, int i8, View view, String str, String str2, C3519a c3519a, boolean z8) {
        Set unmodifiableSet;
        this.f8517a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.f8518b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f8520d = map;
        this.f8522f = view;
        this.f8521e = i8;
        this.f8523g = str;
        this.f8524h = str2;
        this.f8525i = c3519a == null ? C3519a.f36344j : c3519a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f8519c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f8517a;
    }

    public String b() {
        Account account = this.f8517a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f8517a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f8519c;
    }

    public Set e(P.a aVar) {
        android.support.v4.media.a.a(this.f8520d.get(aVar));
        return this.f8518b;
    }

    public String f() {
        return this.f8523g;
    }

    public Set g() {
        return this.f8518b;
    }

    public final C3519a h() {
        return this.f8525i;
    }

    public final Integer i() {
        return this.f8526j;
    }

    public final String j() {
        return this.f8524h;
    }

    public final void k(Integer num) {
        this.f8526j = num;
    }
}
