package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import okhttp3.HttpUrl;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class m {
    CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f892b;

    /* renamed from: c, reason: collision with root package name */
    String f893c;

    /* renamed from: d, reason: collision with root package name */
    String f894d;

    /* renamed from: e, reason: collision with root package name */
    boolean f895e;

    /* renamed from: f, reason: collision with root package name */
    boolean f896f;

    public IconCompat a() {
        return this.f892b;
    }

    public String b() {
        return this.f894d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.f893c;
    }

    public boolean e() {
        return this.f895e;
    }

    public boolean f() {
        return this.f896f;
    }

    public String g() {
        String str = this.f893c;
        if (str != null) {
            return str;
        }
        if (this.a == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "name:" + ((Object) this.a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().n() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
