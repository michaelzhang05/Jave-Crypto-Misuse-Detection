package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class s implements n {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f2170a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Object obj) {
        this.f2170a = p.a(obj);
    }

    @Override // androidx.core.os.n
    public Object a() {
        return this.f2170a;
    }

    @Override // androidx.core.os.n
    public String b() {
        String languageTags;
        languageTags = this.f2170a.toLanguageTags();
        return languageTags;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f2170a.equals(((n) obj).a());
        return equals;
    }

    @Override // androidx.core.os.n
    public Locale get(int i6) {
        Locale locale;
        locale = this.f2170a.get(i6);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f2170a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.os.n
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f2170a.isEmpty();
        return isEmpty;
    }

    @Override // androidx.core.os.n
    public int size() {
        int size;
        size = this.f2170a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f2170a.toString();
        return localeList;
    }
}
