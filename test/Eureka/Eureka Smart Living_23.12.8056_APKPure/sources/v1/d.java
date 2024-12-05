package v1;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f9542a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9543b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f9544c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9545d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9546e;

    /* renamed from: f, reason: collision with root package name */
    private final View f9547f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9548g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9549h;

    /* renamed from: i, reason: collision with root package name */
    private final i2.a f9550i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f9551j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f9552a;

        /* renamed from: b, reason: collision with root package name */
        private l.b f9553b;

        /* renamed from: c, reason: collision with root package name */
        private String f9554c;

        /* renamed from: d, reason: collision with root package name */
        private String f9555d;

        /* renamed from: e, reason: collision with root package name */
        private i2.a f9556e = i2.a.f6964j;

        public d a() {
            return new d(this.f9552a, this.f9553b, null, 0, null, this.f9554c, this.f9555d, this.f9556e, false);
        }

        public a b(String str) {
            this.f9554c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f9553b == null) {
                this.f9553b = new l.b();
            }
            this.f9553b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f9552a = account;
            return this;
        }

        public final a e(String str) {
            this.f9555d = str;
            return this;
        }
    }

    public d(Account account, Set set, Map map, int i6, View view, String str, String str2, i2.a aVar, boolean z5) {
        this.f9542a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f9543b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f9545d = map;
        this.f9547f = view;
        this.f9546e = i6;
        this.f9548g = str;
        this.f9549h = str2;
        this.f9550i = aVar == null ? i2.a.f6964j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.f0.a(it.next());
            throw null;
        }
        this.f9544c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f9542a;
    }

    public Account b() {
        Account account = this.f9542a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f9544c;
    }

    public String d() {
        return this.f9548g;
    }

    public Set e() {
        return this.f9543b;
    }

    public final i2.a f() {
        return this.f9550i;
    }

    public final Integer g() {
        return this.f9551j;
    }

    public final String h() {
        return this.f9549h;
    }

    public final void i(Integer num) {
        this.f9551j = num;
    }
}
